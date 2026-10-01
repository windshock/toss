package com.tnkfactory.ad.rwd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ImprovedBulletSpan implements LeadingMarginSpan {
    public Path a;
    public final int b;
    public final int c;
    public final int d;

    public ImprovedBulletSpan(int i2, int i3, int i4) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7, int i8, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i7) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float lineBaseline = layout != null ? layout.getLineBaseline(layout.getLineForOffset(i7)) - (this.b * 2.0f) : (i4 + i6) / 2.0f;
            float f = (i3 * this.b) + i2;
            if (canvas.isHardwareAccelerated()) {
                if (this.a == null) {
                    Path path = new Path();
                    this.a = path;
                    path.addCircle(0.0f, 0.0f, this.b, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(f, lineBaseline);
                canvas.drawPath(this.a, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f, lineBaseline, this.b, paint);
            }
            paint.setStyle(style);
        }
    }

    public final int getBulletRadius() {
        return this.b;
    }

    public final int getColor() {
        return this.d;
    }

    public final int getGapWidth() {
        return this.c;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return (this.b << 1) + this.c;
    }
}
