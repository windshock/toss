package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzle implements zzbs {
    private static final byte[] zza = new byte[0];
    private final byte[] zzb;
    private final zzlg zzc;
    private final zzld zzd;
    private final zzla zze;
    private final byte[] zzf;

    static zzle zza(zzuw zzuwVar) throws GeneralSecurityException {
        if (zzuwVar.zzf().zze()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        zzus zzusVarZzb = zzuwVar.zzb();
        return new zzle(zzxr.zza(zzuwVar.zzf().zzg()), zzlh.zzc(zzusVarZzb), zzlh.zzb(zzusVarZzb), zzlh.zza(zzusVarZzb), zzxr.zza(new byte[0]));
    }

    private zzle(zzxr zzxrVar, zzlg zzlgVar, zzld zzldVar, zzla zzlaVar, zzxr zzxrVar2) {
        this.zzb = zzxrVar.zzb();
        this.zzc = zzlgVar;
        this.zzd = zzldVar;
        this.zze = zzlaVar;
        this.zzf = zzxrVar2.zzb();
    }
}
