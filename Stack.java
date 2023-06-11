public class Stack {
	private int maxSize;
	private int top;
	private int[] stackArray;

	public Stack(int maxSize) {
	     this.maxSize = maxSize;
	     this.top = -1; 
	     this.stackArray = new int[maxSize];

	}
	
	public void push(int item) {
	    if (top == maxSize - 1) {
	        System.out.println("Stack is full cannot push item.");
		return;
	    }
 	     stackArray[++top] = item;
	}
	
	public int pop() {
	     if (top == -1) {
	         System.out.println("Stack is empty cannot pop item");
	         return -1;
	     }
	     return stackArray[top--];
	}

	public int peek() {
	    if (top == -1) {
		System.out.println("Stack is empty. No item to peek");
                return -1;
	    }
	    return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
	
	public static void main(String[]args) {
	     Stack stack = new Stack(5);
	     stack.push(10);
	     stack.push(20);
	     stack.push(30);

	     System.out.println("Top item :" + stack.peek());
	     System.out.println("Popped item: " + stack.pop()); // Output: 30
             System.out.println("Popped item: " + stack.pop()); // Output: 20

             System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
       }
}		