package com.kh.c_collection.b_set.simple;

import java.util.Iterator;

import com.kh.c_collection.a_list.simple.SimpleList;
import com.kh.c_collection.common.Simple;

public class SimpleSet<E> implements Simple<SimpleList<E>>,Iterable<E>{
	
	//배열의 초기크기
	private int arraySize = 17;
	private SimpleList<E>[] simpleSet;
	private SimpleList<E> allElements = new SimpleList<>(); //모든 요소를 저장하는 리스트
	
	//배열안에 들어간 요소들 개수
	private int size = 0;
	
	@SuppressWarnings("unchecked")
	public SimpleSet() {
		simpleSet = new SimpleList[arraySize];
	}
	
	public int size() {
		return allElements.size();
	}
	
	//해쉬함수 작성
	//해싱 : 입력받은 값을 일정한 자리수의 다른 값으로 변환하는 것
	// 해싱의 기본원칙 : 같은 값이 입력되면 늘 같은 값으로 변환되어야 한다.
	//				다른 값을 넣으면 해싱값은 반드시 달라야 한다.
	//				-> 불가능, 다른 값을 넣었는데 같은 해싱값이 반환되는 것을 해쉬충돌이라 한다.
	
	//우리가 만들 해쉬함수 : 사용자가 입력한 데이터를 Object배열의 인덱스로 해싱
	//만약 배열의 크기가 현재 17일 경우 해싱값의 범위는 0~16
	private int simpleHashMethod(E data) {
		//인스턴스를 식별할 수 있는 숫자값을 hashCode 메서드를 통해 반환 받는다.
		//hashCode의 결과값은 음수가 나오기도 한다. 인덱스는 음수일 수 없다.
		//Math.abs : 절대값으로 변환해주는 메서드
		int res = Math.abs(data.hashCode());
		
		//res를 배열의 크기로 나눈 나머지를 구한다.
		//나머지는 0 ~ (나누는 수-1) 사이의 값이기 때문이다.
		res %= arraySize;
		return res;
	}
	
	public void add(E data) {
		int index = simpleHashMethod(data); //해쉬함수를 통해 저장할 인덱스 결정
		
		if(size < arraySize) {
			add(data, index);
		}else {
			arraySize *= 2;
			simpleSet = extendsArray(simpleSet,arraySize);
			add(data, index);
		}
	}

	private void add(E data, int index) {
		if(simpleSet[index] == null) {
			SimpleList<E> datas = new SimpleList<E>();
			simpleSet[index] = datas;
		}
		
		if(simpleSet[index].contains(data)) return;
		
		simpleSet[index].add(data);
		allElements.add(data);	
		size++; 
	}
	
	//5. contains
	public boolean contains(E e) {
		return allElements.contains(e);
	}
	
	public E remove(E data) {

		int index = simpleHashMethod(data); //해당 data가 몇번 인덱스에 있는 지 확인
		SimpleList<E> es = simpleSet[index];
		
		if(es == null || !es.contains(data)) throw new IllegalArgumentException();
		
		int innerIdx = es.indexOf(data);
		E res = es.get(innerIdx); 	//삭제 될 값을 미리 저장
		
		es.remove(innerIdx);		//삭제
		allElements.remove(allElements.indexOf(data)); //전체 목록에서 삭제
		return res;
	}
	
	@Override
	public Iterator<E> iterator() {		
		return new Iterator<E>() {

			//Iterator로 반환한 요소의 개수
			private int iterIdx;
			
			@Override
			public boolean hasNext() {
				if(iterIdx < size()) {
					return true;
				}
				return false;
			}

			@Override
			public E next() {
				E res = allElements.get(iterIdx);
				iterIdx++;
				return res;
			}
		};
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	
	
	
	
	
	
	

