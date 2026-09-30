package com.lguplus.usimlib;

import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface AgentStateListener {
    void onProgressChanged(JSONObject jSONObject);

    void onRequestState(int i);
}
