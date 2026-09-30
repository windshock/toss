package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznk {
    private static final zznk zza = new zznk();
    private final Map<Class<? extends zzci>, zznn<? extends zzci>> zzb = new HashMap();

    public final zzbu zza(zzci zzciVar, @Nullable Integer num) throws GeneralSecurityException {
        return zzb(zzciVar, null);
    }

    private final <ParametersT extends zzci> zzbu zzb(ParametersT parameterst, @Nullable Integer num) throws GeneralSecurityException {
        zzbu zzbuVarZza;
        synchronized (this) {
            zznn<? extends zzci> zznnVar = this.zzb.get(parameterst.getClass());
            if (zznnVar == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(parameterst) + ": no key creator for this class was registered.");
            }
            zzbuVarZza = zznnVar.zza(parameterst, null);
        }
        return zzbuVarZza;
    }

    public static zznk zza() {
        return zza;
    }

    public final <ParametersT extends zzci> void zza(zznn<ParametersT> zznnVar, Class<ParametersT> cls) throws GeneralSecurityException {
        synchronized (this) {
            zznn<? extends zzci> zznnVar2 = this.zzb.get(cls);
            if (zznnVar2 != null && !zznnVar2.equals(zznnVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.zzb.put(cls, zznnVar);
        }
    }
}
