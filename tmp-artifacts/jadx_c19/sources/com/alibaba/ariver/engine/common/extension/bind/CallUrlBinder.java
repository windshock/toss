package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallUrl;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CallUrlBinder implements Binder<BindingCallUrl, String> {
    private String callUrl;

    public CallUrlBinder(String str) {
        this.callUrl = str;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public String bind(Class<String> cls, BindingCallUrl bindingCallUrl) throws BindException {
        return this.callUrl;
    }
}
