package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxp {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & Byte.MAX_VALUE);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | 64);
        zzme.zza(jArr, bArrCopyOf, bArr2);
        return zzmj.zzc(jArr);
    }

    public static byte[] zza(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return zza(bArr, bArr2);
    }
}
