package com.training.threads.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFeatureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> c = CompletableFuture.allOf(CompletableFuture.runAsync(new Thread2("test6")),
                CompletableFuture.runAsync(new Thread2("test7")),
                CompletableFuture.runAsync(new Thread2("test8")),
                CompletableFuture.runAsync(new Thread2("test9")),
                CompletableFuture.runAsync(new Thread2("test10")));
        c.thenRun(new Thread2("test5")).get();
    }
}
