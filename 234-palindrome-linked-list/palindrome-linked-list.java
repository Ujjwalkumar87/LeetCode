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
    public boolean isPalindrome(ListNode head) {
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
        while(j != null){
            if(i.val != j.val) return false;
            else{
                i = i.next;
                j = j.next;
            }
        }
        return true;
    }
}


// Array List
// class Solution {
//  public boolean isPalindrome(ListNode head) {
//     ArrayList<Integer> ans = new ArrayList<>();
//     ListNode temp = head;
//     while(temp != null){
//         ans.add(temp.val);
//         temp = temp.next;
//     }
//     int i = 0;
//     int j = ans.size() - 1;
//     while(i <= j){
//         int a = ans.get(i);
//         int b = ans.get(j);
//         if(a != b) return false;
//             i++;
//             j--;
//     }
//     return true;
//     }
// }