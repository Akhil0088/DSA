package com.cabook.demo;
import java.util.*;

 class Node{
	int data;
	Node next;
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
	}
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class reverseList {
	
	public static Node reverseLinkedList(Node head) {
		Node temp = head;
		Node prev = null;
		while(temp != null) {
			Node front = temp.next;
			temp.next = prev;
			prev = temp;
			temp = front;
		}
		return prev;
	}
	
	public static Node middleElement(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
	}
	public static boolean cyclic(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == slow) {
				return true;
			}
		}
		return false;
		
	}
}

