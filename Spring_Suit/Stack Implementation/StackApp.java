package com.rakuten.trainig.basics;

public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackI si=new StackI(9);//if 9 is there then array out of bound exception
		StackUser u=new StackUser();
		u.fill(si);

	}

}
