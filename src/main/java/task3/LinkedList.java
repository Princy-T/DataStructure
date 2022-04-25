package task3;
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

	    public void insertAtBeginning(int newData)//insert at the beginning 
	    {
	        Node newNode = new Node(newData);//object creation for new node
	        newNode.next = head;//assigning head to the new node
	        head = newNode;//assigning new node as head
	    }

	    public void insertAfter(Node prevNode, int newData)//insert at the center
	    {
	        if (prevNode == null)
	        {
	            logger.log("The given previous node cannot be null");
	            return;
	        }
	        Node newNode = new Node(newData);
	        newNode.next = prevNode.next;//Assigning prev node next to new node next
	        prevNode.next = newNode;//Point to the address in the new node
	    }

	    public void insertAtEnd(int newData)//insert at the end
	    {
	        Node newNode = new Node(newData);

	        if (head == null)
	        {
	            head = new Node(newData);
	            return;
	        }

	        newNode.next = null;

	        Node last = head;//assigning last node as head
	        while (last.next != null)
	            	last = last.next;//moving the pointer to the last node to insert at the end
	        	last.next = newNode;//inserting the new node at last
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
	            logger.log(tnode.data + " ");
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

	        logger.log("Elements in the Linked list: ");
	        list.printList();

	        logger.log("\nAfter deleting an element: ");
	        list.deleteNode(4);
	        list.deleteNode(2);
	        list.printList();

	        logger.log();
	    }
}
	
