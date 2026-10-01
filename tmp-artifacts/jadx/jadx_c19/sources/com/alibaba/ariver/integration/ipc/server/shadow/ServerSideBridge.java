package com.alibaba.ariver.integration.ipc.server.shadow;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.engine.api.bridge.EngineRouter;
import com.alibaba.ariver.engine.api.bridge.NativeBridge;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.integration.ipc.server.ServerSideCallbackHolder;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ServerSideBridge implements NativeBridge {
    private static final String TAG = "AriverInt:ServerSideBridge";
    private App mApp;

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public void bindEngineRouter(EngineRouter engineRouter) {
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public void release() {
    }

    ServerSideBridge(App app) {
        this.mApp = app;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback) {
        return sendToNative(nativeCallContext, sendToNativeCallback, true);
    }

    @Override // com.alibaba.ariver.engine.api.bridge.NativeBridge
    public boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback, boolean z) {
        ServerSideCallbackHolder.getInstance().registerCallback(this.mApp.getStartToken(), nativeCallContext.getId(), sendToNativeCallback);
        Bundle bundle = new Bundle();
        bundle.putParcelable("remoteCallContext", nativeCallContext);
        bundle.putBoolean("remoteCallNeedPermission", z);
        RVLogger.d(TAG, "sendToNative with context: " + nativeCallContext);
        IpcServerUtils.sendMsgToClient(this.mApp.getAppId(), this.mApp.getStartToken(), 8, bundle);
        return true;
    }
}
