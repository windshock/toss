package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.NumberUtil;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class h {
    private byte[] a;
    private byte[] b = new byte[1];
    private byte[] c = new byte[1];
    private byte[] d = new byte[1];
    private byte[] e = new byte[1];
    private byte[] f = new byte[4];
    private byte[] g = new byte[2];
    private byte[] h = new byte[7];
    private byte[] i = new byte[3];
    private byte[] j = new byte[3];
    private byte[] k = new byte[4];
    private byte[] l = new byte[6];
    private byte[] m = new byte[2];
    private byte[] n = new byte[4];

    /* renamed from: o, reason: collision with root package name */
    private byte[] f4o = new byte[2];
    private byte[] p = new byte[2];
    private byte[] q = new byte[2];
    private byte[] r = new byte[2];
    private byte[] s = new byte[2];
    private byte[] t = new byte[2];
    private byte[] u;
    private boolean v;

    public h(byte[] bArr) {
        byte[] bArr2 = new byte[1];
        this.a = bArr2;
        byte[] bArr3 = new byte[2];
        this.u = bArr3;
        this.v = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 54) {
                System.arraycopy(bArr, 0, bArr2, 0, 1);
                System.arraycopy(bArr, 1, this.b, 0, 1);
                System.arraycopy(bArr, 2, this.c, 0, 1);
                System.arraycopy(bArr, 3, this.d, 0, 1);
                System.arraycopy(bArr, 4, this.e, 0, 1);
                System.arraycopy(bArr, 5, this.f, 0, 4);
                System.arraycopy(bArr, 9, this.g, 0, 2);
                System.arraycopy(bArr, 11, this.h, 0, 7);
                System.arraycopy(bArr, 18, this.i, 0, 3);
                System.arraycopy(bArr, 21, this.j, 0, 3);
                System.arraycopy(bArr, 24, this.k, 0, 4);
                System.arraycopy(bArr, 28, this.l, 0, 6);
                System.arraycopy(bArr, 34, this.m, 0, 2);
                System.arraycopy(bArr, 36, this.n, 0, 4);
                System.arraycopy(bArr, 40, this.f4o, 0, 2);
                System.arraycopy(bArr, 42, this.p, 0, 2);
                System.arraycopy(bArr, 44, this.q, 0, 2);
                System.arraycopy(bArr, 46, this.r, 0, 2);
                System.arraycopy(bArr, 48, this.s, 0, 2);
                System.arraycopy(bArr, 50, this.t, 0, 2);
                System.arraycopy(bArr, 52, this.u, 0, 2);
                byte[] bArr4 = this.u;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    this.v = true;
                }
            }
        }
    }

    public final String getDateTime() {
        byte[] bArr = this.h;
        if (bArr != null) {
            return BinaryUtil.binaryToDateTime(BinaryUtil.toBinaryString(bArr));
        }
        return null;
    }

    public final byte getInOut() {
        return this.c[0];
    }

    public final int getMpda() {
        try {
            if (this.v) {
                return NumberUtil.parseShort(this.m) * 10;
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final String getSW() {
        byte[] bArr = this.u;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public final int getTermId() {
        try {
            if (this.v) {
                return NumberUtil.parseInt(this.k);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int getVehicle() {
        try {
            if (this.v) {
                return NumberUtil.parseShort(this.g);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final boolean isbResData() {
        return this.v;
    }

    public final byte[] parseData() {
        byte[] bArr = new byte[16];
        System.arraycopy(this.c, 0, bArr, 0, 1);
        System.arraycopy(this.f, 0, bArr, 1, 4);
        System.arraycopy(this.g, 0, bArr, 5, 2);
        System.arraycopy(this.h, 0, bArr, 7, 7);
        System.arraycopy(this.m, 0, bArr, 14, 2);
        return bArr;
    }
}
