package com.helin.tank;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

import static com.helin.tank.TankFrame.GAME_HEIGHT;
import static com.helin.tank.TankFrame.GAME_WIDTH;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/4 21:39
 * @Copyright © 新点软件股份有限公司
 */
public class Tank extends BaseGun {

    public static final int WIDTH = ResourceMgr.BAD_RED_TANK_U.getWidth();
    public static final int HEIGHT = ResourceMgr.BAD_RED_TANK_U.getHeight();
    private int speed = 8;
    private int x, y;
    private Dir dir;
    private boolean ismoving = true;
    private TankFrame tf;
    private Group group = null;
    private Random random = new Random();
    private Rectangle rect = new Rectangle(this.x, this.y, WIDTH, HEIGHT);
    private int breathe = 0;

    public Tank(int x, int y, Dir dir, Group group, TankFrame tf) {
        super(x,y,dir,group,tf);
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.group = group;
        this.tf = tf;
        if (group.equals(Group.GOOD)) {
            ismoving = false;
            speed = 10;
        }
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        if (!living) {
            tf.tanks.remove(this);
        }
        BufferedImage image_u = ImageUtil.getBufferedImageByGroupAndBreathe(this.group, this.breathe);
        switch (dir) {
            case DL:
                g.drawImage(ImageUtil.rotateImage(image_u, 270), x, y, null);
                break;
            case DU:
                g.drawImage(image_u, x, y, null);
                break;
            case DR:
                g.drawImage(ImageUtil.rotateImage(image_u, 90), x, y, null);
                break;
            case DD:
                g.drawImage(ImageUtil.rotateImage(image_u, 180), x, y, null);
                break;
        }
        this.move(g);
    }

    @Override
    public void move(Graphics g) {
        if (!ismoving) return;
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
        //敌人坦克随机方向
        if (random.nextInt(100) > 95) {//不一定每次画 都需要开火
            if (this.group.equals(Group.BAD)) {
                this.fire(new DefaultOneFireStartegy());//敌方坦克策略模式
            }
        }
        randomDir();
        rect.setRect(this.x, this.y, WIDTH, HEIGHT);

    }

    @Override
    public void randomDir() {
        if (this.group.equals(Group.GOOD)) {
            return;
        }
        if (this.x < 0) {
            this.x = 0;
        }
        if (this.y < 0) {
            this.y = 0;
        }
        if (this.x > GAME_WIDTH) {
            this.x = GAME_WIDTH;
        }
        if (this.y > GAME_HEIGHT) {
            this.y = GAME_HEIGHT;
        }
        if (random.nextInt(100) > 95) {
            this.dir = Dir.values()[random.nextInt(4)];
        }

    }

    public boolean isIsmoving() {
        return ismoving;
    }

    public void setIsmoving(boolean ismoving) {
        this.ismoving = ismoving;
    }

    public void fire(FireStartegy fs) {
        fs.fire(this);
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public TankFrame getTf() {
        return tf;
    }

    public void setTf(TankFrame tf) {
        this.tf = tf;
    }
}
