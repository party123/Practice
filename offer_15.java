/**
 * Created by 6 on 2018/3/12.
 */
public class offer_15 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null)
            return null;
        ListNode first = head;
        ListNode after = head;
        int i = 0;
        for(i = 0; i < k && first!=null; ++i){
            first = first.next;
        }
        if(i < k)
            return null;
        while(first!=null){
            first = first.next;
            after = after.next;
        }
        return after;
    }
}
