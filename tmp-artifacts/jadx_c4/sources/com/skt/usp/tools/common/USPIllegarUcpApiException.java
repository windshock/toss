package com.skt.usp.tools.common;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class USPIllegarUcpApiException extends Exception {
    private static final long b = -5386690308937765255L;
    String a;

    public USPIllegarUcpApiException() {
        this.a = null;
    }

    public USPIllegarUcpApiException(String str) {
        super(str);
        this.a = null;
    }

    public USPIllegarUcpApiException(String str, String str2) {
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
