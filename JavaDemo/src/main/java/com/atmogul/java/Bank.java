package com.atmogul.java;

/**
 * 线程安全的单例模式（懒汉式）
 */
public class Bank {

    private Bank(){}
    private static Bank instance = null;

    public static Bank getInstance(){
        if (instance == null){
            synchronized (Bank.class){
                if (instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
