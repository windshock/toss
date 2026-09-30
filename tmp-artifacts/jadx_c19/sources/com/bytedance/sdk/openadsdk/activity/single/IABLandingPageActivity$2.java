package com.bytedance.sdk.openadsdk.activity.single;

import com.bytedance.sdk.component.jw.fby;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class IABLandingPageActivity$2 implements Runnable {
    final /* synthetic */ fby ycx;
    final /* synthetic */ IABLandingPageActivity zb;

    IABLandingPageActivity$2(IABLandingPageActivity iABLandingPageActivity, fby fbyVar) {
        this.zb = iABLandingPageActivity;
        this.ycx = fbyVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ycx.scrollBy(0, 1);
        this.ycx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity$2.1
            @Override // java.lang.Runnable
            public void run() {
                IABLandingPageActivity$2 iABLandingPageActivity$2 = IABLandingPageActivity$2.this;
                if (iABLandingPageActivity$2.ycx == null || iABLandingPageActivity$2.zb.isFinishing()) {
                    return;
                }
                IABLandingPageActivity$2.this.ycx.scrollBy(0, -1);
            }
        }, 10L);
    }
}
