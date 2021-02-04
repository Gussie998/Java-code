/**
 * User:DELL
 * Date:2021-02-03
 * Time:11:52
 */
package bstree;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-02-03
 * Time: 11:26
 */




class BinarySearchTree {

    static class BSNode {
        public int val;
        public BSNode left;
        public BSNode right;
        public BSNode(int val) {
            this.val = val;
        }
    }
    public BSNode root = null;

    public BSNode search(int val) {
        if(root == null) return null;
        BSNode cur = root;
        while (cur!=null){
            if(val<cur.val){
                cur=cur.left;
            }else if(val==cur.val){
                return cur;
            } else {
                cur = cur.right;
            }
        }
        return  null;
    }

    public boolean insert(int val) {
        BSNode bsNode = new BSNode(val);
        if(root==null) {
            root=bsNode;
            return true;
        }
        BSNode cur = root;
        BSNode parent = null;
        while (cur!=null) {
            if (bsNode.val < cur.val) {
                parent = cur;
                cur = cur.left;
            } else if (bsNode.val == cur.val) {
                return false;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        if (parent.val>val){
            parent.left=bsNode;
        }else {
            parent.right=bsNode;
        }
        return true;

    }

    public void remove(int val) {
        if(root == null) return;
        BSNode cur = root;
        BSNode parent = null;
        while (cur != null) {
            if(cur.val == val) {
                removeNode(parent,cur,val);
                return;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }

    /**
     * 删除二叉搜索树的节点
     * @param parent
     * @param cur
     * @param val
     */
    public void removeNode(BSNode parent,BSNode cur,int val) {
        if(cur.left == null) {
            if(cur==root) root=cur.right;
            if(cur!=root) {
                if(cur==parent.left){
                    parent.left=cur.right;
                }else {
                    parent.right=cur.right;
                }
            }

        }else if(cur.right == null) {
            if(cur==root) {
                root = cur.left;
            }
            else if(cur==parent.left){
                parent.left=cur.left;
            }else {
                parent.right=cur.left;
            }

        }else {

        }
    }

}
public class TestDemo {

    public static void main(String[] args) {
    }
}

