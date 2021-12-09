package com.Main;

import java.util.NoSuchElementException;

/** A class that implements a queue of objects by using
a chain of linked nodes that has both head and tail references. */
public final class LinkedQueue<T> implements QueueInterface<T>
{
private Node firstNode; // References node at front of queue
private Node lastNode;  // References node at back of queue
	
	public LinkedQueue()
	{
		firstNode = null;
		lastNode = null;
	} // end default constructor

	@Override
	public void enqueue(T newEntry)
	{
	   Node newNode = new Node(newEntry, null);

	   if (isEmpty())
	      firstNode = newNode;
	   else
	      lastNode.setNextNode(newNode);
	    
	   lastNode = newNode;
	} // end enqueue


	@Override
	public T dequeue()
	{
	   T front = getFront();  // Might throw EmptyQueueException
	   // Assertion: firstNode != null
	   firstNode.setData(null);
	   firstNode = firstNode.getNextNode();

	   if (firstNode == null)
	      lastNode = null;

	   return front;
	} // end dequeue


	@Override
	public T getFront()
	{
	   if (isEmpty())
	      throw new NoSuchElementException();
	   else
	      return firstNode.getData();
	} // end getFront


	@Override
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
		
	}

	private class Node
	 {
		 private T data;    // Deque entry
		 private Node next;    // Link to next node
		 private Node previous; // Link to previous node
		 
		 private Node(T dataPortion)
		 {
			 data = dataPortion;
			 next = null; 
			 previous = null; 
		 } // end constructor
		 
		 private Node(T dataPortion, Node nextNode)
		 {
			 data = dataPortion;
			 next = nextNode; 
			 //previous = previousNode;
		 } // end constructor
		 
		 private T getData()
		 {
			 return data;
		 } // end getData
		 
		 private void setData(T newData)
		 {
			 data = newData;
		 } // end setData
		 
		 private Node getNextNode()
		 {
			 return next;
		 } // end getNextNode
		 
		 private void setNextNode(Node nextNode)
		 {
			 next = nextNode;
		 } // end setNextNode
		 
		 @SuppressWarnings("unused")
		private Node getPreviousNode()
		 {
			 return previous;
		 } // end getPreviousNode
		 
		 @SuppressWarnings("unused")
		private void setPreviousNode(Node previousNode)
		 {
			 previous = previousNode;
		 } // end setPreviousNode
	 } // end DLNode
	
	@Override
	public String toString() {
	    String listRepresentation = "";
	    Node currentNode = firstNode;

	    while (currentNode != null) {
	        listRepresentation += currentNode.getData() + "\n";
	        currentNode = currentNode.getNextNode();
	    }

	    return listRepresentation;
	}


} // end LinkedQueue