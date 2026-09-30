package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzakd implements zzakl {
    private zzakl[] zza;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakl
    public final zzaki zza(Class<?> cls) {
        for (zzakl zzaklVar : this.zza) {
            if (zzaklVar.zzb(cls)) {
                return zzaklVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    zzakd(zzakl... zzaklVarArr) {
        this.zza = zzaklVarArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzakl
    public final boolean zzb(Class<?> cls) {
        for (zzakl zzaklVar : this.zza) {
            if (zzaklVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
