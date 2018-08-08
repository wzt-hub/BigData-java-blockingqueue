package com.bigdata.java.blockingqueue.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{  
    BlockingQueue<String> queue; 
    public Consumer(BlockingQueue<String> queue){  
        this.queue = queue;  
    }        
    @Override  
    public void run() {  
        try {  
        	String consumer = Thread.currentThread().getName();
            String temp = queue.take();//如果队列为空，会阻塞当前线程  
            System.out.println(consumer+"：get a product:"+temp);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
}  

