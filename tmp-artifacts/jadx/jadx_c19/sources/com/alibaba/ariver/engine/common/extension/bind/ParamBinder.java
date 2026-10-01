package com.alibaba.ariver.engine.common.extension.bind;

import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.exthub.common.ExtHubLogger;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ParamBinder<T> implements Binder<BindingParam, T> {
    private JSONObject sourceJSON;

    public ParamBinder(@Nullable JSONObject jSONObject) {
        this.sourceJSON = jSONObject;
    }

    @Override // com.alibaba.ariver.engine.common.extension.bind.Binder
    public T bind(Class<T> cls, BindingParam bindingParam) throws BindException {
        String str;
        String[] strArrValue = bindingParam.value();
        if (strArrValue == null || strArrValue.length <= 0) {
            strArrValue = bindingParam.name();
        }
        if (strArrValue == null || strArrValue.length <= 0) {
            throw new BindException("bind key is null");
        }
        try {
            int length = strArrValue.length;
            str = null;
            T t = null;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    str = strArrValue[i2];
                    JSONObject jSONObject = this.sourceJSON;
                    t = (jSONObject == null || !jSONObject.containsKey(str)) ? null : (T) this.sourceJSON.getObject(str, cls);
                    if (t != null) {
                        break;
                    }
                } catch (JSONException e) {
                    e = e;
                    ExtHubLogger.e("AriverKernel", "Binding targetType: " + cls + " with: " + this.sourceJSON + " key: " + str + " exception!", e);
                    throw new BindException(e.getMessage());
                }
            }
            if (t == null) {
                if (bindingParam.required()) {
                    throw new RequiredParamNotFoundException(strArrValue[0] + " param is missing!");
                }
                if (cls.isPrimitive()) {
                    if (cls == Boolean.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Boolean.valueOf(bindingParam.booleanDefault()), cls);
                    }
                    if (cls == Integer.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Integer.valueOf(bindingParam.intDefault()), cls);
                    }
                    if (cls == Float.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Float.valueOf(bindingParam.floatDefault()), cls);
                    }
                    if (cls == Double.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Double.valueOf(bindingParam.doubleDefault()), cls);
                    }
                    if (cls == Long.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Long.valueOf(bindingParam.longDefault()), cls);
                    }
                } else if (cls == String.class) {
                    return (T) TypeUtils.castToJavaBean(bindingParam.stringDefault(), cls);
                }
            }
            return t;
        } catch (JSONException e2) {
            e = e2;
            str = null;
        }
    }
}
