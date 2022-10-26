package com.training.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Inside Try :" + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Try :" + Thread.currentThread().getName());
    }
}

public class ExecutorExample1 {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(10);
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.submit(new Thread1());
        e.shutdown();
    }
}
