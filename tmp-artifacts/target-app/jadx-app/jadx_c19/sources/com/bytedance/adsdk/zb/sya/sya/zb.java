package com.bytedance.adsdk.zb.sya.sya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.zb.sya.sya.lud;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb extends ycx {
    private final Paint ea;
    private final List<ycx> fby;
    private final RectF jc;
    private final RectF jw;
    private boolean ok;
    private com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ul;

    public zb(com.bytedance.adsdk.zb.jw jwVar, lud ludVar, List<lud> list, com.bytedance.adsdk.zb.ul ulVar, Context context) {
        int i2;
        ycx ycxVar;
        lud.zb zbVarOk;
        int i3;
        super(jwVar, ludVar);
        this.fby = new ArrayList();
        this.jw = new RectF();
        this.jc = new RectF();
        this.ea = new Paint();
        this.ok = true;
        com.bytedance.adsdk.zb.sya.ycx.zb zbVarThx = ludVar.thx();
        if (zbVarThx != null) {
            com.bytedance.adsdk.zb.ycx.zb.ycx<Float, Float> ycxVarYcx = zbVarThx.ycx();
            this.ul = ycxVarYcx;
            ycx(ycxVarYcx);
            this.ul.ycx(this);
        } else {
            this.ul = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(ulVar.ry().size());
        int size = list.size() - 1;
        ycx ycxVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            lud ludVar2 = list.get(size);
            ycx ycxVarYcx2 = ycx.ycx(this, ludVar2, jwVar, ulVar, context);
            if (ycxVarYcx2 != null) {
                longSparseArray.put(ycxVarYcx2.zb().lud(), ycxVarYcx2);
                if (ycxVar2 != null) {
                    ycxVar2.ycx(ycxVarYcx2);
                    ycxVar2 = null;
                } else {
                    this.fby.add(0, ycxVarYcx2);
                    if (ludVar2 != null && (zbVarOk = ludVar2.ok()) != null && ((i3 = AnonymousClass1.ycx[zbVarOk.ordinal()]) == 1 || i3 == 2)) {
                        ycxVar2 = ycxVarYcx2;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < longSparseArray.size(); i2++) {
            ycx ycxVar3 = (ycx) longSparseArray.get(longSparseArray.keyAt(i2));
            if (ycxVar3 != null && (ycxVar = (ycx) longSparseArray.get(ycxVar3.zb().ry())) != null) {
                ycxVar3.zb(ycxVar);
            }
        }
    }

    /* renamed from: com.bytedance.adsdk.zb.sya.sya.zb$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[lud.zb.values().length];
            ycx = iArr;
            try {
                iArr[lud.zb.zb.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[lud.zb.sya.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void zb(boolean z) {
        this.ok = z;
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void ycx(boolean z) {
        super.ycx(z);
        Iterator<ycx> it = this.fby.iterator();
        while (it.hasNext()) {
            it.next().ycx(z);
        }
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void zb(Canvas canvas, Matrix matrix, int i2) {
        super.zb(canvas, matrix, i2);
        com.bytedance.adsdk.zb.lud.ycx("CompositionLayer#draw");
        this.jc.set(0.0f, 0.0f, this.sya.fby(), this.sya.jw());
        matrix.mapRect(this.jc);
        boolean z = this.zb.jw() && this.fby.size() > 1 && i2 != 255;
        if (z) {
            this.ea.setAlpha(i2);
            com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.jc, this.ea);
        } else {
            canvas.save();
        }
        if (z) {
            i2 = 255;
        }
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            if ((!this.ok && "__container".equals(this.sya.lt())) || this.jc.isEmpty() || canvas.clipRect(this.jc)) {
                this.fby.get(size).ycx(canvas, matrix, i2);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.zb.lud.zb("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx, com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        super.ycx(rectF, matrix, z);
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            this.jw.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.fby.get(size).ycx(this.jw, this.ycx, true);
            rectF.union(this.jw);
        }
    }

    public List<ycx> ok() {
        return this.fby;
    }

    @Override // com.bytedance.adsdk.zb.sya.sya.ycx
    public void ycx(float f) {
        super.ycx(f);
        if (this.ul != null) {
            f = ((this.ul.ul().floatValue() * this.sya.ycx().ok()) - this.sya.ycx().lt()) / (this.zb.hf().wie() + 0.01f);
        }
        if (this.ul == null) {
            f -= this.sya.sya();
        }
        if (this.sya.zb() != 0.0f && !"__container".equals(this.sya.lt())) {
            f /= this.sya.zb();
        }
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            this.fby.get(size).ycx(f);
        }
    }
}
