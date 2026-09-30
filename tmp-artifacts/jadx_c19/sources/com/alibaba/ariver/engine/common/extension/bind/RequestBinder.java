package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RequestBinder<T> implements Binder<BindingRequest, T> {
    private JSONObject sourceJSON;

    public RequestBinder(JSONObject jSONObject) {
        this.sourceJSON = jSONObject;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public T bind(Class<T> cls, BindingRequest bindingRequest) throws BindException {
        JSONObject jSONObject = this.sourceJSON;
        if (jSONObject == null) {
            throw new BindException("input JSON is null");
        }
        try {
            return (T) JSON.toJavaObject(jSONObject, cls);
        } catch (Throwable th) {
            throw new BindException(th.getMessage());
        }
    }
}
