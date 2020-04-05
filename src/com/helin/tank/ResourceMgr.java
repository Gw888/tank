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

    public static BufferedImage TANK_L,TANK_U,TANK_R,TANK_D;
    public static BufferedImage BULLET_L,BULLET_U,BULLET_R,BULLET_D;

    static{
        try {
            TANK_L = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankL.gif"));
            TANK_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankU.gif"));
            TANK_R = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankR.gif"));
            TANK_D = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/tankD.gif"));
            BULLET_L = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletL.gif"));
            BULLET_U = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletU.gif"));
            BULLET_R = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletR.gif"));
            BULLET_D = ImageIO.read(ResourceMgr.class.getClassLoader().getResourceAsStream("images/bulletD.gif"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
