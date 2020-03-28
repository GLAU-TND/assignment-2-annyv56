/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
  TreeNode root;
  void printSingles(TreeNode node)
  {
    if(node == null)
      return;
    if(node.left != null && node.right != null);
    {
      printSingles(node.left);
      printSingles(node.right);
    }
}
