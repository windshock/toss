package com.bytedance.adsdk.zb.sya.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw implements sya {
    private final boolean sya;
    private final String ycx;
    private final ycx zb;

    public enum ycx {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static ycx ycx(int i2) {
            if (i2 == 1) {
                return MERGE;
            }
            if (i2 == 2) {
                return ADD;
            }
            if (i2 == 3) {
                return SUBTRACT;
            }
            if (i2 == 4) {
                return INTERSECT;
            }
            if (i2 == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public jw(String str, ycx ycxVar, boolean z) {
        this.ycx = str;
        this.zb = ycxVar;
        this.sya = z;
    }

    public String ycx() {
        return this.ycx;
    }

    public ycx zb() {
        return this.zb;
    }

    public boolean sya() {
        return this.sya;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new com.bytedance.adsdk.zb.ycx.ycx.ok(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.zb + '}';
    }
}
