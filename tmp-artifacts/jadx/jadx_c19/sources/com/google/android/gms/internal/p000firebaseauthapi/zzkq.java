package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzto;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzkq {
    public static final zzvd zza;
    private static final byte[] zzb;
    private static final zzvd zzc;
    private static final zzvd zzd;

    @Deprecated
    private static zzvd zza(zztx zztxVar, zzuc zzucVar, zztj zztjVar, zzvd zzvdVar, zzvt zzvtVar, byte[] bArr) {
        zzto.zza zzaVarZza = zzto.zza();
        zztw zztwVar = (zztw) ((zzaja) zztw.zza().zza(zztxVar).zza(zzucVar).zza(zzahm.zza(bArr)).zzf());
        return (zzvd) ((zzaja) zzvd.zza().zza(new zzje().zzd()).zza(zzvtVar).zza(((zzto) ((zzaja) zzaVarZza.zza((zztp) ((zzaja) zztp.zzc().zza(zztwVar).zza((zztk) ((zzaja) zztk.zza().zza(zzvdVar).zzf())).zza(zztjVar).zzf())).zzf())).zzi()).zzf());
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zztx zztxVar = zztx.NIST_P256;
        zzuc zzucVar = zzuc.SHA256;
        zztj zztjVar = zztj.UNCOMPRESSED;
        zzvd zzvdVar = zzcz.zza;
        zzvt zzvtVar = zzvt.TINK;
        zza = zza(zztxVar, zzucVar, zztjVar, zzvdVar, zzvtVar, bArr);
        zzc = zza(zztxVar, zzucVar, zztj.COMPRESSED, zzvdVar, zzvt.RAW, bArr);
        zzd = zza(zztxVar, zzucVar, zztjVar, zzcz.zzb, zzvtVar, bArr);
    }
}
