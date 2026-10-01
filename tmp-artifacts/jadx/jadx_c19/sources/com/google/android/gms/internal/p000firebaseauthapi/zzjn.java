package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzjl;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzjn extends zzks {
    private final zzjv zza;

    @Nullable
    private final zzxu zzb;

    @Nullable
    private final zzxt zzc;

    public final zzjl zzb() {
        return this.zza.zzb();
    }

    public static zzjn zza(zzjv zzjvVar, zzxt zzxtVar) throws GeneralSecurityException {
        if (zzjvVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzjvVar.zzc() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzxtVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] bArrZza = zzxtVar.zza(zzbr.zza());
        byte[] bArrZzb = zzjvVar.zzc().zzb();
        if (bArrZza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (!Arrays.equals(zzxp.zza(bArrZza), bArrZzb)) {
            throw new GeneralSecurityException("Invalid private key for public key.");
        }
        return new zzjn(zzjvVar, null, zzxtVar);
    }

    public static zzjn zza(zzjv zzjvVar, zzxu zzxuVar) throws GeneralSecurityException {
        if (zzjvVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzjvVar.zzd() == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        if (zzxuVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        BigInteger bigIntegerZza = zzxuVar.zza(zzbr.zza());
        ECPoint eCPointZzd = zzjvVar.zzd();
        zzjl.zzc zzcVarZzd = zzjvVar.zzb().zzd();
        BigInteger order = zza(zzcVarZzd).getOrder();
        if (bigIntegerZza.signum() <= 0 || bigIntegerZza.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (!zzmd.zza(bigIntegerZza, zza(zzcVarZzd)).equals(eCPointZzd)) {
            throw new GeneralSecurityException("Invalid private value");
        }
        return new zzjn(zzjvVar, zzxuVar, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzks
    public final /* synthetic */ zzkr zzc() {
        return this.zza;
    }

    @Nullable
    public final zzxu zzd() {
        return this.zzb;
    }

    @Nullable
    public final zzxt zze() {
        return this.zzc;
    }

    private static ECParameterSpec zza(zzjl.zzc zzcVar) {
        if (zzcVar == zzjl.zzc.zza) {
            return zzmd.zza;
        }
        if (zzcVar == zzjl.zzc.zzb) {
            return zzmd.zzb;
        }
        if (zzcVar == zzjl.zzc.zzc) {
            return zzmd.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzcVar));
    }

    private zzjn(zzjv zzjvVar, @Nullable zzxu zzxuVar, @Nullable zzxt zzxtVar) {
        this.zza = zzjvVar;
        this.zzb = zzxuVar;
        this.zzc = zzxtVar;
    }
}
