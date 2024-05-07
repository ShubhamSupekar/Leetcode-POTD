// ONLY 1046 / 1265 testcases passed

class Solution {
    public ListNode doubleIt(ListNode head) {
        int num=0;
        ListNode l = head;
        while(l!=null){
            num = num*10+l.val;
            l = l.next;
        }
        num = num*2; 
        String n = Integer.toString(num);
        ListNode m = head;
        ListNode last = head;
        for(int i=0;i<n.length();i++){
            int digit = n.charAt(i)-'0';
            if(head==null){
                last.next =  new ListNode(digit); 
                last = last.next;
            }else{
                head.val = digit;
            }
            last = head;
            if(head!=null){head = head.next;}
        }
        return m;
    }
}