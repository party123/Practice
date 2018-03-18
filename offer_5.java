import java.util.*;

/**
 * Created by 6 on 2018/3/11.
 */
public class offer_5 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
       Stack<Integer> temp = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while (listNode != null) {
            temp.push(listNode.val);
            listNode = listNode.next;
        }
        while(!temp.empty()) {
            ans.add(temp.pop());
        }
        return ans;
    }
}
