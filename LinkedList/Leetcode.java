
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Leetcode {

  public boolean hasCycle(ListNode head) {

    ListNode hare = head;
    ListNode tort = head;

    if (hare == null || hare.next == null) {
      return false;
    }

    while (hare != null && hare.next != null) {

      hare = hare.next.next;
      tort = tort.next;
      if (hare == tort) {
        return true;
      }
    }
    return false;
  }
}
