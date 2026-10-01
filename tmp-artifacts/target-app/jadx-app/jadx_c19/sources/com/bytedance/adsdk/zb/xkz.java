package com.bytedance.adsdk.zb;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class xkz<K, V> {
    private int dj;
    private int fby;
    private int lt;
    private int lud;
    private int sya;
    private int ul;
    private final LinkedHashMap<K, V> ycx;
    private int zb;

    protected int zb(K k, V v) {
        return 1;
    }

    protected V zb(K k) {
        return null;
    }

    public xkz(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.sya = i2;
        this.ycx = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V ycx(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.ycx.get(k);
            if (v != null) {
                this.ul++;
                return v;
            }
            this.fby++;
            V vZb = zb(k);
            if (vZb == null) {
                return null;
            }
            synchronized (this) {
                this.lud++;
                vPut = this.ycx.put(k, vZb);
                if (vPut != null) {
                    this.ycx.put(k, vPut);
                } else {
                    this.zb += sya(k, vZb);
                }
            }
            if (vPut != null) {
                return vPut;
            }
            ycx(this.sya);
            return vZb;
        }
    }

    public final V ycx(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.dj++;
            this.zb += sya(k, v);
            vPut = this.ycx.put(k, v);
            if (vPut != null) {
                this.zb -= sya(k, vPut);
            }
        }
        ycx(this.sya);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ycx(int i2) {
        while (true) {
            synchronized (this) {
                if (this.zb >= 0 && (!this.ycx.isEmpty() || this.zb == 0)) {
                    if (this.zb <= i2 || this.ycx.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.ycx.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.ycx.remove(key);
                    this.zb -= sya(key, value);
                    this.lt++;
                } else {
                    break;
                }
            }
        }
    }

    private int sya(K k, V v) {
        int iZb = zb(k, v);
        if (iZb >= 0) {
            return iZb;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final String toString() {
        String str;
        synchronized (this) {
            int i2 = this.ul;
            int i3 = this.fby + i2;
            str = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.sya), Integer.valueOf(this.ul), Integer.valueOf(this.fby), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
        }
        return str;
    }
}
