package com.example.rbgcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

public class GameManager {

    private MainCircle mainCircle;
    private Paint paint;
    private CanvacView canvacView;
    private  static  int width;
    private  static  int height;


    public GameManager(CanvacView canvacView, int w, int h) {

        this.canvacView = canvacView;
        width =w;
        height = h;


        initMainCircle();
        initPaint();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width/2,height/2);

    }

    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

    }
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getRadius(),paint);
    }
}
