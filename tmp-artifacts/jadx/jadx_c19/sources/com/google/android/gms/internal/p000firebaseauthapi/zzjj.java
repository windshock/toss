package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzjj extends zznb<zztt> {
    public final zzic.zza zza() {
        return zzic.zza.zza;
    }

    public final zzux.zzb zzc() {
        return zzux.zzb.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        return zztt.zza(zzahmVar, zzaip.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public zzjj() {
        super(zztt.class, new zzoi[]{new zzji(zzbs.class)});
    }

    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        zztt zzttVar = (zztt) zzakkVar;
        zzxq.zza(zzttVar.zza(), 0);
        zzku.zza(zzttVar.zzb());
    }
}
