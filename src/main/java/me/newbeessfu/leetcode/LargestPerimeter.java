package me.newbeessfu.leetcode;

import java.util.Arrays;

public class LargestPerimeter {

  public int largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    for (int i = nums.length - 1; i >= 2; i--) {
      if (nums[i - 2] + nums[i - 1] > nums[i]) {
        return nums[i - 2] + nums[i - 1] + nums[i];
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    String s="012";
    StringBuilder sb = new StringBuilder(s);
    StringBuilder stringBuilder = sb.deleteCharAt(1);
    System.out.println(sb.toString());
    System.out.println(stringBuilder.toString());
//    int[] nums={1,4,5};
//    LargestPerimeter largestPerimeter = new LargestPerimeter();
//    System.out.println(largestPerimeter.largestPerimeter(nums));
  }
}
