package com.skt.usp.tools.common;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class UCPException extends Exception {
    private static final long b = -3413090264012898527L;
    APIResultCode a;

    public UCPException() {
        this.a = null;
    }

    public UCPException(APIResultCode aPIResultCode, Throwable th) {
        super(th);
        this.a = aPIResultCode;
    }

    public UCPException(String str, Throwable th) {
        super(str, th);
        this.a = null;
    }

    public UCPException(String str) {
        super(str);
        this.a = null;
    }

    public APIResultCode getApiResultCode() {
        return this.a;
    }
}
