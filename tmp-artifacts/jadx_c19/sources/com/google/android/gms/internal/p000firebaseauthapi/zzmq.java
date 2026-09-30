package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzmn;
import java.util.Collections;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzmq implements zzmn.zza {
    private final /* synthetic */ zzbt zza;

    public final <Q> zzbt<Q> zza(Class<Q> cls) {
        if (this.zza.zza().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final zzbt<?> zza() {
        return this.zza;
    }

    public final Class<?> zzb() {
        return this.zza.getClass();
    }

    public final Set<Class<?>> zzc() {
        return Collections.singleton(this.zza.zza());
    }

    zzmq(zzbt zzbtVar) {
        this.zza = zzbtVar;
    }
}
