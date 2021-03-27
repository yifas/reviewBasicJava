package com.bin;

/**
 * 基本过程总结
 * 1.类要继承Thread
 * 2.重写Thread类中的run方法
 * 3.创建当前类对象 调用start方法启动 并执行线程
 *
 * 类要实现Thread
 */
public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        //调用的是当前类中的方法
        ThreadDemo thread = new ThreadDemo();
        //该方法作用：1.启动当前线程  2.调用当前线程的run()
        thread.start();

        //注：再调用一个线程 需要重新创建新的线程对象
        ThreadDemo thread2 = new ThreadDemo();
        thread2.start();


        int j=1;
        for (int i = 0; i < 10; i++) {

            System.out.println("主线程"+j++);
        }

    }

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        int j=1;
        for (int i = 0; i < 10; i++) {

            System.out.println("子线程"+Thread.currentThread().getName()+j++);
        }

    }

}
