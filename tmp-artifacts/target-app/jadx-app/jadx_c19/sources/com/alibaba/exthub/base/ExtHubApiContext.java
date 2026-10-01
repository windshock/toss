package com.alibaba.exthub.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.exthub.event.ExtHubEventUtil;
import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubApiContext implements ApiContext {
    private String a;
    private Activity b;
    private String c;
    private String d;

    public void callBridgeApi(NativeCallContext nativeCallContext, SendToNativeCallback sendToNativeCallback, boolean z) {
    }

    public String getBridgeId() {
        return null;
    }

    public Resource getContent(String str) {
        return null;
    }

    public View getInternalView() {
        return null;
    }

    public int getPageId() {
        return 0;
    }

    public Render getRender() {
        return null;
    }

    public int getRenderId() {
        return 0;
    }

    public String getSourceProcess() {
        return null;
    }

    public Bundle getStartParams() {
        return null;
    }

    public boolean isFromRemote() {
        return false;
    }

    public ExtHubApiContext(String str, Activity activity, String str2) {
        this.a = str;
        this.b = activity;
        this.c = str2;
    }

    public ExtHubApiContext(String str, Activity activity, String str2, String str3) {
        this.a = str;
        this.b = activity;
        this.c = str2;
        this.d = str3;
    }

    public String getPluginId() {
        return this.d;
    }

    public String getAppId() {
        return this.a;
    }

    public Context getAppContext() {
        return ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
    }

    public Activity getActivity() {
        return this.b;
    }

    public void startActivity(Intent intent) {
        Activity activity = this.b;
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    public void sendEvent(String str, @Nullable JSONObject jSONObject, @Nullable SendToRenderCallback sendToRenderCallback) {
        ExtHubEventUtil.sendNativeEvent(str, jSONObject);
    }

    public String getBizType() {
        return this.c;
    }

    public void setBizType(String str) {
        this.c = str;
    }
}
