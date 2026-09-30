package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzkp implements zzkb {
    private final zzke zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    zzkp(zzke zzkeVar, String str, Object[] objArr) {
        this.zza = zzkeVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.zzd = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4++;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkb
    public final zzke zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzkb
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.recaptcha.internal.zzkb
    public final int zzc() {
        int i2 = this.zzd;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
