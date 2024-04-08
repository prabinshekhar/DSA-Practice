import java.util.*;

class DoubleLL {
   private class Node {
     int data;
     Node next;
     Node prev;
     
     Node(int data)
     {
       this.prev=null;
       this.data=data;
       this.next=null;
     }
  }
  
  private Node head;
  private Node tail;
  
  DoubleLL()
  {
  this.head=null;
  this.tail=null; 
  }
  
  public void append(int data)
  {
    Node newNode = new Node(data);
    if(head==null)
    {
     head=newNode;
     tail=newNode;
    }
    else{
      tail.next=newNode;
      newNode.prev=tail;
      tail=newNode;
    }
  }
  
  public void display()
  {
    if(head==null)
    {
      System.out.print("Empty");
    }
    else{
      Node curr = head;
      while(curr!=null)
      {
        System.out.print(curr.data+" ");
        curr=curr.next;
      }
      System.out.println();
    }
  }
  
  public void reverseDisplay()
  {
    Node curr =tail;
    while(curr!=null)
    {
      System.out.print(curr.data+" ");
      curr=curr.prev;
    }
    System.out.println();
  }
  
  public static void main(String[]  args)
  {
    DoubleLL list = new DoubleLL();
    list.append(23);
    list.append(34);
    list.append(45);
    list.append(56);
    list.append(67);
    
    list.display();
    list.reverseDisplay();
    
  }
  
}
