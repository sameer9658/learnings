package com.datastructure.tree;

import com.Collections.Node;

class NodeFORTree {
    int key;
    NodeFORTree left, right;

    public NodeFORTree(int item) {
        key = item;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                +'}';
    }
}

public class BinaryTree {

    static NodeFORTree root;

    BinaryTree() {
        root = null;
    }
    /* Given a binary tree, print its nodes according to the
         "bottom-up" postorder traversal. */
    static void printPostOrder(NodeFORTree node) {
        if(node ==null){
            return;
        }
        // first recur on left subtree
        printPostOrder(node.left);
        // then recur on right subtree
        printPostOrder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");


    }


    public static void main(String[] args) {
        NodeFORTree node1 = new NodeFORTree(1);
        NodeFORTree node2 = new NodeFORTree(2);
        NodeFORTree node3 = new NodeFORTree(3);
        NodeFORTree node4 = new NodeFORTree(4);
        NodeFORTree node5 = new NodeFORTree(5);
        NodeFORTree node6 = new NodeFORTree(6);
        NodeFORTree node7 = new NodeFORTree(7);
        NodeFORTree node8 = new NodeFORTree(8);
        NodeFORTree node9 = new NodeFORTree(9);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = node1;
        binaryTree.root.left = node2;
        binaryTree.root.right = node3;
        binaryTree.root.left.left = node4;
        binaryTree.root.left.left.right = node9;
        binaryTree.root.left.right = node5;
        binaryTree.root.right.left = node6;
        binaryTree.root.right.right = node7;
        binaryTree.root.right.right.right = node8;

        printPostOrder(root);

    }

}
