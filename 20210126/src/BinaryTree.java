import java.util.LinkedList;
import java.util.Queue;

/**
 * User:DELL
 * Date:2021-01-26
 * Time:9:47
 */

class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode( char val) {
        this.val = val;
    }
}
public class BinaryTree {
    public BTNode createTree(){
        BTNode A =new BTNode('A');
        BTNode B =new BTNode('B');
        BTNode C =new BTNode('C');
        BTNode D =new BTNode('D');
        BTNode E =new BTNode('E');
        BTNode F =new BTNode('F');
        BTNode G =new BTNode('G');
        BTNode H =new BTNode('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        E.right=H;
        C.left=F;
        C.right=G;
        return A;
    }

    public void preOrderTraversal(BTNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    public void inOrderTraversal(BTNode root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);

    }
    public void postOrderTraversal(BTNode root){
        if(root==null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.val);
    }

    static int size=0;
    //节点个数 遍历思路
    public void getSize(BTNode root){
        if(root!=null){
            size++;
            getSize(root.left);
            getSize(root.right);
        } else return;
    }

    //子问题
    public int getSize2(BTNode root){
        if(root==null ) return 0;
        return getSize2(root.left)+getSize2(root.right)+1;
    }

    //叶子结点个数
    static int leafSize=0;
    public void getLeafSize1(BTNode root){
        if(root==null) return;
        if(root.left==null &&root.right==null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    public int getLeafSize2(BTNode root){
        if(root==null) {
            return 0;
        }
        if(root.left==null &&root.right==null) {
            return 1;
        }
        return getSize2(root.left)+getSize2(root.right);
    }

    public int getKLevelSize(BTNode root,int k ){
        if(root==null) return 0;
        if(k==1) return 1;
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }

    static int high=0;
    public int getHigh(BTNode root){
        if(root==null) return 0;
        //时间复杂度非常大
        //return getHigh(root.left)>getHigh(root.right) ?
        //        getHigh(root.left)+1:getHigh(root.right)+1;
        int lefthigh=getHigh(root.left);
        int righthigh=getHigh(root.right);
        return lefthigh>righthigh?lefthigh+1:righthigh+1;
    }

    public BTNode find(BTNode root,char val) {
        if(root==null) return null;
        if(root.val==val) {
            return root;
        }
        BTNode ret=find(root.left,val);
        if(ret!=null) return ret;
        ret = find(root.right,val);
        if (ret!=null) return ret;

        return null;
    }

    //时间复杂度是较小的树的节点数
    public boolean isSameTree(BTNode r1,BTNode r2){

        if(r1==null && r2==null){
            return true;
        }
        if(r1==null || r2==null){
            return false;
        }
        if(r1.val!=r2.val){
            return false;
        }
        return isSameTree(r1.left,r2.left) && isSameTree(r1.right,r2.right);
    }

    //contains子树
    public boolean isSubtree(BTNode s, BTNode t) {
        if(s==null || t==null) return false;
        if(isSameTree(s,t)){
            return true;
        }
        if(isSubtree(s.left,t)){
            return true;
        }
        if(isSubtree(s.right,t)){
            return true;
        }
        return false;
    }

    //镜像对称
    public boolean isSymmetricChild(BTNode leftTree,BTNode rightTree){
        if(leftTree==null&& rightTree!=null || leftTree!=null&&         rightTree==null) return false;
        if(leftTree==null && rightTree==null) return true;
        if(leftTree!=null&& rightTree==null) return false;
        if(leftTree.val!=rightTree.val) return false;

        return isSymmetricChild(leftTree.left,rightTree.right)&&                            isSymmetricChild(leftTree.right,rightTree.left);
    }
    public boolean isSymmetric(BTNode root){
        if(root==null) return true;
        return isSymmetricChild(root.left,root.right);
    }

    //判断平衡树

    public int maxDepth(BTNode root) {
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return leftHeight  > rightHeight  ?
                leftHeight +1 : rightHeight +1;
    }

    //层序遍历
    public void levelOrderTraversal(BTNode root){
        if(root==null) return;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){

            BTNode cur = queue.poll();
            System.out.print(cur.val+" ");
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }

    public boolean isBalanced(BTNode root) {
        if(root==null) return true;
        if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1){
            return false;
        }
        if(isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode root = binaryTree.createTree();
//        binaryTree.preOrderTraversal(root);
//        binaryTree.postOrderTraversal(root);
//        binaryTree.getSize(root);
//        System.out.println(BinaryTree.size);
//        binaryTree.getLeafSize1(root);
//        System.out.println(BinaryTree.leafSize);
//        System.out.println("================");
//        binaryTree.getLeafSize2(root);
//        System.out.println(BinaryTree.leafSize);
        binaryTree.levelOrderTraversal(root);

        BTNode ret = binaryTree.find(root,'F');
        System.out.println(ret.val);
    }

}
