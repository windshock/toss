package com.bytedance.sdk.openadsdk.wwx;

import android.webkit.ValueCallback;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class fby$7 implements Runnable {
    final /* synthetic */ fby ycx;

    fby$7(fby fbyVar) {
        this.ycx = fbyVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (fby.lt(this.ycx) != null) {
            fby.lt(this.ycx).evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.wwx.fby$7.1
                @Override // android.webkit.ValueCallback
                /* renamed from: ycx, reason: merged with bridge method [inline-methods] */
                public void onReceiveValue(String str) {
                    if (fby.ul(fby$7.this.ycx) != null) {
                        fby.ul(fby$7.this.ycx).ycx(System.currentTimeMillis());
                    }
                }
            });
        }
        if (fby.fby(this.ycx) != null) {
            fby.fby(this.ycx).postDelayed(this, 500L);
        }
    }
}
