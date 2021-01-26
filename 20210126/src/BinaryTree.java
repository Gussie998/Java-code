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



    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode root = binaryTree.createTree();
        binaryTree.preOrderTraversal(root);
        binaryTree.postOrderTraversal(root);
        binaryTree.getSize(root);
        System.out.println(BinaryTree.size);
        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println("================");
        binaryTree.getLeafSize2(root);
        System.out.println(BinaryTree.leafSize);
    }

}
