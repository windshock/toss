package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzow;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzmt<SerializationT extends zzow> {
    private final zzxr zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzow> zzmt<SerializationT> zza(zzmv<SerializationT> zzmvVar, zzxr zzxrVar, Class<SerializationT> cls) {
        return new zzms(zzxrVar, cls, zzmvVar);
    }

    public abstract zzbu zza(SerializationT serializationt, @Nullable zzct zzctVar) throws GeneralSecurityException;

    public final zzxr zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzmt(zzxr zzxrVar, Class<SerializationT> cls) {
        this.zza = zzxrVar;
        this.zzb = cls;
    }
}
