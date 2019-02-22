package com.company.question7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAll {
    
    public static void main(String[] args) throws InterruptedException {
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        List<Callable<Integer>> threadList = new ArrayList<>();
        
        threadList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        
        threadList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        
        threadList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        
        threadList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });
        
        List<Future<Integer>> futureList = executorService.invokeAll(threadList);
        futureList.forEach((e)->{
            if(e.isDone()){
                try {
                    System.out.println(e.get());
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        });
        executorService.shutdown();
        
    }
}
