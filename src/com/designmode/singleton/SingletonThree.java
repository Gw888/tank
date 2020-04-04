package com.designmode.singleton;

/**
 * 简单懒汉式
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 11:52
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonThree {

    private static SingletonThree singletonThree;

    private SingletonThree(){

    }

    public SingletonThree getInstance(){
        if(singletonThree == null){
            singletonThree = new SingletonThree();
        }
        return this.singletonThree;
    }

}
