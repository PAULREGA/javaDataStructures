
public class Node {
    int data;
    Node next;

    public Node(int data) {
	this.data = data;
	this.next = null;
    }


public static class LinkedList {
     private Node head;
     
     public LinkedList() {
	this.head = null;
	
     }
	
     public void insert(int data) {
	Node newNode = new Node(data);
	if (head == null) {
	    head = newNode;
	} else {
	    Node current = head;
	    while (current.next != null) {
	        current = current.next;
	    }
	    current.next = newNode;
	}
      }
      
      public void display() {
	   Node current = head;
	   while (current != null) {
	        System.out.print(current.data + " ");
 		current = current.next;
	   }
	   System.out.println();
      }

      public boolean search(int data) {
	 Node current = head;
	 while (current != null) {
	     if (current.data == data) {
		return true;
	     }
	     current = current.next;
	 }
	return false;
      }

      public void delete(int data) {
	  if (head == null) {
	      return;
	  }
	  if (head.data == data) {
	      head = head.next;
	  } else {
	    Node current = head;
	    while (current.next != null && current.next.data != data) {
	  	current = current.next;
	    }
	    if (current.next != null) {
		current.next = current.next.next;
	    }
	  }
      }



      public static void main(String[] args){
	    LinkedList list = new LinkedList();
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.display();

	    System.out.println(list.search(20));
	    System.out.println(list.search(30));
	    list.delete(20);
	    list.display();
       }
    }
}

