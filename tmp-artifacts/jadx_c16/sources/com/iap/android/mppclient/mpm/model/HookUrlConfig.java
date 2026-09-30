package com.iap.android.mppclient.mpm.model;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class HookUrlConfig {
    public String hookType;
    public String hookUrl;
    public String mappingParams;
    public String matchRule;
    public String matchType;

    public static final List<HookUrlConfig> parseConfig(String str) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        HookUrlConfig hookUrlConfig = new HookUrlConfig();
                        hookUrlConfig.hookType = jSONObject.optString("hookType");
                        hookUrlConfig.matchType = jSONObject.optString("matchType");
                        hookUrlConfig.matchRule = jSONObject.optString("matchRule");
                        hookUrlConfig.mappingParams = jSONObject.optString("mappingParams");
                        arrayList.add(hookUrlConfig);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }
}
