package com.alibaba.ariver.engine.api.bridge.model;

import com.alibaba.ariver.engine.api.Render;
import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RenderCallContext {
    public static final String TYPE_CALL = "call";
    public static final String TYPE_CALLBACK = "callback";
    private String action;
    private String eventId;
    private boolean keep;
    private JSONObject param;
    private Render target;
    private String type;

    public RenderCallContext(Builder builder) {
        this.eventId = builder.eventId;
        this.action = builder.action;
        JSONObject jSONObject = builder.param;
        this.param = jSONObject;
        if (jSONObject == null) {
            this.param = new JSONObject();
        }
        this.type = builder.type;
        this.keep = builder.keep;
        this.target = builder.target;
    }

    public Render getTarget() {
        return this.target;
    }

    public String getEventId() {
        return this.eventId;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public JSONObject getParam() {
        return this.param;
    }

    public void setParam(JSONObject jSONObject) {
        this.param = jSONObject;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public boolean getKeep() {
        return this.keep;
    }

    public void setKeep(boolean z) {
        this.keep = z;
    }

    public static Builder newBuilder(Render render) {
        return new Builder(render);
    }

    public static class Builder {
        private String action;
        private String eventId = "native_" + System.currentTimeMillis();
        private boolean keep;
        private JSONObject param;
        private Render target;
        private String type;

        public Builder(Render render) {
            this.target = render;
        }

        public Builder eventId(String str) {
            this.eventId = str;
            return this;
        }

        public Builder action(String str) {
            this.action = str;
            return this;
        }

        public Builder param(JSONObject jSONObject) {
            this.param = jSONObject;
            return this;
        }

        public Builder type(String str) {
            this.type = str;
            return this;
        }

        public Builder keep(boolean z) {
            this.keep = z;
            return this;
        }

        public RenderCallContext build() {
            return new RenderCallContext(this);
        }
    }
}
