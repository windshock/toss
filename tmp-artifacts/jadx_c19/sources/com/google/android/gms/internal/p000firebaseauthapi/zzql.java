package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzql extends zzna<zzuf, zzue> {
    private final /* synthetic */ zzqe zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ zzakk zza(zzakk zzakkVar) throws GeneralSecurityException {
        zzuf zzufVar = (zzuf) zzakkVar;
        return (zzue) ((zzaja) zzue.zzb().zza(zzqe.zzh()).zza(zzufVar.zzf()).zza(zzahm.zza(zzov.zza(zzufVar.zza()))).zzf());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ zzakk zza(zzahm zzahmVar) throws zzajj {
        return zzuf.zza(zzahmVar, zzaip.zza());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzql(zzqe zzqeVar, Class cls) {
        super(cls);
        this.zza = zzqeVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzna
    public final /* synthetic */ void zzb(zzakk zzakkVar) throws GeneralSecurityException {
        zzuf zzufVar = (zzuf) zzakkVar;
        if (zzufVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzqe.zzb(zzufVar.zzf());
    }
}
