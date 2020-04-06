package com.helin.tank;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class ImageUtil {
    public static BufferedImage rotateImage(final BufferedImage bufferedimage,
                                            final int degree) {
        int w = bufferedimage.getWidth();
        int h = bufferedimage.getHeight();
        int type = bufferedimage.getColorModel().getTransparency();
        BufferedImage img;
        Graphics2D graphics2d;
        (graphics2d = (img = new BufferedImage(w, h, type))
                .createGraphics()).setRenderingHint(
                RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2d.rotate(Math.toRadians(degree), w / 2, h / 2);
        graphics2d.drawImage(bufferedimage, 0, 0, null);
        graphics2d.dispose();
        return img;
    }

    public static BufferedImage getBufferedImageByGroupAndBreathe(Group group, int breathe) {
        breathe++;
        if (breathe > 100) {
            breathe = 0;
        }
        if (group.equals(Group.GOOD)) {
            if (breathe % 50 == 0) {
                return ResourceMgr.GOOD_BLUE_TANK_U;
            } else {
                return ResourceMgr.GOOD_RED_TANK_U;
            }
        } else {
            if (breathe % 50 == 0) {
                return ResourceMgr.BAD_BLUE_TANK_U;
            } else {
                return ResourceMgr.BAD_RED_TANK_U;
            }
        }
    }

}
