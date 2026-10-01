package com.alibaba.ariver.engine.common.bridge.interceptor;

import com.alibaba.fastjson.JSONObject;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class InterceptResponse$Builder {
    JSONObject content;
    Map<String, Object> map;
    String name;
    String sessionId;
    Object target;
    long timeStamp = System.currentTimeMillis();

    private InterceptResponse$Builder() {
    }

    public static InterceptResponse$Builder create() {
        return new InterceptResponse$Builder();
    }

    public InterceptResponse$Builder setRequest(InterceptRequest interceptRequest) {
        this.sessionId = interceptRequest.getSessionId();
        this.name = interceptRequest.getName();
        return this;
    }

    public InterceptResponse$Builder setContent(JSONObject jSONObject) {
        this.content = jSONObject;
        return this;
    }

    public InterceptResponse$Builder setTarget(Object obj) {
        this.target = obj;
        return this;
    }

    public InterceptResponse$Builder addMaps(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            this.map = map;
        }
        return this;
    }

    public InterceptResponse$Builder copy(InterceptResponse interceptResponse) {
        if (interceptResponse == null) {
            return this;
        }
        this.name = interceptResponse.getName();
        this.timeStamp = interceptResponse.timeStamp();
        this.sessionId = interceptResponse.getSessionId();
        this.content = interceptResponse.getContent();
        this.target = interceptResponse.getTarget();
        this.map = InterceptResponse.access$000(interceptResponse);
        return this;
    }

    public InterceptResponse build() {
        return new InterceptResponse(this);
    }
}
