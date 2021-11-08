package com.Day_14_Linked_List;

public class MyLinkedList 
{
	MyNode head;
	MyNode tail;
	
	public MyLinkedList() 
	{
		this.head = null;
		this.tail = null;
	}
	
	//addNode() will add a new node to the list    
    public void addNode(int data) 
    {       
        MyNode newNode = new MyNode(data);       
        if(head == null) 
        {     
            head = newNode;    
            tail = newNode;    
        }    
        else 
        {                   
            tail.next = newNode;               
            tail = newNode;    
        }    
    }    
	
	//show() will print all the elements in the list
	public void show()
	{
		MyNode temp = head;
		if(head == null)
		{
			System.out.println("Linked List is Empty");
		}
		else
		{
			while(temp != null)
			{
				System.out.println(temp.data + " ");
				temp = temp.next;
			}
		}
		
	}
}
