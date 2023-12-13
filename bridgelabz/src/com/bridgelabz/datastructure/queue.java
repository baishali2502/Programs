package com.bridgelabz.datastructure;
import java.util.*;

class Node<T>{
	T data;
	Node<T> next;
	Node(T data,Node<T> next){
		this.data = data;
		this.next = next;
	}
	Node(T data){
		this.data = data;
		next = null;
	}
}

class Queue<T>
{
	Node<T> front = null;
	Node<T> rear = null;
	int size = 0;
	/*
     * @desc:This method returns size of queue
     * @param:none
     * @return:int-->size of linked-list
    */
    int size()
    {
    	return size;
    }
    /*
     * @desc:This method checks if queue is empty or not
     * @param:none
     * @return:boolean
    */
    boolean isEmpty()
    {
    	return (size==0);
    }
    /*
     * @desc:This method returns front element of queue
     * @param:none
     * @return:Front element
    */
    T front()
    {
    	if(front==null)
    		return null;
    	return front.data;
    }
    /*
     * @desc:This method returns rear element of queue
     * @param:none
     * @return:Rear element
    */
    T rear()
    {
    	if(rear==null)
    		return null;
    	return rear.data;
    }
    /*
     * @desc:This method adds an element in the queue
     * @param:Element to be added
     * @return:void
    */
    void enqueue(T elem)
    {
    	Node<T> newnode = new Node<T>(elem);
    	if(front==null)
    	{
    		front = newnode;
    		rear = newnode;
    	}
    	else
    	{
    		rear.next = newnode;
    		rear = newnode;
    	}
    	size++;
    }
    /*
     * @desc:This method removes an element from the queue
     * @param:none
     * @return:the removed element
    */
    T dequeue()
    {
    	if(isEmpty())
    		return null;
    	T temp = front.data;
    	front = front.next;
    	size--;
    	return temp;
    }
    /*
     * @desc:This method prints the queue
     * @param:none
     * @return:void
    */
    void printQueue()
    {
    	System.out.print("Front--> ");
    	Node<T> temp = front;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    		temp = temp.next;
    	}
    	System.out.println("<--Rear");
    }
}


public class queue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Operations:\n1.Enqueue\n"
				+ "2.Dequeue\n"
				+ "3.Front\n"
				+ "4.Rear\n"
				+ "5.Size of queue\n"
				+ "6.IsEmpty\n"
				+ "7.Print queue\n"
				+  "Choose : ");
		Queue<Integer> q = new Queue<>();
		int choice = s.nextInt();
		while(choice!=-1)
		{
			if(choice==1)
			{
				System.out.print("Enter element :");
				int elem = s.nextInt();
				q.enqueue(elem);
				System.out.println("Element added(at rear end)\n");
			}
			else if(choice==2)
			{
				 int poped =q.dequeue();
				 System.out.println("Removed element(from front end) = "+poped+"\n");
			}
			else if(choice==3)
			{
				int f = q.front();
				System.out.println("Element at front = "+f+"\n");
			}
			else if(choice==4)
			{
				int r = q.rear();
				System.out.println("Element at rear = "+r+"\n");
			}
			else if(choice==5)
			{
				int n = q.size();
				System.out.println("Size of queue = "+n+"\n");
			}
			else if(choice==6)
			{
				boolean isE = q.isEmpty();
				if(isE)
					System.out.println("Queue Empty\n");
				else
					System.out.println("Queue Not Empty\n");
			}
			else
			{
				q.printQueue();
			}
			
			System.out.print("Enter choice : ");
			choice = s.nextInt();
		}

	}

}
