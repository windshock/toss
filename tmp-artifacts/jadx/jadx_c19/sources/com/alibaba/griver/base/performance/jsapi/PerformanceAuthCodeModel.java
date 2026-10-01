package com.alibaba.griver.base.performance.jsapi;

import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PerformanceAuthCodeModel {
    public final LinkedHashMap<String, AuthCodeTime> a = new LinkedHashMap<>();

    public static class AuthCodeTime {
        long cost;
        long endTime;
        long startTime;

        public AuthCodeTime(long j) {
            this.startTime = j;
        }
    }

    public void begin(String str, long j) {
        if (TextUtils.isEmpty(str) || j < 0) {
            return;
        }
        this.a.put(str, new AuthCodeTime(j));
    }

    public void clear() {
        this.a.clear();
    }

    public void end(String str, long j) {
        AuthCodeTime authCodeTime;
        if (TextUtils.isEmpty(str) || j < 0 || !this.a.containsKey(str) || (authCodeTime = this.a.get(str)) == null) {
            return;
        }
        authCodeTime.endTime = j;
        authCodeTime.cost = j - authCodeTime.startTime;
    }

    public Map<String, Object> getUploadMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : new LinkedHashMap(this.a).entrySet()) {
            linkedHashMap.put(String.valueOf(((AuthCodeTime) entry.getValue()).startTime), String.valueOf(((AuthCodeTime) entry.getValue()).cost));
        }
        return linkedHashMap;
    }
}
