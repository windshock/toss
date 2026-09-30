package com.skp.smarttouch.sem.tools.common;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class STIllegarCarrierApiException extends Exception {
    private static final long b = -5386690308937765255L;
    String a;

    public STIllegarCarrierApiException() {
        this.a = null;
    }

    public STIllegarCarrierApiException(String str) {
        super(str);
        this.a = null;
    }

    public STIllegarCarrierApiException(String str, String str2) {
        super(str2);
        this.a = str;
    }

    public String getCode() {
        return this.a;
    }

    public void setCode(String str) {
        this.a = str;
    }
}
