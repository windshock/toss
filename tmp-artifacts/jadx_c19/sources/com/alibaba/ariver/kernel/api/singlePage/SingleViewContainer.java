package com.alibaba.ariver.kernel.api.singlePage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.singlePage.CaprSinglePageProxy;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SingleViewContainer {
    void addOnEmbedWebviewPostMessage(OnEmbedWebviewPostMessage onEmbedWebviewPostMessage);

    void addOnEmbedWebviewPostMessageWithResult(OnEmbedWebviewPostMessageWithResult onEmbedWebviewPostMessageWithResult);

    void addPostNotificationListener(OnEmbedWebviewPostNotification onEmbedWebviewPostNotification);

    void exitWebviewContainer();

    String getCurrentUrl();

    CaprSinglePageProxy.CaprErrorCallback getErrorCallback();

    Page getPage();

    String getPageToken();

    CaprSinglePageProxy.CaprProgressCallback getProgressCallback();

    Bundle getStartParams();

    View getView();

    ViewGroup getViewContainer();

    JSONArray getmJsapiBlackList();

    JSONArray getmLaunchParamsBlackList();

    boolean isSystemWebview();

    void loadUrl(String str);

    void popWebview(Page page);

    void postMessageToEmbedWebview(JSONObject jSONObject, PostMessageResponseCallback postMessageResponseCallback);

    void postMessageToNative(JSONObject jSONObject);

    JSONObject postMessageToNativeWithResult(JSONObject jSONObject);

    void postNotificationMessage(JSONObject jSONObject);

    void pushWebview(Page page);

    <T extends Extension> void registerExtensionByPoint(Class<T> cls, T t);

    void sendDataToWarpToWeb(String str, JSONObject jSONObject, H5WebDataCallBack h5WebDataCallBack);

    void sendPauseEventToToWeb(JSONObject jSONObject);

    void sendResumeEventToToWeb(JSONObject jSONObject);

    boolean setBackgroundColor(int i2);

    void setPageExitHandle(PageExitHandler pageExitHandler);
}
