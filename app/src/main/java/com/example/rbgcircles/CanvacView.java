package com.example.rbgcircles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CanvacView extends View {
    private MainCircle mainCircle;
    private Paint paint;


    public CanvacView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initMainCircle();
        initPaint();
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(300,600);

    }

    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getRadius(),paint);
    }
}
