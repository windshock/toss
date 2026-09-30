package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.LogHelper;
import com.tmoney.utils.NumberUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class f {
    private byte[] b;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private boolean l;
    private final String a = "TmoneyApduResPurse";
    private byte[] c = new byte[1];
    private byte[] d = new byte[4];
    private byte[] e = new byte[4];
    private byte[] f = new byte[4];
    private byte[] g = new byte[8];
    private byte[] h = new byte[4];

    public f(byte[] bArr) {
        byte[] bArr2 = new byte[1];
        this.b = bArr2;
        int i = 4;
        byte[] bArr3 = new byte[2];
        this.k = bArr3;
        this.l = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 28 || bArr.length == 48) {
                System.arraycopy(bArr, 0, bArr2, 0, 1);
                System.arraycopy(bArr, 1, this.c, 0, 1);
                System.arraycopy(bArr, 2, this.d, 0, 4);
                System.arraycopy(bArr, 6, this.e, 0, 4);
                System.arraycopy(bArr, 10, this.f, 0, 4);
                System.arraycopy(bArr, 14, this.g, 0, 8);
                int i2 = 22;
                System.arraycopy(bArr, 22, this.h, 0, 4);
                if (bArr.length == 48) {
                    byte[] bArr4 = new byte[7];
                    this.i = bArr4;
                    this.j = new byte[13];
                    System.arraycopy(bArr, 26, bArr4, 0, 7);
                    System.arraycopy(bArr, 33, this.j, 0, 13);
                    i2 = 33;
                    i = 13;
                }
                System.arraycopy(bArr, i2 + i, this.k, 0, 2);
                byte[] bArr5 = this.k;
                if (bArr5[0] == -112 && bArr5[1] == 0) {
                    this.l = true;
                }
            }
        }
    }

    public final int getBalance() {
        try {
            if (this.l) {
                return NumberUtil.parseInt(this.d);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final String getDateTime() {
        byte[] bArr = this.i;
        if (bArr != null) {
            return BinaryUtil.binaryToDateTime(BinaryUtil.toBinaryString(bArr));
        }
        return null;
    }

    public final String getIdsam() {
        return BinaryUtil.toBinaryString(this.g);
    }

    public final String getNtep() {
        return BinaryUtil.toBinaryString(this.e);
    }

    public final String getNtsam() {
        return BinaryUtil.toBinaryString(this.h);
    }

    public final byte[] getPurseData() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.b);
            byteArrayOutputStream.write(this.c);
            byteArrayOutputStream.write(this.d);
            byteArrayOutputStream.write(this.e);
            byteArrayOutputStream.write(this.f);
            byteArrayOutputStream.write(this.g);
            byteArrayOutputStream.write(this.h);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            LogHelper.exception("TmoneyApduResPurse", e);
            return null;
        }
    }

    public final String getSW() {
        byte[] bArr = this.k;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public final String getTag() {
        return BinaryUtil.toBinaryString(this.b);
    }

    public final int getUseAmt() {
        try {
            if (this.l) {
                return NumberUtil.parseInt(this.f);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final boolean isbResData() {
        return this.l;
    }
}
