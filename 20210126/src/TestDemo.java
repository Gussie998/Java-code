/**
 * User:DELL
 * Date:2021-01-26
 * Time:16:16
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  
public class TestDemo {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if(t1==null && t2==null) return null;
            if(t1==null) {
                return t2;
            } else if( t2==null){
                return t1;
            }
            t1.val+=t2.val;

            t1.left= mergeTrees(t1.left,t2.left);
            t1.right= mergeTrees(t1.right,t2.right);
            return t1;

        }
}
