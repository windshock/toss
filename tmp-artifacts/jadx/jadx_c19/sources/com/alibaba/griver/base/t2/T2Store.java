package com.alibaba.griver.base.t2;

import com.alibaba.fastjson.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class T2Store {
    public String a;
    public String b;
    public String c;
    public JSONObject d;

    public T2Store(String str, String str2, String str3, JSONObject jSONObject) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jSONObject;
    }

    public String getEnableJsT2() {
        return this.a;
    }

    public JSONObject getExtraJsT2MapStr() {
        return this.d;
    }

    public String getUcJsT2() {
        return this.b;
    }

    public String getUcJsT2State() {
        return this.c;
    }

    public void setEnableJsT2(String str) {
        this.a = str;
    }

    public void setExtraJsT2MapStr(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public void setUcJsT2(String str) {
        this.b = str;
    }

    public void setUcJsT2State(String str) {
        this.c = str;
    }

    public String toString() {
        return "T2Store{enableJsT2='" + this.a + "', ucJsT2='" + this.b + "', ucJsT2State='" + this.c + "', extraJsT2MapStr='" + this.d + "'}";
    }
}
