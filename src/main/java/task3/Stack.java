package Task3;

public class Stack 
{
    private int arr[];// store elements of stack in arr variable
    private int top;// represent the top element of stack 
    private int capacity;// total capacity of the stack

    Stack(int size) // Creating a stack
    {
        arr = new int[size];// initialize the array
        capacity = size; // initialize the size as variable capacity
        top = -1;//while stack is empty 
    }

    public void push(int x) // inserting the element in the stack
    {
        if (isFull()) //condition to check whether the stack is full
        {
            logger.log("Stack OverFlow");
            
            System.exit(1);// terminates the program
        }

        logger.log("Pushed inside the stack: " + x);
        arr[++top] = x;
    }

    public int pop() //deleting the element in the stack as LIFO(Last In First Out)
    {

        if (isEmpty()) //condition to check whether the stack is empty 
        {
            logger.log("STACK EMPTY");
            
            System.exit(1);// terminates the program
        }

        return arr[top--];// delete element from top of stack
    }

    public int getSize() // return size of the stack
    {
        return top + 1;//+1 => the starting index value is 0
    }

    public Boolean isEmpty() // check if the stack is empty
    {
        return top == -1; 
    }

    public Boolean isFull() // check if the stack is full
    {
        return top == capacity - 1; //-1 => the starting index value is 0
    }
    
    public void printStack()// display elements of stack 
    {
        for (int i = 0; i <= top; i++) 
        {
            logger.log(arr[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        Stack stack = new Stack(5);
        
        // inserting the element in the stack
        stack.push(59);
        stack.push(133);
        stack.push(89);
        stack.push(612);
        stack.push(49);

        logger.log("Elements in the Stack: ");
        
        //print the stack elements
        stack.printStack();

        // remove element from stack
        stack.pop();
        stack.pop();
        
        logger.log("\nAfter deleting the element:");
        
        //print the stack elements
        stack.printStack();

    }
}
