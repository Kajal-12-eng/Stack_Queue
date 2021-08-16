package com.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class UC3 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(56);
		queue.add(30);
		queue.add(70);

		System.out.println("Elements of queue " + queue);

		System.out.println(queue);

		int head = queue.peek();
		System.out.println("head of queue::" + head);

		int size = queue.size();
		System.out.println("Size of queue::" + size);
	}

}