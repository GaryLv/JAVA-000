package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        long start=System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法

        int result = sum(); //这是得到的返回值

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        start = System.currentTimeMillis();
        Callable<Integer> callable = Main::sum;
        Integer r1 = callable.call();
        System.out.println("1: 异步计算结果为：" + r1);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(Main::sum);
        System.out.println("2: 异步计算结果为：" + future.get());
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        start = System.currentTimeMillis();
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(Main::sum, executorService);
        Integer r3 = completableFuture.get();
        System.out.println("3: 异步计算结果为：" + r3);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        executorService.shutdown();
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
