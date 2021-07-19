package me.newbeessfu.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Intersection {

  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> result = new HashSet<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums1.length; i++) {
      map.put(nums1[i], 1);
    }
    for (int i = 0; i < nums2.length; i++) {
      if (null != map.get(nums2[i])) {
        result.add(nums2[i]);
      }
    }
    int i = 0;
    int[] ints = new int[result.size()];
    for (Integer number : result) {
      ints[i++] = number;
    }
    return ints;
  }


}
