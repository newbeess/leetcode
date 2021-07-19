package me.newbeessfu.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PreOrder {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> lists = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode current = root;
    while (!stack.isEmpty() || null != current) {
      while (null != current) {
        stack.push(current);
        current = current.left;
      }
      TreeNode node = stack.pop();
      lists.add(node.val);
      if (null != node.right) {
        current = node.right;
      }
    }
    return lists;
  }


  static int find = 0;
  static TreeNode ancestor = null;

  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    TreeNode ancestor = null;
    Map<Integer,TreeNode> mapP = new HashMap<>();
    Map<Integer,TreeNode> mapQ = new HashMap<>();
    TreeNode currentp = root;
    while(null != currentp){
      mapP.put(currentp.val,currentp);
      if(currentp.val == p.val ){
        break;
      }
      currentp = p.val < currentp.val ? currentp.left : currentp.right;
    }
    TreeNode currentQ = root;
    while(null != currentQ){
      mapQ.put(currentQ.val,currentQ);
      if(currentQ.val == q.val ){
        break;
      }
      currentQ = q.val < currentQ.val ? currentQ.left : currentQ.right;
    }
    for(Integer key : mapP.keySet()){
      if(null != mapQ.get(key)){
        ancestor = mapQ.get(key);
      }
    }
    List<Integer> list = new ArrayList<>();

    return ancestor;
  }

  static boolean exist = false;
  public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    List<TreeNode> s = find(root,subRoot.val);
    if(s.size() == 0){
      return false;
    }

    for(int i=0;i<s.size();i++){
      boolean exist = same(s.get(i),subRoot);
      if(exist){
        break;
      }
    }
    return exist;
  }

  public static List<TreeNode> find(TreeNode root,int val){
    List<TreeNode> result = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    stack.push(root);
    while(!stack.isEmpty()){
      TreeNode node = stack.pop();
      if(node.val == val){
        result.add(node);
      }
      if(node.right != null){
        stack.push(node.right);
      }
      if(node.left != null){
        stack.push(node.left);
      }
    }
    return result;
  }

  public static boolean same(TreeNode s, TreeNode t){
    if(s== null && t== null){
      return true;
    }else if((s==null && t != null) ||(s!=null && t == null)){
      return false;
    }else if(s.val != t.val){
      return false;
    }
    return same(s.left,t.left) && same(s.right,t.right);

  }
  public static void main(String[] args) {
    TreeNode treeNode4 = new TreeNode(4, null, null);
    TreeNode treeNode5 = new TreeNode(5, null, null);
    TreeNode treeNode6 = new TreeNode(6, null, null);
    TreeNode treeNode7 = new TreeNode(7, null, null);
    TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
    TreeNode treeNode3 = new TreeNode(3, treeNode6, treeNode7);
    TreeNode root = new TreeNode(1, treeNode2, treeNode3);
    boolean treeNode = isSubtree(root, treeNode2);
    System.out.println(treeNode);
  }
}
