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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode head = new ListNode();
        if(list1 == null || list2 == null) return head;

        while(h1 != null && h2 != null)
        {
            if(h1.val <= h2.val)
            {
                head.val = h1.val;
                ListNode node = new ListNode();
                h1.next = node;
            }
            else
            {
                head.val = h2.val;
                h2 = h2.next;
                ListNode node = new ListNode();
                h1.next = node;
            }
        }
        return head;
    }
}
