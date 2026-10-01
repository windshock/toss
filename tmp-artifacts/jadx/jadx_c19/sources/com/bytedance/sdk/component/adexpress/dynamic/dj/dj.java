package com.bytedance.sdk.component.adexpress.dynamic.dj;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class dj {
    public String dj;
    public String sya;
    public List<ycx> ycx;
    public String zb;

    public static class ycx {
        public int ycx;
        public JSONObject zb;
    }

    public static dj ycx(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dj djVar = new dj();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    ycx ycxVar = new ycx();
                    ycxVar.ycx = jSONObjectOptJSONObject.optInt(TtmlNode.ATTR_ID);
                    ycxVar.zb = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(ycxVar);
                }
            }
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auOJTNFtgASnIVU=", "S+8/hgaYYMGGettIixiu", 40);
        }
        djVar.ycx = arrayList;
        djVar.zb = jSONObject.optString("diff_data");
        djVar.sya = jSONObject.optString("style_diff");
        djVar.dj = jSONObject.optString("tag_diff");
        return djVar;
    }
}
