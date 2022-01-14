package com.kh.h_interface;

import java.io.Serializable;


public interface Communicatable 
			extends Cloneable, Serializable{ //다중 상속을 허용한다.
	void sendMessage();
}
