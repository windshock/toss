package com.bytedance.sdk.component.adexpress.dynamic.dj;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw {
    public float ycx;
    public float zb;

    public jw(float f, float f2) {
        this.ycx = f;
        this.zb = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jw jwVar = (jw) obj;
        return Float.compare(jwVar.ycx, this.ycx) == 0 && Float.compare(jwVar.zb, this.zb) == 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ycx), Float.valueOf(this.zb)});
    }
}
