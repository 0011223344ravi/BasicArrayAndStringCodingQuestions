package org.example.basicarrayandstringcodingquestions.Tree;



public class BinaryTreeDemo {
     public static TreeNode createTree(){
          TreeNode root  = new TreeNode(1);
          root.left  = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          root.right.right  = new TreeNode(6);
          return root ;
     }

     // Traversals

    //inorder
    // left -> root -> right

    public static void inorder(TreeNode  root){
         if(root == null) return;

         inorder(root.left);
        System.out.print(root.val +" ");
        inorder(root.right);
    }
    // Preorder: Root → Left → Right

    public static void preOrder(TreeNode  root){

        if(root == null) return;
        System.out.print(root.val +" ");
        preOrder(root.left);

        preOrder(root.right);
    }

    // Postorder: Left → Right → Root
    public static void postOrder(TreeNode  root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val +" ");

    }

    public static void main(String[] args) {
       TreeNode root  = createTree();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Preorder: ");
        preOrder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postOrder(root);
        System.out.println();
    }

}
