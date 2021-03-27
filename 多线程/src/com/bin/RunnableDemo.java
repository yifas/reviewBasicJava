package com.bin;

/**
 * 创建多线程的方式二:实现Runnable接口
 * 1.创建一个实现了RunnabLe接口的类
 * 2．实现类去实现Runnable中的抽象方法: run()
 * 3.创建实现类的对象
 * 4．将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 * 两种实现方式的比较：
 * 1.java中有单继承的限制 在继承了Thread之后 无法继承其他类  而实现方式还可以实现其他接口【java单继承的局限性】
 * 2.实现方式更适合用来处理多个线程共享数据 【因为数据直接放在实现Runnable接口的类中，类的对象作为参数传递到各个线程构造器，这样就天然共享数据了！！】
 * 3.Thread 底层也是实现Runnable  都需要重写run方法  将要执行的逻辑写在run方法中
 */

//1.实现Runnable接口
public class RunnableDemo implements Runnable{


    public static void main(String[] args) {
        //3.获取当前类对象
        RunnableDemo r1 = new RunnableDemo();
        //4.通过thread类提供的构造方法 来启动线程
        //注：启动线程的方式 还是和继承Thread是一样的
        Thread thread = new Thread(r1);
        thread.start();

        for (int i = 0; i <= 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }

    /**
     * 2.重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}
