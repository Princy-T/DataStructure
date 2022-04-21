package Task3;

public class Queue 
{
	    int length = 4;
	    int items[] = new int[length];
	    int front, rear;

	    Queue() // while queue is empty the front and rear assign -1
	    {
	    	front = -1;
	        rear = -1;
	    }

	    boolean isFull() //condition for the queue is full
	    {
	    	if (front == 0 && rear == length - 1)// at starting front is 0 and rear is length-1(index starts from 0)
	        {
	    		return true;
	        }
	        return false;
	    }

	    boolean isEmpty() // condition for the queue is empty
	    {
	    	if (front == -1) 
	    		return true;
	        else
	                return false;
	    }

	        void enQueue(int element) // condition to insert an element in the queue
	        {
	            if (isFull())
	            {
	                logger.log("Queue is full...");
	            } 
	            else 
	            {
	                if (front == -1)// means empty
	                    front = 0;// Assigning a index to insert the element
	                rear++; 
	                items[rear] = element;
	                logger.log("Inserted " + element);
	            }
	        }

	        int deQueue() // condition to deleting an element in the queue
	        {
	            int element;
	            if (isEmpty())
	            {
	                logger.log("Queue is empty...");
	                return (-1);
	            } 
	            else 
	            {
	                element = items[front]; 
	                if (front >= rear)
	                {
	                    front = -1;
	                    rear = -1;
	                } //If Q has only one element, so we reset the queue after deleting it.
	                else 
	                {
	                    front++;
	                }
	                logger.log("\nDeleted elements:" + element);
	                return (element);
	            }
	        }

	        void display() //to display the queue elements
	        {
	            int i;
	            if (isEmpty()) 
	            {
	                logger.log("Queue is Empty...");
	            } 
	            else 
	            {
	                logger.log("Elements in the queue: ");
	                for (i = front; i <= rear; i++)
	                    logger.log(items[i] + "  ");
	            }
	        }
	        public static void main(String[] args) 
	        {
	            Queue q = new Queue();

	            q.deQueue();// deQueue is not possible on empty queue

	            // enQueue 5 elements
	            q.enQueue(52);
	            q.enQueue(98);
	            q.enQueue(65);
	            q.enQueue(78);
	            q.enQueue(014);

	            q.enQueue(6);// 6th element can't be added to because the queue is full
	            q.display();//displaying the queue elements
	            q.deQueue();// deQueue removes element entered first i.e. 52
	            q.display();// Now we have just 4 elements

	        }
}
