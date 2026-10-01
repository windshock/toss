package com.bytedance.adsdk.zb;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ok<V> {
    private final V ycx;
    private final Throwable zb;

    public ok(V v) {
        this.ycx = v;
        this.zb = null;
    }

    public ok(Throwable th) {
        this.zb = th;
        this.ycx = null;
    }

    public V ycx() {
        return this.ycx;
    }

    public Throwable zb() {
        return this.zb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        if (ycx() != null && ycx().equals(okVar.ycx())) {
            return true;
        }
        if (zb() == null || okVar.zb() == null) {
            return false;
        }
        return zb().toString().equals(zb().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{ycx(), zb()});
    }
}
