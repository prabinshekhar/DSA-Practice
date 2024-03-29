class Node {
  int data;
  Node next;

  Node(int data)
  {
    this.data =data;
    this.next = null;
}
}

class LinkedList{
  Node head = new Node(23);
  Node temp1 = new Node(30);
  head.next= temp1;

  void display()
  {

}
