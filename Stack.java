//Stack Implementation using an Array 

public class Main
{
  public static void main(String[] args)
  {
    ArrayStack stack = new ArrayStack(5);
    
    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    stack.display();
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    stack.display();
  }
  
}

class ArrayStack{
  private int maxSize;
  private int[] stackArray;
  private int top;
  
  public ArrayStack(int size)
  {
    this.maxSize=size;
    this.stackArray = new int[maxSize];
    this.top=-1;
  }
  
  public void push(int value)
  {
    if(isFull())
    {
      System.out.println("Stack is full");
      return;
    }
    stackArray[++top]=value;
  }
  
  public int pop()
  {
    if(isEmpty())
    {
      System.out.println("Stack is empty");
      return -1;
    }
    return stackArray[top--];
  }
  
  public int peek(){
    if(isEmpty())
    {
      System.out.println("Stack is empty");
      return -1;
    }
    return stackArray[top];
  }
  
  public boolean isEmpty(){
    return top==-1;
  }
  
  public boolean isFull()
  {
    return top==maxSize -1;
  }
  
  public void display()
  {
    if(isEmpty())
    {
      System.out.println("Stack is empty");
      return;
    }
    for(int i=0;i<=top;i++)
    {
      System.out.print(stackArray[i]+ " ");
    }
    System.out.println();
  }
}
