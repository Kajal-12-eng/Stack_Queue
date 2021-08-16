package com.stack_queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class UC2 {
	public static void main(String args[]) {

		Stack<Integer> stack = new Stack<>();
		System.out.println("stack: " + stack);

		pushelmnt(stack, 70);
		pushelmnt(stack, 30);
		pushelmnt(stack, 56);

		int top = stack.peek();
		System.out.println("Top of stack::" + top);

		popelmnt(stack);
		popelmnt(stack);

		try {
			popelmnt(stack);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

	@SuppressWarnings("removal")
	static void pushelmnt(Stack stack, int x) {

		stack.push(new Integer(x));
		System.out.println("push -> " + x);
		// prints modified stack
		System.out.println("stack: " + stack);
	}

	static void popelmnt(Stack stack) {
		System.out.print("pop -> ");

		Integer x = (Integer) stack.pop();
		System.out.println(x);

		System.out.println("stack: " + stack);
	}
}