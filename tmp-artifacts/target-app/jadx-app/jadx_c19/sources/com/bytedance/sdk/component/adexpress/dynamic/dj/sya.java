package com.bytedance.sdk.component.adexpress.dynamic.dj;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya {
    private HashMap<String, Object> ycx = new HashMap<>();
    private JSONObject zb;

    public sya(JSONObject jSONObject) {
        this.zb = jSONObject;
    }

    public Object ycx(String str) {
        if (this.ycx.containsKey(str)) {
            return this.ycx.get(str);
        }
        return null;
    }

    public boolean zb(String str) {
        return this.ycx.containsKey(str);
    }

    public void ycx() {
        Iterator<String> itKeys = this.zb.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.zb.opt(next);
            int i2 = 0;
            if (TextUtils.equals(TtmlNode.TAG_IMAGE, next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i2 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.ycx.put(next + "." + i2 + "." + next2, objOpt2);
                                }
                            }
                            i2++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) objOpt);
                        Iterator<String> itKeys3 = jSONObject.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObject.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i3 = 0; i3 < ((JSONArray) objOpt3).length(); i3++) {
                                    this.ycx.put(next + "." + next3 + "." + i3, ((JSONArray) objOpt3).opt(i3));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.ycx.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                ycx(next, next3, objOpt3);
                            } else {
                                this.ycx.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auSST9ZJhQel", "S+8/hgauStWFS8NUmhQ=", 79);
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject2.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject2.opt(next5);
                    this.ycx.put(next + "." + next5, objOpt5);
                }
            } else {
                this.ycx.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.ycx.put(next, objOpt);
                }
            }
        }
    }

    private void ycx(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i2 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i2 < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.ycx.put(str + "." + str2 + "." + next + "." + i2 + "." + next2, objOpt2);
                        }
                        i2++;
                    }
                }
            } else {
                this.ycx.put(str + "." + str2 + "." + next, objOpt);
            }
        }
    }
}
