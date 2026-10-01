package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.NumberUtil;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class b {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private boolean i;

    public b() {
    }

    public b(byte[] bArr) {
        byte[] bArr2 = new byte[1];
        this.a = bArr2;
        this.b = new byte[4];
        this.c = new byte[1];
        this.d = new byte[8];
        this.e = new byte[4];
        this.f = new byte[8];
        this.g = new byte[4];
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

    public static byte[] balance() {
        return a.getApduCmd(1);
    }

    public static byte[] getData() {
        return new byte[]{0, -54, 2, 0, 22};
    }

    public static byte[] getResponse(byte b) {
        return a.getApduCmd(20, (byte) 0, (byte) 0, (byte) 0, 0, b);
    }

    public static byte[] initPurchase(int i) {
        return a.getApduCmd(5, (byte) 0, i);
    }

    public static byte[] recentPurseInfo() {
        return a.getApduCmd(7, (byte) 1, 0);
    }

    public static byte[] select() {
        return a.getApduCmd(0);
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
