package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzakk;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzoi<PrimitiveT, KeyProtoT extends zzakk> {
    private final Class<PrimitiveT> zza;

    final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zza(KeyProtoT keyprotot) throws GeneralSecurityException;

    public zzoi(Class<PrimitiveT> cls) {
        this.zza = cls;
    }
}
