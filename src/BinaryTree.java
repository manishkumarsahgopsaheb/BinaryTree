class Node{
    int data;
    Node left;
    Node right;
    public Node(int value){
        data = value;
        left = null;
        right = null;
    }
}

class BinaryTreeNode{
    public void printPreOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public void printInOrder(Node root){
        if(root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.println(root.data+" ");
        printInOrder(root.right);
    }

    public void printPostOrder(Node root){
        if (root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data+" ");
    }

}


public class BinaryTree {

    public static void main(String[] args) {
//        here i am creating the seven node
        Node root = new Node(11);
        root.left = new Node(7);
        root.right = new Node(22);
        root.left.left = new Node(2);
        root.left.right = new Node(9);
        root.right.left = new Node(14);
        root.right.right = new Node(26);

        BinaryTreeNode binaryTreeNode = new BinaryTreeNode();

        System.out.println("PreOrderData of Binary Tree is: ");
        binaryTreeNode.printPreOrder(root);

        System.out.println("InOrderData of Binary Tree is: ");
        binaryTreeNode.printInOrder(root);

        System.out.println("PostOrderData of Binary Tree is: ");
        binaryTreeNode.printPostOrder(root);

    }
}
