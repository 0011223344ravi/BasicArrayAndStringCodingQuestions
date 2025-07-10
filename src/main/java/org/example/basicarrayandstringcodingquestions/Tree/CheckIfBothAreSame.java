package org.example.basicarrayandstringcodingquestions.Tree;

import com.sun.source.tree.Tree;

public class CheckIfBothAreSame {

    public static TreeNode createTree(){
        TreeNode root  = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right  = new TreeNode(6);
        return root ;
    }

      public static  boolean  isSameTree(TreeNode p , TreeNode q){
          if(p==null && q==null)
               return true;
          if(p==null || q==null)
               return false;
          if(p.val != q.val)
               return false;
           return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
      }

    public static void main(String[] args) {
        TreeNode p =createTree();
         TreeNode q  = createTree();
        // q.right.right.right = new TreeNode(22);
        System.out.println("both trees are same :- " + isSameTree(p,q)) ;
    }

}
