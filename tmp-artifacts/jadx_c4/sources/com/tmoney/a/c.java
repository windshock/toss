package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.NumberUtil;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class c {
    private byte[] a;
    private byte[] b = new byte[4];
    private byte[] c = new byte[1];
    private byte[] d = new byte[8];
    private byte[] e = new byte[4];
    private byte[] f = new byte[8];
    private byte[] g = new byte[4];
    private byte[] h;
    private boolean i;

    public c(byte[] bArr) {
        byte[] bArr2 = new byte[1];
        this.a = bArr2;
        byte[] bArr3 = new byte[2];
        this.h = bArr3;
        this.i = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 32) {
                System.arraycopy(bArr, 0, bArr2, 0, 1);
                System.arraycopy(bArr, 1, this.b, 0, 4);
                System.arraycopy(bArr, 5, this.c, 0, 1);
                System.arraycopy(bArr, 6, this.d, 0, 8);
                System.arraycopy(bArr, 14, this.e, 0, 4);
                System.arraycopy(bArr, 18, this.f, 0, 8);
                System.arraycopy(bArr, 26, this.g, 0, 4);
                System.arraycopy(bArr, 30, this.h, 0, 2);
                byte[] bArr4 = this.h;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    this.i = true;
                }
            }
        }
    }

    public final int getBalance() {
        try {
            if (this.i) {
                return NumberUtil.parseInt(this.b);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final String getSW() {
        byte[] bArr = this.h;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public final boolean isbResData() {
        return this.i;
    }
}
