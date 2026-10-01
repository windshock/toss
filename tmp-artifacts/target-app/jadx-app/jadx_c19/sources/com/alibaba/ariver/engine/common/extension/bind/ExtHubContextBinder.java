package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindExtHubContext;
import com.alibaba.exthub.base.ExtHubContext;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExtHubContextBinder implements Binder<BindExtHubContext, ExtHubContext> {
    private ExtHubContext extHubContext;

    public ExtHubContextBinder(ExtHubContext extHubContext) {
        this.extHubContext = extHubContext;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public ExtHubContext bind(Class<ExtHubContext> cls, BindExtHubContext bindExtHubContext) throws BindException {
        if (bindExtHubContext.required() && this.extHubContext == null) {
            throw new BindException("Required ExtHubContext but not inject!!!");
        }
        return this.extHubContext;
    }
}
