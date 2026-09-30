package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.common.bridge.internal.DefaultBridgeCallback;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CallbackBinder implements Binder<BindingCallback, BridgeCallback> {
    private BridgeResponseHelper responseHelper;

    public CallbackBinder(BridgeResponseHelper bridgeResponseHelper) {
        this.responseHelper = bridgeResponseHelper;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public BridgeCallback bind(Class<BridgeCallback> cls, BindingCallback bindingCallback) throws BindException {
        return new DefaultBridgeCallback(this.responseHelper, bindingCallback.isSticky());
    }
}
