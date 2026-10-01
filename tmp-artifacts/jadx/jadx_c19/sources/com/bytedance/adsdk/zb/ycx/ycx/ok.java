package com.bytedance.adsdk.zb.ycx.ycx;

import android.graphics.Path;
import com.bytedance.adsdk.zb.sya.zb.jw;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok implements jc, ry {
    private final String dj;
    private final com.bytedance.adsdk.zb.sya.zb.jw lt;
    private final Path ycx = new Path();
    private final Path zb = new Path();
    private final Path sya = new Path();
    private final List<ry> lud = new ArrayList();

    public ok(com.bytedance.adsdk.zb.sya.zb.jw jwVar) {
        this.dj = jwVar.ycx();
        this.lt = jwVar;
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.jc
    public void ycx(ListIterator<sya> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            sya syaVarPrevious = listIterator.previous();
            if (syaVarPrevious instanceof ry) {
                this.lud.add((ry) syaVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.sya
    public void ycx(List<sya> list, List<sya> list2) {
        for (int i2 = 0; i2 < this.lud.size(); i2++) {
            this.lud.get(i2).ycx(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.zb.ycx.ycx.ry
    public Path dj() {
        this.sya.reset();
        if (this.lt.sya()) {
            return this.sya;
        }
        int i2 = AnonymousClass1.ycx[this.lt.zb().ordinal()];
        if (i2 == 1) {
            ycx();
        } else if (i2 == 2) {
            ycx(Path.Op.UNION);
        } else if (i2 == 3) {
            ycx(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 4) {
            ycx(Path.Op.INTERSECT);
        } else if (i2 == 5) {
            ycx(Path.Op.XOR);
        }
        return this.sya;
    }

    /* renamed from: com.bytedance.adsdk.zb.ycx.ycx.ok$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;

        static {
            int[] iArr = new int[jw.ycx.values().length];
            ycx = iArr;
            try {
                iArr[jw.ycx.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ycx[jw.ycx.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ycx[jw.ycx.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ycx[jw.ycx.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ycx[jw.ycx.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void ycx() {
        for (int i2 = 0; i2 < this.lud.size(); i2++) {
            this.sya.addPath(this.lud.get(i2).dj());
        }
    }

    private void ycx(Path.Op op) {
        this.zb.reset();
        this.ycx.reset();
        for (int size = this.lud.size() - 1; size > 0; size--) {
            ry ryVar = this.lud.get(size);
            if (ryVar instanceof dj) {
                dj djVar = (dj) ryVar;
                List<ry> listZb = djVar.zb();
                for (int size2 = listZb.size() - 1; size2 >= 0; size2--) {
                    Path pathDj = listZb.get(size2).dj();
                    pathDj.transform(djVar.sya());
                    this.zb.addPath(pathDj);
                }
            } else {
                this.zb.addPath(ryVar.dj());
            }
        }
        ry ryVar2 = this.lud.get(0);
        if (ryVar2 instanceof dj) {
            dj djVar2 = (dj) ryVar2;
            List<ry> listZb2 = djVar2.zb();
            for (int i2 = 0; i2 < listZb2.size(); i2++) {
                Path pathDj2 = listZb2.get(i2).dj();
                pathDj2.transform(djVar2.sya());
                this.ycx.addPath(pathDj2);
            }
        } else {
            this.ycx.set(ryVar2.dj());
        }
        this.sya.op(this.ycx, this.zb, op);
    }
}
