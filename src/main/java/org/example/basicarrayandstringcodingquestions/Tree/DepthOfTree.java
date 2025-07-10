package org.example.basicarrayandstringcodingquestions.Tree;

import com.sun.source.tree.Tree;

public class DepthOfTree {

    public static int returnDepthOfTree(TreeNode  root){
         if(root  ==null)
              return 0;

       int leftDepth =  returnDepthOfTree(root.left);
     int rightDepth=    returnDepthOfTree(root.right);
         return  1+ Math.max(leftDepth,rightDepth);
    }

    public static TreeNode createTree(){
        TreeNode root  = new TreeNode(1);
        root.left  = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right  = new TreeNode(6);
        return root ;
    }
    public static void main(String[] args) {
       TreeNode root  = createTree();
      int depth = returnDepthOfTree(root);
        System.out.println("depth " + depth);
    }
}
