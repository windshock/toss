package com.bytedance.sdk.openadsdk.core.jc;

import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.core.jc.ry;
import com.bytedance.sdk.openadsdk.core.widget.ycx.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ry$2$3 implements MessageQueue.IdleHandler {
    final /* synthetic */ ry.2 sya;
    final /* synthetic */ int ycx;
    final /* synthetic */ MessageQueue zb;

    ry$2$3(ry.2 r1, int i2, MessageQueue messageQueue) {
        this.sya = r1;
        this.ycx = i2;
        this.zb = messageQueue;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() throws Throwable {
        new sya(this.ycx, true, this.zb).zb();
        return false;
    }
}
