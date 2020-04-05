package com.helin.tank;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/5 9:54
 * @Copyright © 新点软件股份有限公司
 */
public class TestTankImage {

    @Test
    public void Test1(){
        assertNotNull(new Object());
    }

    @Test
    public void Test2(){
        fail(" not yet acucess");
    }

    @Test
    public void test3(){
        try {
            BufferedImage image = ImageIO.read(new File("F:\\mygame\\tank\\src\\images\\BadTank2.png"));
            assertNotNull(image);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        try {
            BufferedImage image = ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("images\\BadTank2.png"));
            assertNotNull(image);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test5(){
        int i = 10 + 50/2 + 10/2;
        System.out.println("i : "+i);
        int j = (10 - 50)>>1;
        System.out.println("j : "+j);
        int y = 10 + 50>>>1 + 10>>>1;
        System.out.println("y : "+y);
    }

}
