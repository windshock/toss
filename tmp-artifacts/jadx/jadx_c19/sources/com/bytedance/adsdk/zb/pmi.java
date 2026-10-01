package com.bytedance.adsdk.zb;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class pmi {
    private boolean ycx = false;
    private final Set<Object> zb = new ycx();
    private final Map<String, com.bytedance.adsdk.zb.lt.dj> sya = new HashMap();
    private final Comparator<Pair<String, Float>> dj = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.zb.pmi.1
        @Override // java.util.Comparator
        /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    void ycx(boolean z) {
        this.ycx = z;
    }

    public void ycx(String str, float f) {
        if (this.ycx) {
            com.bytedance.adsdk.zb.lt.dj djVar = this.sya.get(str);
            if (djVar == null) {
                djVar = new com.bytedance.adsdk.zb.lt.dj();
                this.sya.put(str, djVar);
            }
            djVar.ycx(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.zb.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
