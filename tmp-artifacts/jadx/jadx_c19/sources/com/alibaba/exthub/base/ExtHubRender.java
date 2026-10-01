package com.alibaba.exthub.base;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.model.ExitCallback;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.bridge.model.ScrollChangedCallback;
import com.alibaba.ariver.kernel.api.node.DataNode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubRender implements Render {
    private RenderBridge a = new ExtHubRenderBridgeImpl();
    private RVEngine b = new ExtHubRVEngine();
    private DataNode c;

    public void destroy() {
    }

    public void eveluateJavaScript(String str) {
    }

    public Activity getActivity() {
        return null;
    }

    public String getAppId() {
        return null;
    }

    public Bitmap getCapture(int i2) {
        return null;
    }

    public String getCurrentUri() {
        return null;
    }

    public int getPageId() {
        return 0;
    }

    public String getRenderId() {
        return null;
    }

    public int getScrollY() {
        return 0;
    }

    public Bundle getStartParams() {
        return null;
    }

    public String getUserAgent() {
        return null;
    }

    public View getView() {
        return null;
    }

    public void goBack(GoBackCallback goBackCallback) {
    }

    public boolean hasTriggeredLoad() {
        return false;
    }

    public void init() {
    }

    public boolean isDestroyed() {
        return false;
    }

    public void load(LoadParams loadParams) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void reload() {
    }

    public void reset() {
    }

    public void runExit(ExitCallback exitCallback) {
    }

    public void setScrollChangedCallback(ScrollChangedCallback scrollChangedCallback) {
    }

    public void setTextSize(int i2) {
    }

    public void showErrorView(View view) {
    }

    public void triggerSaveSnapshot() {
    }

    public ExtHubRender(DataNode dataNode) {
        this.c = dataNode;
    }

    public RVEngine getEngine() {
        return this.b;
    }

    public RenderBridge getRenderBridge() {
        return this.a;
    }

    public DataNode getPage() {
        return this.c;
    }
}
