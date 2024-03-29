package com.example.rbgcircles;

public class MainCircle {
    private static final int INIT_RADIUS = 75;
    private static final int MAIN_SPEED = 30;
    private int x;
    private int y;
    private int radius;

    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        radius = INIT_RADIUS;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }


    public void moveMainCircleWhenTouchAt(int x1, int y1) {
     int dx = (x1-x)  * MAIN_SPEED /GameManager.getWidth();
     int dy = (y1-y)  * MAIN_SPEED /GameManager.getHeight();
     x+=dx;
     y+=dy;
    }
}
