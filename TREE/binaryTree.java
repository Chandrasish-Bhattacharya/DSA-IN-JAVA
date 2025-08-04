package TREE;

public class binaryTree{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class BinnaryTree{
        static int index = -1;
        public static Node BuildTree(int node[]){
            index++;
            if(index >= node.length || node[index] == -1){
                return null;
            }
            Node newNode = new Node(node[index]);
            newNode.left = BuildTree(node);
            newNode.right = BuildTree(node);
            return newNode;
        }
        // lets implement a method to print the tree in pre-order
        public static void preOrder(Node root){

            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        // lets implement a method to print the tree in in-order
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        // lets implement a method to print the tree in post-order
        public static void postOrder(Node root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String args[]){
        int node[] = {1,2,3,-1,-1,5,-1,-1,3,-1 ,6,-1,-1};
        BinnaryTree tree = new BinnaryTree();
        Node root = tree.BuildTree(node);
        System.out.println("Binary Tree created with root value: " + root.data);
        tree.preOrder(root);
        System.out.println("\nIn-order traversal of the tree:");
        tree.inOrder(root);
        System.out.println("\nPost-order traversal of the tree:");
        tree.postOrder(root);
    }
}