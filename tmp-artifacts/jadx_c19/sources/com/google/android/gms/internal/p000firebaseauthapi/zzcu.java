package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcu {
    private static final Logger zza = Logger.getLogger(zzcu.class.getName());
    private static final ConcurrentMap<String, Object> zzb = new ConcurrentHashMap();
    private static final Set<Class<?>> zzc;

    public static zzux zza(String str, zzahm zzahmVar) throws GeneralSecurityException {
        zzcp zzcpVarZza = zzmn.zza().zza(str);
        if (zzcpVarZza instanceof zzcp) {
            return zzcpVarZza.zzc(zzahmVar);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }

    public static zzux zza(zzvd zzvdVar) throws GeneralSecurityException {
        zzux zzuxVarZza;
        synchronized (zzcu.class) {
            zzbt zzbtVarZza = zzmn.zza().zza(zzvdVar.zzf());
            if (zzmn.zza().zzb(zzvdVar.zzf())) {
                zzuxVarZza = zzbtVarZza.zza(zzvdVar.zze());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + zzvdVar.zzf());
            }
        }
        return zzuxVarZza;
    }

    @Nullable
    public static Class<?> zza(Class<?> cls) {
        try {
            return zzns.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P zza(zzux zzuxVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(zzuxVar.zzf(), zzuxVar.zze(), cls);
    }

    public static <P> P zza(String str, zzahm zzahmVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzmn.zza().zza(str, cls).zzb(zzahmVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, zzahm.zza(bArr), cls);
    }

    public static <B, P> P zza(zzch<B> zzchVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzns.zza().zza(zzchVar, cls);
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(zzbh.class);
        hashSet.add(zzbq.class);
        hashSet.add(zzcw.class);
        hashSet.add(zzbs.class);
        hashSet.add(zzbp.class);
        hashSet.add(zzcf.class);
        hashSet.add(zzrv.class);
        hashSet.add(zzcs.class);
        hashSet.add(zzcr.class);
        zzc = Collections.unmodifiableSet(hashSet);
    }

    private zzcu() {
    }

    public static <KeyProtoT extends zzakk, PublicKeyProtoT extends zzakk> void zza(zzoq<KeyProtoT, PublicKeyProtoT> zzoqVar, zznb<PublicKeyProtoT> zznbVar, boolean z) throws GeneralSecurityException {
        synchronized (zzcu.class) {
            zzmn.zza().zza(zzoqVar, zznbVar, true);
        }
    }

    public static <P> void zza(zzbt<P> zzbtVar, boolean z) throws GeneralSecurityException {
        synchronized (zzcu.class) {
            if (zzbtVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (!zzc.contains(zzbtVar.zza())) {
                throw new GeneralSecurityException("Registration of key managers for class " + String.valueOf(zzbtVar.zza()) + " has been disabled. Please file an issue on https://github.com/tink-crypto/tink-java");
            }
            if (!zzic.zza.zza.zza()) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            zzmn.zza().zza(zzbtVar, true);
        }
    }

    public static <KeyProtoT extends zzakk> void zza(zznb<KeyProtoT> zznbVar, boolean z) throws GeneralSecurityException {
        synchronized (zzcu.class) {
            zzmn.zza().zza(zznbVar, true);
        }
    }

    public static <B, P> void zza(zzcq<B, P> zzcqVar) throws GeneralSecurityException {
        synchronized (zzcu.class) {
            zzns.zza().zza(zzcqVar);
        }
    }
}
