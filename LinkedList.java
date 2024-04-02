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

   public void addBegin(int data)
       {
           Node newNode = new Node(data);
           newNode.next=head;
           head=newNode;
       }

  public void deleteFromEnd()
    {
      if(head==null || head.next==null)
      {
        head=null;
      }
      else{
        Node curr = head;
        while(curr.next.next!=null)
        {
          curr=curr.next;
        }
        curr.next=null;
      }
    }

  public void deleteFromBegin()
    {
       if(head!=null)
       {
           head=head.next;
       }
       
    }

  public void search(int s)
  {
      int flag=0;
      Node curr = head;
      while(curr!=null)
      {
          if(curr.data==s)
          {
              flag=1;
              System.out.print("Found");
              break;
          }
          curr=curr.next;
      }
     if(flag!=1)
     {
         System.out.print("Not Found");
     }
  }
    public static void main(String[] args) {
      LinkedList list = new LinkedList();
      list.add(1);
      list.add(2);
      list.add(3);
      
      list.display();
      System.out.print(list.llength());
      list.deleteFromEnd();
      list.display();
      
}
}
