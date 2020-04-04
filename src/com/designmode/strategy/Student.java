package com.designmode.strategy;

/**
 * @author 何林
 * @version V1.0
 * @Package com.designmode.strategy
 * @date 2020/4/4 18:40
 * @Copyright © 新点软件股份有限公司
 */
public class Student implements Comparable{

    private String name;

    private int age;

    private Double englishScore;

    private Double chinaScore;

    private Double mathScore;

    public Student(String name, int age, Double englishScore, Double chinaScore, Double mathScore) {
        this.name = name;
        this.age = age;
        this.englishScore = englishScore;
        this.chinaScore = chinaScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Double englishScore) {
        this.englishScore = englishScore;
    }

    public Double getChinaScore() {
        return chinaScore;
    }

    public void setChinaScore(Double chinaScore) {
        this.chinaScore = chinaScore;
    }

    public Double getMathScore() {
        return mathScore;
    }

    public void setMathScore(Double mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", englishScore=" + englishScore +
                ", chinaScore=" + chinaScore +
                ", mathScore=" + mathScore +
                '}';
    }
}
