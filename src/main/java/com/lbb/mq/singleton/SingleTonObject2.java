package com.lbb.mq.singleton;

/**
 * 懒汉式单例 线程安全 synchroized
 * 缺点：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 第一次调用才初始化，避免内存浪费。必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */
public class SingleTonObject2 {

    public static SingleTonObject2 instance;

    //让构造方法私有 不让别人new 只能通过静态方法获取
    private SingleTonObject2(){};

    public static  synchronized SingleTonObject2 getInstance(){
        if(instance == null ){
            instance = new SingleTonObject2();
        }
        return instance;
    }
}
