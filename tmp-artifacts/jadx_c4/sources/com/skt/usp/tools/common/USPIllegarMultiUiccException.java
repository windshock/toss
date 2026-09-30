package com.skt.usp.tools.common;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class USPIllegarMultiUiccException extends Exception {
    private static final long c = -5386690308937765255L;
    String a;
    int b;

    public USPIllegarMultiUiccException() {
        this.a = null;
        this.b = -1;
    }

    public USPIllegarMultiUiccException(String str) {
        super(str);
        this.a = null;
        this.b = -1;
    }

    public USPIllegarMultiUiccException(String str, String str2) {
        super(str2);
        this.b = -1;
        this.a = str;
    }

    public USPIllegarMultiUiccException(int i, String str) {
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
