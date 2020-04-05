package com.helin.tank;

import java.awt.*;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/5 12:48
 * @Copyright © 新点软件股份有限公司
 */
public class Exploded {

    public static int WIDTH = ResourceMgr.EXPLOED[0].getWidth();
    public static int HEIGHT = ResourceMgr.EXPLOED[0].getHeight();
    TankFrame tf = null;
    private int x, y;
    private boolean living = true;
    private int step = 0;

    public Exploded(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
        new Thread(()->new Audio("audio/explode.wav").play()).start();
    }

    public void paint(Graphics g) {
        g.drawImage(ResourceMgr.EXPLOED[step ++],x,y,null);
        if(step >= ResourceMgr.EXPLOED.length){
           tf.explodeds.remove(this);
        }
    }

}
