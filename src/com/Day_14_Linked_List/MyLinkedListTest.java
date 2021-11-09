package com.Day_14_Linked_List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyLinkedListTest 
{
	@Test
	void searchTest() 
	{
		MyLinkedList obj = new MyLinkedList();
		obj.addNode(56);
		obj.addNode(30);
		obj.addNode(40);
		obj.addNode(70);
		int result = obj.deleteTest(40);
		Assert.assertEquals(40, result);
	}
	@Test
	void deleteTest() 
	{
		MyLinkedList obj = new MyLinkedList();
		obj.addNode(56);
		obj.addNode(30);
		obj.addNode(70);
		int result = obj.searchTest(30);
		Assert.assertEquals(30, result);
	}
	@Test
	void insertAfterTest() 
	{
		MyLinkedList obj = new MyLinkedList();
		obj.addNode(56);
		obj.addNode(30);
		obj.addNode(70);
		int result = obj.insertAfterTest(30, 40);
		Assert.assertEquals(40, result);
	}
}
