package com.alibaba.ariver.integration.ipc.server.shadow;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.ariver.engine.BaseRenderImpl;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.ScrollChangedCallback;
import com.alibaba.ariver.kernel.api.node.DataNode;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ServerSideRender extends BaseRenderImpl {
    public Bitmap getCapture(int i2) {
        return null;
    }

    public int getPageId() {
        return 0;
    }

    public RenderBridge getRenderBridge() {
        return null;
    }

    public int getScrollY() {
        return 0;
    }

    public View getView() {
        return null;
    }

    public void init() {
    }

    @Override // com.alibaba.ariver.engine.BaseRenderImpl
    public void onDestroy() {
    }

    @Override // com.alibaba.ariver.engine.BaseRenderImpl
    public void onPause() {
    }

    @Override // com.alibaba.ariver.engine.BaseRenderImpl
    public void onResume() {
    }

    public void setScrollChangedCallback(ScrollChangedCallback scrollChangedCallback) {
    }

    public void showErrorView(View view) {
    }

    public ServerSideRender(RVEngine rVEngine, Activity activity, DataNode dataNode, CreateParams createParams) {
        super(rVEngine, activity, dataNode, createParams);
    }
}
