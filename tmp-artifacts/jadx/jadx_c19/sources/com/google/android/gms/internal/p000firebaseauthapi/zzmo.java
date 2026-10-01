package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzakk;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzmo<KeyFormatProtoT extends zzakk, KeyProtoT extends zzakk> {
    private final zzna<KeyFormatProtoT, KeyProtoT> zza;

    final KeyProtoT zza(zzahm zzahmVar) throws GeneralSecurityException, zzajj {
        zzakk zzakkVarZza = this.zza.zza(zzahmVar);
        this.zza.zzb(zzakkVarZza);
        return (KeyProtoT) this.zza.zza((zzna<KeyFormatProtoT, KeyProtoT>) zzakkVarZza);
    }

    zzmo(zzna<KeyFormatProtoT, KeyProtoT> zznaVar) {
        this.zza = zznaVar;
    }
}
