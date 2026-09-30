package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.zb.ycx.zb.ycx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj implements lud, ry, ycx.InterfaceC0014ycx {
    private final Path dj;
    private com.bytedance.adsdk.zb.ycx.zb.dy ea;
    private final List<sya> fby;
    private List<ry> jc;
    private final com.bytedance.adsdk.zb.jw jw;
    private final String lt;
    private final RectF lud;
    private final Matrix sya;
    private final boolean ul;
    private final Paint ycx;
    private final RectF zb;

    private static List<sya> ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, List<com.bytedance.adsdk.zb.sya.zb.sya> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            sya syaVarYcx = list.get(i2).ycx(jwVar, ulVar, ycxVar);
            if (syaVarYcx != null) {
                arrayList.add(syaVarYcx);
            }
        }
        return arrayList;
    }

    static com.bytedance.adsdk.zb.sya.ycx.ok ycx(List<com.bytedance.adsdk.zb.sya.zb.sya> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.bytedance.adsdk.zb.sya.zb.sya syaVar = list.get(i2);
            if (syaVar instanceof com.bytedance.adsdk.zb.sya.ycx.ok) {
                return (com.bytedance.adsdk.zb.sya.ycx.ok) syaVar;
            }
        }
        return null;
    }

    public dj(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, com.bytedance.adsdk.zb.sya.zb.dy dyVar, com.bytedance.adsdk.zb.ul ulVar) {
        this(jwVar, ycxVar, dyVar.ycx(), dyVar.sya(), ycx(jwVar, ulVar, ycxVar, dyVar.zb()), ycx(dyVar.zb()));
    }

    dj(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar, String str, boolean z, List<sya> list, com.bytedance.adsdk.zb.sya.ycx.ok okVar) {
        this.ycx = new com.bytedance.adsdk.zb.ycx.ycx();
        this.zb = new RectF();
        this.sya = new Matrix();
        this.dj = new Path();
        this.lud = new RectF();
        this.lt = str;
        this.jw = jwVar;
        this.ul = z;
        this.fby = list;
        if (okVar != null) {
            com.bytedance.adsdk.zb.ycx.zb.dy dyVarJc = okVar.jc();
            this.ea = dyVarJc;
            dyVarJc.ycx(ycxVar);
            this.ea.ycx(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            sya syaVar = list.get(size);
            if (syaVar instanceof jc) {
                arrayList.add((jc) syaVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((jc) arrayList.get(size2)).ycx(list.listIterator(list.size()));
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.zb.ycx.InterfaceC0014ycx
    public void ycx() {
        this.jw.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.fby.size());
        arrayList.addAll(list);
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            sya syaVar = this.fby.get(size);
            syaVar.ycx(arrayList, this.fby.subList(0, size));
            arrayList.add(syaVar);
        }
    }

    List<ry> zb() {
        if (this.jc == null) {
            this.jc = new ArrayList();
            for (int i2 = 0; i2 < this.fby.size(); i2++) {
                sya syaVar = this.fby.get(i2);
                if (syaVar instanceof ry) {
                    this.jc.add((ry) syaVar);
                }
            }
        }
        return this.jc;
    }

    Matrix sya() {
        com.bytedance.adsdk.zb.ycx.zb.dy dyVar = this.ea;
        if (dyVar != null) {
            return dyVar.dj();
        }
        this.sya.reset();
        return this.sya;
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ry
    public Path dj() {
        this.sya.reset();
        com.bytedance.adsdk.zb.ycx.zb.dy dyVar = this.ea;
        if (dyVar != null) {
            this.sya.set(dyVar.dj());
        }
        this.dj.reset();
        if (this.ul) {
            return this.dj;
        }
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            sya syaVar = this.fby.get(size);
            if (syaVar instanceof ry) {
                this.dj.addPath(((ry) syaVar).dj(), this.sya);
            }
        }
        return this.dj;
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(Canvas canvas, Matrix matrix, int i2) {
        if (this.ul) {
            return;
        }
        this.sya.set(matrix);
        com.bytedance.adsdk.zb.ycx.zb.dy dyVar = this.ea;
        if (dyVar != null) {
            this.sya.preConcat(dyVar.dj());
            i2 = (int) (((((this.ea.ycx() == null ? 100 : this.ea.ycx().ul().intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        boolean z = this.jw.jw() && lud() && i2 != 255;
        if (z) {
            this.zb.set(0.0f, 0.0f, 0.0f, 0.0f);
            ycx(this.zb, this.sya, true);
            this.ycx.setAlpha(i2);
            com.bytedance.adsdk.zb.lt.lt.ycx(canvas, this.zb, this.ycx);
        }
        if (z) {
            i2 = 255;
        }
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            sya syaVar = this.fby.get(size);
            if (syaVar instanceof lud) {
                ((lud) syaVar).ycx(canvas, this.sya, i2);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean lud() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.fby.size(); i3++) {
            if ((this.fby.get(i3) instanceof lud) && (i2 = i2 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.lud
    public void ycx(RectF rectF, Matrix matrix, boolean z) {
        this.sya.set(matrix);
        com.bytedance.adsdk.zb.ycx.zb.dy dyVar = this.ea;
        if (dyVar != null) {
            this.sya.preConcat(dyVar.dj());
        }
        this.lud.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.fby.size() - 1; size >= 0; size--) {
            sya syaVar = this.fby.get(size);
            if (syaVar instanceof lud) {
                ((lud) syaVar).ycx(this.lud, this.sya, z);
                rectF.union(this.lud);
            }
        }
    }
}
