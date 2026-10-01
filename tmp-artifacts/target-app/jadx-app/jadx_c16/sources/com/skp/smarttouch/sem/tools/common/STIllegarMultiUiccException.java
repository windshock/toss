package com.skp.smarttouch.sem.tools.common;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class STIllegarMultiUiccException extends Exception {
    private static final long c = -5386690308937765255L;
    String a;
    int b;

    public STIllegarMultiUiccException() {
        this.a = null;
        this.b = -1;
    }

    public STIllegarMultiUiccException(String str) {
        super(str);
        this.a = null;
        this.b = -1;
    }

    public STIllegarMultiUiccException(String str, String str2) {
        super(str2);
        this.b = -1;
        this.a = str;
    }

    public STIllegarMultiUiccException(int i, String str) {
        super(str);
        this.a = null;
        this.b = i;
    }

    public String getCode() {
        return this.a;
    }

    public void setCode(String str) {
        this.a = str;
    }

    public int getResultSubCode() {
        return this.b;
    }

    public void setResultSubCode(int i) {
        this.b = i;
    }
}
