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
    
    //insertInBetween() will insert a node in between two nodes
    //works only when there are only two nodes in the list at beginning
    public MyNode insertInBetween(int left, int data, int right)
    {
    	MyNode leftNode = new MyNode(left);
    	MyNode rightNode = new MyNode(right);
    	MyNode newNode = new MyNode(data);
    	if (head == null)
		{
			head = null;
			tail = null;
		}
    	else
    	{
    		head = leftNode;
    		leftNode.next = newNode;
    		newNode.next = rightNode;
    	}
    	return newNode;
    }
    
    //popFirst() will pop the first node of list and return it
    public MyNode popFirst()
    {
    	MyNode tempNode = this.head;
    	this.head = tempNode.next;
    	return tempNode;
    }
    
  //popLast() will pop the last node of list and return it
    public MyNode popLast()
    {    	
    	MyNode tempNode = head;
    	while(tempNode.next != this.tail)
    	{
    		tempNode = tempNode.next;
    	}
    	this.tail = tempNode;
    	tempNode.next = null;
    	return tempNode;
    }
    
    //search will search the list for the data provided
    public MyNode search(int data)
    {
    	MyNode temp = head;
    	while((temp != null) && (temp.data != data))
    	{
    		temp = temp.next;
    	}
    	return temp;
    }
    
    //insertAfter() will insert a node after a certain node
    public MyNode insertAfter(int searchData, int insertData)
    {
    	MyNode searchedNode = search(searchData);
    	if(searchedNode == null)
    	{
    		return searchedNode;
    	}
    	MyNode newNode = new MyNode(insertData);
    	MyNode temp = searchedNode.next;
    	searchedNode.next = newNode;
    	newNode.next = temp;
    	if(((searchedNode == head) && (searchedNode == tail)) || (searchedNode == tail))
    	{
    		tail = newNode;
    	}
    	return newNode;
    }
    
  //search will search the list for the data provided
    public MyNode searchDelete(int data)
    {
    	MyNode temp = head;
    	MyNode prevNode = temp;
    	while((temp != null) && (temp.data != data))
    	{
    		prevNode = temp;
    		temp = temp.next;
    	}
    	return prevNode;
    }
    
    //delete() will delete a particular node from the list
    public MyNode delete(int data)
    {
    	MyNode searchedNode = search(data);
    	MyNode previousNode = searchDelete(data);
    	MyNode tempNode = null;
    	if(searchedNode == null)
    	{
    		return searchedNode;
    	}
    	else if((searchedNode == this.head) && (searchedNode == this.tail)) 
    	{
    		head = head.next;
    		tail = tail.next;
    		return searchedNode;
    	}
    	else if(searchedNode == this.tail)
    	{
    		previousNode.next = null;
    		this.tail = previousNode;
    		return searchedNode;
    	}
    	else if(searchedNode == this.head)
    	{
    		tempNode = this.head;
        	this.head = tempNode.next;
        	return searchedNode;
    	}
    	else
    	{
    		tempNode = searchedNode;
    		while(tempNode.next.data != tail.data)
        	{
    			tempNode.data = tempNode.next.data;
    			tempNode = tempNode.next;
        	}
    		tempNode.data = tempNode.next.data;
    		this.tail = tempNode;
    		tempNode.next=null;
    	}
    	return searchedNode;
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
