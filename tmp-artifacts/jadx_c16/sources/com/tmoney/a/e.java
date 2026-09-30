package com.tmoney.a;

import com.tmoney.utils.BinaryUtil;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class e {
    private byte[] a;
    private byte[] b;
    private boolean c;

    public e(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.a = bArr2;
        byte[] bArr3 = new byte[2];
        this.b = bArr3;
        this.c = false;
        if (bArr != null) {
            if (bArr.length == 2) {
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                return;
            }
            if (bArr.length == 6) {
                System.arraycopy(bArr, 0, bArr2, 0, 4);
                System.arraycopy(bArr, 4, this.b, 0, 2);
                byte[] bArr4 = this.b;
                if (bArr4[0] == -112 && bArr4[1] == 0) {
                    this.c = true;
                }
            }
        }
    }

    public final String getSW() {
        return BinaryUtil.toBinaryStringtoUp(this.b);
    }

    public final boolean isbResData() {
        return this.c;
    }
}
