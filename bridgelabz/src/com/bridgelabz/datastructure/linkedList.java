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

public class linkedList {
	
    static Node<Integer> head=null;
    static Node<Integer> tail = head;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
			insertFirst(val);
			System.out.println("Node added at first position\n");
		  }
		  else if(choice==2)
		  {
			System.out.print("Enter number :");
			int val = s.nextInt();
			insertLast(val);
			System.out.println("Node added at the end\n");
		  }
		  else if(choice==3)
		  {
			  System.out.print("Enter number :");
			  int val = s.nextInt();
			  System.out.print("Enter position :");
			  int pos = s.nextInt();
			  insertAtP(val,pos-1);
			  System.out.println("Node added at position = "+pos+"\n");
		  }
		  else if(choice==4)
		  {
			  int n = size();
			  System.out.println("Size of linked-list = "+n+"\n");
		  }
		  else if(choice==5)
		  {
			  deleteFirst();
		  }
		  else if(choice==6)
		  {
			  deleteLast();
			  
		  }
		  else
		  {
			print();
		  }
		  System.out.print("Enter choice :");
		  choice = s.nextInt();
		}
		

	}
	private static int size()
	{
		if(head==null)
			return 0;
		int count= 0;
		Node<Integer> temp = head;
		while(temp!=null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}
	private static void insertAtP(int val, int pos) 
	{
		if(pos==0)
		{
			insertFirst(val);	
		}
		else 
		{
			int i=0;
		    Node<Integer> newnode = new Node<>(val);
		    Node<Integer> temp = head;
		    while(i<pos-1)
		    {
		    	temp = temp.next;
		    	i++;
		    }
		    newnode.next = temp.next;
		    temp.next = newnode;
		}
		
	}
	private static void deleteLast() {
		if(head==null)
			System.out.println("Can't delete , linked-list is empty\n");
		else {
		Node<Integer> temp = head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		temp.next=null;
		tail = temp;
		System.out.println("Last node deleted\n");
		}
	}
	private static void deleteFirst() {
		if(head==null)
			System.out.println("Can't delete , linked-list is empty\n");
		else {
			head = head.next;
			System.out.println("First node deleted\n");
		}
		
	}
	private static void insertFirst(int val) {
		Node<Integer> newnode = new Node<>(val);
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
	public static void insertLast(int val)
	{
		Node<Integer> newnode = new Node<>(val);
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
	public static void print()
	{
		Node<Integer> temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("null\n");
	}

}
