package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzlo extends zznb<zzuw> {
    public final zzic.zza zza() {
        return zzic.zza.zza;
    }

    public final zzux.zzb zzc() {
        return zzux.zzb.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        return zzuw.zza(zzahmVar, zzaip.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public zzlo() {
        super(zzuw.class, new zzoi[]{new zzln(zzbs.class)});
    }

    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        zzuw zzuwVar = (zzuw) zzakkVar;
        zzxq.zza(zzuwVar.zza(), 0);
        if (!zzuwVar.zzg()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzlq.zza(zzuwVar.zzb());
    }
}
