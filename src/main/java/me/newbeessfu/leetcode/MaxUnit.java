package me.newbeessfu.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxUnit {

  public int maximumUnits(int[][] boxTypes, int truckSize) {
    int result = 0;
    Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
    int i = 0;
    while (i < boxTypes.length && truckSize > 0) {
      int count = Math.min(truckSize, boxTypes[i][0]);
      result += boxTypes[i][1];
      boxTypes[i][0] -= count;
      truckSize -= count;
      if (boxTypes[i][0] == 0) {
        i++;
      }
    }
    return result;
  }

  public String sortSentence(String s) {
    String[] arr = s.split(" ");
    StringBuilder sb = new StringBuilder();
    Arrays.sort(arr, (a, b) -> {
      int num1 = a.charAt(a.length() - 1);
      int num2 = b.charAt(b.length() - 1);
      return num1 - num2;
    });
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i].substring(0, arr[i].length() - 1));
      if (i != arr.length - 1) {
        sb.append(" ");
      }
    }
    return sb.toString();
  }


  public static void main(String[] args) {
    MaxUnit maxUnit = new MaxUnit();
//    int[][] boxTypes = {{5, 10}, {2, 5}, {4, 7}, {3, 9}};
//
//    int size = 10;
//    int i = maxUnit.maximumUnits(boxTypes, size);
//    System.out.println(i);
    String s = "Myself2 Me1 I4 and3";
    System.out.println(maxUnit.sortSentence(s));
  }

}
