package com.designmode.strategy;

import java.util.Arrays;

/**
 * 排序 对阿毛阿狗进行排序
 *
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 17:03
 * @Copyright © 新点软件股份有限公司
 */
public class Main {

    public static void main(String[] args) {
        //
        //int[] ints = new int[]{1,2,4,3,9,6,0,12};
//        Sorter sorter = new Sorter();
//        sorter.sort1(ints);
//        Arrays.stream(ints).forEach((e)->{
//            System.out.println(e);
//        });

        Cat[] cats = new Cat[]{new Cat(10, 8), new Cat(15, 6), new Cat(12, 5)};
        Sorter sorter = new Sorter();
        sorter.sort(cats);
        Arrays.asList(cats).forEach((e) -> {
            System.out.println(e.toString());
        });

//        Dog[] dogs = new Dog[]{new Dog(10),new Dog(15),new Dog(12)};
//        Sorter sorter1 = new Sorter();
//        sorter1.sort(dogs);
//        Arrays.asList(dogs).forEach((e) ->{
//            System.out.println(e.toString());
//        });

        //按照学生的英语成绩进行排名
        Student[] students = new Student[]{new Student("小明", 12, 89d, 85d, 90d),
                new Student("小王", 11, 86d, 84d, 89d),
                new Student("小利", 15, 100d, 88d, 95d),
                new Student("小张", 13, 96d, 95d, 86d)};
        Sorter<Student> sorter2 = new Sorter();
//        sorter2.sort(students,new DefaultStudentChinaScoreSort());
//                Arrays.asList(students).forEach((e) ->{
        sorter2.sort(students, (o1, o2) -> {
            if (o1.getChinaScore() - o2.getChinaScore() > 0) {
                return 1;
            } else if (o1.getChinaScore() - o2.getChinaScore() < 0) {
                return -1;
            }
            return 0;
        });
        Arrays.stream(students).forEach((e) ->{
            System.out.println(e.toString());
        });
}
}
