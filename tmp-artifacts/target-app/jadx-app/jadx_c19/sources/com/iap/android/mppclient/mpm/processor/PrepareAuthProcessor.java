package com.iap.android.mppclient.mpm.processor;

import android.text.TextUtils;
import com.iap.android.mppclient.basic.http.BaseProcessor;
import com.iap.android.mppclient.mpm.model.PrepareAuthResult;
import com.iap.android.mppclient.mpm.request.BaseRequest;
import com.iap.android.mppclient.mpm.request.PrepareAuthRequest;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareAuthProcessor extends BaseProcessor<PrepareAuthRequest, PrepareAuthResult> {
    public PrepareAuthResult fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        PrepareAuthResult prepareAuthResult = new PrepareAuthResult();
        prepareAuthResult.acquirerId = jSONObject.optString("acquirerId");
        prepareAuthResult.authClientId = jSONObject.optString("authClientId");
        prepareAuthResult.authRedirectUrl = jSONObject.optString("authRedirectUrl");
        prepareAuthResult.pspId = jSONObject.optString("pspId");
        prepareAuthResult.scopes = getScopes(jSONObject.optJSONArray("scopes"));
        return prepareAuthResult;
    }

    public String toJson(PrepareAuthRequest prepareAuthRequest) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("acquirerId", prepareAuthRequest.acquirerId);
            jSONObject.put("authUrl", prepareAuthRequest.authUrl);
            jSONObject.put("passThroughInfo", ((BaseRequest) prepareAuthRequest).passThroughInfo);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private List<String> getScopes(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
        }
        return arrayList;
    }

    public String getPath() {
        return "api/open/common_json/extensions/prepareAuthInfo";
    }
}
