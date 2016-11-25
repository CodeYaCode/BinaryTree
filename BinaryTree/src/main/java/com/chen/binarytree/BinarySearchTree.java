/**
* BinarySearchTree.java
*/
package com.chen.binarytree;

/**
 *
 * @author LiuChen
 * @date 2016年11月24日 下午4:34:20
 *
 */

public class BinarySearchTree extends BinaryTree<Integer> {
    
    /**
     * Insert a node into binary search tree.
     * 
     * @param value
     * @return
     */
    public BinarySearchTree insertSearch(Integer value) {
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(value);
        if(this.root == null) {
            this.root = newNode;
            return this;
        }
        BinaryTreeNode<Integer> temp = this.root;
        while(temp != null) {
            if(temp.getValue() == value) {
                return this;
            } else if(temp.getValue() < value) {
                if(temp.getRightNode() == null) {
                    temp.setRightNode(newNode);
                    break;
                }
                temp = temp.getRightNode();
            } else {
                if(temp.getLeftNode() == null) {
                    temp.setLeftNode(newNode);
                    break;
                }
                temp = temp.getLeftNode();
            }
        }
        return this;
    }
    
    public BinaryTreeNode<Integer> searchNode(BinaryTreeNode<Integer> node, Integer value) {
        if(node == null) {
            return null;
        }
        if(node.getValue() == value) {
            return node;
        } else if(node.getValue() < value) {
            return searchNode(node.getRightNode(), value);
        } else {
            return searchNode(node.getLeftNode(), value);
        }
    }
}
