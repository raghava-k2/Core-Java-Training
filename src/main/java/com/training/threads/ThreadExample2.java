package com.training.threads;

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside thread2 : " + Thread.currentThread().getName());
    }
}

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inside main : " + Thread.currentThread().getName());
        Thread t = new Thread(new Thread2());
        t.start();
        System.out.println("Inside main : " + Thread.currentThread().getName());
        System.out.println("Inside main : " + Thread.currentThread().getName());
        System.out.println("Inside main : " + Thread.currentThread().getName());
        Thread.sleep(1);
        System.out.println("Inside main : " + Thread.currentThread().getName());
        System.out.println("Inside main : " + Thread.currentThread().getName());
    }
}
