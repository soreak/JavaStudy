package com.study.ThreadTalk;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class HandleSocketTheadPool {
    //线程池
    private ExecutorService executor;

    public HandleSocketTheadPool(int maxPoolSize,int queueSize){
        executor = new ThreadPoolExecutor(
                maxPoolSize,
                maxPoolSize,
                120L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(queueSize));
    }

    public void execute(Runnable task){
        this.executor.execute(task);
    }
}
