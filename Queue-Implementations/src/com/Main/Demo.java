package com.Main;

import java.util.ArrayDeque;

public class Demo {
	
	public static void main(String args[]) {
		
		//Testing out LinkedQueue class
		LinkedQueue<String> linkedQueue= new LinkedQueue<>();
		
		linkedQueue.enqueue("first");
		linkedQueue.enqueue("Second");
		linkedQueue.enqueue("third");
		linkedQueue.dequeue();
		System.out.println(linkedQueue.getFront());
		
		System.out.println("\nPrinting the entire Queue: \n" + linkedQueue.toString());
		
		System.out.println("--------------------------------------------------------\n");
		
		//Testing out CircularArrayQueue class
		CircularArrayQueue<String> circularArrayQueue = new CircularArrayQueue<>();
		circularArrayQueue.enqueue("first");
		circularArrayQueue.enqueue("second");
		circularArrayQueue.enqueue("third");
		circularArrayQueue.dequeue();
		System.out.println(circularArrayQueue.getFront());
		circularArrayQueue.dequeue();
		System.out.println(circularArrayQueue.getFront());
		
		//System.out.println("\nPrinting the entire Queue: \n" + circularArrayQueue.toString());
		
		System.out.println("--------------------------------------------------------\n");
		
		//Testing out ArrayDeque class
		ArrayDeque<String> dequeue = new ArrayDeque<>();
		//Adds elements 1,2,3,4 to the front of the dequeue
		//Then adds 0,-1,-2 from the back of the dequeue
		//dequeue contents should be: -2,-1,0,1,2,3,4
		dequeue.addFirst("first");
		dequeue.addFirst("second");
		dequeue.addLast("Back1");
		dequeue.addLast("Back2");
//		System.out.println("Front Value: "+ dequeue.getFirst());	// Prints 4
//		System.out.println("Back value: " + dequeue.getLast());	//	Prints 2
//		dequeue.removeLast();	//Removes 2
//		System.out.println("Back value: " + dequeue.getLast());
//		System.out.println("Front value: " + dequeue.getFirst());	//Prints 4
//		dequeue.removeLast();	//Removes 4
//		System.out.println("Front value: " +dequeue.getFirst());	
		System.out.println("\n" + dequeue.toString());	//Should print 3210-1
		
		
		System.out.println("--------------------------------------------------------\n");
		
	}

}
