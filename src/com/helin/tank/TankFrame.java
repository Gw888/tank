package com.helin.tank;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 何林
 * @version V1.0
 * @Package com.helin.tank
 * @date 2020/4/4 19:59
 * @Copyright © 新点软件股份有限公司
 */
public class TankFrame extends Frame {

    public static final int GAME_WIDTH = 800;
    public static final int GAME_HEIGHT = 800;
    private static Dir dir = Dir.DD;
    private Tank myTank = new Tank(50, 50, Dir.DD,this);
//    private Bullet b = new Bullet(50,50,Dir.DD);
    private List<Bullet> bullets = new ArrayList<>();

    public TankFrame() throws HeadlessException {
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("tank war");
        this.setName("tank war");
        this.setSize(800, 800);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.addKeyListener(new DefaultKeyListener());

    }

    Image offScreenImage = null;
    @Override
    public void update(Graphics g){
        if(offScreenImage == null){
            offScreenImage = this.createImage(GAME_WIDTH,GAME_HEIGHT);
        }
        Graphics gOffScreen = offScreenImage.getGraphics();
        Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.BLACK);
        gOffScreen.fillRect(0,0,GAME_WIDTH,GAME_HEIGHT);
        gOffScreen.setColor(c);
        paint(gOffScreen);
        g.drawImage(offScreenImage,0,0,null);
    }

    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.drawString("发出子弹数量：" + bullets.size(),10,60);
        g.setColor(c);

        myTank.paint(g);
        for(int i = 0; i < bullets.size(); i++){
            bullets.get(i).paint(g);
        }
    }

    private class DefaultKeyListener implements KeyListener {

        private Boolean DU = false;
        private Boolean DR = false;
        private Boolean DD = false;
        private Boolean DL = false;

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("keyTyped : " + e.paramString());
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("keyPressed : " + e.paramString());
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    DL = true;
                    break;
                case KeyEvent.VK_DOWN:
                    DD = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    DR = true;
                    break;
                case KeyEvent.VK_UP:
                    DU = true;
                    break;
                default:
                    break;

            }

            defaultSwitch();

        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("keyReleased : " + e.paramString());
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    DL = false;
                    break;
                case KeyEvent.VK_DOWN:
                    DD = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    DR = false;
                    break;
                case KeyEvent.VK_UP:
                    DU = false;
                    break;
                case KeyEvent.VK_CONTROL:
                    myTank.fire();
                    break;
                default:
                    break;

            }
            defaultSwitch();
        }

        private void defaultSwitch() {
            myTank.setIsmoving(true);
            if (DL) myTank.setDir(Dir.DL);
            if (DU) myTank.setDir(Dir.DU);
            if (DR) myTank.setDir(Dir.DR);
            if (DD) myTank.setDir(Dir.DD);
            if(!DL && !DU && !DR && !DD) myTank.setIsmoving(false);
        }
    }

    public void addBullet(Bullet bullet) {
        this.bullets.add(bullet);
    }

    public List<Bullet> getBullets(){
        return this.bullets;
    }

}
