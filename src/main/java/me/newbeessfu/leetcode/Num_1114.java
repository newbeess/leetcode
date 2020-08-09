package me.newbeessfu.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Num_1114 {

  static class Foo {

    private CountDownLatch second = new CountDownLatch(1);
    private CountDownLatch third = new CountDownLatch(1);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

      // printFirst.run() outputs "first". Do not change or remove this line.
      printFirst.run();
      second.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
      second.await();
      // printSecond.run() outputs "second". Do not change or remove this line.
      printSecond.run();
      third.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
      third.await();
      // printThird.run() outputs "third". Do not change or remove this line.
      printThird.run();
    }
  }


}
