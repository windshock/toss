package com.bytedance.adsdk.zb.lt;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.zb.sya.zb.xkz;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private static final PointF ycx = new PointF();

    public static boolean sya(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float ycx(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int ycx(int i2, int i3, float f) {
        return (int) (i2 + (f * (i3 - i2)));
    }

    public static PointF ycx(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void ycx(xkz xkzVar, Path path) {
        path.reset();
        PointF pointFYcx = xkzVar.ycx();
        path.moveTo(pointFYcx.x, pointFYcx.y);
        ycx.set(pointFYcx.x, pointFYcx.y);
        for (int i2 = 0; i2 < xkzVar.sya().size(); i2++) {
            com.bytedance.adsdk.zb.sya.ycx ycxVar = xkzVar.sya().get(i2);
            PointF pointFYcx2 = ycxVar.ycx();
            PointF pointFZb = ycxVar.zb();
            PointF pointFSya = ycxVar.sya();
            PointF pointF = ycx;
            if (pointFYcx2.equals(pointF) && pointFZb.equals(pointFSya)) {
                path.lineTo(pointFSya.x, pointFSya.y);
            } else {
                path.cubicTo(pointFYcx2.x, pointFYcx2.y, pointFZb.x, pointFZb.y, pointFSya.x, pointFSya.y);
            }
            pointF.set(pointFSya.x, pointFSya.y);
        }
        if (xkzVar.zb()) {
            path.close();
        }
    }

    static int ycx(float f, float f2) {
        return ycx((int) f, (int) f2);
    }

    private static int ycx(int i2, int i3) {
        return i2 - (i3 * zb(i2, i3));
    }

    private static int zb(int i2, int i3) {
        int i4 = i2 / i3;
        return ((i2 ^ i3) < 0 && i2 % i3 != 0) ? i4 - 1 : i4;
    }

    public static int ycx(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i4, i2));
    }

    public static float zb(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
