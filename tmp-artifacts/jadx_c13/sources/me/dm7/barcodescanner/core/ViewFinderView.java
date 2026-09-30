package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import o.ApmHelperzb;
import o.BusMonitorDependWrapper;
import org.bouncycastle.asn1.BERTags;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ViewFinderView extends View implements ApmHelperzb {
    private static final int[] asBinder = {0, 64, 128, BERTags.PRIVATE, 255, BERTags.PRIVATE, 128, 64};
    protected Paint IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private Rect access000;
    private int access100;
    private final int asInterface;
    protected boolean onExtraCallback;
    protected int onExtraCallbackWithResult;
    protected Paint onNavigationEvent;
    private final int onTransact;
    protected Paint onWarmupCompleted;

    public ViewFinderView(Context context) {
        super(context);
        this.asInterface = getResources().getColor(R.color.viewfinder_laser);
        this.IAuthTabCallbackStubProxy = getResources().getColor(R.color.viewfinder_mask);
        this.IAuthTabCallbackStub = getResources().getColor(R.color.viewfinder_border);
        this.onTransact = getResources().getInteger(R.integer.viewfinder_border_width);
        this.IAuthTabCallbackDefault = getResources().getInteger(R.integer.viewfinder_border_length);
        onWarmupCompleted();
    }

    public ViewFinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.asInterface = getResources().getColor(R.color.viewfinder_laser);
        this.IAuthTabCallbackStubProxy = getResources().getColor(R.color.viewfinder_mask);
        this.IAuthTabCallbackStub = getResources().getColor(R.color.viewfinder_border);
        this.onTransact = getResources().getInteger(R.integer.viewfinder_border_width);
        this.IAuthTabCallbackDefault = getResources().getInteger(R.integer.viewfinder_border_length);
        onWarmupCompleted();
    }

    private void onWarmupCompleted() {
        Paint paint = new Paint();
        this.onWarmupCompleted = paint;
        paint.setColor(this.asInterface);
        this.onWarmupCompleted.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.IAuthTabCallback = paint2;
        paint2.setColor(this.IAuthTabCallbackStubProxy);
        Paint paint3 = new Paint();
        this.onNavigationEvent = paint3;
        paint3.setColor(this.IAuthTabCallbackStub);
        this.onNavigationEvent.setStyle(Paint.Style.STROKE);
        this.onNavigationEvent.setStrokeWidth(this.onTransact);
        this.onExtraCallbackWithResult = this.IAuthTabCallbackDefault;
    }

    public void setLaserColor(int i) {
        this.onWarmupCompleted.setColor(i);
    }

    public void setMaskColor(int i) {
        this.IAuthTabCallback.setColor(i);
    }

    public void setBorderColor(int i) {
        this.onNavigationEvent.setColor(i);
    }

    public void setBorderStrokeWidth(int i) {
        this.onNavigationEvent.setStrokeWidth(i);
    }

    public void setBorderLineLength(int i) {
        this.onExtraCallbackWithResult = i;
    }

    public void setSquareViewFinder(boolean z) {
        this.onExtraCallback = z;
    }

    @Override // o.ApmHelperzb
    public void setupViewFinder() {
        onExtraCallback();
        invalidate();
    }

    @Override // o.ApmHelperzb
    public Rect onExtraCallbackWithResult() {
        return this.access000;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (onExtraCallbackWithResult() == null) {
            return;
        }
        onNavigationEvent(canvas);
        onExtraCallbackWithResult(canvas);
        onExtraCallback(canvas);
    }

    public void onNavigationEvent(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect rectOnExtraCallbackWithResult = onExtraCallbackWithResult();
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rectOnExtraCallbackWithResult.top, this.IAuthTabCallback);
        canvas.drawRect(0.0f, rectOnExtraCallbackWithResult.top, rectOnExtraCallbackWithResult.left, rectOnExtraCallbackWithResult.bottom + 1, this.IAuthTabCallback);
        canvas.drawRect(rectOnExtraCallbackWithResult.right + 1, rectOnExtraCallbackWithResult.top, f, rectOnExtraCallbackWithResult.bottom + 1, this.IAuthTabCallback);
        canvas.drawRect(0.0f, rectOnExtraCallbackWithResult.bottom + 1, f, height, this.IAuthTabCallback);
    }

    public void onExtraCallbackWithResult(Canvas canvas) {
        Rect rectOnExtraCallbackWithResult = onExtraCallbackWithResult();
        float f = rectOnExtraCallbackWithResult.left - 1;
        canvas.drawLine(f, rectOnExtraCallbackWithResult.top - 1, f, r1 + this.onExtraCallbackWithResult, this.onNavigationEvent);
        float f2 = rectOnExtraCallbackWithResult.top - 1;
        canvas.drawLine(rectOnExtraCallbackWithResult.left - 1, f2, r1 + this.onExtraCallbackWithResult, f2, this.onNavigationEvent);
        float f3 = rectOnExtraCallbackWithResult.left - 1;
        canvas.drawLine(f3, rectOnExtraCallbackWithResult.bottom + 1, f3, r1 - this.onExtraCallbackWithResult, this.onNavigationEvent);
        int i = rectOnExtraCallbackWithResult.left - 1;
        float f4 = rectOnExtraCallbackWithResult.bottom + 1;
        canvas.drawLine(i, f4, i + this.onExtraCallbackWithResult, f4, this.onNavigationEvent);
        float f5 = rectOnExtraCallbackWithResult.right + 1;
        canvas.drawLine(f5, rectOnExtraCallbackWithResult.top - 1, f5, r1 + this.onExtraCallbackWithResult, this.onNavigationEvent);
        float f6 = rectOnExtraCallbackWithResult.top - 1;
        canvas.drawLine(rectOnExtraCallbackWithResult.right + 1, f6, r1 - this.onExtraCallbackWithResult, f6, this.onNavigationEvent);
        float f7 = rectOnExtraCallbackWithResult.right + 1;
        canvas.drawLine(f7, rectOnExtraCallbackWithResult.bottom + 1, f7, r1 - this.onExtraCallbackWithResult, this.onNavigationEvent);
        int i2 = rectOnExtraCallbackWithResult.right + 1;
        float f8 = rectOnExtraCallbackWithResult.bottom + 1;
        canvas.drawLine(i2, f8, i2 - this.onExtraCallbackWithResult, f8, this.onNavigationEvent);
    }

    public void onExtraCallback(Canvas canvas) {
        Rect rectOnExtraCallbackWithResult = onExtraCallbackWithResult();
        Paint paint = this.onWarmupCompleted;
        int[] iArr = asBinder;
        paint.setAlpha(iArr[this.access100]);
        this.access100 = (this.access100 + 1) % iArr.length;
        int iHeight = (rectOnExtraCallbackWithResult.height() / 2) + rectOnExtraCallbackWithResult.top;
        canvas.drawRect(rectOnExtraCallbackWithResult.left + 2, iHeight - 1, rectOnExtraCallbackWithResult.right - 1, iHeight + 2, this.onWarmupCompleted);
        postInvalidateDelayed(80L, rectOnExtraCallbackWithResult.left - 10, rectOnExtraCallbackWithResult.top - 10, rectOnExtraCallbackWithResult.right + 10, rectOnExtraCallbackWithResult.bottom + 10);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        onExtraCallback();
    }

    public void onExtraCallback() {
        int width;
        int height;
        int width2;
        synchronized (this) {
            Point point = new Point(getWidth(), getHeight());
            int iIAuthTabCallback = BusMonitorDependWrapper.IAuthTabCallback(getContext());
            if (this.onExtraCallback) {
                if (iIAuthTabCallback != 1) {
                    width2 = getHeight();
                } else {
                    width2 = getWidth();
                }
                width = (int) (width2 * 0.625f);
                height = width;
            } else if (iIAuthTabCallback != 1) {
                int height2 = (int) (getHeight() * 0.625f);
                height = height2;
                width = (int) (height2 * 1.4f);
            } else {
                width = (int) (getWidth() * 0.75f);
                height = (int) (width * 0.75f);
            }
            if (width > getWidth()) {
                width = getWidth() - 50;
            }
            if (height > getHeight()) {
                height = getHeight() - 50;
            }
            int i = (point.x - width) / 2;
            int i2 = (point.y - height) / 2;
            this.access000 = new Rect(i, i2, width + i, height + i2);
        }
    }
}
