package com.alibaba.ariver.engine.api.bridge;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface NativeBridge {
    void bindEngineRouter(EngineRouter engineRouter);

    void release();

    boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback);

    boolean sendToNative(NativeCallContext nativeCallContext, @Nullable SendToNativeCallback sendToNativeCallback, boolean z);
}
