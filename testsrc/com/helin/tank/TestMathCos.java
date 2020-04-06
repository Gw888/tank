package com.helin.tank;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/6 9:43
 * @Copyright © 新点软件股份有限公司
 */
public class TestMathCos {

    @Test
    public void test(){

        class A{
            private int x;
            private int y;
            A(int x,int y){
                this.x = x;
                this.y = y;
            }
        }

        A a = new A(1,5);
        A b = new A(10,50);

        //a如果向b运动 计算偏角  对应的x方向 和y方向上的偏移
        int dx = b.x - a.x;
        int dy = b.y - a.y;
        int absDX = Math.abs(dx);
        int absDY = Math.abs(dy);

        BigDecimal bigX = BigDecimal.valueOf(dx);
        BigDecimal bigY = BigDecimal.valueOf(dy);
        BigDecimal bigv = bigX.divide(bigY,2, RoundingMode.DOWN);
        double radina = Math.tan(bigv.doubleValue());//计算弧度
        double angle = Math.floor(180/(Math.PI/radina));
        System.out.println("dx : " + dx + "dy : " + dy + "弧度为 : " + radina + ",对应角度为：" + angle);

        //第一现象


    }

}
