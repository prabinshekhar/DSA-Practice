import java.util.*;

public class LinkedList {
  
    private class Node{
      int data;
      Node next;
      
      Node (int data)
      {
        this.data = data;
        this.next=null;
      }
    }
    
    private Node head;
    public LinkedList()
    {
      head=null;
    }
    
    
    public void add(int data)
    {
      Node newNode = new Node(data);
      if(head==null)
      {
        head=newNode;
      }
      else{
        Node curr = head;
        while(curr.next!= null)
        {
          curr=curr.next;
        }
        curr.next=newNode;
        
      }
    }
    
    public void display(){
      Node curr=head;
      while(curr!=null)
      {
        System.out.print(curr.data + " ");
        curr= curr.next;
      }
      System.out.println();
    }
    
    public int llength()
       {
           int l=0;
           Node curr = head;
           while(curr!=null)
           {
               l++;
               curr=curr.next;
           }
          return l;
       }
  
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.add(1);
      list.add(2);
      list.add(3);
      
      list.display();
      System.out.print(list.llength());
      
}
}
