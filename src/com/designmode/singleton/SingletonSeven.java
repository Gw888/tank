package com.designmode.singleton;

/**
 *
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 12:08
 * @Copyright © 新点软件股份有限公司
 */
public class SingletonSeven {

    private volatile static SingletonSeven singletonseven;

    private SingletonSeven(){

    }

    public static SingletonSeven getInstance(){
        if(singletonseven == null){
            synchronized(SingletonSeven.class){
                if(singletonseven == null){
                    singletonseven = new SingletonSeven();
                }
            }
        }
        return singletonseven;
    }

}
