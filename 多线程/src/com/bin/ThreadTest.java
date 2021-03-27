package com.bin;

/**
 * 一个线程遍历100以内偶数 另一个遍历100以内奇数
 */
public class ThreadTest extends Thread{
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.start();
        int num=100;
        for (int i = 0; i <= num; i++) {
            if (i % 2!=0){
                System.out.println("奇数"+i);
            }
        }

    }

    @Override
    public void run() {
        int num=100;
        for (int i = 0; i <= num; i++) {
            if (i % 2==0){
                System.out.println("偶数"+i);
            }
        }

    }
}
