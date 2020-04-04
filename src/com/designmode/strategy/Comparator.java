package com.designmode.strategy;

/**
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 18:42
 * @Copyright © 新点软件股份有限公司
 */
@FunctionalInterface
public interface Comparator<T> {

    int compare(T t,T t2);

}
