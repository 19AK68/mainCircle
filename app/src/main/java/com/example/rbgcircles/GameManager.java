package com.example.rbgcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

public class GameManager {

    private MainCircle mainCircle;

    private CanvacView canvacView;
    private  static  int width;
    private  static  int height;


    public GameManager(CanvacView canvacView, int w, int h) {

        this.canvacView = canvacView;
        width =w;
        height = h;


        initMainCircle();

    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width/2,height/2);

    }


    public void onDraw() {
        canvacView.drawCircle(mainCircle);
    }
}
