package com.designmode.strategy;

/**
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 17:49
 * @Copyright © 新点软件股份有限公司
 */
public class Dog implements Comparable<Dog> {

    public Dog(int weight) {
        this.weight = weight;
    }

    private int weight;

    @Override
    public int compareTo(Dog dog){
        if(this.weight > dog.weight){
            return 1;
        }else if(this.weight < dog.weight){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}
