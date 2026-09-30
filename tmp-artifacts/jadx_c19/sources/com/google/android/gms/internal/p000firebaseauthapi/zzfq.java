package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzfo;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzfq {
    private static final zzxr zza;
    private static final zzoa<zzfo, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzfl, zzot> zzd;
    private static final zzmt<zzot> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfl zzb(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zztf zztfVarZza = zztf.zza(zzotVar.zzd(), zzaip.zza());
            if (zztfVarZza.zza() == 0) {
                return zzfl.zza(zza(zzotVar.zzc()), zzxt.zza(zztfVarZza.zzd().zzg(), zzct.zza(zzctVar)), zzotVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzfo.zza zza(zzvt zzvtVar) throws GeneralSecurityException {
        int i2 = zzft.zza[zzvtVar.ordinal()];
        if (i2 == 1) {
            return zzfo.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzfo.zza.zzb;
        }
        if (i2 == 4) {
            return zzfo.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvtVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfo zzb(zzos zzosVar) throws GeneralSecurityException {
        if (!zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzti.zza(zzosVar.zza().zze(), zzaip.zza());
            return zzfo.zza(zza(zzosVar.zza().zzd()));
        } catch (zzajj e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    private static zzvt zza(zzfo.zza zzaVar) throws GeneralSecurityException {
        if (zzfo.zza.zza.equals(zzaVar)) {
            return zzvt.TINK;
        }
        if (zzfo.zza.zzb.equals(zzaVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzfo.zza.zzc.equals(zzaVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    static {
        zzxr zzxrVarZzb = zzpg.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzxrVarZzb;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfp
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                return zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzti.zzb().zzi()).zza(zzfq.zza(((zzfo) zzciVar).zzb())).zzf()));
            }
        }, zzfo.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfs
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                return zzfq.zzb((zzos) zzowVar);
            }
        }, zzxrVarZzb, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfr
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzfl zzflVar = (zzfl) zzbuVar;
                return zzot.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zztf) ((zzaja) zztf.zzb().zza(zzahm.zza(zzflVar.zzd().zza(zzct.zza(zzctVar)))).zzf())).zzi(), zzux.zzb.SYMMETRIC, zzfq.zza(zzflVar.zzb().zzb()), zzflVar.zza());
            }
        }, zzfl.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfu
            @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                return zzfq.zzb((zzot) zzowVar, zzctVar);
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
