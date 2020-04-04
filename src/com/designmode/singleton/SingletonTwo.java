package com.designmode.singleton;

/**
 * 单例模式模式第二种 静态代码块饿汉式
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 11:49
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonTwo {

    private static SingletonTwo singletonTwo;

    {
        singletonTwo = new SingletonTwo();
    }

    private SingletonTwo(){

    }

    public SingletonTwo getInstance(){
        return this.singletonTwo;
    }

}
