package me.newbeessfu.leetcode;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.newbeessfu.leetcode.Num_1114.Foo;
import org.junit.Test;

public class Num_1114Test {

  class Print implements Runnable {

    private String s;

    public Print(String s) {
      this.s = s;
    }

    @Override
    public void run() {
      System.out.println(s);
    }
  }

  class ManageThread implements Runnable {

    private Foo foo;
    private String methodName;
    private Print print;

    public ManageThread(Foo foo, String methodName, Print print) {
      this.foo = foo;
      this.methodName = methodName;
      this.print = print;
    }

    @Override
    public void run() {
      try {
        Method method = foo.getClass().getDeclaredMethod(methodName, Runnable.class);
        method.invoke(foo, print);
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      } catch (InvocationTargetException | NoSuchMethodException e) {
        e.printStackTrace();
      }
    }
  }

  @Test
  public void test1114() {
    Foo foo = new Foo();
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    ManageThread firstThread = new ManageThread(foo, "first", new Print("first"));
    ManageThread secondThread = new ManageThread(foo, "second", new Print("second"));
    ManageThread thirdThread = new ManageThread(foo, "third", new Print("third"));
    List<ManageThread> manageThreadList = Arrays.asList(firstThread, secondThread, thirdThread);
    Collections.shuffle(manageThreadList);
    executorService.submit(manageThreadList.get(0));
    executorService.submit(manageThreadList.get(1));
    executorService.submit(manageThreadList.get(2));
  }

}