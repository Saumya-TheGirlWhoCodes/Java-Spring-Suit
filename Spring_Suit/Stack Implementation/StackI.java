package com.rakuten.trainig.basics;

public class StackI implements Stack{
	private Object[] content;
	private int top=-1;//as empty initially below 0 index
	
	public StackI(int capacity) {
		// TODO Auto-generated constructor stub
		content=new Object[capacity];
	}
	@Override
	public void push(Object element) {
		try {
		   content[++top]=element;//increament top and add element at that index
		}catch (ArrayIndexOutOfBoundsException e) {
			top--;
			throw new StackFullException("stack capaci=y "+content.length+",full",e);
		}
	}
	@Override
	public Object pop() {
		return content[top];// return content of top then decreament
		
	}
	

}
