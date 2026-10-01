package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzea;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzef {
    private static final zzxr zza;
    private static final zzoa<zzea, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzdv, zzot> zzd;
    private static final zzmt<zzot> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdv zzb(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzso zzsoVarZza = zzso.zza(zzotVar.zzd(), zzaip.zza());
            if (zzsoVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdv.zzb().zza(zzea.zze().zzb(zzsoVarZza.zze().zzb()).zza(zzsoVarZza.zzd().zza()).zzc(16).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zzsoVarZza.zze().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzea.zzb zza(zzvt zzvtVar) throws GeneralSecurityException {
        int i2 = zzei.zza[zzvtVar.ordinal()];
        if (i2 == 1) {
            return zzea.zzb.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzea.zzb.zzb;
        }
        if (i2 == 4) {
            return zzea.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvtVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzea zzb(zzos zzosVar) throws GeneralSecurityException {
        if (!zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzsp zzspVarZza = zzsp.zza(zzosVar.zza().zze(), zzaip.zza());
            return zzea.zze().zzb(zzspVarZza.zza()).zza(zzspVarZza.zzd().zza()).zzc(16).zza(zza(zzosVar.zza().zzd())).zza();
        } catch (zzajj e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    private static zzss zzb(zzea zzeaVar) throws GeneralSecurityException {
        if (zzeaVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzeaVar.zzd())));
        }
        return (zzss) ((zzaja) zzss.zzb().zza(zzeaVar.zzb()).zzf());
    }

    private static zzvt zza(zzea.zzb zzbVar) throws GeneralSecurityException {
        if (zzea.zzb.zza.equals(zzbVar)) {
            return zzvt.TINK;
        }
        if (zzea.zzb.zzb.equals(zzbVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzea.zzb.zzc.equals(zzbVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzxrVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzee
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                zzea zzeaVar = (zzea) zzciVar;
                return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zzsp) ((zzaja) zzsp.zzb().zza(zzef.zzb(zzeaVar)).zza(zzeaVar.zzc()).zzf())).zzi()).zza(zzef.zza(zzeaVar.zzf())).zzf()));
            }
        }, zzea.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeh
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzef.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeg
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzdv zzdvVar = (zzdv) zzbuVar;
                return zzot.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzso) ((zzaja) zzso.zzb().zza(zzef.zzb(zzdvVar.zzc())).zza(zzahm.zza(zzdvVar.zze().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zzef.zza(zzdvVar.zzc().zzf()), zzdvVar.zza());
            }
        }, zzdv.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzef.zzb((zzot) zzowVar, zzctVar);
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
