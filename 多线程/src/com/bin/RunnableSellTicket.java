package com.bin;

/**
 * 多线程卖票
 */
public class RunnableSellTicket implements Runnable {

    //这里和继承Thread不同 不需要静态变量  因为只new 了一次当前类对象
    private int ticket =100;

    public static void main(String[] args) {
        //只需要创建一个Runnable 对象
        RunnableSellTicket r = new RunnableSellTicket();

        Thread t1 = new Thread(r);
        t1.start();

        Thread t2 = new Thread(r);
        t2.start();

        Thread t3 = new Thread(r);
        t3.start();




    }


    @Override
    public void run() {
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖票：票号"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}
