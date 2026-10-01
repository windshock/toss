package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzhk {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i2, int i3) {
        return (i2 << i3) | (i2 >>> (-i3));
    }

    private static void zza(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int iZza = zza(i6 ^ iArr[i5], 16);
        iArr[i5] = iZza;
        int i7 = iArr[i4] + iZza;
        iArr[i4] = i7;
        int iZza2 = zza(iArr[i3] ^ i7, 12);
        iArr[i3] = iZza2;
        int i8 = iArr[i2] + iZza2;
        iArr[i2] = i8;
        int iZza3 = zza(iArr[i5] ^ i8, 8);
        iArr[i5] = iZza3;
        int i9 = iArr[i4] + iZza3;
        iArr[i4] = i9;
        iArr[i3] = zza(iArr[i3] ^ i9, 7);
    }

    static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void zza(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    static int[] zza(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
