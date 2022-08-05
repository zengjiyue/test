package com.cy.controller;
//懒汉式单例
public class LazyMan {
    private LazyMan(){

    }
    //volatile禁止指令重排
    private volatile static LazyMan lazyMan;
    //单线程下确实单例OK，但是涉及到多线程并发就得加锁
    //双重检测锁模式 懒汉式单例 DCL懒汉式
    public static LazyMan getInstance(){
        if (lazyMan==null){
            synchronized (LazyMan.class){
                if (lazyMan==null){
                    lazyMan = new LazyMan();//不是一个原子性操作
                }
            }
        }
        return lazyMan;
    }

    /*
     * 1.分配内存空间
     * 2.执行构造方法，初始化对象
     * 3.把这个对象指向这个空间
     *
     * 123
     * 132   A
     *       B   此时lozyMan还没完成构造
     * */




}
