/**
 * Created by 6 on 2017/9/14.
 */
import java.util.*;
public class Kth_Smallest_Element_in_a_BST_230 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int kthSmallest(TreeNode root, int k) {
        int ans = 0;
       Stack<TreeNode> s = new Stack<>();
        if(root == null || k == 0)
            return 0;
        TreeNode temp = root;
       while(temp.left!=null){
           s.push(temp);
           temp = temp.left;
       }
        while(k>0 && (temp!=null)||!s.isEmpty()){
            if(temp == null){
                temp = s.pop();
                if(--k == 0)
                    return temp.val;
                temp = temp.right;
            }
            else{
                s.push(temp);
                temp = temp.left;
            }
        }
        return ans;
    }
}
