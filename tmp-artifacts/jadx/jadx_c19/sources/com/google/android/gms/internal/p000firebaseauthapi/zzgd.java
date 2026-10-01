package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzgd {
    private static final zzxr zza;
    private static final zzoa<zzge, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzgb, zzot> zzd;
    private static final zzmt<zzot> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgb zzb(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        if (zzotVar.zzc() != zzvt.RAW) {
            throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got " + String.valueOf(zzotVar.zzc()));
        }
        try {
            zzvl zzvlVarZza = zzvl.zza(zzotVar.zzd(), zzaip.zza());
            if (zzvlVarZza.zza() == 0) {
                return zzgb.zza(zzge.zza(zzvlVarZza.zzd().zzd()));
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzvlVarZza));
        } catch (zzajj e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzge zzb(zzos zzosVar) throws GeneralSecurityException {
        if (!zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzvm zzvmVarZza = zzvm.zza(zzosVar.zza().zze(), zzaip.zza());
            if (zzosVar.zza().zzd() != zzvt.RAW) {
                throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(zzosVar.zza().zzd()) + " with format " + String.valueOf(zzvmVarZza));
            }
            return zzge.zza(zzvmVarZza.zzd());
        } catch (zzajj e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzxrVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgg
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzvm) ((zzaja) zzvm.zza().zza(((zzge) zzciVar).zzb()).zzf())).zzi()).zza(zzvt.RAW).zzf()));
            }
        }, zzge.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgf
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzgd.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgi
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                return zzot.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzvl) ((zzaja) zzvl.zzb().zza((zzvm) ((zzaja) zzvm.zza().zza(((zzgb) zzbuVar).zzb().zzb()).zzf())).zzf())).zzi(), zzux.zzb.REMOTE, zzvt.RAW, null);
            }
        }, zzgb.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzgd.zzb((zzot) zzowVar, zzctVar);
            }
        }, zzxrVarZzb, zzot.class);
    }

    public static void zza() throws GeneralSecurityException {
        zznv zznvVarZza = zznv.zza();
        zznvVarZza.zza(zzb);
        zznvVarZza.zza(zzc);
        zznvVarZza.zza(zzd);
        zznvVarZza.zza(zze);
    }
}
