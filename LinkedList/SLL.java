
package LinkedList;

class Node {

  int data ;
  Node next;

  Node( int data ){

    this.data = data;
    this.next = null;
  }
}

class SingleLL {

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

  public int size(){
    return size;
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

  public void remove(int val) {

    if( Head == null)
      return;

    if(Head.data == val){
      Head = Head.next;
      size--;
      return ;
    }
    Node curr = Head;
    Node prev = null;

    while(curr!= null && curr.data != val){
      prev = curr;
      curr = curr.next;
    }

    if( curr == null ){
      return;
    }

    prev.next = curr.next;
    size--;
    return ;

  }

}

