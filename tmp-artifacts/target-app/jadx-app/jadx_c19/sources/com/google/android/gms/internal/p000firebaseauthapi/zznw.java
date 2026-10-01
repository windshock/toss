package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzow;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zznw<SerializationT extends zzow> {
    private final zzxr zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzow> zznw<SerializationT> zza(zzny<SerializationT> zznyVar, zzxr zzxrVar, Class<SerializationT> cls) {
        return new zznz(zzxrVar, cls, zznyVar);
    }

    public abstract zzci zza(SerializationT serializationt) throws GeneralSecurityException;

    public final zzxr zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zznw(zzxr zzxrVar, Class<SerializationT> cls) {
        this.zza = zzxrVar;
        this.zzb = cls;
    }
}
