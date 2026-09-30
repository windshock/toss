package com.bytedance.adsdk.zb.sya;

import android.graphics.PointF;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    public ycx dj;
    public boolean ea;
    public int fby;
    public float jc;
    public int jw;
    public float lt;
    public int lud;
    public PointF ok;
    public PointF ry;
    public float sya;
    public float ul;
    public String ycx;
    public String zb;

    public enum ycx {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public zb(String str, String str2, float f, ycx ycxVar, int i2, float f2, float f3, int i3, int i4, float f4, boolean z, PointF pointF, PointF pointF2) {
        ycx(str, str2, f, ycxVar, i2, f2, f3, i3, i4, f4, z, pointF, pointF2);
    }

    public zb() {
    }

    public void ycx(String str, String str2, float f, ycx ycxVar, int i2, float f2, float f3, int i3, int i4, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.ycx = str;
        this.zb = str2;
        this.sya = f;
        this.dj = ycxVar;
        this.lud = i2;
        this.lt = f2;
        this.ul = f3;
        this.fby = i3;
        this.jw = i4;
        this.jc = f4;
        this.ea = z;
        this.ok = pointF;
        this.ry = pointF2;
    }

    public int hashCode() {
        int iHashCode = (int) ((((this.ycx.hashCode() * 31) + this.zb.hashCode()) * 31) + this.sya);
        int iOrdinal = this.dj.ordinal();
        int i2 = this.lud;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lt);
        return (((((((iHashCode * 31) + iOrdinal) * 31) + i2) * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.fby;
    }
}
