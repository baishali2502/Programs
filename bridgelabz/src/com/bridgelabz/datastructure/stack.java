package com.bridgelabz.datastructure;
import java.util.*;
class node1{
	int data;
	node1 next;
	node1(int data,node1 next){
		this.data = data;
		this.next = next;
	}
	node1(int data){
		this.data = data;
		next = null;
	}
}

public class stack{
	
		node1 head;
		int size;
		stack()
		{
			head=null;
			size=0;
		}
		public int size()
		{
			return size;
		}
		public boolean isEmpty()
		{
			return (size()==0);
		}
		public Integer top()
		{
			if(size()==0)
				return null;
			else
			    return head.data;
		}
		public void push(int elem)
		{
			node1 newnode = new node1(elem);
			newnode.next = head;
			head = newnode;
			size++;
		}
		public Integer pop()
		{
			if(size()==0)
				return null;
			int temp = head.data;
			head = head.next;
			size--;
			return temp;
		}
		public void printStack() {
			if(isEmpty())
			{
				System.out.println("Stack Empty\n");
				return;
			}
			System.out.print("Top-->");
			node1 temp = head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				System.out.print("      ");
				temp=temp.next;
			}
			System.out.println();
			
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Operations:\n1.Push\n"
				+ "2.Pop\n"
				+ "3.Top\n"
				+ "4.Size\n"
				+ "5.IsEmpty\n"
				+ "6.Print stack\n"
				+ "Choose: ");
		stack st = new stack();
		int choice = s.nextInt();
		while(choice!=-1)
		{
			if(choice==1)
			{
				System.out.print("Enter element :");
				int elem = s.nextInt();
				st.push(elem);
				System.out.println("Element pushed\n");
			}
			else if(choice==2)
			{
				 int poped =st.pop();
				 System.out.println("Element pushed = "+poped+"\n");
			}
			else if(choice==3)
			{
				int tp = st.top();
				System.out.println("Element at top = "+tp+"\n");
			}
			else if(choice==4)
			{
				int n = st.size();
				System.out.println("Size of stack = "+n+"\n");
			}
			else if(choice==5)
			{
				boolean isE = st.isEmpty();
				if(isE)
					System.out.println("Stack Empty\n");
				else
					System.out.println("Stack Not Empty\n");
			}
			else
			{
				st.printStack();
			}
			
			System.out.print("Enter choice : ");
			choice = s.nextInt();
		}

	}
	
	
	

}
