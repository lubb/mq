package com.lbb.mq.singleton;

/**
 * 内部类实现
 */
public class SingleTonObject5 {

    //让构造方法私有 不让别人new 只能通过静态方法获取
    private SingleTonObject5(){};

    private static class InnerObject{
        private static SingleTonObject5 singleTonObject5 = new SingleTonObject5();
    }

    public static SingleTonObject5 getInstance(){
        return InnerObject.singleTonObject5;
    }
}
