package com.iap.android.mppclient.container.interceptor;

import android.app.Activity;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface BridgeInterceptor {

    public static class InterceptContext {
        public JSONObject acParams;
        public Activity activity;
        public Context context;
        public boolean isMiniProgram;
        public JSONObject jsParameters;
        public String miniProgramAppID;
        public String miniProgramName;
        public String miniProgramPageURL;
        public String sourceSite;
    }

    boolean willHandleJSAPI(String str, InterceptContext interceptContext, BridgeCallback bridgeCallback);
}
