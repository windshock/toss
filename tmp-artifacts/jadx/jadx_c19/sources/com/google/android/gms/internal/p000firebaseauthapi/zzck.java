package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzvh;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzck<P> {
    private final Class<P> zza;
    private ConcurrentMap<zzcl, List<zzcm<P>>> zzb;
    private final List<zzcm<P>> zzc;
    private zzcm<P> zzd;
    private zzrl zze;

    public final zzck<P> zza(@Nullable P p, @Nullable P p2, zzvh.zza zzaVar) throws GeneralSecurityException {
        return zza(p, p2, zzaVar, false);
    }

    public final zzck<P> zzb(@Nullable P p, @Nullable P p2, zzvh.zza zzaVar) throws GeneralSecurityException {
        return zza(p, p2, zzaVar, true);
    }

    private final zzck<P> zza(@Nullable P p, @Nullable P p2, zzvh.zza zzaVar, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (p == null && p2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (zzaVar.zzc() != zzvb.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        Integer numValueOf = Integer.valueOf(zzaVar.zza());
        if (zzaVar.zzf() == zzvt.RAW) {
            numValueOf = null;
        }
        zzbu zzbuVarZza = zznv.zza().zza(zzot.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), numValueOf), zzct.zza());
        int i2 = zzbn.zza[zzaVar.zzf().ordinal()];
        if (i2 == 1 || i2 == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(zzaVar.zza()).array();
        } else if (i2 == 3) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(zzaVar.zza()).array();
        } else if (i2 == 4) {
            bArrArray = zzbo.zza;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzcm<P> zzcmVar = new zzcm<>(p, p2, bArrArray, zzaVar.zzc(), zzaVar.zzf(), zzaVar.zza(), zzaVar.zzb().zzf(), zzbuVarZza);
        ConcurrentMap<zzcl, List<zzcm<P>>> concurrentMap = this.zzb;
        List<zzcm<P>> list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzcmVar);
        zzcl zzclVar = new zzcl(zzcmVar.zzh());
        List<zzcm<P>> listPut = concurrentMap.put(zzclVar, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(zzcmVar);
            concurrentMap.put(zzclVar, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzcmVar);
        if (!z) {
            return this;
        }
        if (this.zzd != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.zzd = zzcmVar;
        return this;
    }

    public final zzck<P> zza(zzrl zzrlVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzrlVar;
        return this;
    }

    public final zzch<P> zza() throws GeneralSecurityException {
        ConcurrentMap<zzcl, List<zzcm<P>>> concurrentMap = this.zzb;
        if (concurrentMap == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzch<P> zzchVar = new zzch<>(concurrentMap, this.zzc, this.zzd, this.zze, this.zza);
        this.zzb = null;
        return zzchVar;
    }

    private zzck(Class<P> cls) {
        this.zzb = new ConcurrentHashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzrl.zza;
    }
}
