package com.lbb.mq.singleton;

/**
 * 饿汉式单例模式
 */
public class SingleTonObject {

    public static SingleTonObject instance = new SingleTonObject();

    //让构造方法私有 不让别人new 只能通过静态方法获取
    private SingleTonObject(){};

    public static SingleTonObject getInstance(){
        return instance;
    }
}
