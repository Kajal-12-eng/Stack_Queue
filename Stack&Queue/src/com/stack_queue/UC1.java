package com.stack_queue;


public class UC1 {
		public static void main(String[] args)   
		{  
		Stack<Integer> stk= new Stack<>();  
		boolean result = stk.empty();  
		stk.push(70);  
		stk.push(30);  
		stk.push(56);  
		
		System.out.println("Elements in Stack: " + stk);  
		result = stk.empty();  
		}  

}
