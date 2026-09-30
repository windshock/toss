package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzot implements zzow {
    private final String zza;
    private final zzxr zzb;
    private final zzahm zzc;
    private final zzux.zzb zzd;
    private final zzvt zze;

    @Nullable
    private final Integer zzf;

    public static zzot zza(String str, zzahm zzahmVar, zzux.zzb zzbVar, zzvt zzvtVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzvtVar == zzvt.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzot(str, zzahmVar, zzbVar, zzvtVar, num);
    }

    public final zzux.zzb zza() {
        return this.zzd;
    }

    public final zzvt zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzow
    public final zzxr zzb() {
        return this.zzb;
    }

    public final zzahm zzd() {
        return this.zzc;
    }

    @Nullable
    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    private zzot(String str, zzahm zzahmVar, zzux.zzb zzbVar, zzvt zzvtVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzpg.zzb(str);
        this.zzc = zzahmVar;
        this.zzd = zzbVar;
        this.zze = zzvtVar;
        this.zzf = num;
    }
}
