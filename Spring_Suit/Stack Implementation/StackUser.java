package com.rakuten.trainig.basics;

public class StackUser {
	public void fill(Stack s) {
		for(int i=0; i<10; i++) {
			s.push(i);
			System.out.println("pushed:"+i);
		}
	}
 

}
