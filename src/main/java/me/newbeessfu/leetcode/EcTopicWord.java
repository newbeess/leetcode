package me.newbeessfu.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EcTopicWord {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      Integer value = map.get(c);
      if (null == value) {
        map.put(c, 1);
      } else {
        map.put(c, ++value);
      }
    }
    for (int i = 0; i < t.length(); i++) {
      Character c = t.charAt(i);
      Integer value = map.get(c);
      if (null == value) {
        return false;
      } else if (value == 1) {
        map.remove(c);
      } else {
        map.put(c, --value);
      }
    }
    return map.size() == 0;
  }

  public static void main(String[] args) {
    test("a", "a");
    test("car", "cat");
    test("aaac", "aaab");
    test("aaabbbcccttt", "aaabbbcccttt");
    int[] a = new int[9];
    Set<Integer> set = new HashSet<>();
    set.toArray();
  }

  public static void test(String s, String t) {
    EcTopicWord ecTopicWord = new EcTopicWord();
    boolean anagram = ecTopicWord.isAnagram(s, t);
    System.out.println(String.format("s= %s ,t=%s,result=%s", s, t, anagram ? "passed" : "not pass"));
  }
}
