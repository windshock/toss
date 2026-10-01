package com.bytedance.sdk.component.adexpress.dynamic.ycx;

import com.bytedance.sdk.component.adexpress.dynamic.lud.ul;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ycx$ycx implements Runnable {
    final /* synthetic */ ycx ycx;
    private int zb;

    public ycx$ycx(ycx ycxVar, int i2) {
        this.ycx = ycxVar;
        this.zb = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.zb == 2) {
            ycx.dj(this.ycx).callBackRenderFail(ycx.lud(this.ycx) instanceof ul ? 127 : 117, null);
        }
    }
}
