package com.bytedance.adsdk.zb.lt;

import android.view.Choreographer;
import com.bytedance.adsdk.zb.ul;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class sya extends ycx implements Choreographer.FrameCallback {
    private ul jc;
    private float zb = 1.0f;
    private boolean sya = false;
    private long dj = 0;
    private float lud = 0.0f;
    private float lt = 0.0f;
    private int ul = 0;
    private float fby = -2.1474836E9f;
    private float jw = 2.1474836E9f;
    protected boolean ycx = false;
    private boolean ea = false;

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(lt());
    }

    public float lt() {
        ul ulVar = this.jc;
        if (ulVar == null) {
            return 0.0f;
        }
        return (this.lt - ulVar.lt()) / (this.jc.ul() - this.jc.lt());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fSyc;
        float fDy;
        float fSyc2;
        if (this.jc == null) {
            return 0.0f;
        }
        if (htf()) {
            fSyc = dy() - this.lt;
            fDy = dy();
            fSyc2 = syc();
        } else {
            fSyc = this.lt - syc();
            fDy = dy();
            fSyc2 = syc();
        }
        return fSyc / (fDy - fSyc2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        ul ulVar = this.jc;
        if (ulVar == null) {
            return 0L;
        }
        return (long) ulVar.lud();
    }

    public float ul() {
        return this.lt;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.ycx;
    }

    public void sya(boolean z) {
        this.ea = z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        wie();
        if (this.jc == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.zb.lud.ycx("LottieValueAnimator#doFrame");
        float fUh = (this.dj != 0 ? j - r1 : 0L) / uh();
        float f = this.lud;
        if (htf()) {
            fUh = -fUh;
        }
        float f2 = f + fUh;
        boolean zSya = lud.sya(f2, syc(), dy());
        float f3 = this.lud;
        float fZb = lud.zb(f2, syc(), dy());
        this.lud = fZb;
        if (this.ea) {
            fZb = (float) Math.floor(fZb);
        }
        this.lt = fZb;
        this.dj = j;
        if (!this.ea || this.lud != f3) {
            sya();
        }
        if (!zSya) {
            if (getRepeatCount() != -1 && this.ul >= getRepeatCount()) {
                float fSyc = this.zb < 0.0f ? syc() : dy();
                this.lud = fSyc;
                this.lt = fSyc;
                pmi();
                zb(htf());
            } else {
                ycx();
                this.ul++;
                if (getRepeatMode() == 2) {
                    this.sya = !this.sya;
                    jw();
                } else {
                    float fDy = htf() ? dy() : syc();
                    this.lud = fDy;
                    this.lt = fDy;
                }
                this.dj = j;
            }
        }
        thx();
        com.bytedance.adsdk.zb.lud.zb("LottieValueAnimator#doFrame");
    }

    private float uh() {
        ul ulVar = this.jc;
        if (ulVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / ulVar.ok()) / Math.abs(this.zb);
    }

    public void fby() {
        this.jc = null;
        this.fby = -2.1474836E9f;
        this.jw = 2.1474836E9f;
    }

    public void ycx(ul ulVar) {
        boolean z = this.jc == null;
        this.jc = ulVar;
        if (z) {
            ycx(Math.max(this.fby, ulVar.lt()), Math.min(this.jw, ulVar.ul()));
        } else {
            ycx((int) ulVar.lt(), (int) ulVar.ul());
        }
        float f = this.lt;
        this.lt = 0.0f;
        this.lud = 0.0f;
        ycx((int) f);
        sya();
    }

    public void ycx(float f) {
        if (this.lud == f) {
            return;
        }
        float fZb = lud.zb(f, syc(), dy());
        this.lud = fZb;
        if (this.ea) {
            fZb = (float) Math.floor(fZb);
        }
        this.lt = fZb;
        this.dj = 0L;
        sya();
    }

    public void ycx(int i2) {
        ycx(i2, (int) this.jw);
    }

    public void zb(float f) {
        ycx(this.fby, f);
    }

    public void ycx(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        ul ulVar = this.jc;
        float fLt = ulVar == null ? -3.4028235E38f : ulVar.lt();
        ul ulVar2 = this.jc;
        float fUl = ulVar2 == null ? Float.MAX_VALUE : ulVar2.ul();
        float fZb = lud.zb(f, fLt, fUl);
        float fZb2 = lud.zb(f2, fLt, fUl);
        if (fZb == this.fby && fZb2 == this.jw) {
            return;
        }
        this.fby = fZb;
        this.jw = fZb2;
        ycx((int) lud.zb(this.lt, fZb, fZb2));
    }

    public void jw() {
        sya(-jc());
    }

    public void sya(float f) {
        this.zb = f;
    }

    public float jc() {
        return this.zb;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.sya) {
            return;
        }
        this.sya = false;
        jw();
    }

    public void ea() {
        this.ycx = true;
        ycx(htf());
        ycx((int) (htf() ? dy() : syc()));
        this.dj = 0L;
        this.ul = 0;
        wie();
    }

    public void ok() {
        pmi();
        zb(htf());
    }

    public void ry() {
        pmi();
        dj();
    }

    public void xkz() {
        this.ycx = true;
        wie();
        this.dj = 0L;
        if (htf() && ul() == syc()) {
            ycx(dy());
        } else if (!htf() && ul() == dy()) {
            ycx(syc());
        }
        lud();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        zb();
        pmi();
    }

    private boolean htf() {
        return jc() < 0.0f;
    }

    public float syc() {
        ul ulVar = this.jc;
        if (ulVar == null) {
            return 0.0f;
        }
        float f = this.fby;
        return f == -2.1474836E9f ? ulVar.lt() : f;
    }

    public float dy() {
        ul ulVar = this.jc;
        if (ulVar == null) {
            return 0.0f;
        }
        float f = this.jw;
        return f == 2.1474836E9f ? ulVar.ul() : f;
    }

    @Override // com.bytedance.adsdk.zb.lt.ycx
    void zb() {
        super.zb();
        zb(htf());
    }

    protected void wie() {
        if (isRunning()) {
            dj(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void pmi() {
        dj(true);
    }

    protected void dj(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.ycx = false;
        }
    }

    private void thx() {
        if (this.jc != null) {
            float f = this.lt;
            float f2 = this.fby;
            if (f < f2 || f > this.jw) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f2), Float.valueOf(this.jw), Float.valueOf(f)));
            }
        }
    }
}
