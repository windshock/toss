package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ApiContextBinder implements Binder<BindingApiContext, ApiContext> {
    private ApiContext mApiContext;

    public ApiContextBinder(ApiContext apiContext) {
        this.mApiContext = apiContext;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public ApiContext bind(Class<ApiContext> cls, BindingApiContext bindingApiContext) throws BindException {
        if (bindingApiContext.required() && this.mApiContext == null) {
            throw new BindException("Required ApiContext but not inject!!!");
        }
        return this.mApiContext;
    }
}
