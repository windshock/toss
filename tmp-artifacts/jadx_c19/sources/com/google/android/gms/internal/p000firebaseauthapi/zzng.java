package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzng {
    public static final zzrp zza = new zzni();

    public static <P> zzrs zza(zzch<P> zzchVar) {
        zzbw zzbwVar;
        zzrr zzrrVar = new zzrr();
        zzrrVar.zza(zzchVar.zzb());
        Iterator<List<zzcm<P>>> it = zzchVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcm<P> zzcmVar : it.next()) {
                int i2 = zznj.zza[zzcmVar.zzc().ordinal()];
                if (i2 == 1) {
                    zzbwVar = zzbw.zza;
                } else if (i2 == 2) {
                    zzbwVar = zzbw.zzb;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbwVar = zzbw.zzc;
                }
                int iZza = zzcmVar.zza();
                String strZzg = zzcmVar.zzg();
                if (strZzg.startsWith("type.googleapis.com/google.crypto.")) {
                    strZzg = strZzg.substring(34);
                }
                zzrrVar.zza(zzbwVar, iZza, strZzg, zzcmVar.zzd().name());
            }
        }
        if (zzchVar.zza() != null) {
            zzrrVar.zza(zzchVar.zza().zza());
        }
        try {
            return zzrrVar.zza();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
