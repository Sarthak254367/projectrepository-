lass Node {
    int data;
    Node next;
    Node prev;

    // Corrected constructor: takes data, next, and prev
    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    // Overloaded constructor for convenience when creating a new node with only data
    Node(int data) {
        this(data, null, null);
    }
}

class LinkedList {
    Node head; // Head of the doubly linked list

    // Corrected insertAtBefore method: takes data as a parameter
    void insertAtBefore(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
            return;
        }
        newNode.next = head; // Link new node's next to the current head
        head.prev = newNode; // Link current head's prev to the new node
        head = newNode;      // Update head to the new node
    }
    
    void insertAtEnd(int data){
        Node newNode=new Node(data);
         if (head == null) {
            head = newNode; // If the list is ode becomes the head
            return;
        }
       Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        
        
        
    }
    
    void deleteHead(){
      if(head==null){
      
        return;
      }
        head=head.next;
        
       
      head.prev=null;
    
    }
  
     
    

    public void display() {
      Node temp=head;
        while (temp != null) {
            System.out.print(temp.data + " "); // Print data and a space
            temp = temp.next;
        }
        System.out.println(); // New line after printing all elements
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Instantiate LinkedList
        list.insertAtBefore(23);
        list.insertAtBefore(21);
        list.insertAtBefore(24);
        list.insertAtEnd(34);
        list.deleteHead();
        list.display(); // Should print: 24 21 23
    }
}
// Use this editor to write, c
