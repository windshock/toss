package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzvh;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcc {
    private final zzvh.zzb zza;

    private final int zza(zzvd zzvdVar, boolean z) throws GeneralSecurityException {
        int iZza;
        synchronized (this) {
            zzvh.zza zzaVarZza = zza(zzvdVar);
            this.zza.zza(zzaVarZza);
            iZza = zzaVarZza.zza();
        }
        return iZza;
    }

    private final int zzc() {
        int iZza;
        synchronized (this) {
            iZza = zzpg.zza();
            while (zzb(iZza)) {
                iZza = zzpg.zza();
            }
        }
        return iZza;
    }

    public final zzby zza() throws GeneralSecurityException {
        zzby zzbyVarZza;
        synchronized (this) {
            zzbyVarZza = zzby.zza((zzvh) ((zzaja) this.zza.zzf()));
        }
        return zzbyVarZza;
    }

    public final zzcc zza(zzbv zzbvVar) throws GeneralSecurityException {
        synchronized (this) {
            zza(zzbvVar.zza(), false);
        }
        return this;
    }

    public final zzcc zza(int i2) throws GeneralSecurityException {
        synchronized (this) {
            for (int i3 = 0; i3 < this.zza.zza(); i3++) {
                zzvh.zza zzaVarZzb = this.zza.zzb(i3);
                if (zzaVarZzb.zza() == i2) {
                    if (!zzaVarZzb.zzc().equals(zzvb.ENABLED)) {
                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i2);
                    }
                    this.zza.zza(i2);
                }
            }
            throw new GeneralSecurityException("key not found: " + i2);
        }
        return this;
    }

    public static zzcc zzb() {
        return new zzcc(zzvh.zzc());
    }

    public static zzcc zza(zzby zzbyVar) {
        return new zzcc(zzbyVar.zzb().zzm());
    }

    private final zzvh.zza zza(zzux zzuxVar, zzvt zzvtVar) throws GeneralSecurityException {
        zzvh.zza zzaVar;
        synchronized (this) {
            int iZzc = zzc();
            if (zzvtVar == zzvt.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzaVar = (zzvh.zza) ((zzaja) zzvh.zza.zzd().zza(zzuxVar).zza(iZzc).zza(zzvb.ENABLED).zza(zzvtVar).zzf());
        }
        return zzaVar;
    }

    private final zzvh.zza zza(zzvd zzvdVar) throws GeneralSecurityException {
        zzvh.zza zzaVarZza;
        synchronized (this) {
            zzaVarZza = zza(zzcu.zza(zzvdVar), zzvdVar.zzd());
        }
        return zzaVarZza;
    }

    private zzcc(zzvh.zzb zzbVar) {
        this.zza = zzbVar;
    }

    private final boolean zzb(int i2) {
        synchronized (this) {
            Iterator<zzvh.zza> it = this.zza.zzb().iterator();
            while (it.hasNext()) {
                if (it.next().zza() == i2) {
                    return true;
                }
            }
            return false;
        }
    }
}
