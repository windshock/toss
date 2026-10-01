package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingId;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class IdBinder implements Binder<BindingId, String> {
    private String id;

    public IdBinder(String str) {
        this.id = str;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public String bind(Class<String> cls, BindingId bindingId) throws BindException {
        return this.id;
    }
}
