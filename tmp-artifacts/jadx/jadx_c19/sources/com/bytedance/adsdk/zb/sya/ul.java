package com.bytedance.adsdk.zb.sya;

import android.util.Pair;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul<T> {
    T ycx;
    T zb;

    public void ycx(T t, T t2) {
        this.ycx = t;
        this.zb = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return zb(pair.first, this.ycx) && zb(pair.second, this.zb);
    }

    private static boolean zb(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.ycx;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.zb;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.ycx + " " + this.zb + "}";
    }
}
