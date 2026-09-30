package com.bytedance.sdk.openadsdk.sya;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.pmi;
import com.bytedance.sdk.openadsdk.core.tn;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    private static volatile zb ycx;
    private final tn<com.bytedance.sdk.openadsdk.dj.ycx> zb = pmi.sya();

    private zb() {
    }

    public static zb ycx() {
        if (ycx == null) {
            synchronized (zb.class) {
                if (ycx == null) {
                    ycx = new zb();
                }
            }
        }
        return ycx;
    }

    public void ycx(@NonNull String str, List<FilterWord> list, String str2) {
        ycx(str, list, null, null, str2);
    }

    public void ycx(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.zb.ycx(str, list, jSONObject, str2, str3);
    }
}
