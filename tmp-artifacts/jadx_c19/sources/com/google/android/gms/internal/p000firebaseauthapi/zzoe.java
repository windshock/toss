package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzbu;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzoe<KeyT extends zzbu, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    public static <KeyT extends zzbu, PrimitiveT> zzoe<KeyT, PrimitiveT> zza(zzog<KeyT, PrimitiveT> zzogVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzoh(cls, cls2, zzogVar);
    }

    public abstract PrimitiveT zza(KeyT keyt) throws GeneralSecurityException;

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }

    private zzoe(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
