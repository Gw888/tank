package com.designmode.strategy;

/**
 * 按照学生的英语成绩排名
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 18:44
 * @Copyright © 新点软件股份有限公司
 */
public class DefaultStudentChinaScoreSort implements Comparator<Student> {

    @Override
    public int compare(Student t1, Student t2) {
        if(t1.getChinaScore() - t2.getChinaScore() > 0){
            return 1;
        }else if(t1.getChinaScore() - t2.getChinaScore() < 0){
            return -1;
        }
        return 0;
    }
}
