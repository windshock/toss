package com.bytedance.sdk.openadsdk.core.syc.zb;

import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.hf;
import com.bytedance.sdk.openadsdk.utils.yzp;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class sya$6 implements hf.ycx {
    final /* synthetic */ sya ycx;

    sya$6(sya syaVar) {
        this.ycx = syaVar;
    }

    public void ycx(Context context, Intent intent, boolean z, final int i2) {
        yzp.ycx(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.syc.zb.sya$6.1
            @Override // java.lang.Runnable
            public void run() {
                sya.ycx(sya$6.this.ycx, i2);
            }
        });
    }
}
