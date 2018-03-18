import javax.swing.tree.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
/**
 * Created by 6 on 2017/10/11.
 */
public class Leetcode297_Serialize_and_Deserialize_Binary_Tree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        maketree(root,s);
        return s.toString();
    }
    public void maketree(TreeNode root, StringBuilder s){
        if(root == null){
            s.append("null"+",");
        }
        else{
            s.append(root.val+",");
            maketree(root.left,s);
            maketree(root.right,s);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> node = new LinkedList<>();         //Deque为双向队列,后面只能创建LinkedList
        node.addAll(Arrays.asList(data.split(",")));
        return buildtree(node);
    }

    public TreeNode buildtree(Deque<String> node){
        String val = node.remove();
        if(val.equals("null")) return null;
        else{
            TreeNode nodes = new TreeNode(Integer.valueOf(val));
            nodes.left = buildtree(node);
            nodes.right = buildtree(node);
            return nodes;
        }
    }
}
