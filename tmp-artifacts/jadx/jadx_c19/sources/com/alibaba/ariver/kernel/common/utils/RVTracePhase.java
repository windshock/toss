package com.alibaba.ariver.kernel.common.utils;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RVTracePhase {
    public static int cookieSeed = 500;
    public int cookie;
    public String phaseName;

    public RVTracePhase(String str) {
        this.phaseName = str;
        int i2 = cookieSeed;
        cookieSeed = i2 + 1;
        this.cookie = i2;
    }
}
