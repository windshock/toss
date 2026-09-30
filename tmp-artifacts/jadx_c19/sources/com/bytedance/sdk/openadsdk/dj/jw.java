package com.bytedance.sdk.openadsdk.dj;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.jw.zb;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw {
    private final WebView fby;
    private long jc;
    private int lt;
    private final boolean lud;
    private int ul;
    private final tn ycx;
    private String jw = "landingpage";
    private final Map<Integer, Long> zb = new HashMap();
    private final List<Integer> sya = new ArrayList();
    private final Map<Integer, String> dj = new HashMap();

    public jw(tn tnVar, WebView webView, boolean z) {
        this.ycx = tnVar;
        this.fby = webView;
        this.lud = z;
    }

    public void ycx(String str, int i2) {
        if (this.lud) {
            i2++;
        }
        if (ycx(true)) {
            sya.ycx(this.ycx, this.jw, this.lt, str, i2);
            this.dj.put(Integer.valueOf(this.lt), str);
            this.jc = SystemClock.elapsedRealtime();
        }
    }

    public void ycx(String str) {
        if (ycx(false)) {
            sya.ycx(this.ycx, this.jw, this.lt, str, SystemClock.elapsedRealtime() - this.jc);
        }
    }

    public void ycx(WebView webView, String str) {
        tn tnVar = this.ycx;
        if (tnVar == null || !zb.ycx(tnVar.hf().sya(), str)) {
            return;
        }
        String str2 = this.dj.get(Integer.valueOf(this.lt));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sya.ycx(this.ycx, this.jw, this.lt, str2, str, 2);
    }

    public void zb(String str) {
        String str2 = this.dj.get(Integer.valueOf(this.lt));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i2 = this.lt;
        if (i2 > 0) {
            sya.ycx(this.ycx, this.jw, i2, str3, str, 1);
        }
    }

    private boolean ycx(boolean z) {
        int i2 = z ? this.lt : this.ul;
        zb(z);
        int i3 = z ? this.lt : this.ul;
        return i3 > 0 && i3 != i2;
    }

    private void zb(boolean z) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.fby.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.lt = currentIndex + 1;
                    if (this.lud) {
                        this.lt = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.ul = currentIndex2 + 1;
                if (this.lud) {
                    this.ul = currentIndex2 + 2;
                }
            }
        } catch (Throwable th) {
            sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "evwvnBeuaMCFZtZTiBiuL3fhKg==", "Tv4plBe5StKSWNJTmCGhL17HI5EGpA==", 114);
            htf.sya("ArbitrageLandingLog", th.toString());
        }
    }

    public void sya(String str) {
        this.jw = str;
    }
}
