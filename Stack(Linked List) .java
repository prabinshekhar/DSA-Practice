//Stack Implementation using Linked List

public class Main
{
  public static void main(String[] args)
  {
    LLStack stack = new LLStack();
    
    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    stack.display();
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    stack.display();
  }
  
}

class Node {
  int data;
  Node next;
  
  public Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}

class LLStack{
  private Node top;
  
  public LLStack()
  {
    this.top=null;
  }


  //Inserting at Start
  public void push(int val)
  {
    Node newnode = new Node(val);
    newnode.next=top;
    top=newnode;
  }

  //Deleting at start 
  public int pop()
  {
    if(isEmpty())
    {
      System.out.println("Stack is empty");
      return -1;
    }
    int val = top.data;
    top=top.next;
    return val;
  }
  
  public void display()
  {
    if(isEmpty())
    {
      System.out.println("Stack is empty");
    }
    Node curr = top;
    while(curr!=null)
    {
      System.out.print(curr.data+ " ");
      curr=curr.next;
    }
  }
  
  public int peek()
  {
    if(isEmpty())
    {
      System.out.println("Stack is empty");
      return -1;
    }
    return top.data;
  }
  
  public boolean isEmpty(){
    return top==null;
  }
  
}
