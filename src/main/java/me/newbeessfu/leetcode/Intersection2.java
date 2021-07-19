package me.newbeessfu.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Intersection2 {

  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map1 = this.getMap(nums1);
    Map<Integer, Integer> map2 = this.getMap(nums2);
    List<Integer> result = new ArrayList<>();
    for (Integer num : map1.keySet()) {
      Integer count1 = map1.get(num);
      Integer count2 = map2.get(num);
      if (null != count1 && null != count2) {
        int count = count1 <= count2 ? count1 : count2;
        for (int i = 1; i <= count; i++) {
          result.add(num);
        }
      }
    }
    return result.stream().mapToInt(e -> e).toArray();
  }

  public Map<Integer, Integer> getMap(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      Integer count = map.get(num);
      if (null == count) {
        map.put(num, 1);
      } else {
        map.put(num, ++count);
      }
    }
    return map;
  }


}
