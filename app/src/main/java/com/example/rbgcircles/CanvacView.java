package com.example.rbgcircles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CanvacView extends View {
    private GameManager gameManager;



    public CanvacView(Context context, AttributeSet attrs) {
        super(context, attrs);
        gameManager = new GameManager();

    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);

    }
}
