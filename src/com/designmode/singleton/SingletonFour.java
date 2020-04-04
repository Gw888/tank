package com.designmode.singleton;

/**
 * 简单加锁实现懒汉
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 11:56
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonFour {

    private SingletonFour singletonFour;

    private SingletonFour(){

    }

    public synchronized SingletonFour getInstance(){
        if(singletonFour == null){
            singletonFour = new SingletonFour();
        }
        return singletonFour;
    }

}
