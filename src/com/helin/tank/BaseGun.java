package com.helin.tank;

import java.awt.*;
import java.awt.image.BufferedImage;

import static com.helin.tank.TankFrame.GAME_HEIGHT;
import static com.helin.tank.TankFrame.GAME_WIDTH;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/6 8:10
 * @Copyright © 新点软件股份有限公司
 */
public abstract class BaseGun {

    //x坐标
    private int x;
    //y坐标
    private int y;
    //方向
    private Dir dir;
    //红方 蓝方
    private Group group;
    //控制中台 view
    private TankFrame tf;
    //速度
    private int speed;
    //具体形状
    private Rectangle rect;
    private boolean ismoving;
    public boolean living = true;
    private int breathe = 0;

    public BaseGun(int x, int y, Dir dir, Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        this.tf = tf;
    }

    //绘画自己的样子
    public abstract void paint(Graphics g);

    //移动模式 下一次轨迹
    public abstract void move(Graphics g);

    //下次方向
    public abstract void randomDir();

    public void die() {
        living = false;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public TankFrame getTf() {
        return tf;
    }

    public void setTf(TankFrame tf) {
        this.tf = tf;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }
}
