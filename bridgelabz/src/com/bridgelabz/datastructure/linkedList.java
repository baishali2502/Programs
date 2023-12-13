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

class linked_list<T>
{
	Node<T> head=null;
    Node<T> tail = head;
    int size;
    /*
	 * @desc:This method returns size of the list
	 * 
	 * @params:none
	 * 
	 * @returns:none
	 */
     int size()
	{
		if(head==null)
			return 0;
		int count= 0;
		Node<T> temp = head;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}
     /*
 	 * @desc:This method inserts new element at the any position of the list
 	 * 
 	 * @params:element to be added and position
 	 * 
 	 * @returns:none
 	 */
	 void insertAtP(T val, int pos) 
	{
		if(pos==0)
		{
			insertFirst(val);	
		}
		else 
		{
			int i=0;
		    Node<T> newnode = new Node<>(val);
		    Node<T> temp = head;
		    while(i<pos-1)
		    {
		    	temp = temp.next;
		    	i++;
		    }
		    newnode.next = temp.next;
		    temp.next = newnode;
		}
		
	}
	 /*
		 * @desc:This method deletes element at the end of the list
		 * 
		 * @params:none
		 * 
		 * @returns:none
		 */
	void deleteLast() {
		if(head==null)
			System.out.println("Can't delete , linked-list is empty\n");
		else {
		Node<T> temp = head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		tail = temp;
		System.out.println("Last node deleted\n");
		}
	}
	/*
	 * @desc:This method deletes element at the beginning of the list
	 * 
	 * @params:none
	 * 
	 * @returns:none
	 */
	void deleteFirst() {
		if(head==null)
			System.out.println("Can't delete , linked-list is empty\n");
		else {
			head = head.next;
			System.out.println("First node deleted\n");
		}
		
	}
	/*
	 * @desc:This method inserts new element at the beginning of the list
	 * 
	 * @params:element to be added
	 * 
	 * @returns:none
	 */
	void insertFirst(T val) {
		Node<T> newnode = new Node<>(val);
		if(head==null) {
			head = newnode;
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	/*
	 * @desc:This method inserts new element at the end of the list
	 * 
	 * @params:element to be added
	 * 
	 * @returns:none
	 */
	void insertLast(T val)
	{
		Node<T> newnode = new Node<>(val);
		if(head==null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}
		
	}
	/*
	 * @desc:This method prints the list
	 * 
	 * @params:none
	 * 
	 * @returns:none
	 */
	void print()
	{
		Node<T> temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("null\n");
	}

	/*
	 * @desc:This method sorts the list
	 * 
	 * @params:none
	 * 
	 * @returns:none
	 */
	void sort()
	{
		ArrayList<T> list = new ArrayList<>();
		Node<T> temp = head;
		int data = 0;
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
		}
		list.sort(null);
		head=null;
		tail=head;
		for(int i=0;i<list.size();i++)
		{
			insertLast(list.get(i));
		}
	}

}
public class linkedList {
	
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		linked_list l=new linked_list<Integer>();
		System.out.println("Operations:\n1.Insert at first\n"
				+ "2.Insert at last\n"
				+ "3.Insert at a certain position\n"
				+ "4.Size of linked-list\n"
				+ "5.Delete at first\n"
				+ "6.Delete at last\n"
				+ "7.Print the linked-list\n"
				+ "Choose: ");
		int choice = s.nextInt();
		while(choice!=-1) 
		{
		  if(choice==1)
		  {
			System.out.print("Enter number :");
			int val = s.nextInt();
			l.insertFirst(val);
			System.out.println("Node added at first position\n");
		  }
		  else if(choice==2)
		  {
			System.out.print("Enter number :");
			int val = s.nextInt();
			l.insertLast(val);
			System.out.println("Node added at the end\n");
		  }
		  else if(choice==3)
		  {
			  System.out.print("Enter number :");
			  int val = s.nextInt();
			  System.out.print("Enter position :");
			  int pos = s.nextInt();
			  l.insertAtP(val,pos-1);
			  System.out.println("Node added at position = "+pos+"\n");
		  }
		  else if(choice==4)
		  {
			  int n = l.size();
			  System.out.println("Size of linked-list = "+n+"\n");
		  }
		  else if(choice==5)
		  {
			  l.deleteFirst();
		  }
		  else if(choice==6)
		  {
			  l.deleteLast();
			  
		  }
		  else
		  {
			l.print();
		  }
		  System.out.print("Enter choice :");
		  choice = s.nextInt();
		}
		

	}
	
}
