package com.bytedance.sdk.openadsdk.core.ul;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.ul.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx extends sya {
    private static volatile ycx ycx;

    @Override // com.bytedance.sdk.openadsdk.core.ul.sya
    public /* bridge */ /* synthetic */ sya.C0024sya ycx() {
        return super.ycx();
    }

    public static ycx ycx(Context context) {
        if (ycx == null) {
            synchronized (ycx.class) {
                if (ycx == null) {
                    ycx = new ycx(context);
                }
            }
        }
        return ycx;
    }

    private ycx(Context context) {
        super(context);
    }
}
