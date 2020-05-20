package com.lockexample.DesignPattern.CreateDesign;

/**
 * 单例模式（Singleton）
 * 在内部创建一个实例，构造器全部设置为private，
 * 所有方法均在该实例上改动，在创建上要注意类的实例化只能执行一次，
 * 可以采用许多种方法来实现，如Synchronized关键字，
 * 或者利用内部类等机制来实现。
 */
public class Singleton {

    private Singleton(){};

    private static class GetSingleton{
        private static Singleton singleton = new Singleton();
    }

    public Singleton getSingleton(){
        return new GetSingleton().singleton;
    }

}
