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

class Stack<T>
{
	Node<T> head;
	int size;
	Stack()
	{
		head=null;
		size=0;
	}

	/*
	 * @params:This method returns size of linked-list
	 * 
	 * @returns:int
	 * 
	 * @params:void
	 */
	public int size()
	{
		return size;
	}

	/*
	 * @desc:This method checks if the linked-list is empty or not
	 * 
	 * @params:none
	 * 
	 * @returns:boolean
	 */
	public boolean isEmpty()
	{
		return (size()==0);
	}

	/*
	 * @desc:This method returns the top element of the stack
	 * 
	 * @returns:the element at top
	 * 
	 * @params:none
	 */
	public T top()
	{
		if(size()==0)
			return null;
		else
		    return head.data;
	}

	/*
	 * @desc:This method adds an element in the stack
	 * 
	 * @params:New element to be added
	 * 
	 * @returns:void
	 */
	public void push(T elem)
	{
		Node<T> newnode = new Node<T>(elem);
		newnode.next = head;
		head = newnode;
		size++;
	}

	/*
	 * @desc:This method pops an element from the stack
	 * 
	 * @params:none
	 * 
	 * @returns:The popped element
	 */
	public T pop()
	{
		if(size()==0)
			return null;
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	/*
	 * @desc:This method prints the stack
	 * 
	 * @params:none
	 * 
	 * @returns:void
	 */	
	public void printStack() {
		if(isEmpty())
		{
			System.out.println("Stack Empty\n");
			return;
		}
		System.out.print("Top-->");
		Node<T> temp = head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			System.out.print("      ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
}
public class stack{
	
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Operations:\n1.Push\n"
				+ "2.Pop\n"
				+ "3.Top\n"
				+ "4.Size\n"
				+ "5.IsEmpty\n"
				+ "6.Print stack\n"
				+ "Choose: ");
		Stack<Integer> st = new Stack<>();
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
