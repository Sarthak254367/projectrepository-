public class main8 {
     Node head;
     private int size;
     main8(){
        this.size=size;
    }
    class Node{
        String data;
        Node next;
       

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
          Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            return ;
        }

        //head will not updatr
        Node currNode=head;
        while(currNode.next!=null){
          currNode=currNode.next;
        }
        
    

    currNode.next=newNode;
}



public void printList(){
    Node currNode=head;
    while(currNode.next!=null){
        System.out.println(currNode.data);
    
        currNode=currNode.next;
    }
    System.out.println("NuLL");
}


//delete first
public void deleteFirst(){
    if (head==null) {
        System.out.println("the list is empty");
        return;
    }
    size--;

    if(head.next==null){
        head=null;
        return;
    }
    Node secondLast=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;
    }

    secondLast.next=null;
}

    public int getSize(){
       return size;
    }

    public static void main(String[] args) {
        //linked list
       //singular linked list
      main8 list=new main8();
      list.addFirst("a");
      list.addFirst("is");
      list.printList();
      list.addLast("list");
       list.printList();

       list.deleteFirst();
       list.printList();
       System.out.println(list.getSize());
      

    }
}
