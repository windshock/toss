package com.iap.android.mppclient.container.model;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class JSAPIError {
    private String message;
    private int value;

    public JSAPIError(int i, String str) {
        this.value = i;
        this.message = str;
    }

    public JSAPIError newValue(int i, String str) {
        return new JSAPIError(i, str);
    }

    public JSAPIError jsapiNotExisted() {
        return newValue(1, "JSAPI not existed");
    }

    public JSAPIError invalidParameters() {
        return newValue(2, "Invalid parameters");
    }

    public JSAPIError unknown() {
        return newValue(3, "Unknown error");
    }

    public JSAPIError noPermission() {
        return newValue(4, "JSAPI call denied");
    }
}
