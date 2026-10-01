package com.lguplus.usimlib;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface CommonApiRequestListener {
    void onError(JSONObject jSONObject);

    void onRequestDeviceId(String str);

    void onRequestIccId(String str);

    void onRequestImei(String str);

    void onRequestMeid(String str);

    void onRequestSerial(String str);

    void onRequestSimSerialNumber(String str);

    void onRequestSubscriberId(String str);
}
