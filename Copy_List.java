/**
 * Created by 6 on 2017/7/6.
 */
class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };

  public class Copy_List {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
                return null;
        RandomListNode pnode = head;
        RandomListNode qnode = head;
        RandomListNode znode = head;
        RandomListNode znewnode = null;
        RandomListNode zhead = null;
        while(pnode!=null){
            RandomListNode newnode = new RandomListNode(pnode.label);
            newnode.next = pnode.next;
            newnode.random = null;
            pnode.next = newnode;
            pnode = newnode.next;
        }

        while(qnode!=null){
            RandomListNode qnewnode = qnode.next;
            if(qnode.random!=null)
                qnewnode.random = qnode.random.next;
            qnode = qnewnode.next;
        }

        if(znode!=null) {
            zhead = znode.next;
            znewnode = znode.next;
            znode = znewnode.next;
        }
        while(znode!=null){
            znewnode.next = znode.next;
            znewnode = znewnode.next;
            znode.next = znewnode.next;
            znode = znode.next;
        }
        return zhead;
    }

    public static void main(String args[]){

    }
}
