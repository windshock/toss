package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzru {
    private final zzbw zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        zzbw zzbwVar = this.zza;
        int i2 = this.zzb;
        return Objects.hash(zzbwVar, Integer.valueOf(i2), this.zzc, this.zzd);
    }

    public final String toString() {
        zzbw zzbwVar = this.zza;
        int i2 = this.zzb;
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", zzbwVar, Integer.valueOf(i2), this.zzc, this.zzd);
    }

    private zzru(zzbw zzbwVar, int i2, String str, String str2) {
        this.zza = zzbwVar;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzru)) {
            return false;
        }
        zzru zzruVar = (zzru) obj;
        return this.zza == zzruVar.zza && this.zzb == zzruVar.zzb && this.zzc.equals(zzruVar.zzc) && this.zzd.equals(zzruVar.zzd);
    }
}
