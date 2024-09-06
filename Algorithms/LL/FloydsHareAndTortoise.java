
package Algorithms.LL;

/**
 * FloydsHareAndTortoise
 */
public class FloydsHareAndTortoise {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle here

        boolean result = hasCycle(node1);
        System.out.println("Cycle detected: " + result);
    }

    public static boolean hasCycle(ListNode Head){

        if ( Head == null || Head.next == null)
            return false;

        ListNode tortoise = Head;
        ListNode hare = Head.next;
        while( hare != null && hare.next != null ){
            if( tortoise == hare ){
                return true;
            }

            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return false;
    }
}

class ListNode {

     int data;
     ListNode next;

     ListNode( int data ){
         this.data = data;
         this.next = null;
     }
}
