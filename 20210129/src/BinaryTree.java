/**
 * User:DELL
 * Date:2021-01-29
 * Time:9:07
 */

class BTNode{
    public int val;
    public BTNode left;
    public BTNode right;

    public BTNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {

    public int preIndex =0;

    public BTNode buildTreeChild(int[] preorder,int[] inorder,int inbegin,int inend){
        if(inbegin>inend) return null;
        BTNode root=new BTNode(preorder[preIndex]);

        int index = findValInorder(inorder,preorder[preIndex],inbegin,inend);
        preIndex++;
        root.left=buildTreeChild(preorder,inorder,inbegin,index-1);
        root.right=buildTreeChild(preorder,inorder,index+1,inend);
        return root;

    }

    public int findValInorder(int[] inorder,int key,int inbegin,int inend){
        for (int i = inbegin; i <inend+1 ; i++) {
            if(inorder[i]==key) {
                return i;
            }
        }
        return -1;
    }

        //给出前序中序 创建二叉树 求后序遍历
    public BTNode buildTree(int[] preorder,int[] inorder){
        if(preorder==null || inorder==null) return null;
        if(preorder.length==0 || inorder.length==0) return  null;
        int preIndex = 0;

        return buildTreeChild(preorder,inorder,0,inorder.length-1);

    }


    /**
     *
     */

}
