package com.bytedance.sdk.component.adexpress.lt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok extends View {
    private int dj;
    private Paint ea;
    private int fby;
    private Bitmap jc;
    private int[] jw;
    private int lt;
    private int lud;
    private Xfermode ok;
    private PorterDuff.Mode ry;
    private int sya;
    private final List<ycx> syc;
    private int ul;
    private LinearGradient xkz;
    Rect ycx;
    Rect zb;

    public ok(Context context) {
        super(context);
        this.ry = PorterDuff.Mode.DST_IN;
        this.syc = new ArrayList();
        ycx();
    }

    private void ycx() {
        this.sya = com.bytedance.sdk.component.utils.wwx.dj(getContext(), "tt_splash_unlock_image_arrow");
        this.dj = Color.parseColor("#00ffffff");
        this.lud = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.lt = color;
        this.ul = 10;
        this.fby = 40;
        this.jw = new int[]{this.dj, this.lud, color};
        setLayerType(1, null);
        this.ea = new Paint(1);
        this.jc = BitmapFactory.decodeResource(getResources(), this.sya);
        this.ok = new PorterDuffXfermode(this.ry);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.jc, this.ycx, this.zb, this.ea);
        canvas.save();
        Iterator<ycx> it = this.syc.iterator();
        while (it.hasNext()) {
            ycx next = it.next();
            this.xkz = new LinearGradient(next.zb, 0.0f, next.zb + this.fby, this.ul, this.jw, (float[]) null, Shader.TileMode.CLAMP);
            this.ea.setColor(-1);
            this.ea.setShader(this.xkz);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.ea);
            this.ea.setShader(null);
            next.ycx();
            if (next.zb > getWidth()) {
                it.remove();
            }
        }
        this.ea.setXfermode(this.ok);
        canvas.drawBitmap(this.jc, this.ycx, this.zb, this.ea);
        this.ea.setXfermode(null);
        canvas.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (this.jc == null) {
            return;
        }
        this.ycx = new Rect(0, 0, this.jc.getWidth(), this.jc.getHeight());
        this.zb = new Rect(0, 0, getWidth(), getHeight());
    }

    public void ycx(int i2) {
        this.syc.add(new ycx(i2));
        postInvalidate();
    }

    public static class ycx {
        private final int ycx;
        private int zb = 0;

        public ycx(int i2) {
            this.ycx = i2;
        }

        public void ycx() {
            this.zb += this.ycx;
        }
    }
}
