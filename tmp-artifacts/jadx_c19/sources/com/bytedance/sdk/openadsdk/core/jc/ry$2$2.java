package com.bytedance.sdk.openadsdk.core.jc;

import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.core.jc.ry;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ry$2$2 implements Runnable {
    final /* synthetic */ int dj;
    final /* synthetic */ ry.2 lud;
    final /* synthetic */ int sya;
    final /* synthetic */ int ycx;
    final /* synthetic */ MessageQueue zb;

    ry$2$2(ry.2 r1, int i2, MessageQueue messageQueue, int i3, int i4) {
        this.lud = r1;
        this.ycx = i2;
        this.zb = messageQueue;
        this.sya = i3;
        this.dj = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        ry.2.ycx(this.lud, this.zb, this.sya);
        ry.2.zb(this.lud, this.zb, this.dj);
    }
}
