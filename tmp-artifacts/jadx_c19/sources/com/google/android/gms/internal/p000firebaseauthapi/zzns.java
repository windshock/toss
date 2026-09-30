package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzns {
    private static zzns zza = new zzns();
    private final AtomicReference<zzol> zzb = new AtomicReference<>(new zzok().zza());

    public static zzns zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.zzb.get().zza((zzol) keyt, (Class) cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzch<InputPrimitiveT> zzchVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.zzb.get().zza(zzchVar, cls);
    }

    zzns() {
    }

    public final <KeyT extends zzbu, PrimitiveT> void zza(zzoe<KeyT, PrimitiveT> zzoeVar) throws GeneralSecurityException {
        synchronized (this) {
            this.zzb.set(zzol.zza(this.zzb.get()).zza(zzoeVar).zza());
        }
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> void zza(zzcq<InputPrimitiveT, WrapperPrimitiveT> zzcqVar) throws GeneralSecurityException {
        synchronized (this) {
            this.zzb.set(zzol.zza(this.zzb.get()).zza(zzcqVar).zza());
        }
    }
}
