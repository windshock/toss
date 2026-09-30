package com.bytedance.adsdk.ugeno.zb.zb;

import com.bytedance.adsdk.ugeno.zb.zb.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class dj {
    private final float[] dj;
    private int dy;
    private final float[] ea;
    private final float[] fby;
    private final float[] jc;
    private final float[] jw;
    private final float[] lt;
    private final float[] lud;
    private final float[] ok;
    private int pmi;
    private final int[] ry;
    private final zb.dj[] sya;
    private final float[] syc;
    private final float[] ul;
    private int wie;
    private int xkz;
    private final zb ycx;
    private final zb.sya zb;

    dj(zb zbVar) {
        this.ycx = zbVar;
        this.zb = zbVar.ycx();
        zb.dj[] djVarArr = (zb.dj[]) zbVar.zb().toArray(new zb.dj[0]);
        this.sya = djVarArr;
        this.dj = new float[600];
        this.lud = new float[600];
        this.lt = new float[600];
        this.ul = new float[600];
        this.fby = new float[600];
        this.jw = new float[600];
        this.jc = new float[600];
        this.ea = new float[600];
        this.ok = new float[600];
        this.ry = new int[600];
        this.syc = new float[djVarArr.length];
        int iNanoTime = (int) (System.nanoTime() ^ System.identityHashCode(this));
        this.dy = iNanoTime == 0 ? 305441741 : iNanoTime;
    }

    void ycx(int i2, int i3) {
        this.wie = i2;
        this.pmi = i3;
    }

    zb.dj[] ycx() {
        return this.sya;
    }

    zb zb() {
        return this.ycx;
    }

    void ycx(float f) {
        if (this.wie <= 0 || this.pmi <= 0 || this.sya.length == 0) {
            return;
        }
        zb(f);
        sya(f);
    }

    private void zb(float f) {
        float[] fArr = this.dj;
        float[] fArr2 = this.lud;
        float[] fArr3 = this.lt;
        float[] fArr4 = this.ul;
        float[] fArr5 = this.fby;
        float[] fArr6 = this.jw;
        float[] fArr7 = this.ea;
        float[] fArr8 = this.ok;
        int i2 = 0;
        while (i2 < this.xkz) {
            float f2 = fArr5[i2] + f;
            if (f2 >= fArr6[i2]) {
                ycx(i2);
            } else {
                float f3 = fArr7[i2] + (fArr8[i2] * f);
                if (f3 <= 0.0f) {
                    ycx(i2);
                } else {
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fArr5[i2] = f2;
                    fArr7[i2] = f3;
                    fArr[i2] = fArr[i2] + (fArr3[i2] * f);
                    fArr2[i2] = fArr2[i2] + (fArr4[i2] * f);
                    i2++;
                }
            }
        }
    }

    private void ycx(int i2) {
        int i3 = this.xkz - 1;
        this.xkz = i3;
        if (i2 != i3) {
            float[] fArr = this.dj;
            fArr[i2] = fArr[i3];
            float[] fArr2 = this.lud;
            fArr2[i2] = fArr2[i3];
            float[] fArr3 = this.lt;
            fArr3[i2] = fArr3[i3];
            float[] fArr4 = this.ul;
            fArr4[i2] = fArr4[i3];
            float[] fArr5 = this.fby;
            fArr5[i2] = fArr5[i3];
            float[] fArr6 = this.jw;
            fArr6[i2] = fArr6[i3];
            float[] fArr7 = this.jc;
            fArr7[i2] = fArr7[i3];
            float[] fArr8 = this.ea;
            fArr8[i2] = fArr8[i3];
            float[] fArr9 = this.ok;
            fArr9[i2] = fArr9[i3];
            int[] iArr = this.ry;
            iArr[i2] = iArr[i3];
        }
    }

    private void sya(float f) {
        zb.dj[] djVarArr = this.sya;
        float[] fArr = this.syc;
        for (int i2 = 0; i2 < djVarArr.length; i2++) {
            zb.dj djVar = djVarArr[i2];
            float f2 = djVar.zb;
            if (f2 > 0.0f) {
                fArr[i2] = fArr[i2] + (f2 * f);
                while (true) {
                    float f3 = fArr[i2];
                    if (f3 < 1.0f || this.xkz >= 600) {
                        break;
                    }
                    fArr[i2] = f3 - 1.0f;
                    ycx(i2, djVar);
                }
                if (this.xkz >= 600) {
                    fArr[i2] = 0.0f;
                }
            }
        }
    }

    private void ycx(int i2, zb.dj djVar) {
        int i3 = this.xkz;
        this.xkz = i3 + 1;
        float fYcx = ycx(djVar.sya, djVar.dj);
        if (fYcx < 0.01f) {
            fYcx = 0.01f;
        }
        float fYcx2 = ycx(djVar.lud, djVar.lt);
        if (fYcx2 < 0.0f) {
            fYcx2 = 0.0f;
        }
        float fYcx3 = ycx(djVar.ul, djVar.fby);
        if (fYcx3 < 0.0f) {
            fYcx3 = 0.0f;
        }
        float fSya = sya() * 6.2831855f;
        float radians = (float) Math.toRadians(djVar.jw);
        if (radians > 0.0f) {
            fSya += (sya() - 0.5f) * radians;
        }
        float fSya2 = 1.0f - (djVar.jc > 0.0f ? sya() * djVar.jc : 0.0f);
        if (fSya2 < 0.0f) {
            fSya2 = 0.0f;
        }
        this.fby[i3] = 0.0f;
        this.jw[i3] = fYcx;
        this.jc[i3] = fYcx2;
        double d = fSya;
        this.lt[i3] = ((float) Math.cos(d)) * fYcx3;
        this.ul[i3] = ((float) Math.sin(d)) * fYcx3;
        this.ea[i3] = fSya2;
        this.ok[i3] = djVar.ea;
        this.ry[i3] = i2;
        zb(i3);
    }

    private void zb(int i2) {
        float fYcx = this.zb.jw.ycx(this.wie);
        float fYcx2 = this.zb.jc.ycx(this.pmi);
        float f = fYcx < 0.0f ? 0.0f : fYcx;
        float f2 = fYcx2 < 0.0f ? 0.0f : fYcx2;
        float fYcx3 = this.zb.ul.ycx(this.wie);
        float fYcx4 = this.zb.fby.ycx(this.pmi);
        float f3 = f / 2.0f;
        float f4 = fYcx3 - f3;
        float f5 = f2 / 2.0f;
        float f6 = fYcx4 - f5;
        zb.sya syaVar = this.zb;
        int i3 = syaVar.dj;
        int i4 = syaVar.lud;
        if (i3 == 2) {
            if (i4 == 1) {
                ycx(i2, f4, f6, f, f2);
                return;
            } else {
                this.dj[i2] = (sya() * f) + f4;
                this.lud[i2] = f6 + (sya() * f2);
                return;
            }
        }
        if (i3 == 3 || i3 == 4) {
            float fSya = sya();
            float fSqrt = i4 == 1 ? 1.0f : (float) Math.sqrt(sya());
            double d = fSya * 6.2831855f;
            this.dj[i2] = fYcx3 + (((float) Math.cos(d)) * f3 * fSqrt);
            this.lud[i2] = fYcx4 + (((float) Math.sin(d)) * f5 * fSqrt);
            return;
        }
        if (i3 == 1) {
            this.dj[i2] = (sya() * f) + f4;
            this.lud[i2] = fYcx4;
        } else {
            this.dj[i2] = fYcx3;
            this.lud[i2] = fYcx4;
        }
    }

    private void ycx(int i2, float f, float f2, float f3, float f4) {
        float f5 = f3 + f4;
        float f6 = f5 * 2.0f;
        if (f6 <= 0.0f) {
            this.dj[i2] = f;
            this.lud[i2] = f2;
            return;
        }
        float fSya = sya() * f6;
        if (fSya < f3) {
            this.dj[i2] = f + fSya;
            this.lud[i2] = f2;
            return;
        }
        if (fSya < f5) {
            this.dj[i2] = f + f3;
            this.lud[i2] = f2 + (fSya - f3);
            return;
        }
        float f7 = 2.0f * f3;
        if (fSya < f7 + f4) {
            this.dj[i2] = (f + f3) - ((fSya - f3) - f4);
            this.lud[i2] = f2 + f4;
        } else {
            this.dj[i2] = f;
            this.lud[i2] = (f2 + f4) - ((fSya - f7) - f4);
        }
    }

    private float ycx(float f, float f2) {
        return f2 <= 0.0f ? f : f + (((sya() * 2.0f) - 1.0f) * f2);
    }

    private float sya() {
        int i2 = this.dy;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >>> 17);
        int i5 = i4 ^ (i4 << 5);
        if (i5 == 0) {
            i5 = -1640531527;
        }
        this.dy = i5;
        return (i5 >>> 8) * 5.9604645E-8f;
    }

    void ycx(lt ltVar) {
        int i2 = this.xkz;
        ltVar.ycx(600);
        ltVar.ycx = i2;
        System.arraycopy(this.dj, 0, ltVar.sya, 0, i2);
        System.arraycopy(this.lud, 0, ltVar.dj, 0, i2);
        System.arraycopy(this.jc, 0, ltVar.lud, 0, i2);
        System.arraycopy(this.ea, 0, ltVar.lt, 0, i2);
        System.arraycopy(this.fby, 0, ltVar.ul, 0, i2);
        System.arraycopy(this.ry, 0, ltVar.fby, 0, i2);
        ltVar.zb = this.zb.lt;
    }
}
