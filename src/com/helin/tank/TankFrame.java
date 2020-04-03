package com.helin.tank;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/4 6:55
 * @Copyright © 新点软件股份有限公司
 */
public class TankFrame extends Frame {

    private int x = 200;
    private int y = 200;

    public TankFrame() throws HeadlessException {
        this.setTitle("坦克大战");
        this.setName("tank war");
        this.setSize(800, 800);
        this.setEnabled(true);
        this.setVisible(true);
        this.setResizable(false);
        //添加桌面监听事件
        this.addWindowListener(new WindowAdapter() {
            /**
             * 点击关闭按钮时退出程序
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //添加按钮监听事件
        this.addKeyListener(new DefaultKeyListener());

    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);
        x += 50;
        y += 50;
    }


    //默认的按钮监听事件
    private class DefaultKeyListener implements KeyListener {


        /**
         * Invoked when a key has been typed.
         * See the class description for {@link KeyEvent} for a definition of
         * a key typed event.
         *
         * @param e
         */
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("keyTyped:" + e.paramString());
        }

        /**
         * Invoked when a key has been pressed.
         * See the class description for {@link KeyEvent} for a definition of
         * a key pressed event.
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed:" + e.paramString());
        }

        /**
         * Invoked when a key has been released.
         * See the class description for {@link KeyEvent} for a definition of
         * a key released event.
         *
         * @param e
         */
        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased:" + e.paramString());
        }
    }
}
