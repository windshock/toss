package com.bytedance.sdk.openadsdk.dj;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.openadsdk.oty.sya;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ry$ycx {
    private final int[] ycx;

    public ry$ycx(int[] iArr) {
        this.ycx = iArr;
    }

    @JavascriptInterface
    public void readPercent(String str) {
        int iIntValue;
        try {
            iIntValue = Float.valueOf(str).intValue();
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkAkjHI4EGrm/Gg08=", "SesskTO5e8SFRMM=", 785);
        }
        if (iIntValue > 100) {
            iIntValue = 100;
        } else if (iIntValue < 0) {
            iIntValue = 0;
        }
        int[] iArr = this.ycx;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        iArr[0] = iIntValue;
    }

    @JavascriptInterface
    public String getUrl() {
        return "";
    }
}
