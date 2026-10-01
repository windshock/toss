package com.bytedance.sdk.component.adexpress.dynamic.ycx;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.component.adexpress.dynamic.dj.fby;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ycx$2 implements com.bytedance.sdk.component.adexpress.dynamic.lt.zb {
    final /* synthetic */ ycx ycx;

    ycx$2(ycx ycxVar) {
        this.ycx = ycxVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lt.zb
    public void ycx(final fby fbyVar) {
        ycx.zb(this.ycx);
        ycx.sya(this.ycx).lud().sya(this.ycx.sya());
        ycx.ycx(this.ycx, fbyVar);
        ycx.zb(this.ycx, fbyVar);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ycx.sya(this.ycx, fbyVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ycx.ycx$2.1
                @Override // java.lang.Runnable
                public void run() {
                    ycx.sya(ycx$2.this.ycx, fbyVar);
                }
            });
        }
        if (ycx.dj(this.ycx) == null || fbyVar == null) {
            return;
        }
        ycx.dj(this.ycx).setBgColor(fbyVar.ycx());
        ycx.dj(this.ycx).setBgMaterialCenterCalcColor(fbyVar.zb());
    }
}
