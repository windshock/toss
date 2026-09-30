package com.bytedance.adsdk.zb.dj;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public enum sya {
    JSON(".json"),
    ZIP(".zip");

    public final String sya;

    sya(String str) {
        this.sya = str;
    }

    public String ycx() {
        return ".temp" + this.sya;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.sya;
    }
}
