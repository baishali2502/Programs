package com.bridgelabz.datastructure;
import java.util.*;

class nodeofLL{
	int data;
	nodeofLL next;
	nodeofLL(int data,nodeofLL next){
		this.data = data;
		this.next = next;
	}
	nodeofLL(int data){
		this.data = data;
		next = null;
	}
}
public class queue {
	nodeofLL front = null;
	nodeofLL rear = null;
	int size = 0;
	
    int size()
    {
    	return size;
    }
    boolean isEmpty()
    {
    	return (size==0);
    }
    Integer front()
    {
    	if(front==null)
    		return null;
    	return front.data;
    }
    Integer rear()
    {
    	if(rear==null)
    		return null;
    	return rear.data;
    }
    void enqueue(int elem)
    {
    	nodeofLL newnode = new nodeofLL(elem);
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
    Integer dequeue()
    {
    	if(isEmpty())
    		return null;
    	int temp = front.data;
    	front = front.next;
    	size--;
    	return temp;
    }
    void printQueue()
    {
    	System.out.print("Front--> ");
    	nodeofLL temp = front;
    	while(temp!=null)
    	{
    		System.out.print(temp.data+" ");
    		temp = temp.next;
    	}
    	System.out.println("<--Rear");
    }
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
		queue q = new queue();
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
