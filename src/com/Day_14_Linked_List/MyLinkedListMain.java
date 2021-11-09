package com.Day_14_Linked_List;

public class MyLinkedListMain 
{	
	public static void main(String[] args) 
	{
		MyLinkedList list = new MyLinkedList();
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		list.show();
		System.out.println(" ");
		list.insertAfter(30, 40);
		list.show();
		System.out.println(" ");
		list.sortList();
		list.show();
	}
}

     
    
   










