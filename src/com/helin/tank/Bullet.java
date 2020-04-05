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

    public static final int WIDTH = ResourceMgr.BULLET_D.getWidth();
    public static final int HEIGHT = ResourceMgr.BULLET_D.getHeight();
    private static final int speed = 10;

    private int x, y;

    private Dir dir;

    private TankFrame tf = null;

    private boolean living = true;

    private Group group = null;

    private Rectangle rect = new Rectangle(this.x, this.y, WIDTH, HEIGHT);

    public Bullet(int x, int y, Dir dir, Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        this.tf = tf;
        new Thread(()->new Audio("audio/tank_fire.wav").play()).start();
    }

    public void paint(Graphics g) {
        if (!living) {
            tf.getBullets().remove(this);
        }
        switch (dir) {
            case DL:
                g.drawImage(ResourceMgr.BULLET_L, x, y, null);
                break;
            case DU:
                g.drawImage(ResourceMgr.BULLET_U, x, y, null);
                break;
            case DR:
                g.drawImage(ResourceMgr.BULLET_R, x, y, null);
                break;
            case DD:
                g.drawImage(ResourceMgr.BULLET_D, x, y, null);
                break;
        }
        this.move(g);
    }

    private void move(Graphics g) {
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
        if (x < 0 || y < 0 || x > GAME_WIDTH || y > GAME_HEIGHT) {
            living = false;
        }

        //检测是否撞到坦克而且不是自己的坦克
        for (int i = 0; i < tf.tanks.size(); i++) {
            this.collideWith(tf.tanks.get(i));
        }

        rect.setRect(this.x,this.y,WIDTH,HEIGHT);
    }

    private void die() {
        living = false;
    }

    /**
     * 如何检测呢 两个方块相交
     *
     * @param tank
     * @return
     */
    public void collideWith(Tank tank) {
        if(this.group.equals(tank.getGroup())) {
            return;
        }
        Rectangle rectBullet = new Rectangle(this.x, this.y, WIDTH, HEIGHT);
        Rectangle rectTank = new Rectangle(tank.getX(), tank.getY(), Tank.WIDTH, Tank.HEIGHT);
        if (this.rect.intersects(tank.getRect())) {
            this.die();
            tank.die();
            int dX = tank.getX() + Tank.WIDTH / 2 - Exploded.WIDTH/2;
            int dY = tank.getY() + Tank.HEIGHT / 2 - Exploded.HEIGHT/2;
            tf.explodeds.add(new Exploded(dX,dY,tf));
        }

    }
}
