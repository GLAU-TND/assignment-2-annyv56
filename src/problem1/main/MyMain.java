/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {
  public static void main(String[] args)
  {
    MyBinarySearchTree tree = new MyBinarySearchTree();
    tree.root = new TreeNode(1);
    tree.root.left = new TreeNode(2);
    tree.root.right = new TreeNode(3);
    tree.root.left.right = new TreeNode(4);
    tree.root.right.left = new TreeNode(5);
    tree.root.right.left.right = new TreeNode(6); 
    tree.printSingles(tree.root);
  }
}
