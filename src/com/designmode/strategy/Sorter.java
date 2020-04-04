package com.designmode.strategy;

/**
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 17:05
 * @Copyright © 新点软件股份有限公司
 */
public class Sorter<T> {
    //冒泡排序
    public void sort(Comparable[] ints) {
        for (int i = 0; i < ints.length; i++) {
            //找到最小值放到最前面
            int minPos = i;
            for (int j = i + 1; j < ints.length; j++) {
                if(ints[i].compareTo(ints[j]) > 0){
                    minPos = j;
                }
            }
            Comparable temp = ints[minPos];
            ints[minPos] = ints[i];
            ints[i] = temp;
        }
    }

    //冒泡排序
    public void sort(T[] ints,Comparator<T> comparator) {
        for (int i = 0; i < ints.length; i++) {
            //找到最小值放到最前面
            int minPos = i;
            for (int j = i + 1; j < ints.length; j++) {
                if(comparator.compare(ints[i],ints[j]) > 0){
                    minPos = j;
                }
            }
            T temp = ints[minPos];
            ints[minPos] = ints[i];
            ints[i] = temp;
        }
    }

    public void sort1(int[] ints){
        for(int i = 0;i < ints.length; i ++){
            int minPos = i;
            for(int j = i+1;j < ints.length; j ++){
                minPos = ints[i] > ints[j] ? j : i;
            }
            int temp = ints[i];
            ints[i] = ints[minPos];
            ints[minPos] = temp;

        }
    }

}
