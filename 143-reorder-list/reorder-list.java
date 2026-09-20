/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
       
       
        ListNode current = head;
        ListNode forward = null;
        ListNode previous = null;
        while(current != null){
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);

        ListNode i = head;
        ListNode j = head2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i != null && j != null){
            k.next = i;
            i = i.next;
            k = k.next;

            k.next = j;
            j = j.next;
            k = k.next;
        }
        if(i == null) k.next = j;
        else k.next = i;
        head = dummy.next;
    }
}