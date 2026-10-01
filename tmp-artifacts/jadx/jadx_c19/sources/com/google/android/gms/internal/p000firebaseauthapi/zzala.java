package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzala implements zzaki {
    private final zzakk zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaki
    public final zzakk zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaki
    public final zzakz zzb() {
        int i2 = this.zzd;
        return (i2 & 1) != 0 ? zzakz.PROTO2 : (i2 & 4) == 4 ? zzakz.EDITIONS : zzakz.PROTO3;
    }

    final String zzd() {
        return this.zzb;
    }

    zzala(zzakk zzakkVar, String str, Object[] objArr) {
        this.zza = zzakkVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 1;
        int i4 = 13;
        while (true) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.zzd = i2 | (cCharAt2 << i4);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i3++;
            }
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaki
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
