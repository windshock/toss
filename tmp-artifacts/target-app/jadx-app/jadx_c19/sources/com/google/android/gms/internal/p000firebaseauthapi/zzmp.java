package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzmn;
import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzmp implements zzmn.zza {
    private final /* synthetic */ zznb zza;

    public final <Q> zzbt<Q> zza(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzml(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzbt<?> zza() {
        zznb zznbVar = this.zza;
        return new zzml(zznbVar, zznbVar.zze());
    }

    public final Class<?> zzb() {
        return this.zza.getClass();
    }

    public final Set<Class<?>> zzc() {
        return this.zza.zzg();
    }

    zzmp(zznb zznbVar) {
        this.zza = zznbVar;
    }
}
