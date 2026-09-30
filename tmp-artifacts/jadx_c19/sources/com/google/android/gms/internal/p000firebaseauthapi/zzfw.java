package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzfw {
    private static final zzoe<zzgb, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfv
        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            zzgb zzgbVar = (zzgb) zzbuVar;
            return zzcg.zza(zzgbVar.zzb().zzb()).zza(zzgbVar.zzb().zzb());
        }
    }, zzgb.class, zzbh.class);
    private static final zzbt<zzbh> zzb = zznd.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzbh.class, zzux.zzb.REMOTE, zzvl.zze());
    private static final zznn<zzge> zzc = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfy
        @Override // com.google.android.gms.internal.p000firebaseauthapi.zznn
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzfw.zza((zzge) zzciVar, null);
        }
    };

    public static /* synthetic */ zzgb zza(zzge zzgeVar, Integer num) throws GeneralSecurityException {
        if (num != null) {
            throw new GeneralSecurityException("Id Requirement is not supported for LegacyKmsEnvelopeAeadKey");
        }
        return zzgb.zza(zzgeVar);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zzgd.zza();
        zzns.zza().zza(zza);
        zznk.zza().zza(zzc, zzge.class);
        zzcu.zza((zzbt) zzb, true);
    }
}
