package com.designmode.singleton;

/**
 * 单例模式第一种 常量饿汉式
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 11:46
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonOne {

    private final static SingletonOne singletonOne = new SingletonOne();

    private SingletonOne(){
    }

    public SingletonOne getInstance(){
        return singletonOne;
    }

}
