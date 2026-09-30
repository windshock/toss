package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzgw implements Iterable, Serializable {
    private int zzc = 0;
    public static final zzgw zzb = new zzgt(zzjc.zzd);
    private static final zzgv zzd = new zzgv(null);
    private static final Comparator zza = new zzgo();

    zzgw() {
    }

    public static zzgw zzm(byte[] bArr, int i2, int i3) {
        zzk(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzgt(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zzc;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zzc = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgn(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzlg.zza(this) : zzlg.zza(zzg(0, 47)).concat("..."));
    }

    public abstract byte zza(int i2);

    abstract byte zzb(int i2);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i2, int i3, int i4);

    protected abstract int zzf(int i2, int i3, int i4);

    public abstract zzgw zzg(int i2, int i3);

    protected abstract String zzh(Charset charset);

    abstract void zzi(zzgm zzgmVar) throws IOException;

    public abstract boolean zzj();

    protected final int zzl() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }

    public final byte[] zzo() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzjc.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    static int zzk(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }
}
