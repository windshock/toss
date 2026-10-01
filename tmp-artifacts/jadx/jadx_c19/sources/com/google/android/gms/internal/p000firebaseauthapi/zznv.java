package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznv {
    private static final zznv zza = (zznv) zzpe.zza(new zzph() { // from class: com.google.android.gms.internal.firebase-auth-api.zznu
        @Override // com.google.android.gms.internal.p000firebaseauthapi.zzph
        public final Object zza() throws GeneralSecurityException {
            zznv zznvVar = new zznv();
            zznvVar.zza(zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zznx
                @Override // com.google.android.gms.internal.p000firebaseauthapi.zzmz
                public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                    return ((zznc) zzbuVar).zza(zzctVar);
                }
            }, zznc.class, zzot.class));
            return zznvVar;
        }
    });
    private final AtomicReference<zzoz> zzb = new AtomicReference<>(new zzoy().zza());

    public final <SerializationT extends zzow> zzbu zza(SerializationT serializationt, @Nullable zzct zzctVar) throws GeneralSecurityException {
        return this.zzb.get().zza((zzoz) serializationt, zzctVar);
    }

    public final zzbu zza(zzot zzotVar, @Nullable zzct zzctVar) throws GeneralSecurityException {
        if (!this.zzb.get().zzb((zzoz) zzotVar)) {
            return new zznc(zzotVar, zzctVar);
        }
        return zza((zznv) zzotVar, zzctVar);
    }

    public final <SerializationT extends zzow> zzci zza(SerializationT serializationt) throws GeneralSecurityException {
        return this.zzb.get().zza((zzoz) serializationt);
    }

    public static zznv zza() {
        return zza;
    }

    public final <KeyT extends zzbu, SerializationT extends zzow> SerializationT zza(KeyT keyt, Class<SerializationT> cls, @Nullable zzct zzctVar) throws GeneralSecurityException {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzctVar);
    }

    public final <ParametersT extends zzci, SerializationT extends zzow> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return (SerializationT) this.zzb.get().zza((zzoz) parameterst, (Class) cls);
    }

    public final <SerializationT extends zzow> void zza(zzmt<SerializationT> zzmtVar) throws GeneralSecurityException {
        synchronized (this) {
            this.zzb.set(new zzoy(this.zzb.get()).zza(zzmtVar).zza());
        }
    }

    public final <KeyT extends zzbu, SerializationT extends zzow> void zza(zzmx<KeyT, SerializationT> zzmxVar) throws GeneralSecurityException {
        synchronized (this) {
            this.zzb.set(new zzoy(this.zzb.get()).zza(zzmxVar).zza());
        }
    }

    public final <SerializationT extends zzow> void zza(zznw<SerializationT> zznwVar) throws GeneralSecurityException {
        synchronized (this) {
            this.zzb.set(new zzoy(this.zzb.get()).zza(zznwVar).zza());
        }
    }

    public final <ParametersT extends zzci, SerializationT extends zzow> void zza(zzoa<ParametersT, SerializationT> zzoaVar) throws GeneralSecurityException {
        synchronized (this) {
            this.zzb.set(new zzoy(this.zzb.get()).zza(zzoaVar).zza());
        }
    }

    public final <SerializationT extends zzow> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzc((zzoz) serializationt);
    }
}
