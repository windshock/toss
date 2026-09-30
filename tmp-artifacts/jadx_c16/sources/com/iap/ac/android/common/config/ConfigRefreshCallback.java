package com.iap.ac.android.common.config;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface ConfigRefreshCallback {
    void onFetchFailed(String str, String str2);

    void onFetchSuccess(JSONObject jSONObject);
}
