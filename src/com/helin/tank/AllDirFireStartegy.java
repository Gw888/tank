package com.helin.tank;

import java.util.Random;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/5 21:44
 * @Copyright © 新点软件股份有限公司
 */
public class AllDirFireStartegy implements FireStartegy {

    Random random = new Random();

    @Override
    public void fire(BaseGun baseGun) {
        //把子弹放入子弹列表中进行绘制
        //实现方式第一种一次只放一颗炮弹  这里可以设置一定的速度哈哈哈

        if (baseGun.getGroup().equals(Group.BAD)) {
            if (random.nextInt(100) < 50) {
                return;
            }
        }
        int bX = baseGun.getX();
        int bY = baseGun.getY();
        switch (baseGun.getDir()) {
            case DL:
                bY = bY + ((Tank.WIDTH - Bullet.WIDTH) >> 1);
                break;
            case DU:
                bX = bX + ((Tank.WIDTH - Bullet.WIDTH) >> 1);
                break;
            case DR:
                bX = bX + Tank.WIDTH - Bullet.HEIGHT;
                bY = bY + ((Tank.HEIGHT - Bullet.WIDTH) >> 1);
                break;
            case DD:
                bX = bX + ((Tank.WIDTH - Bullet.WIDTH) >> 1);
                bY = bY + Tank.HEIGHT - Bullet.WIDTH;
                break;
            default:
                break;
        }
        new Bullet(bX, bY, Dir.DU, baseGun.getGroup(), baseGun.getTf());
        new Bullet(bX, bY, Dir.DL, baseGun.getGroup(), baseGun.getTf());
        new Bullet(bX, bY, Dir.DR, baseGun.getGroup(), baseGun.getTf());
        new Bullet(bX, bY, Dir.DD, baseGun.getGroup(), baseGun.getTf());
    }

}