/**
* UnitTest.java
*/
package com.binarytree.test.chen;

import org.junit.Test;

import com.binarytree.chen.BinaryTree;

/**
 *
 * @author LiuChen
 * @date 2016年11月24日 下午2:35:16
 *
 */

public class UnitTest {

    @Test
    public void testTraverse() {
        BinaryTree<String> iTree = new BinaryTree<String>();
        iTree.insert("a").insert("b").insert("c").insert("d").insert("e").insert("f").insert("g").insert("h").insert("i");
        iTree.preOrderTraverse(iTree.getRoot());System.out.println();
        iTree.inOrderTraverse(iTree.getRoot());System.out.println();
        iTree.postOrderTraverse(iTree.getRoot());System.out.println();
    }
    
    @Test
    public void testGetNodeCount() {
        BinaryTree<String> iTree = new BinaryTree<String>();
        iTree.insert("a").insert("b").insert("c").insert("d").insert("e").insert("f").insert("g").insert("h").insert("i");
        System.out.println(iTree.getNodeCount(iTree.getRoot()));
    }
}
