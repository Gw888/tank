package com.designmode.singleton;

import sun.security.jca.GetInstance;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

/**
 * 枚举单例
 *
 * @author 何林
 * @version V1.0
 * @Package com.designmode.singleton
 * @date 2020/4/4 12:09
 * @Copyright © 新点软件股份有限公司
 */
public enum SingletonEight {

    SINGLETON_EIGHT(0, "付款状态");

    private int status;

    private String name;

    SingletonEight(Integer status, String name) {
        this.status = status;
        this.name = name;
    }

    public int getStatus() {
        return this.status;
    }

    public String getName() {
        return this.name;
    }

}