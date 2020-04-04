package com.designmode.strategy;

/**
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 17:36
 * @Copyright © 新点软件股份有限公司
 */
public class Cat implements Comparable<Cat> {

    private int weight;
    private int height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat cat){
        if(this.height > cat.height){
            return 1;
        }else if(this.height < cat.height){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
