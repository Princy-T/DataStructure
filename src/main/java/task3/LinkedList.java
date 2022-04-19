package task3;
import java.io.*;
public class LinkedList 
{
	    Node head;
	    class Node 
	    {
	        int data;
	        Node next;
	       
	        Node(int d)//creating constructor for assigning data and address for the node. 
	        {
	            data = d;//data
	            next = null;//address
	        }
	    }

	    public void insertAtBeginning(int new_data)//insert at the beginning 
	    {
	        Node new_node = new Node(new_data);//object creation for new node
	        new_node.next = head;//assigning head to the new node
	        head = new_node;//assigning new node as head
	    }

	    public void insertAfter(Node prev_node, int new_data)//insert at the center
	    {
	        if (prev_node == null)
	        {
	            System.out.println("The given previous node cannot be null");
	            return;
	        }
	        Node new_node = new Node(new_data);
	        new_node.next = prev_node.next;//Assigning prev node next to new node next
	        prev_node.next = new_node;//Point to the address in the new node
	    }

	    public void insertAtEnd(int new_data)//insert at the end
	    {
	        Node new_node = new Node(new_data);

	        if (head == null)
	        {
	            head = new Node(new_data);
	            return;
	        }

	        new_node.next = null;

	        Node last = head;//assigning last node as head
	        while (last.next != null)
	            last = last.next;//moving the pointer to the last node to insert at the end
	        last.next = new_node;//inserting the new node at last
	        return;
	    }

	    void deleteNode(int position)//deleting a node
	    {
	        if (head == null)//the linked list is empty 
	            return;

	        Node temp = head;//assigning temp variable

	        if (position == 0)
	        {
	            head = temp.next;//to delete the 0th index it will point next node 
	            return;
	        }
	       
	        for (int i = 0; temp != null && i < position - 1; i++)//to delete a node at a particular position
	            temp = temp.next;

	        if (temp == null || temp.next == null)
	            return;

	        Node next = temp.next.next;//link to the deleted node's next node 

	        temp.next = next;
	    }

	    public void printList()//display the linkedlist
	    {
	        Node tnode = head;
	        while (tnode != null)
	        {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }

	    }

	    public static void main(String[] args)//main 
	    {
	        LinkedList list = new LinkedList();

	        list.insertAtEnd(10);
	        list.insertAtBeginning(45);
	        list.insertAtBeginning(99);
	        list.insertAtEnd(15);
	        list.insertAfter(list.head.next, 58);
	        list.insertAtEnd(4930);

	        System.out.println("Elements in the Linked list: ");
	        list.printList();

	        System.out.println("\nAfter deleting an element: ");
	        list.deleteNode(4);
	        list.deleteNode(2);
	        list.printList();

	        System.out.println();
	    }
}
	
