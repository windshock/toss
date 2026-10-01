package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.oty.sya;
import com.bytedance.sdk.openadsdk.utils.dc;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class TTPlayableLandingPageActivity$7 implements View.OnSystemUiVisibilityChangeListener {
    final /* synthetic */ TTPlayableLandingPageActivity ycx;

    TTPlayableLandingPageActivity$7(TTPlayableLandingPageActivity tTPlayableLandingPageActivity) {
        this.ycx = tTPlayableLandingPageActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i2) {
        if (i2 == 0) {
            try {
                if (this.ycx.isFinishing()) {
                    return;
                }
                this.ycx.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity$7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        dc.zb(TTPlayableLandingPageActivity$7.this.ycx);
                    }
                }, 2500L);
            } catch (Exception e) {
                sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE40StCFN5zmMTa9gyYdG0g==", "b9odmQKlaMWMT/tcghWpJlzeLJIGnWrTiVzeSZVV8X4=", "VOAejBCobMq1Q+FUnxiiIVfnOYwgtGjJh08=", 1260);
                htf.sya("TTPWPActivity", e.getMessage());
            }
        }
    }
}
