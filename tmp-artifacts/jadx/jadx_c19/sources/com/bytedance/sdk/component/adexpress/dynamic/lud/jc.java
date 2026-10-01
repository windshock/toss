package com.bytedance.sdk.component.adexpress.dynamic.lud;

import com.bytedance.sdk.component.adexpress.dynamic.lud.zb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jc {
    public static float ycx(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<zb.ycx> ycx(float f, List<zb.ycx> list) {
        ArrayList<zb.ycx> arrayList = new ArrayList();
        Iterator<zb.ycx> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((zb.ycx) it.next().clone());
        }
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        for (zb.ycx ycxVar : arrayList) {
            if (ycxVar.zb) {
                i2 = (int) (i2 + ycxVar.ycx);
            } else {
                i3 = (int) (i3 + ycxVar.ycx);
                z = false;
            }
        }
        if (!z || f <= i2) {
            float f2 = i2;
            float f3 = f < f2 ? f / f2 : 1.0f;
            float f4 = f > f2 ? (f - f2) / i3 : 0.0f;
            if (f4 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (zb.ycx ycxVar2 : arrayList) {
                    if (!ycxVar2.zb) {
                        float f5 = ycxVar2.sya;
                        if (f5 != 0.0f && ycxVar2.ycx * f4 > f5) {
                            ycxVar2.ycx = f5;
                            ycxVar2.zb = true;
                            z2 = true;
                        }
                    }
                    arrayList2.add(ycxVar2);
                }
                if (z2) {
                    return ycx(f, arrayList2);
                }
            }
            int i4 = 0;
            for (zb.ycx ycxVar3 : arrayList) {
                if (ycxVar3.zb) {
                    ycxVar3.ycx = ycx(ycxVar3.ycx * f3);
                } else {
                    ycxVar3.ycx = ycx(ycxVar3.ycx * f4);
                }
                i4 = (int) (i4 + ycxVar3.ycx);
            }
            float f6 = i4;
            if (f6 < f) {
                float f7 = f - f6;
                for (int size = 0; size < arrayList.size() && f7 > 0.0f; size = (size + 1) % arrayList.size()) {
                    zb.ycx ycxVar4 = (zb.ycx) arrayList.get(size);
                    if ((f < f2 && ycxVar4.zb) || (f > f2 && !ycxVar4.zb)) {
                        ycxVar4.ycx += 0.0625f;
                        f7 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }
}
