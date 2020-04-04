package com.designmode.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 11:59
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonFive {

    private static SingletonFive singletonFive;

    private SingletonFive(){

    }

    public static SingletonFive getInstance(){
        if(singletonFive == null){
            synchronized(SingletonFive.class){
                if(singletonFive == null){
                    singletonFive = new SingletonFive();
                }
            }
        }
        return singletonFive;
    }

}
