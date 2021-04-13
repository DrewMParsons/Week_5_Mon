package linkedLists;

import java.util.LinkedList;

public class LinkedListDemo
{
	/*
	 * A linked list is a linear collection of data elements whose order is not given by their physical placement in memory. 
	 * Instead, each element points to the next element. It is a data structure consisting of a collection of nodes 
	 * which together represent a sequence.  each node contains: data, and a reference (in other words, a link) 
	 * to the next node in the sequence.

		Singly linked lists contain nodes which have a data field as well as 'next' field, 
		which points to the next node in line of nodes. Operations that can be performed on singly linked lists include 
		insertion, deletion and traversal.
		In a 'doubly linked list', each node contains, besides the next-node link, a second link field pointing to the 
		'previous' node in the sequence. The two links may be called 'forward('s') and 'backwards', 
		or 'next' and 'prev'('previous').
		Many modern operating systems use doubly linked lists to maintain references to active processes, 
		threads, and other dynamic objects
	 */

	
	public static void main(String[] args)
	{
		LinkedList<String> sLL = new LinkedList<String>();
		//Linked list also implement the Queue/Deque interfaces along with List
		
		
		for(int i=0;i<10;i++) {
			sLL.add(String.valueOf(i));
		}
		System.out.println(sLL);
		
		System.out.println(sLL.peek());
		System.out.println(sLL.peekLast());
		
	
		
		
		

	}

}
