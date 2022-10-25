package com.training.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class Thread3 implements Callable<Integer> {
    public Integer call() throws InterruptedException {
        System.out.println("Inside call : " + Thread.currentThread().getName());
        Thread.sleep(100);
        return 10;
    }
}

public class ThreadExample3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Inside main : " + Thread.currentThread().getName());
        FutureTask<Integer> f = new FutureTask<>(new Thread3());
        Thread t = new Thread(f);
        t.start();
        System.out.println(f.get());
        System.out.println("Inside main : " + Thread.currentThread().getName());
    }
}
