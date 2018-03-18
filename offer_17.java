/**
 * Created by 6 on 2018/3/13.
 */
public class offer_17 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode ans = list1.val>list2.val?list2:list1;
        while(list1 != null || list2 != null){
            while(list1.val < list2.val){
                list1 = list1.next;
            }
            while(list1.val > list2.val){
                list2 = list2.next;
            }
        }
        return ans;
    }
}
