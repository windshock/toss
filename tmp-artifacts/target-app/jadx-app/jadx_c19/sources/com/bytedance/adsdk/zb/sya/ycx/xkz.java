package com.bytedance.adsdk.zb.sya.ycx;

import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class xkz<V, O> implements ry<V, O> {
    final List<com.bytedance.adsdk.zb.ul.ycx<V>> ycx;

    xkz(List<com.bytedance.adsdk.zb.ul.ycx<V>> list) {
        this.ycx = list;
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public List<com.bytedance.adsdk.zb.ul.ycx<V>> sya() {
        return this.ycx;
    }

    @Override // com.bytedance.adsdk.zb.sya.ycx.ry
    public boolean zb() {
        return this.ycx.isEmpty() || (this.ycx.size() == 1 && this.ycx.get(0).lud());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ycx.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.ycx.toArray()));
        }
        return sb.toString();
    }
}
