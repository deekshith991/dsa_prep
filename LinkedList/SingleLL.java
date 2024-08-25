
package LinkedList;

class Node {

  int data ;
  Node next;

  Node( int data ){

    this.data = data;
    this.next = null;
  }
}

public class SingleLL {

  private Node Head;
  public int size = 0;

  SingleLL(){
    this.Head = null;
  }

  public void display(){

    Node curr = Head;

    while (curr != null) {
      System.out.print( curr.data + " -> ");
      curr = curr.next;
    }

    System.out.println("null");
  }



  public void add(int data ){

    Node newNode = new Node(data);
    if(Head == null){
      Head = newNode;
    } else {
      Node curr = Head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = newNode;
    }

    size++;
  }

}
