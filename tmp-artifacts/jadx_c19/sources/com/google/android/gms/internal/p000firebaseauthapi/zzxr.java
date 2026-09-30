package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxr {
    private final byte[] zza;

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final int zza() {
        return this.zza.length;
    }

    public static zzxr zza(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzxr(bArr, 0, length);
    }

    public final String toString() {
        return "Bytes(" + zzxh.zza(this.zza) + ")";
    }

    private zzxr(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzxr) {
            return Arrays.equals(((zzxr) obj).zza, this.zza);
        }
        return false;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
