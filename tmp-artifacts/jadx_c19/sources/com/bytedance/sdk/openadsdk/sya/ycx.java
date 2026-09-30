package com.bytedance.sdk.openadsdk.sya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.dc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends com.bytedance.sdk.openadsdk.core.lt.fby {
    private int dj;
    private boolean sya;
    private Paint ycx;
    private float zb;

    public ycx(Context context) {
        super(context);
        ycx();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx() {
        this.zb = dc.ycx(getContext(), 8.0f);
        this.ycx = new Paint();
    }

    public void setMinTextSize(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.zb = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ycx(String str, int i2) {
        if (this.sya || i2 <= 0) {
            return;
        }
        float textSize = getTextSize();
        this.ycx.set(getPaint());
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float fYcx = ycx(textSize, str);
        while (fYcx > (i2 - paddingLeft) - paddingRight) {
            textSize -= 1.0f;
            this.ycx.setTextSize(textSize);
            if (textSize <= this.zb) {
                break;
            } else {
                fYcx = ycx(textSize, str);
            }
        }
        setTextSize(0, textSize);
        this.sya = true;
    }

    private float ycx(float f, String str) {
        this.ycx.setTextSize(f);
        return this.ycx.measureText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.dj = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.dj);
        } else {
            layoutParams.height = this.dj;
        }
        setLayoutParams(layoutParams);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i2 = this.dj;
        if (i2 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        ycx(getText().toString(), getWidth());
    }
}
