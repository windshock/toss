package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzxt {
    private final zzxr zza;

    public final int zza() {
        return this.zza.zza();
    }

    public static zzxt zza(byte[] bArr, zzct zzctVar) {
        if (zzctVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return new zzxt(zzxr.zza(bArr));
    }

    public static zzxt zza(int i2) {
        return new zzxt(zzxr.zza(zzov.zza(i2)));
    }

    private zzxt(zzxr zzxrVar) {
        this.zza = zzxrVar;
    }

    public final byte[] zza(zzct zzctVar) {
        if (zzctVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza.zzb();
    }
}
