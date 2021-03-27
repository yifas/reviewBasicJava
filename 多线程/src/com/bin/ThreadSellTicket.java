package com.bin;

/**
 * 多线程超卖问题
 */
public class ThreadSellTicket extends Thread{

    //必须是静态 为什么？
    //如果是非静态 创建了3个该类的对象 每个对象各自拥有100 不存在共享变量
    private static int ticket=100;

    public static void main(String[] args) {

        ThreadSellTicket t1 = new ThreadSellTicket();
        t1.start();

        ThreadSellTicket t2 = new ThreadSellTicket();
        t2.start();

        ThreadSellTicket t3 = new ThreadSellTicket();
        t3.start();

    }

    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(getName()+"票号"+ticket);
                ticket--;
            }else {
                break;
            }
        }

    }
}
