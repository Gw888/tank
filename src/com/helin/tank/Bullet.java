package com.helin.tank;

import java.awt.*;

import static com.helin.tank.TankFrame.GAME_HEIGHT;
import static com.helin.tank.TankFrame.GAME_WIDTH;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/4 22:01
 * @Copyright © 新点软件股份有限公司
 */
public class Bullet {

    private static final int WEIGHT = 10;
    private static final int HIGHT = 10;
    private int speed = 1;

    private int x, y;

    private Dir dir;

    private TankFrame tf = null;

    private boolean live = true;

    public Bullet(int x, int y, Dir dir,TankFrame tf) {
        this.x = x + Tank.WEIGHT/2;
        this.y = y + Tank.HIGHT/2;
        this.dir = dir;
        this.tf = tf;
    }

    private void move(Graphics g) {

        g.fillRect(x, y, WEIGHT, HIGHT);
        switch (dir) {
            case DL:
                x -= speed;
                break;
            case DU:
                y -= speed;
                break;
            case DR:
                x += speed;
                break;
            case DD:
                y += speed;
                break;
            default:
                break;
        }
        if(x < 0 || y < 0 || x > GAME_WIDTH || y > GAME_HEIGHT){
            live = false;
        }
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        this.move(g);
        g.setColor(c);
        if(!live){
            tf.getBullets().remove(this);
        }

    }

}
