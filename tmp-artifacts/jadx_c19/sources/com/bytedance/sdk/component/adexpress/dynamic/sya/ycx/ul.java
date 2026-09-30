package com.bytedance.sdk.component.adexpress.dynamic.sya.ycx;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.kernel.RVParams;
import java.lang.ref.SoftReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul implements View.OnTouchListener {
    private static int sya = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.sya.fby dj;
    private int lud;
    private float ycx;
    private float zb;
    private RectF lt = new RectF();
    private long ul = 0;
    private final int fby = RVParams.WEBVIEW_FONT_SIZE_LARGEST;
    private final int jw = 3;
    private SoftReference<View> jc = new SoftReference<>(null);

    public ul(com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar, int i2, final ViewGroup viewGroup) {
        this.lud = sya;
        this.dj = fbyVar;
        if (i2 > 0) {
            this.lud = i2;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.ul.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    ul.this.jc = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    private RectF ycx(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r1 + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar;
        com.bytedance.sdk.component.adexpress.dynamic.sya.fby fbyVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lt = ycx(this.jc.get());
            this.ycx = motionEvent.getRawX();
            this.zb = motionEvent.getRawY();
            this.ul = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.lt;
            if (rectF != null && !rectF.contains(this.ycx, this.zb)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float fAbs = Math.abs(rawX - this.ycx);
            float fAbs2 = Math.abs(rawY - this.zb);
            int iZb = com.bytedance.sdk.component.adexpress.dj.ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), Math.abs(rawX - this.ycx));
            float f = sya;
            if (fAbs < f || fAbs2 < f) {
                if ((System.currentTimeMillis() - this.ul < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (fbyVar = this.dj) != null) {
                    fbyVar.ycx();
                }
            } else if (rawX > this.ycx && iZb > this.lud && (fbyVar2 = this.dj) != null) {
                fbyVar2.ycx();
            }
        }
        return true;
    }
}
