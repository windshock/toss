package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dy implements ea, jc, lud, ry, ycx.InterfaceC0014ycx {
    private final com.bytedance.adsdk.zb.sya.sya.ycx dj;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> fby;
    private dj jc;
    private final com.bytedance.adsdk.zb.ycx.zb.dy jw;
    private final boolean lt;
    private final String lud;
    private final com.bytedance.adsdk.zb.jw sya;
    private final com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ul;
    private final Matrix ycx = new Matrix();
    private final Path zb = new Path();

    public dy(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.ok okVar) {
        this.sya = jwVar;
        this.dj = ycxVar;
        this.lud = okVar.ycx();
        this.lt = okVar.lud();
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx = okVar.zb().ycx();
        this.ul = ycxVarYcx;
        ycxVar.ycx(ycxVarYcx);
        ycxVarYcx.ycx(this);
        com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx2 = okVar.sya().ycx();
        this.fby = ycxVarYcx2;
        ycxVar.ycx(ycxVarYcx2);
        ycxVarYcx2.ycx(this);
        com.bytedance.adsdk.zb.ycx.zb.dy dyVarJc = okVar.dj().jc();
        this.jw = dyVarJc;
        dyVarJc.ycx(ycxVar);
        dyVarJc.ycx(this);
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.jc
    public void ycx(ListIterator<sya> listIterator) {
        if (this.jc != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.jc = new dj(this.sya, this.dj, "Repeater", this.lt, arrayList, null);
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
        this.jc.ycx(list, list2);
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ry
    public Path dj() {
        Path pathDj = this.jc.dj();
        this.zb.reset();
        float fFloatValue = this.ul.ul().floatValue();
        float fFloatValue2 = this.fby.ul().floatValue();
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.ycx.set(this.jw.zb(i2 + fFloatValue2));
            this.zb.addPath(pathDj, this.ycx);
        }
        return this.zb;
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        float fFloatValue = this.ul.ul().floatValue();
        float fFloatValue2 = this.fby.ul().floatValue();
        float fFloatValue3 = this.jw.zb().ul().floatValue() / 100.0f;
        float fFloatValue4 = this.jw.sya().ul().floatValue() / 100.0f;
        for (int i3 = ((int) fFloatValue) - 1; i3 >= 0; i3--) {
            this.ycx.set(matrix);
            float f = i3;
            this.ycx.preConcat(this.jw.zb(f + fFloatValue2));
            this.jc.ycx(canvas, this.ycx, (int) (i2 * com.bytedance.adsdk.zb.lt.lud.ycx(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        this.jc.ycx(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        this.sya.invalidateSelf();
    }
}
