package com.helin.tank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/4 20:06
 * @Copyright © 新点软件股份有限公司
 */
public class Main {

    public static void main(String[] args) {
        TankFrame tankFrame = new TankFrame();
        for(int i = 0;i< 10;i++){
            tankFrame.tanks.add(new Tank((i + 1) * 50,200,Dir.DD,Group.BAD,tankFrame));
        }
        new Thread(()->new Audio("audio/war1.wav").play()).start();
        Thread thread = new Thread(() -> {
            while(true) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tankFrame.repaint();
            }
        });
        thread.start();
    }
}
