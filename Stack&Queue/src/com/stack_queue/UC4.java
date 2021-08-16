package com.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UC4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		System.out.print("Enter size of que::");
		int size1 = scanner.nextInt();
		for (int i = 0; i < size1; i++) {
			System.out.print("Enter elements of que::");
			int element = scanner.nextInt();
			queue.add(element);
		}
		System.out.println("Elements of queue:: " + queue);

		int removedele = queue.remove();
		System.out.println("removed element::" + removedele);

		System.out.println(queue);

		int head = queue.peek();
		System.out.println("head of queue::" + head);

		int size = queue.size();
		System.out.println("Size of queue::" + size);
	}

}
