package com.company.question6;

import java.util.concurrent.*;

import static sun.swing.SwingUtilities2.submit;

public class FutureDemo {
    
    
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
         
         Future<Integer> future =  executorService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return 2;
                }
            });
         
         executorService.shutdown();
         
         
         if(future.isDone()){
             System.out.println(future.get());
         }
         
         if(future.isCancelled()){
             System.out.println("Task is cancelled");
         }
         
         
         
         
        
    }
}
