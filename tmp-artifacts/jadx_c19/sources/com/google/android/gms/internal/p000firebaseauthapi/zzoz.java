package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzoz {
    private final Map<zzpd, zzmx<?, ?>> zza;
    private final Map<zzpb, zzmt<?>> zzb;
    private final Map<zzpd, zzoa<?, ?>> zzc;
    private final Map<zzpb, zznw<?>> zzd;

    public final <SerializationT extends zzow> zzbu zza(SerializationT serializationt, @Nullable zzct zzctVar) throws GeneralSecurityException {
        zzpb zzpbVar = new zzpb(serializationt.getClass(), serializationt.zzb());
        if (this.zzb.containsKey(zzpbVar)) {
            return this.zzb.get(zzpbVar).zza(serializationt, zzctVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + String.valueOf(zzpbVar) + " available");
    }

    public final <SerializationT extends zzow> zzci zza(SerializationT serializationt) throws GeneralSecurityException {
        zzpb zzpbVar = new zzpb(serializationt.getClass(), serializationt.zzb());
        if (!this.zzd.containsKey(zzpbVar)) {
            throw new GeneralSecurityException("No Parameters Parser for requested key type " + String.valueOf(zzpbVar) + " available");
        }
        return this.zzd.get(zzpbVar).zza(serializationt);
    }

    public final <KeyT extends zzbu, SerializationT extends zzow> SerializationT zza(KeyT keyt, Class<SerializationT> cls, @Nullable zzct zzctVar) throws GeneralSecurityException {
        zzpd zzpdVar = new zzpd(keyt.getClass(), cls);
        if (!this.zza.containsKey(zzpdVar)) {
            throw new GeneralSecurityException("No Key serializer for " + String.valueOf(zzpdVar) + " available");
        }
        return (SerializationT) this.zza.get(zzpdVar).zza(keyt, zzctVar);
    }

    public final <ParametersT extends zzci, SerializationT extends zzow> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        zzpd zzpdVar = new zzpd(parameterst.getClass(), cls);
        if (!this.zzc.containsKey(zzpdVar)) {
            throw new GeneralSecurityException("No Key Format serializer for " + String.valueOf(zzpdVar) + " available");
        }
        return (SerializationT) this.zzc.get(zzpdVar).zza(parameterst);
    }

    private zzoz(zzoy zzoyVar) {
        this.zza = new HashMap(zzoyVar.zza);
        this.zzb = new HashMap(zzoyVar.zzb);
        this.zzc = new HashMap(zzoyVar.zzc);
        this.zzd = new HashMap(zzoyVar.zzd);
    }

    public final <SerializationT extends zzow> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzpb(serializationt.getClass(), serializationt.zzb()));
    }

    public final <SerializationT extends zzow> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzpb(serializationt.getClass(), serializationt.zzb()));
    }
}
