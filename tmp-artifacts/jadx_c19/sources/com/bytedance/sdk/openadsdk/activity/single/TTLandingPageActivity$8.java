package com.bytedance.sdk.openadsdk.activity.single;

import com.bytedance.sdk.component.jw.fby;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TTLandingPageActivity$8 implements Runnable {
    final /* synthetic */ fby ycx;
    final /* synthetic */ TTLandingPageActivity zb;

    TTLandingPageActivity$8(TTLandingPageActivity tTLandingPageActivity, fby fbyVar) {
        this.zb = tTLandingPageActivity;
        this.ycx = fbyVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ycx.scrollBy(0, 1);
        this.ycx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity$8.1
            @Override // java.lang.Runnable
            public void run() {
                TTLandingPageActivity$8 tTLandingPageActivity$8 = TTLandingPageActivity$8.this;
                if (tTLandingPageActivity$8.ycx == null || tTLandingPageActivity$8.zb.isFinishing()) {
                    return;
                }
                TTLandingPageActivity$8.this.ycx.scrollBy(0, -1);
            }
        }, 10L);
    }
}
