package org.opencv.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.text.DecimalFormat;
import java.util.Objects;
import net.sf.scuba.smartcards.BuildConfig;
import org.opencv.core.Core;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class FpsMeter {
    private static final DecimalFormat FPS_FORMAT = new DecimalFormat("0.00");
    private static final int STEP = 20;
    private static final String TAG = "FpsMeter";
    private int mFramesCounter;
    private double mFrequency;
    Paint mPaint;
    private String mStrfps;
    private long mprevFrameTime;
    boolean mIsInitialized = false;
    int mWidth = 0;
    int mHeight = 0;

    public void init() {
        this.mFramesCounter = 0;
        this.mFrequency = Core.getTickFrequency();
        this.mprevFrameTime = Core.getTickCount();
        this.mStrfps = BuildConfig.FLAVOR;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(-16776961);
        this.mPaint.setTextSize(20.0f);
    }

    public void measure() {
        if (!this.mIsInitialized) {
            init();
            this.mIsInitialized = true;
            return;
        }
        int i = this.mFramesCounter + 1;
        this.mFramesCounter = i;
        if (i % 20 == 0) {
            long tickCount = Core.getTickCount();
            double d = (this.mFrequency * 20.0d) / (tickCount - this.mprevFrameTime);
            this.mprevFrameTime = tickCount;
            if (this.mWidth != 0 && this.mHeight != 0) {
                this.mStrfps = FPS_FORMAT.format(d) + " FPS@" + Integer.valueOf(this.mWidth) + "x" + Integer.valueOf(this.mHeight);
                return;
            }
            this.mStrfps = FPS_FORMAT.format(d) + " FPS";
        }
    }

    public void setResolution(int i, int i2) {
        Objects.toString(Integer.valueOf(this.mWidth));
        Objects.toString(Integer.valueOf(this.mHeight));
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void draw(Canvas canvas, float f, float f2) {
        canvas.drawText(this.mStrfps, f, f2, this.mPaint);
    }
}
