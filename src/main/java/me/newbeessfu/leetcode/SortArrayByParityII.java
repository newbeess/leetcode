package me.newbeessfu.leetcode;

import java.util.Arrays;

public class SortArrayByParityII {

  public int[] sortArrayByParityII(int[] nums) {
    int length = nums.length;
    int i = 0, j = 1;
    while (i < length) {
      if (nums[i] % 2 != 0) {
        while (j < length) {
          if (nums[j] % 2 == 0) {
            break;
          }
          j += 2;
        }
        swap(nums, i, j);
      }
      i += 2;
    }
    return nums;
  }

  public void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = {2, 4, 5, 7};
    System.out.println(Arrays.toString(nums));
    SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();
    sortArrayByParityII.sortArrayByParityII(nums);
    System.out.println(Arrays.toString(nums));
  }
}
