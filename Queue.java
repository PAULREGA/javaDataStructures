import java.util.LinkedList;

public class Queue {
   private LinkedList<Object> elements;

   public Queue() {
	elements = new LinkedList<>();
   }

   public void enqueue(Object item) {
	elements.addLast(item);
   }

   public Object dequeue() {
	return elements.removeFirst();
   }

   public boolean isEmpty() {
	return elements.isEmpty();
   }
   public  Object peek() {
	return elements.getFirst();  
   }
   public int size() {
	return elements.size();
   }

   public static void main(String[]args) {
	Queue queue = new Queue();

	queue.enqueue("A");
	queue.enqueue("B");
	queue.enqueue("C");

	while (!queue.isEmpty()) {
	    System.out.println(queue.dequeue());
	}
    }
}
	