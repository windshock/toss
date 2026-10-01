package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzlk extends zzoq<zzut, zzuw> {
    public final zzic.zza zza() {
        return zzic.zza.zza;
    }

    public final zzna<zzuo, zzut> zzb() {
        return new zzlm(this, zzuo.class);
    }

    public final zzux.zzb zzc() {
        return zzux.zzb.ASYMMETRIC_PRIVATE;
    }

    public final /* synthetic */ zzakk zza(zzakk zzakkVar) throws GeneralSecurityException {
        return ((zzut) zzakkVar).zzd();
    }

    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        return zzut.zza(zzahmVar, zzaip.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public zzlk() {
        super(zzut.class, zzuw.class, new zzoi[]{new zzlj(zzbp.class)});
    }

    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        zzut zzutVar = (zzut) zzakkVar;
        if (zzutVar.zze().zze()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzutVar.zzf()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzxq.zza(zzutVar.zza(), 0);
        zzlq.zza(zzutVar.zzd().zzb());
    }
}
