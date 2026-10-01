package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzsh;
import com.google.android.gms.internal.p000firebaseauthapi.zzst;
import com.google.android.gms.internal.p000firebaseauthapi.zztb;
import com.google.android.gms.internal.p000firebaseauthapi.zzue;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzkw implements zzwk {
    private final String zza;
    private final int zzb;
    private zzst zzc;
    private zzsd zzd;
    private int zze;
    private zztb zzf;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwk
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzwk
    public final zzlv zza(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zza.equals(zzcx.zzb)) {
            return new zzlv((zzbh) zzcu.zza(this.zza, ((zzst) ((zzaja) zzst.zzb().zza((zzst.zza) this.zzc).zza(zzahm.zza(bArr, 0, this.zzb)).zzf())).zzi(), zzbh.class));
        }
        if (!this.zza.equals(zzcx.zza)) {
            if (!this.zza.equals(zzis.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            return new zzlv((zzbq) zzcu.zza(this.zza, ((zztb) ((zzaja) zztb.zzb().zza((zztb.zza) this.zzf).zza(zzahm.zza(bArr, 0, this.zzb)).zzf())).zzi(), zzbq.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
        zzsh zzshVar = (zzsh) ((zzaja) zzsh.zzb().zza((zzsh.zza) this.zzd.zzd()).zza(zzahm.zza(bArrCopyOfRange)).zzf());
        return new zzlv((zzbh) zzcu.zza(this.zza, ((zzsd) ((zzaja) zzsd.zzb().zza(this.zzd.zza()).zza(zzshVar).zza((zzue) ((zzaja) zzue.zzb().zza((zzue.zza) this.zzd.zze()).zza(zzahm.zza(bArrCopyOfRange2)).zzf())).zzf())).zzi(), zzbh.class));
    }

    zzkw(zzvd zzvdVar) throws GeneralSecurityException {
        String strZzf = zzvdVar.zzf();
        this.zza = strZzf;
        if (strZzf.equals(zzcx.zzb)) {
            try {
                zzsw zzswVarZza = zzsw.zza(zzvdVar.zze(), zzaip.zza());
                this.zzc = zzst.zza(zzcu.zza(zzvdVar).zze(), zzaip.zza());
                this.zzb = zzswVarZza.zza();
                return;
            } catch (zzajj e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (strZzf.equals(zzcx.zza)) {
            try {
                zzsg zzsgVarZza = zzsg.zza(zzvdVar.zze(), zzaip.zza());
                this.zzd = zzsd.zza(zzcu.zza(zzvdVar).zze(), zzaip.zza());
                this.zze = zzsgVarZza.zzc().zza();
                this.zzb = this.zze + zzsgVarZza.zzd().zza();
                return;
            } catch (zzajj e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (strZzf.equals(zzis.zza)) {
            try {
                zzte zzteVarZza = zzte.zza(zzvdVar.zze(), zzaip.zza());
                this.zzf = zztb.zza(zzcu.zza(zzvdVar).zze(), zzaip.zza());
                this.zzb = zzteVarZza.zza();
                return;
            } catch (zzajj e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: " + strZzf);
    }
}
