package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends zb {
    private final Bitmap sya;
    private final Rect zb = new Rect();
    private final Paint dj = new Paint(1);

    public ycx(Bitmap bitmap, zb zbVar) {
        this.sya = bitmap;
        if (zbVar != null) {
            this.ycx = zbVar.ycx;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iHeight = rect.height();
        int iWidth = rect.width();
        int width = this.sya.getWidth();
        int height = this.sya.getHeight();
        this.zb.set(0, 0, width, height);
        if (height >= iHeight && width >= iWidth) {
            if (width > iWidth) {
                Rect rect2 = this.zb;
                int i2 = (width - iWidth) / 2;
                rect2.left = i2;
                rect2.right = i2 + iWidth;
            }
            if (height > iHeight) {
                Rect rect3 = this.zb;
                int i3 = (height - iHeight) / 2;
                rect3.top = i3;
                rect3.bottom = i3 + iHeight;
                return;
            }
            return;
        }
        float f = iHeight;
        float f2 = height;
        float f3 = f / f2;
        float f4 = iWidth;
        float f5 = width;
        if (Math.max(f3, f4 / f5) > f3) {
            int i4 = (int) ((f / f4) * f5);
            Rect rect4 = this.zb;
            int i5 = (height - i4) / 2;
            rect4.top = i5;
            rect4.bottom = i5 + i4;
            return;
        }
        int i6 = (int) ((f4 / f) * f2);
        Rect rect5 = this.zb;
        int i7 = (width - i6) / 2;
        rect5.left = i7;
        rect5.right = i7 + i6;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zb
    protected void ycx(Canvas canvas) {
        canvas.drawBitmap(this.sya, this.zb, getBounds(), this.dj);
    }
}
