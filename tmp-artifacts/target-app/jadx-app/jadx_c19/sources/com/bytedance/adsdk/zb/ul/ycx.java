package com.bytedance.adsdk.zb.ul;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.zb.ul;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx<T> {
    public final Interpolator dj;
    private float dy;
    private float ea;
    public PointF fby;
    private final ul jc;
    public PointF jw;
    public final float lt;
    public final Interpolator lud;
    private float ok;
    private int ry;
    public final Interpolator sya;
    private float syc;
    public Float ul;
    private int xkz;
    public final T ycx;
    public T zb;

    public ycx(ul ulVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.ea = -3987645.8f;
        this.ok = -3987645.8f;
        this.ry = 784923401;
        this.xkz = 784923401;
        this.syc = Float.MIN_VALUE;
        this.dy = Float.MIN_VALUE;
        this.fby = null;
        this.jw = null;
        this.jc = ulVar;
        this.ycx = t;
        this.zb = t2;
        this.sya = interpolator;
        this.dj = null;
        this.lud = null;
        this.lt = f;
        this.ul = f2;
    }

    public ycx(ul ulVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.ea = -3987645.8f;
        this.ok = -3987645.8f;
        this.ry = 784923401;
        this.xkz = 784923401;
        this.syc = Float.MIN_VALUE;
        this.dy = Float.MIN_VALUE;
        this.fby = null;
        this.jw = null;
        this.jc = ulVar;
        this.ycx = t;
        this.zb = t2;
        this.sya = null;
        this.dj = interpolator;
        this.lud = interpolator2;
        this.lt = f;
        this.ul = f2;
    }

    public ycx(ul ulVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.ea = -3987645.8f;
        this.ok = -3987645.8f;
        this.ry = 784923401;
        this.xkz = 784923401;
        this.syc = Float.MIN_VALUE;
        this.dy = Float.MIN_VALUE;
        this.fby = null;
        this.jw = null;
        this.jc = ulVar;
        this.ycx = t;
        this.zb = t2;
        this.sya = interpolator;
        this.dj = interpolator2;
        this.lud = interpolator3;
        this.lt = f;
        this.ul = f2;
    }

    public ycx(T t) {
        this.ea = -3987645.8f;
        this.ok = -3987645.8f;
        this.ry = 784923401;
        this.xkz = 784923401;
        this.syc = Float.MIN_VALUE;
        this.dy = Float.MIN_VALUE;
        this.fby = null;
        this.jw = null;
        this.jc = null;
        this.ycx = t;
        this.zb = t;
        this.sya = null;
        this.dj = null;
        this.lud = null;
        this.lt = Float.MIN_VALUE;
        this.ul = Float.valueOf(Float.MAX_VALUE);
    }

    private ycx(T t, T t2) {
        this.ea = -3987645.8f;
        this.ok = -3987645.8f;
        this.ry = 784923401;
        this.xkz = 784923401;
        this.syc = Float.MIN_VALUE;
        this.dy = Float.MIN_VALUE;
        this.fby = null;
        this.jw = null;
        this.jc = null;
        this.ycx = t;
        this.zb = t2;
        this.sya = null;
        this.dj = null;
        this.lud = null;
        this.lt = Float.MIN_VALUE;
        this.ul = Float.valueOf(Float.MAX_VALUE);
    }

    public ycx<T> ycx(T t, T t2) {
        return new ycx<>(t, t2);
    }

    public float sya() {
        ul ulVar = this.jc;
        if (ulVar == null) {
            return 0.0f;
        }
        if (this.syc == Float.MIN_VALUE) {
            this.syc = (this.lt - ulVar.lt()) / this.jc.wie();
        }
        return this.syc;
    }

    public float dj() {
        if (this.jc == null) {
            return 1.0f;
        }
        if (this.dy == Float.MIN_VALUE) {
            if (this.ul == null) {
                this.dy = 1.0f;
            } else {
                this.dy = sya() + ((this.ul.floatValue() - this.lt) / this.jc.wie());
            }
        }
        return this.dy;
    }

    public boolean lud() {
        return this.sya == null && this.dj == null && this.lud == null;
    }

    public boolean ycx(float f) {
        return f >= sya() && f < dj();
    }

    public float lt() {
        if (this.ea == -3987645.8f) {
            this.ea = ((Float) this.ycx).floatValue();
        }
        return this.ea;
    }

    public float ul() {
        if (this.ok == -3987645.8f) {
            this.ok = ((Float) this.zb).floatValue();
        }
        return this.ok;
    }

    public int fby() {
        if (this.ry == 784923401) {
            this.ry = ((Integer) this.ycx).intValue();
        }
        return this.ry;
    }

    public int jw() {
        if (this.xkz == 784923401) {
            this.xkz = ((Integer) this.zb).intValue();
        }
        return this.xkz;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.ycx + ", endValue=" + this.zb + ", startFrame=" + this.lt + ", endFrame=" + this.ul + ", interpolator=" + this.sya + '}';
    }
}
