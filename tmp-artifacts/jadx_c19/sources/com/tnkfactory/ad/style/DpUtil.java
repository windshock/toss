package com.tnkfactory.ad.style;

import android.content.res.Resources;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DpUtil {
    public static final DpUtil INSTANCE = new DpUtil();

    public final int dpToPx(float f) {
        return (int) (f * Resources.getSystem().getDisplayMetrics().density);
    }

    public final int pxToDp(int i2) {
        return (int) (i2 / Resources.getSystem().getDisplayMetrics().density);
    }
}
