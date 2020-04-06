package com.helin.tank.factory;

import com.helin.tank.*;

/**
 * 工厂方法创建坦克
 *
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank.factory
 * @date 2020/4/6 8:58
 * @Copyright © 新点软件股份有限公司
 */
public class TankFactory extends TankAbstractFactory {

    static TankFrame tf = TankFrame.getInstance();

    @Override
    public BaseGun createGun(){
        return new Tank(50,200, Dir.DD, Group.BAD,tf);
    }

}
