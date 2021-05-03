package me.newbeessfu.leetcode;

public class ReverseInteger {

  static int INT_MAX = 2147483647;
  static int INT_MIN = -INT_MAX - 1;

  public int reverse(int x) {
    int reverse = 0;
    while (x != 0) {
      if (reverse > INT_MAX / 10 || reverse < INT_MIN / 10) {
        return 0;
      }
      reverse = reverse * 10 + x % 10;
      x = x / 10;
    }
    return reverse;
  }

  public static void main(String[] args) {

    test(-12, -21);
    test(-2147483647,0);
    test(0,0);
  }

  public static void test(int x, int expected) {
    ReverseInteger reverseInteger = new ReverseInteger();
    int reverse = reverseInteger.reverse(x);

    System.out.println(String.format("x = %d ,reverse = %d,%s", x, reverse, (reverse == expected) ? "passed!" : "faeild"));
  }

}
