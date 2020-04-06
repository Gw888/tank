package com.helin.tank.factory;

import com.helin.tank.*;

/**
 * 抽象工厂方法创建二代跟踪坦克
 *
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank.factory
 * @date 2020/4/6 8:58
 * @Copyright © 新点软件股份有限公司
 */
public class LevelTwoTankFactory extends TankAbstractFactory {

    static TankFrame tf = TankFrame.getInstance();

    public BaseGun createGun(){
        return new LevelTwoTank(50,200, Dir.DD, Group.BAD,tf,tf.myTank);
    }

}
