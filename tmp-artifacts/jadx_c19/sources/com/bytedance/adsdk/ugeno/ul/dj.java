package com.bytedance.adsdk.ugeno.ul;

import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    public static int ycx(boolean z, int i2, int i3) {
        if (i3 == 0 || !z) {
            return i2;
        }
        int i4 = i2 - 512;
        int iAbs = Math.abs(i4) % i3;
        return (i4 >= 0 || iAbs == 0) ? iAbs : i3 - iAbs;
    }

    public static boolean ycx(int i2, Collection<?> collection) {
        return i2 >= 0 && i2 < collection.size();
    }
}
