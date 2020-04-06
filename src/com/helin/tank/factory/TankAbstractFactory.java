package com.helin.tank.factory;

import com.helin.tank.BaseGun;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank.factory
 * @date 2020/4/6 9:06
 * @Copyright © 新点软件股份有限公司
 */
public abstract class TankAbstractFactory {

    //子类创建具体型号坦克
    public abstract BaseGun createGun();

}
