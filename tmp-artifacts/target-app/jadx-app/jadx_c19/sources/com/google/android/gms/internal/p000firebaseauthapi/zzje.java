package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzje extends zzoq<zzts, zztt> {
    public final zzic.zza zza() {
        return zzic.zza.zza;
    }

    public final zzna<zzto, zzts> zzb() {
        return new zzjg(this, zzto.class);
    }

    public final zzux.zzb zzc() {
        return zzux.zzb.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzakk zza(zzakk zzakkVar) throws GeneralSecurityException {
        return ((zzts) zzakkVar).zzd();
    }

    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        return zzts.zza(zzahmVar, zzaip.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    zzje() {
        super(zzts.class, zztt.class, new zzoi[]{new zzjh(zzbp.class)});
    }

    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        zzts zztsVar = (zzts) zzakkVar;
        if (zztsVar.zze().zze()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzxq.zza(zztsVar.zza(), 0);
        zzku.zza(zztsVar.zzd().zzb());
    }
}
