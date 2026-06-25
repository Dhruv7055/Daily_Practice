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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;  // way more good than above solution written in nth_Node function
		ListNode fast = head;  // turtle rabbit technique
		for(int i = 1; i <= n; i++) {
			fast = fast.next;
		}
		if(fast == null) {  // this is suppose in test case 1 if n = 5 the fast will point to null 
		    head = head.next; // so handle that we have written this
			return head;
		}
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
    }
}