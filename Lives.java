import greenfoot.*;

import java.awt.*;


public class Lives extends Actor {
    private static final Color textColor = new Color(64, 255, 43);
    private String text;
    private int stringLength;
    private int remainingLives;

    public Lives(String prefix, int lives) {
        remainingLives = lives;
        text = prefix;
        stringLength = (text.length() + 2) * 10;

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);

        updateImage();
    }

    public void removeOne() {
        remainingLives = remainingLives--;

        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + remainingLives, 1, 12);
    }
}