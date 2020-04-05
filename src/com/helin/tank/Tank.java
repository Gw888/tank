package com.helin.tank;

import java.awt.*;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/4 21:39
 * @Copyright © 新点软件股份有限公司
 */
public class Tank {

    public static final int WEIGHT = 50;
    public static final int HIGHT = 50;
    private static final int SPEED = 10;
    private int x, y;
    private Dir dir;
    private boolean ismoving;
    private TankFrame tf;


    public Tank(int x, int y, Dir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        switch(dir){
            case DL:
                g.drawImage(ResourceMgr.TANK_L,x,y,null);
                break;
            case DU:
                g.drawImage(ResourceMgr.TANK_U,x,y,null);
                break;
            case DR:
                g.drawImage(ResourceMgr.TANK_R,x,y,null);
                break;
            case DD:
                g.drawImage(ResourceMgr.TANK_D,x,y,null);
                break;
        }
        this.move(g);
    }

    private void move(Graphics g) {
        if (!ismoving) return;
        switch (dir) {
            case DL:
                x -= SPEED;
                break;
            case DU:
                y -= SPEED;
                break;
            case DR:
                x += SPEED;
                break;
            case DD:
                y += SPEED;
                break;
            default:
                break;
        }
    }

    public boolean isIsmoving() {
        return ismoving;
    }

    public void setIsmoving(boolean ismoving) {
        this.ismoving = ismoving;
    }

    public void fire() {
        System.out.println("准备开火。。。。。");
        tf.addBullet(new Bullet(x, y, dir,tf));
    }
}
