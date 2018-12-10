package com.lbb.mq.singleton;

/**
 * 双检锁/双重校验锁 这种方式采用双锁机制，安全且在多线程情况下能保持高性能 安全
 */
public class SingleTonObject3 {

    public static SingleTonObject3 instance;

    //让构造方法私有 不让别人new 只能通过静态方法获取
    private SingleTonObject3(){};

    public static SingleTonObject3 getInstance(){
        if(instance == null ){
            synchronized (SingleTonObject3.class){
                if(instance == null ){
                    instance = new SingleTonObject3();
                }
            }
        }
        return instance;
    }
}
