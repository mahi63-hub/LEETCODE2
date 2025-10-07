/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode left=head, right=head;
        while(right!=null && right.next!=null){
            left=left.next;
            right=right.next.next;
            if(left==right){
                return true;
            }
        }
        return false;
    }
}