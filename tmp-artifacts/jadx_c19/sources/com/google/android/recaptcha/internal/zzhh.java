package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzhh extends zzgm {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzhh.class.getName());
    private static final boolean zzd = zzlv.zzx();
    zzhi zza;

    private zzhh() {
    }

    /* synthetic */ zzhh(zzhg zzhgVar) {
    }

    public static zzhh zzA(byte[] bArr, int i2, int i3) {
        return new zzhe(bArr, 0, i3);
    }

    @Deprecated
    static int zzt(int i2, zzke zzkeVar, zzkr zzkrVar) {
        int iZza = ((zzgf) zzkeVar).zza(zzkrVar);
        int iZzy = zzy(i2 << 3);
        return iZzy + iZzy + iZza;
    }

    public static int zzu(int i2) {
        if (i2 >= 0) {
            return zzy(i2);
        }
        return 10;
    }

    public static int zzv(zzke zzkeVar) {
        int iZzn = zzkeVar.zzn();
        return zzy(iZzn) + iZzn;
    }

    static int zzw(zzke zzkeVar, zzkr zzkrVar) {
        int iZza = ((zzgf) zzkeVar).zza(zzkrVar);
        return zzy(iZza) + iZza;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzma.zzc(str);
        } catch (zzlz unused) {
            length = str.getBytes(zzjc.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzz(long j) {
        int i2;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i2 += 2;
        }
        return (j & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzC(String str, zzlz zzlzVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzlzVar);
        byte[] bytes = str.getBytes(zzjc.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzhf(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i2, boolean z) throws IOException;

    public abstract void zze(int i2, zzgw zzgwVar) throws IOException;

    public abstract void zzf(int i2, int i3) throws IOException;

    public abstract void zzg(int i2) throws IOException;

    public abstract void zzh(int i2, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i2, int i3) throws IOException;

    public abstract void zzk(int i2) throws IOException;

    public abstract void zzl(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzm(int i2, String str) throws IOException;

    public abstract void zzo(int i2, int i3) throws IOException;

    public abstract void zzp(int i2, int i3) throws IOException;

    public abstract void zzq(int i2) throws IOException;

    public abstract void zzr(int i2, long j) throws IOException;

    public abstract void zzs(long j) throws IOException;
}
