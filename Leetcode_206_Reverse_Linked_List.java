/**
 * Created by 6 on 2018/3/11.
 */
public class Leetcode_206_Reverse_Linked_List {

    public static ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = null;
        ListNode ans = head;
        ListNode next = head.next;
        while(next != null){
            ListNode temp = next.next;
            ans.next = pre;
            next.next = ans;
            ans = next;
            pre = ans;
            next = temp;
        }
        return ans;
    }

    public static void main(String args[]){
        ListNode test = new ListNode(1);
        ListNode test2 = new ListNode(2);
        test.next = test2;
        System.out.println(reverseList(test).val);
    }
}
