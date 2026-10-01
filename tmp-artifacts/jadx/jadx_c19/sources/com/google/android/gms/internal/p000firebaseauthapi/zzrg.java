package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzqm;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzrg {
    private static final zzxr zza;
    private static final zzmf<zzvt, zzqm.zzc> zzb;
    private static final zzmf<zzuc, zzqm.zzb> zzc;
    private static final zzoa<zzqm, zzos> zzd;
    private static final zznw<zzos> zze;
    private static final zzmx<zzqb, zzot> zzf;
    private static final zzmt<zzot> zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqb zzb(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzue zzueVarZza = zzue.zza(zzotVar.zzd(), zzaip.zza());
            if (zzueVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqb.zzb().zza(zzqm.zzd().zza(zzueVarZza.zzf().zzb()).zzb(zzueVarZza.zze().zza()).zza(zzc.zza((zzmf<zzuc, zzqm.zzb>) zzueVarZza.zze().zzb())).zza(zzb.zza((zzmf<zzvt, zzqm.zzc>) zzotVar.zzc())).zza()).zza(zzxt.zza(zzueVarZza.zzf().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzqm zzb(zzos zzosVar) throws GeneralSecurityException {
        if (!zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzuf zzufVarZza = zzuf.zza(zzosVar.zza().zze(), zzaip.zza());
            if (zzufVarZza.zzb() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzufVarZza.zzb());
            }
            return zzqm.zzd().zza(zzufVarZza.zza()).zzb(zzufVarZza.zzf().zza()).zza(zzc.zza((zzmf<zzuc, zzqm.zzb>) zzufVarZza.zzf().zzb())).zza(zzb.zza((zzmf<zzvt, zzqm.zzc>) zzosVar.zza().zzd())).zza();
        } catch (zzajj e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    private static zzui zzb(zzqm zzqmVar) throws GeneralSecurityException {
        return (zzui) ((zzaja) zzui.zzc().zza(zzqmVar.zzb()).zza((zzuc) zzc.zza((zzmf<zzuc, zzqm.zzb>) zzqmVar.zze())).zzf());
    }

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzxrVarZzb;
        zzb = zzmf.zza().zza(zzvt.RAW, zzqm.zzc.zzd).zza(zzvt.TINK, zzqm.zzc.zza).zza(zzvt.LEGACY, zzqm.zzc.zzc).zza(zzvt.CRUNCHY, zzqm.zzc.zzb).zza();
        zzc = zzmf.zza().zza(zzuc.SHA1, zzqm.zzb.zza).zza(zzuc.SHA224, zzqm.zzb.zzb).zza(zzuc.SHA256, zzqm.zzb.zzc).zza(zzuc.SHA384, zzqm.zzb.zzd).zza(zzuc.SHA512, zzqm.zzb.zze).zza();
        zzd = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrf
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                zzqm zzqmVar = (zzqm) zzciVar;
                return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzuf) ((zzaja) zzuf.zzc().zza(zzrg.zzb(zzqmVar)).zza(zzqmVar.zzc()).zzf())).zzi()).zza((zzvt) zzrg.zzb.zza((zzmf<zzvt, zzqm.zzc>) zzqmVar.zzf())).zzf()));
            }
        }, zzqm.class, zzos.class);
        zze = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzri
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzrg.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzf = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrh
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzqb zzqbVar = (zzqb) zzbuVar;
                return zzot.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzue) ((zzaja) zzue.zzb().zza(zzrg.zzb((zzqm) zzqbVar.zzc())).zza(zzahm.zza(zzqbVar.zze().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, (zzvt) zzrg.zzb.zza((zzmf<zzvt, zzqm.zzc>) ((zzqm) zzqbVar.zzc()).zzf()), zzqbVar.zza());
            }
        }, zzqb.class, zzot.class);
        zzg = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrk
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzrg.zzb((zzot) zzowVar, zzctVar);
            }
        }, zzxrVarZzb, zzot.class);
    }

    public static void zza() throws GeneralSecurityException {
        zznv zznvVarZza = zznv.zza();
        zznvVarZza.zza(zzd);
        zznvVarZza.zza(zze);
        zznvVarZza.zza(zzf);
        zznvVarZza.zza(zzg);
    }
}
