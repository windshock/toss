package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzbu;
import com.google.android.gms.internal.p000firebaseauthapi.zzow;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzmx<KeyT extends zzbu, SerializationT extends zzow> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    public static <KeyT extends zzbu, SerializationT extends zzow> zzmx<KeyT, SerializationT> zza(zzmz<KeyT, SerializationT> zzmzVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new zzmw(cls, cls2, zzmzVar);
    }

    public abstract SerializationT zza(KeyT keyt, @Nullable zzct zzctVar) throws GeneralSecurityException;

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzmx(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
