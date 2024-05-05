/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        while(node!=null){
           int temp = node.next.val;
           node.val = temp;
           if(node.next.next == null){
                node.next = null;
                break;
           }
           node = node.next; 
        }
    }
}
