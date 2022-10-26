package com.training.threads.executors;

import java.util.concurrent.*;

class Thread2 implements Runnable {
    private String name;

    Thread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Inside Try :" + this.name + "::" + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Try :" + this.name + "::" + Thread.currentThread().getName());
    }
}

public class ExecutorExample2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService e = Executors.newScheduledThreadPool(2);
        e.submit(new Thread2("test1"));
        e.submit(new Thread2("test2"));
        ScheduledFuture s = e.scheduleWithFixedDelay(new Thread2("test3"), 1, 2, TimeUnit.SECONDS);
        s.get();
        e.shutdown();
    }
}
