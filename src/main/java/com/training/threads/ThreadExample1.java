package com.training.threads;

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Thread1 :" + Thread.currentThread().getName());
    }
}

public class ThreadExample1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread1 t = new Thread1();
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }
}
