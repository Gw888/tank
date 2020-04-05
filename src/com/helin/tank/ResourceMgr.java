package com.helin.tank;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/5 10:05
 * @Copyright © 新点软件股份有限公司
 */
public class ResourceMgr {

    public static BufferedImage GOOD_RED_TANK_L, GOOD_RED_TANK_U, GOOD_RED_TANK_R, GOOD_RED_TANK_D;
    public static BufferedImage GOOD_BLUE_TANK_L, GOOD_BLUE_TANK_U, GOOD_BLUE_TANK_R, GOOD_BLUE_TANK_D;
    public static BufferedImage BAD_RED_TANK_L, BAD_RED_TANK_U, BAD_RED_TANK_R, BAD_RED_TANK_D;
    public static BufferedImage BAD_BLUE_TANK_L, BAD_BLUE_TANK_U, BAD_BLUE_TANK_R, BAD_BLUE_TANK_D;

    public static BufferedImage BULLET_L, BULLET_U, BULLET_R, BULLET_D;
    public static BufferedImage[] EXPLOED = new BufferedImage[16];

    static {
        try {
            GOOD_RED_TANK_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/GoodTank1.png"));
            GOOD_RED_TANK_R = ImageUtil.rotateImage(GOOD_RED_TANK_U,90);
            GOOD_RED_TANK_D = ImageUtil.rotateImage(GOOD_RED_TANK_U,180);
            GOOD_RED_TANK_L = ImageUtil.rotateImage(GOOD_RED_TANK_U,270);
            GOOD_BLUE_TANK_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/GoodTank2.png"));
            GOOD_BLUE_TANK_R = ImageUtil.rotateImage(GOOD_BLUE_TANK_U,90);
            GOOD_BLUE_TANK_D = ImageUtil.rotateImage(GOOD_BLUE_TANK_U,180);
            GOOD_BLUE_TANK_L = ImageUtil.rotateImage(GOOD_BLUE_TANK_U,270);
            BAD_RED_TANK_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/BadTank1.png"));
            BAD_RED_TANK_R = ImageUtil.rotateImage(BAD_RED_TANK_U,90);
            BAD_RED_TANK_D = ImageUtil.rotateImage(BAD_RED_TANK_U,180);
            BAD_RED_TANK_L = ImageUtil.rotateImage(BAD_RED_TANK_U,270);
            BAD_BLUE_TANK_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/BadTank2.png"));
            BAD_BLUE_TANK_R = ImageUtil.rotateImage(BAD_BLUE_TANK_U,90);
            BAD_BLUE_TANK_D = ImageUtil.rotateImage(BAD_BLUE_TANK_U,180);
            BAD_BLUE_TANK_L = ImageUtil.rotateImage(BAD_BLUE_TANK_U,270);


            BULLET_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletU.png"));
            BULLET_R = ImageUtil.rotateImage(BULLET_U,90);
            BULLET_D = ImageUtil.rotateImage(BULLET_U,180);
            BULLET_L = ImageUtil.rotateImage(BULLET_U,270);
            for (int i = 0; i < 16; i++) {
                EXPLOED[i] = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/e" + (i+1) + ".gif"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
