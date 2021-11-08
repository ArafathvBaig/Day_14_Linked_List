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
    
    //push() will push a new node to the head of a list
    public MyNode push(int data)
    {
    	MyNode newNode = new MyNode(data);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
		return newNode;
	}
    
    //append() will add the node to the tail
    public MyNode append(int data)
    {
    	MyNode newNode = new MyNode(data);
    	if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
    	return newNode;
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
