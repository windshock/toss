package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.ByteHelper;
import com.tmoney.utils.LogHelper;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class g {
    private byte[] a;
    private byte[] b = new byte[1];
    private byte[] c = new byte[1];
    private byte[] d = new byte[1];
    private byte[] e = new byte[1];
    private byte[] f = new byte[8];
    private byte[] g = new byte[5];
    private byte[] h = new byte[4];
    private byte[] i = new byte[4];
    private byte[] j = new byte[1];
    private byte[] k = new byte[1];
    private byte[] l = new byte[4];
    private byte[] m = new byte[2];
    private byte[] n = new byte[4];

    /* renamed from: o, reason: collision with root package name */
    private byte[] f3o = new byte[2];
    private byte[] p = new byte[4];
    private byte[] q = new byte[4];
    private byte[] r;
    private boolean s;

    public g(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.a = bArr2;
        byte[] bArr3 = new byte[2];
        this.r = bArr3;
        this.s = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 53) {
                System.arraycopy(bArr, 0, bArr2, 0, 4);
                System.arraycopy(bArr, 4, this.b, 0, 1);
                System.arraycopy(bArr, 5, this.c, 0, 1);
                System.arraycopy(bArr, 6, this.d, 0, 1);
                System.arraycopy(bArr, 7, this.e, 0, 1);
                System.arraycopy(bArr, 8, this.f, 0, 8);
                System.arraycopy(bArr, 16, this.g, 0, 5);
                System.arraycopy(bArr, 21, this.h, 0, 4);
                System.arraycopy(bArr, 25, this.i, 0, 4);
                System.arraycopy(bArr, 29, this.j, 0, 1);
                System.arraycopy(bArr, 30, this.k, 0, 1);
                System.arraycopy(bArr, 31, this.l, 0, 4);
                System.arraycopy(bArr, 35, this.m, 0, 2);
                System.arraycopy(bArr, 37, this.n, 0, 4);
                System.arraycopy(bArr, 41, this.f3o, 0, 2);
                System.arraycopy(bArr, 43, this.p, 0, 4);
                System.arraycopy(bArr, 47, this.q, 0, 4);
                System.arraycopy(bArr, 51, this.r, 0, 2);
                byte[] bArr4 = this.r;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    this.s = true;
                }
            }
        }
    }

    public final String getCARDtype() {
        return BinaryUtil.toBinaryString(this.b);
    }

    public final String getDEXP() {
        return BinaryUtil.toBinaryString(this.i);
    }

    public final String getDISS() {
        return BinaryUtil.toBinaryString(this.h);
    }

    public final String getIDcenter() {
        return BinaryUtil.toBinaryString(this.e);
    }

    public final String getIDep() {
        return BinaryUtil.toBinaryString(this.f);
    }

    public final String getIDtr() {
        return ByteHelper.toHexString(this.g);
    }

    public final String getSW() {
        byte[] bArr = this.r;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public final String getUSERCODE() {
        return BinaryUtil.toBinaryString(this.j);
    }

    public final boolean isPasscardCARDType() {
        byte b = this.b[0];
        return b >= -80 && b <= -49;
    }

    public final boolean isRealIDcenter() {
        StringBuilder sb = new StringBuilder("isRealIDCenter=");
        sb.append(this.e[0] == 8);
        LogHelper.d("isRealIDcenter", sb.toString());
        return this.e[0] == 8;
    }

    public final boolean isTmoneyCARDtype() {
        byte b = this.b[0];
        return b == 0 || b == 1;
    }

    public final boolean isbResData() {
        return this.s;
    }
}
