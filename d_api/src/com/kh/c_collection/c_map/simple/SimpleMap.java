package com.kh.c_collection.c_map.simple;

import com.kh.c_collection.a_list.simple.SimpleList;
import com.kh.c_collection.b_set.simple.SimpleSet;
import com.kh.c_collection.common.Simple;

public class SimpleMap<K,V> 
		implements Simple<SimpleSet<SimpleMap.Entry<K,V>>>{

	private int arraySize = 17;
	private SimpleSet<Entry<K,V>>[] simpleMap;
	private SimpleSet<K> keySet = new SimpleSet<K>();
	private SimpleList<Entry<K,V>> allElements = new SimpleList<>();
	private int size = 0;
	
	@SuppressWarnings("unchecked")
	public SimpleMap() {
		this.simpleMap = new SimpleSet[arraySize];
	}
	
	//size
	public int size() {
		return allElements.size();
	}
	
	private int simpleHashMethod(Entry<K,V> entry) {
		//인스턴스를 식별할 수 있는 숫자값을 hashCode 메서드를 통해 반환 받는다.
		//hashCode의 결과값은 음수가 나오기도 한다. 인덱스는 음수일 수 없다.
		//Math.abs : 절대값으로 변환해주는 메서드
		int res = Math.abs(entry.hashCode());
		
		//res를 배열의 크기로 나눈 나머지를 구한다.
		//나머지는 0 ~ (나누는 수-1) 사이의 값이기 때문이다.
		res %= arraySize;
		return res;
	}
	
	private void put(Entry<K,V> entry, int index) {
		if(simpleMap[index] == null) {
			SimpleSet<Entry<K,V>> datas = new SimpleSet<Entry<K,V>>();
			simpleMap[index] = datas;
		}
		
		if(simpleMap[index].contains(entry)) {
			simpleMap[index].remove(entry);
		}
		
		simpleMap[index].add(entry);
		allElements.add(entry);	
		size++; 
	}
	
	//put
	public void put(K key, V value) {
		
		Entry<K,V> entry = new Entry<>(key, value);
		int index = simpleHashMethod(entry);
		
		if(size < arraySize) {
			put(entry, index);
		}else {
			arraySize *= 2;
			simpleMap = extendsArray(simpleMap,arraySize);
			put(entry, index);
		}
		
		keySet.add(key); 		//keySet에 key값을 저장
	}
	
	//get
	public V get(K key) {
		
		V value = null;
		Entry<K, V> entry = new Entry<K, V>(key, null);
		int idx = simpleHashMethod(entry);
		SimpleSet<Entry<K,V>> entries = simpleMap[idx];
		
		if(entries == null || !entries.contains(entry)) return null;
		
		for (Entry<K, V> e : entries) {
			if(e.getKey().equals(key)) {
				value = e.getValue();
				break;
			}
		}
		
		return value;
	}
	
	//remove
	//삭제된 데이터를 반환
	public V remove(K key) {
		
		V value = null;
		Entry<K, V> entry = new Entry<K, V>(key, null);
		int idx = simpleHashMethod(entry);
		SimpleSet<Entry<K,V>> entries = simpleMap[idx];
		
		if(entries == null || !entries.contains(entry)) return null;
		
		for (Entry<K, V> e : entries) {
			if(e.getKey().equals(key)) {
				value = e.getValue();
				
				entries.remove(e);
				allElements.remove(allElements.indexOf(e));
				keySet.remove(key);
				size--;
				break;
			}
		}
		
		return value;
	}
	
	//keySet
	public SimpleSet<K> keySet(){
		return keySet;
	}
	
	public static class Entry<K,V>{
		
		private K key;
		private V value;
		
		private Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}
		
		public void setValue(V value) {
			this.value = value;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			return result;
		}

		@SuppressWarnings("unchecked")
		@Override
		public boolean equals(Object obj) {
			Entry<K,V> other = (Entry<K,V>) obj;
			
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			
			return true;
		}
	}
	
	
	public void check() {
		for (Entry<K, V> entry : allElements) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
