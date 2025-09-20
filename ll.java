import java.util.*;

class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data=data;
    this.next=null;
  }
}

class LinkedList{
 Node head;
 void insertAtHead(int data){
 
   Node newNode=new Node(data);
   newNode.next=head;
   head=newNode;
 }
 
 void insertAtEnd(int data){
    Node newNode=new Node(data);
  if(head==null){
    head=newNode;
    return ;
  }
  
  Node temp=head;
  while(temp.next!=null){
    temp=temp.next;
  }
  
  temp.next=newNode;
 }
 
 void insertAtMiddle(int data,int position){
   Node newNode=new Node(data);
   if(position==1){
     newNode.next=head;
     head=newNode;
     return;
     
   }
   
    Node temp=head;
    int count=1;
    while(temp!=null){
      
    if(count==position-1){
      newNode.next=temp.next;
      temp.next=newNode;
      return;
      
    }
    temp=temp.next;
    count++;
    
 }
 }
 void deleteHead(){   
  if(head==null){
    System.out.println("empty");
    return;
  }
  head=head.next;
}


void deleteEnd(){
  Node temp=head;
  if(head==null  && head.next==null){
    return;
  }
  while(temp.next.next!=null){
    temp=temp.next;
  }
  temp.next=null;
}
void deleteMid(int data,int k){
  if(k==1){
    head=head.next;
    return;
  }
  
  Node temp=head;
  Node prev=null;
  int count=0;
  
  while(temp!=null){
    count++;
    if(count==k){
      prev.next=temp.next;
    }
    
    prev=temp;
    temp=temp.next;
    
  }
}

  void display(){
      Node current=head;
    while(current!=null){
      System.out.println(current.data);
      current=current.next;
      
    }
  }
}

 
 public class node{
 public static void main(String[] args) {
     LinkedList list=new LinkedList();
     list.insertAtHead(4);
     list.insertAtHead(23);
     list.insertAtHead(12);
     list.insertAtHead(90);
     list.insertAtEnd(8);
     list.insertAtMiddle(93,3);
     list.deleteHead();
     list.display();
     
  }
}