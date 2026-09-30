package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;
import com.tmoney.utils.NumberUtil;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class i {
    private byte[] a;
    private byte[] b = new byte[4];
    private byte[] c;
    private boolean d;

    public i(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.a = bArr2;
        byte[] bArr3 = new byte[2];
        this.c = bArr3;
        this.d = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 10) {
                System.arraycopy(bArr, 0, bArr2, 0, 4);
                System.arraycopy(bArr, 4, this.b, 0, 4);
                System.arraycopy(bArr, 8, this.c, 0, 2);
                byte[] bArr4 = this.c;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    this.d = true;
                }
            }
        }
    }

    public final int getBalance() {
        try {
            if (this.d) {
                return NumberUtil.parseInt(this.a);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final String getSW() {
        byte[] bArr = this.c;
        return (bArr == null || bArr.length != 2) ? "NONE" : BinaryUtil.toBinaryStringtoUp(bArr);
    }

    public final boolean isbResData() {
        return this.d;
    }
}
