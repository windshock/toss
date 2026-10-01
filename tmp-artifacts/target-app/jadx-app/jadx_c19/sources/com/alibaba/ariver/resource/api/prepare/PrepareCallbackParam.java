package com.alibaba.ariver.resource.api.prepare;

import android.os.Bundle;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.resource.api.models.AppModel;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PrepareCallbackParam {
    public StartAction action;
    public AppModel appInfo;
    public boolean needWaitIpc;
    public Bundle sceneParams;
    public Bundle startParams;

    public PrepareCallbackParam(PrepareContext prepareContext) {
        this.appInfo = prepareContext.getAppModel();
        this.startParams = prepareContext.getStartParams();
        this.sceneParams = prepareContext.getSceneParams();
    }

    public PrepareCallbackParam(Bundle bundle, Bundle bundle2, AppModel appModel) {
        this.appInfo = appModel;
        this.startParams = bundle;
        this.sceneParams = bundle2;
    }

    public String toString() {
        return "PrepareCallbackParam{, needWaitIpc=" + this.needWaitIpc + ", action=" + this.action + '}';
    }
}
