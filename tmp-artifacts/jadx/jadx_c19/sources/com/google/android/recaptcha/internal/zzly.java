package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzly extends zzlx {
    zzly() {
    }

    @Override // com.google.android.recaptcha.internal.zzlx
    final int zza(int i2, byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return 0;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            byte b = bArr[i3];
            if (b < 0) {
                if (b < -32) {
                    if (i5 >= i4) {
                        return b;
                    }
                    if (b >= -62) {
                        i3 += 2;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i5 >= i4 - 2) {
                        return zzma.zza(bArr, i5, i4);
                    }
                    byte b2 = bArr[i5];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0 && bArr[i3 + 2] <= -65) {
                        i5 = i3 + 4;
                        if (bArr[i3 + 3] > -65) {
                        }
                    }
                    return -1;
                }
                if (i5 >= i4 - 1) {
                    return zzma.zza(bArr, i5, i4);
                }
                byte b3 = bArr[i5];
                if (b3 > -65 || (b == -32 && b3 < -96)) {
                    return -1;
                }
                if (b == -19 && b3 >= -96) {
                    return -1;
                }
                i5 = i3 + 3;
                if (bArr[i3 + 2] > -65) {
                    return -1;
                }
            }
            i3 = i5;
        }
        return 0;
    }
}
