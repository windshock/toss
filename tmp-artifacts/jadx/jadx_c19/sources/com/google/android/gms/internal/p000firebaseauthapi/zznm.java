package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznm {
    private static final zznm zza = new zznm();
    private final Map<Class<? extends zzci>, zznp<? extends zzci>> zzb = new HashMap();

    public static zznm zza() {
        return zza;
    }

    public final <ParametersT extends zzci> void zza(zznp<ParametersT> zznpVar, Class<ParametersT> cls) throws GeneralSecurityException {
        synchronized (this) {
            zznp<? extends zzci> zznpVar2 = this.zzb.get(cls);
            if (zznpVar2 != null && !zznpVar2.equals(zznpVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zznpVar);
        }
    }
}
