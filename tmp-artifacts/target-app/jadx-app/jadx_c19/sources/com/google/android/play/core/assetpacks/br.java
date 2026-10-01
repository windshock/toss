package com.google.android.play.core.assetpacks;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class br {
    static int a(byte[] bArr, int i2) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    static int b(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    static long c(byte[] bArr, int i2) {
        return ((a(bArr, i2 + 2) << 16) | a(bArr, i2)) & 4294967295L;
    }
}
