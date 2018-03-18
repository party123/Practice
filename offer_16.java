/**
 * Created by 6 on 2018/3/12.
 */
public class offer_16 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode cur = head;
        ListNode ans = null;
        while (cur!=null){
           ListNode next = cur.next;
            if(next == null)
                ans = cur;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return ans;
    }
}
