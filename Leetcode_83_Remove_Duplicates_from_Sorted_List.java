/**
 * Created by 6 on 2018/3/1.
 */
public class Leetcode_83_Remove_Duplicates_from_Sorted_List {
    public class ListNode {
      int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode ans = head;
        while(head.next != null){
            if(head.val == head.next.val)
                head.next = head.next.next;
            else head = head.next;
        }
        return ans;
    }
}
