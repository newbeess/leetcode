package me.newbeessfu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseInteger {

  static class Solution1 {

    class Node implements Comparable<Node> {

      private int node;
      private int value;

      public Node(int node, int value) {
        this.node = node;
        this.value = value;
      }

      public int getNode() {
        return this.node;
      }

      public int getValue() {
        return this.value;
      }

      public int compareTo(Node n) {
        return Integer.compare(this.value, n.value);
      }
    }

    public int networkDelayTime(int[][] times, int n, int k) {
      Map<Integer, PriorityQueue<Node>> graph = new HashMap<>();
      buildGraph(times,graph);
      int[] dist = initDist(n);

      boolean[] visited = new boolean[n + 1];
      PriorityQueue<Node> queue = new PriorityQueue<>();
      queue.offer(new Node(k, 0));


      while (!queue.isEmpty()) {
        Node node = queue.poll();
        if (visited[node.node]) {
          continue;
        }
        dist[node.node] = node.value;
        visited[node.node] = true;
        PriorityQueue<Node> neiborQ = graph.get(node.node);
        while (null != neiborQ && !neiborQ.isEmpty()) {
          Node neibor = neiborQ.poll();
          if (visited[neibor.node]) {
            continue;
          }
          queue.offer(new Node(neibor.node, node.value + neibor.value));
        }
      }
      int res = 0;
      System.out.println(Arrays.toString(dist));
      for (int dis : dist) {
        if (dis == -1) {
          return -1;
        }
        res = Math.max(res, dis);
      }
      return res;
    }

    private int[] initDist(int n) {
      int[] dist = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        dist[i] = -1;
      }
      return dist;
    }

    private void buildGraph(int[][] times, Map<Integer, PriorityQueue<Node>> graph) {
      for (int i = 0; i < times.length; i++) {
        int a = times[i][0];
        int b = times[i][1];
        int dist = times[i][2];
        graph.putIfAbsent(a, new PriorityQueue<Node>());
        graph.get(a).offer(new Node(b, dist));
        System.out.println("a="+a+",b="+b+",dist="+dist);
      }
    }

  }
  public  static List<Integer> eventualSafeNodes(int[][] graph) {
    List<Integer> answer = new ArrayList<>();
    for(int i=0;i<graph.length;i++){
      if (i!=1){
        continue;
      }
      int[] visited = new int[graph.length];
      if(dfs(i,graph,visited)){
        answer.add(i);
      }
    }
    return answer;
  }

  public static boolean dfs(int i,int[][] graph,int[] visited){
    if(visited[i]==1){
      System.out.println(i);
      return false;
    }
    visited[i]=1;
    for(Integer neibor : graph[i]){
      if(!dfs(neibor,graph,visited)){
        return false;
      }
    }
    return true;
  }
  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    Pattern pattern = Pattern.compile("\\w+");
    Matcher matcher = pattern.matcher(s);
    while (matcher.find()) {
      sb.insert(0,matcher.group());
    }
    return sb.toString();
  }

  //  floyd算法
  public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
    int[][] dist = init(n,edges);
    for(int k=0;k<n;k++){
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
        }
      }
    }
    for (int i=0;i<dist.length;i++){
      System.out.print("i="+i+": ");
      for (int j=0;j<dist[i].length;j++){
        System.out.print(dist[i][j]+",");
      }
      System.out.println("");
    }
    System.out.println(dist);
    int answer = -1;
    int minCount=n+1;
    for(int i=0;i<n;i++){
      int count=0;
      for(int j=0;j<n;j++){
        if(dist[i][j]<=distanceThreshold){
          count++;
        }
      }
      if(count<= minCount){
        minCount=count;
        answer=i;
      }
    }
    return answer;
  }

  private static int[][] init(int n,int[][] edges){
    int[][] dist = new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==j){
          dist[i][j]=0;
        }else{
          dist[i][j]=Integer.MAX_VALUE/2;
        }
      }
    }
    for(int[] edge : edges){
      dist[edge[0]][edge[1]]=edge[2];
      dist[edge[1]][edge[0]]=edge[2];
    }
    return dist;
  }



  static Map<Integer,Integer> lookup = new HashMap<>();
  public static int getKth(int lo, int hi, int k) {
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> weightMap = new HashMap<>();
    for(int i=lo;i<=hi;i++){
      list.add(i);
      weightMap.put(i,getWeight(i,0));
      System.out.println("i="+i+",weight="+weightMap.get(i));
    }

    list.sort((a,b)->(weightMap.get(a).compareTo(weightMap.get(b))));
    System.out.println(list);
    return list.get(k-1);
  }

  private static Integer getWeight(int x,int weight){
    if(lookup.get(x) != null){
      return lookup.get(x);
    }
    if(x==1){
      return weight;
    }
    int temp=x;
    if(x%2 ==0 ){
      x=x/2;
    }else{
      x = x*3 + 1;
    }
    int tempWeight = weight;
    int w = getWeight(x,++weight);
    System.out.println("temp="+temp+"wwww==="+(weight));
    lookup.put(temp,weight);
    return w;
  }

  public static void main(String[] args) {
//   getKth(9,9,1);
      maxProbability(3,new int[][]{{0,1},{1,2},{0,2}},new double[]{0.5,0.5,0.2},0,2);
  }
  public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
    double[] dist = new double[n];
    Map<Integer,List<Pair>> graph = buildMap(edges,succProb);
    int[] visited = new int[n];

    PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->(b.getProb() == a.getProb()  ? 0 :(b.getProb() - a.getProb() >0 ? 1 : -1) ));
    queue.add(new Pair(start,1));
    while(!queue.isEmpty()){
      Pair pair = queue.poll();
      int node = pair.getNode();
      double prob = pair.getProb();
      System.out.println(Arrays.toString(dist));
      if(visited[node]==1){
        continue;
      }
      visited[node]=1;
      for(Pair neibor : graph.getOrDefault(node,new ArrayList<>())){
        int neiborNode = neibor.getNode();
        double neiborProb = neibor.getProb();
        if(visited[neiborNode] == 0){
          if (dist[neiborNode] < neiborProb * prob){
            dist[neiborNode] = neiborProb * prob;
          }
          queue.offer(new Pair(neiborNode,dist[neiborNode]));
        }
      }
    }
    return dist[1];
  }

  private  static Map<Integer,List<Pair>> buildMap(int[][] edges,double[] succProb){
    Map<Integer,List<Pair>> graph = new HashMap<>();
    for(int i=0;i<edges.length;i++){
      int[] arr = edges[i];
      double prob = succProb[i];
      graph.putIfAbsent(arr[0],new ArrayList<Pair>());
      graph.putIfAbsent(arr[1],new ArrayList<Pair>());
      graph.get(arr[0]).add(new Pair(arr[1],prob));
      graph.get(arr[1]).add(new Pair(arr[0],prob));
    }
    return graph;
  }



  static class Pair {
    double prob;
    int node;
    public Pair(int node,double prob){
      this.node = node;
      this.prob = prob;
    }

    public double getProb(){
      return this.prob;
    }
    public int getNode(){
      return this.node;
    }
  }

}
