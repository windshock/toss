package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea {
    private Map<String, Object> dj;
    private JSONObject sya;
    private Context ycx;
    private JSONObject zb;

    public void ycx(Context context) {
        this.ycx = context;
    }

    public void ycx(JSONObject jSONObject) {
        this.zb = jSONObject;
    }

    public JSONObject ycx() {
        return this.sya;
    }

    public void zb(JSONObject jSONObject) {
        this.sya = jSONObject;
    }

    public Map<String, Object> zb() {
        return this.dj;
    }

    public void ycx(Map<String, Object> map) {
        this.dj = map;
    }
}
