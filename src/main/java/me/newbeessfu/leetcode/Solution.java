package me.newbeessfu.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {

  public static Node cloneGraph(Node node) {
    if (null == node) {
      return null;
    }
    Map<Integer, Node> map = new HashMap<>();
    Deque<Node> queue = new LinkedList<>();
    Node root = new Node(node.val, new ArrayList<>());
    map.put(root.val, root);
    queue.offer(node);
    while (!queue.isEmpty()) {
      Node current = queue.poll();
      for (Node neibor : current.neighbors) {
        Node neiborCloned = map.get(neibor.val);
        if (null == neiborCloned) {
          neiborCloned = new Node(neibor.val, new ArrayList<>());
          map.put(neiborCloned.val, neiborCloned);
        }
        map.get(current.val).neighbors.add(neiborCloned);
        queue.offer(neibor);
      }
    }
    return root;

  }

  public static boolean canFinish(int numCourses, int[][] prerequisites) {
    int[] inDegree = new int[numCourses];
    Deque<Integer> queue = new LinkedList<>();
    for (int[] pre : prerequisites) {
      inDegree[pre[0]]++;
    }
    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] == 0) {
        queue.offer(inDegree[i]);
      }
    }
    int i = 0;
    while (!queue.isEmpty()) {
      Integer course = queue.poll();
      i++;
      for (int[] pre : prerequisites) {
        if (pre[1] == course) {
          inDegree[pre[0]]--;
          if (inDegree[pre[0]] == 0) {
            queue.offer(pre[0]);
          }
        }
      }
    }
    return i == numCourses;
  }

  static boolean dag = true;

  public static int[] findOrder(int numCourses, int[][] prerequisites) {
    if (numCourses <= 1) {
      return new int[1];
    }
    int[] inDegree = new int[numCourses];
    for (int[] pre : prerequisites) {
      inDegree[pre[0]]++;
    }
    int startId = -1;
    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] == 0) {
        startId = i;
        break;
      }
    }
    int[] arr = new int[numCourses];
    int[] visited = new int[numCourses];
    dfs(startId, prerequisites, 0, visited, arr);
    return dag ? arr : new int[0];
  }

  public static boolean dfs(int current, int[][] prerequisites, int numCourses, int[] visited, int[] arr) {
    if (visited[current] == 2) {
      return true;
    }
    if (visited[current] == 1) {
      return false;
    }
    visited[current] = 1;
    arr[numCourses] = current;
    for (int[] pre : prerequisites) {
      if (pre[1] == current) {
        if (!dfs(pre[0], prerequisites, ++numCourses, visited, arr)) {
          dag = false;
          return false;
        }
      }
    }
    visited[current] = 2;
    return true;
  }

  public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
    List<Integer> res = new ArrayList<>();
    if (n == 1) {
      res.add(0);
      return res;
    }
    int[] highCount = new int[n];
    int min = 0;
    for (int i = 0; i < n; i++) {
      highCount[i] = count(i, edges);
      System.out.println("i="+i+",hight="+highCount[i]);
      if (i == 0) {
        min = highCount[0];
      } else if (highCount[i] < min) {
        min = highCount[i];
      }
    }

    for (int i = 0; i < n; i++) {
      if (highCount[i] == min) {
        res.add(i);
      }
    }
    return res;
  }

  public static int count(int root, int[][] edges) {
    int high = 0;
    Deque<Integer> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      while (size > 0) {
        Integer current = queue.poll();
        for (int[] parent : edges) {
          if (parent[0] == current) {
            queue.offer(parent[1]);
          }
        }
        size--;
      }
      high++;
    }
    return high;
  }

  public static void main(String[] args) {
//    int num = 2;
//    int[][] co = new int[1][2];
//    co[0][0] = 1;
//    co[0][1] = 0;
//    findOrder(num, co);
    int[][] cc = {{1, 2}, {1, 0}, {1, 3}};
    findMinHeightTrees(4,cc);
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    Integer OOO=1;
    list.remove(OOO);
    System.out.println(list);
    Map<String,List<String>> map = new HashMap<>();
    List<String> a = map.computeIfAbsent("a", o -> new ArrayList<>());
//    list.add(0,src);
  }
}
