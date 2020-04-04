package com.designmode.singleton;

/**
 * 静态内部类
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 12:05
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonSix {

    private SingletonSix(){

    }

    static class SingletonSixInner {
        private final static SingletonSix singletonSix = new SingletonSix();
    }

    public SingletonSix getInstance(){
        return SingletonSixInner.singletonSix;
    }


}
