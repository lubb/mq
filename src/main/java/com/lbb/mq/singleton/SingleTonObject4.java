package com.lbb.mq.singleton;

/**
 * 静态代码块
 */
public class SingleTonObject4 {

    public static SingleTonObject4 instance;

    //让构造方法私有 不让别人new 只能通过静态方法获取
    private SingleTonObject4(){};

    //静态代码块
    static {
        instance = new SingleTonObject4();
    }

    public static SingleTonObject4 getInstance(){
        return instance;
    }
}
