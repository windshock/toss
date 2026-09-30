package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzux;
import com.google.android.gms.internal.p000firebaseauthapi.zzvh;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzby {
    private final zzvh zza;
    private final List<zzca> zzb;
    private final zzrl zzc = zzrl.zza;

    static final zzby zza(zzvh zzvhVar) throws GeneralSecurityException {
        zzc(zzvhVar);
        return new zzby(zzvhVar, zzb(zzvhVar));
    }

    public final zzby zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        zzvh.zzb zzbVarZzc = zzvh.zzc();
        for (zzvh.zza zzaVar : this.zza.zze()) {
            zzux zzuxVarZzb = zzaVar.zzb();
            if (zzuxVarZzb.zzb() != zzux.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("The keyset contains a non-private key");
            }
            zzbVarZzc.zza((zzvh.zza) ((zzaja) zzaVar.zzm().zza(zzcu.zza(zzuxVarZzb.zzf(), zzuxVarZzb.zze())).zzf()));
        }
        zzbVarZzc.zza(this.zza.zzb());
        return zza((zzvh) ((zzaja) zzbVarZzc.zzf()));
    }

    public static final zzby zza(zzcb zzcbVar, zzbh zzbhVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzty zztyVarZza = zzcbVar.zza();
        if (zztyVarZza == null || zztyVarZza.zzc().zzb() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return zza(zza(zztyVarZza, zzbhVar, bArr));
    }

    private static zzot zza(zzvh.zza zzaVar) {
        try {
            return zzot.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzvt.RAW ? null : Integer.valueOf(zzaVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzpe("Creating a protokey serialization failed", e);
        }
    }

    private static zzty zza(zzvh zzvhVar, zzbh zzbhVar, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrZzb = zzbhVar.zzb(zzvhVar.zzj(), bArr);
        try {
            if (!zzvh.zza(zzbhVar.zza(bArrZzb, bArr), zzaip.zza()).equals(zzvhVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            return (zzty) ((zzaja) zzty.zza().zza(zzahm.zza(bArrZzb)).zza(zzcy.zza(zzvhVar)).zzf());
        } catch (zzajj unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static zzvh zza(zzty zztyVar, zzbh zzbhVar, byte[] bArr) throws GeneralSecurityException {
        try {
            zzvh zzvhVarZza = zzvh.zza(zzbhVar.zza(zztyVar.zzc().zzg(), bArr), zzaip.zza());
            zzc(zzvhVarZza);
            return zzvhVarZza;
        } catch (zzajj unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    final zzvh zzb() {
        return this.zza;
    }

    public final zzvi zzc() {
        return zzcy.zza(this.zza);
    }

    @Nullable
    private static <B> B zza(zzmm zzmmVar, zzbu zzbuVar, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) zzmmVar.zza(zzbuVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Nullable
    private static <B> B zza(zzmm zzmmVar, zzvh.zza zzaVar, Class<B> cls) throws GeneralSecurityException {
        try {
            return (B) zzmmVar.zza(zzaVar.zzb(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P zza(Class<P> cls) throws GeneralSecurityException {
        zzox zzoxVarZza = zzox.zza();
        if (zzoxVarZza == null) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        Class<?> clsZza = zzoxVarZza.zza(cls);
        if (clsZza == null) {
            throw new GeneralSecurityException("No wrapper found for " + cls.getName());
        }
        zzcy.zzb(this.zza);
        zzck zzckVar = new zzck(clsZza);
        zzckVar.zza(this.zzc);
        for (int i2 = 0; i2 < this.zza.zza(); i2++) {
            zzvh.zza zzaVarZza = this.zza.zza(i2);
            if (zzaVarZza.zzc().equals(zzvb.ENABLED)) {
                Object objZza = zza(zzoxVarZza, zzaVarZza, clsZza);
                Object objZza2 = this.zzb.get(i2) != null ? zza(zzoxVarZza, this.zzb.get(i2).zza(), clsZza) : null;
                if (objZza2 == null && objZza == null) {
                    throw new GeneralSecurityException("Unable to get primitive " + String.valueOf(clsZza) + " for key of type " + zzaVarZza.zzb().zzf());
                }
                if (zzaVarZza.zza() == this.zza.zzb()) {
                    zzckVar.zzb(objZza2, objZza, zzaVarZza);
                } else {
                    zzckVar.zza(objZza2, objZza, zzaVarZza);
                }
            }
        }
        return (P) zzoxVarZza.zza(zzckVar.zza(), cls);
    }

    public final String toString() {
        return zzcy.zza(this.zza).toString();
    }

    private static List<zzca> zzb(zzvh zzvhVar) throws GeneralSecurityException {
        zzbw zzbwVar;
        ArrayList arrayList = new ArrayList(zzvhVar.zza());
        for (zzvh.zza zzaVar : zzvhVar.zze()) {
            int iZza = zzaVar.zza();
            try {
                zzbu zzbuVarZza = zznv.zza().zza(zza(zzaVar), zzct.zza());
                int i2 = zzbx.zza[zzaVar.zzc().ordinal()];
                if (i2 == 1) {
                    zzbwVar = zzbw.zza;
                } else if (i2 == 2) {
                    zzbwVar = zzbw.zzb;
                } else if (i2 == 3) {
                    zzbwVar = zzbw.zzc;
                } else {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new zzca(zzbuVarZza, zzbwVar, iZza, iZza == zzvhVar.zzb()));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private zzby(zzvh zzvhVar, List<zzca> list) {
        this.zza = zzvhVar;
        this.zzb = list;
    }

    private static void zzc(zzvh zzvhVar) throws GeneralSecurityException {
        if (zzvhVar == null || zzvhVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final void zza(zzce zzceVar, zzbh zzbhVar) throws GeneralSecurityException, IOException {
        zzceVar.zza(zza(this.zza, zzbhVar, new byte[0]));
    }

    public final void zza(zzce zzceVar) throws GeneralSecurityException, IOException {
        for (zzvh.zza zzaVar : this.zza.zze()) {
            if (zzaVar.zzb().zzb() == zzux.zzb.UNKNOWN_KEYMATERIAL || zzaVar.zzb().zzb() == zzux.zzb.SYMMETRIC || zzaVar.zzb().zzb() == zzux.zzb.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzaVar.zzb().zzb().name(), zzaVar.zzb().zzf()));
            }
        }
        zzceVar.zza(this.zza);
    }
}
