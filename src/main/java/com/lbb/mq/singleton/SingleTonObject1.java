package com.lbb.mq.singleton;

/**
 * 懒汉式单例 线程不安全
 */
public class SingleTonObject1 {

    public static SingleTonObject1 instance;

    //让构造方法私有 不让别人new 只能通过静态方法获取
    private SingleTonObject1(){};

    public static SingleTonObject1 getInstance(){
        if(instance == null ){
            instance = new SingleTonObject1();
        }
        return instance;
    }
}
