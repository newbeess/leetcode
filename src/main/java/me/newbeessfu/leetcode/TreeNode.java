package me.newbeessfu.leetcode;

public class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static TreeNode buildTree() {
    TreeNode treeNode4 = new TreeNode(4, null, null);
    TreeNode treeNode5 = new TreeNode(5, null, null);
    TreeNode treeNode6 = new TreeNode(6, null, null);
    TreeNode treeNode7 = new TreeNode(7, null, null);
    TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
    TreeNode treeNode3 = new TreeNode(3, treeNode6, treeNode7);
    return new TreeNode(1, treeNode2, treeNode3);
  }

  public static void main(String[] args) {
    TreeNode treeNode = buildTree();
    tt(treeNode);
  }

  public static void tt(TreeNode treeNode){
    if (treeNode==null){
      return;
    }
    tt(treeNode.left);
    System.out.println(treeNode.val);
    tt(treeNode.right);
  }
}
