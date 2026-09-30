package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzqr implements zzcq<zzcf, zzcf> {
    private static final zzqr zza = new zzqr();
    private static final zzoe<zznc, zzcf> zzb = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqu
        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzrj.zza((zznc) zzbuVar);
        }
    }, zznc.class, zzcf.class);

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcq
    public final Class<zzcf> zza() {
        return zzcf.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcq
    public final Class<zzcf> zzb() {
        return zzcf.class;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzcq
    public final /* synthetic */ zzcf zza(zzch<zzcf> zzchVar) throws GeneralSecurityException {
        Iterator<List<zzcm<zzcf>>> it = zzchVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzcm<zzcf> zzcmVar : it.next()) {
                if (zzcmVar.zzb() instanceof zzqp) {
                    zzqp zzqpVar = (zzqp) zzcmVar.zzb();
                    zzxr zzxrVarZza = zzxr.zza(zzcmVar.zzh());
                    if (!zzxrVarZza.equals(zzqpVar.zzd())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(zzqpVar.zzc()) + " has wrong output prefix (" + String.valueOf(zzqpVar.zzd()) + ") instead of (" + String.valueOf(zzxrVarZza) + ")");
                    }
                }
            }
        }
        return new zzqt(zzchVar);
    }

    zzqr() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzcu.zza(zza);
        zzns.zza().zza(zzb);
    }
}
