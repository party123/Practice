/**
 * Created by 6 on 2017/10/11.
 */
public class Leetcode_2_Add_two_Numbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int jinwei = 0;
        while(l1!=null || l2!=null){
            int val1 = 0;
            int val2 = 0;
            if(l1!=null){
                val1 = l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                val2 = l2.val;
                l2 = l2.next;
            }

            int sum = val1 + val2 + jinwei;
            res.next = new ListNode(sum%10);
            jinwei = sum/10;
            res = res.next;
        }
        if(jinwei!=0){
            res.next = new ListNode(jinwei);
        }
        return cur.next;
    }
}
