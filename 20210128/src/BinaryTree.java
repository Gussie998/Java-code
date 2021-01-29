import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * User:DELL
 * Date:2021-01-28
 * Time:9:17
 */
class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode(char val) {
        this.val = val;
    }
}

public class BinaryTree {
    public boolean isCompleteTree(BTNode root){
        Queue<BTNode> queue = new LinkedList<>();
        if(root==null) return true;
        queue.offer(root);
        while (queue.isEmpty()) {
            BTNode cur=queue.poll();
            if(cur!=null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                break;
            }
            while (!queue.isEmpty()){
                BTNode cur2 = queue.peek();
                if(cur!=null){
                    return false;
                } else {
                    queue.poll();
                }
            }
        }
        return true;
    }

    //非递归实现前序遍历
    public void preOrder(BTNode root){

        if(root==null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur=root;

        while (cur!=null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.println(cur.val + " ");
                cur = cur.left;
            }
            BTNode top = stack.pop();
            cur = top.right;
        }
        System.out.println();

    }

    public void inOrder(BTNode root) {
        if(root==null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur=root;
        while (cur!=null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.pop();
            System.out.println(top.val+" ");
            cur = top.right;
        }
        System.out.println();
    }

    public void postOrder(BTNode root) {
        if(root==null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur=root;
        while (cur!=null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.peek();
            BTNode prev = null;
            if(top.right==null ||top.right == prev ){
                stack.pop();
                System.out.println(top.val+" ");
                prev =top;
            } else {
                cur=top.right;
            }
        }
        System.out.println();
    }

    public static int i=0;
    public BTNode createTree(String str){
        if(str==null || str.length()<=0) return null;
        BTNode root = null;
        if(str.charAt(i)!='#'){
            root = new BTNode(str.charAt(i));
            i++;
            root.left=createTree(str);
            root.right=createTree(str);
        } else {
            i++;
        }
        return root;
    }

    public BTNode lowestCommonAncestor(BTNode root, BTNode p, BTNode q) {
        if(root==null) return null;
        if(p==root ||q==root) return root;
        BTNode left= lowestCommonAncestor(root.left,p,q);
        BTNode right= lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        if (left!=null) return left;
        if (right!=null) return right;
        return null;

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int n=0;
        for(int i=0;i<ransomNote.length();i++){
            if(!magazine.contains(ransomNote.charAt(i)+"")){
                return false;
            } else{
                n++;
                magazine.replaceFirst(ransomNote.charAt(i)+"","*");
            }
        }
        if(n==ransomNote.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        canConstruct("aa","ab");
    }


}
