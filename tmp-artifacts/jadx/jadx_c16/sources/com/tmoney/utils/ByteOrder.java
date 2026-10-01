package com.tmoney.utils;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ByteOrder {
    public static void swap(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return;
        }
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[(length - i) - 1];
        }
    }
}
