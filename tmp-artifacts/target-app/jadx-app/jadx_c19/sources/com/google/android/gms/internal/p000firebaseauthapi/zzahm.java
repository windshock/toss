package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzahm implements Serializable, Iterable<Byte> {
    public static final zzahm zza = new zzahw(zzajc.zzb);
    private static final zzaht zzb = new zzahz();
    private static final Comparator<zzahm> zzc = new zzaho();
    private int zzd = 0;

    static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i2);

    public abstract zzahm zza(int i2, int i3);

    protected abstract String zza(Charset charset);

    abstract void zza(zzahn zzahnVar) throws IOException;

    protected abstract void zza(byte[] bArr, int i2, int i3, int i4);

    abstract byte zzb(int i2);

    public abstract int zzb();

    protected abstract int zzb(int i2, int i3, int i4);

    public abstract zzaib zzc();

    public abstract boolean zzf();

    static int zza(int i2, int i3, int i4) {
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

    public final int hashCode() {
        int iZzb = this.zzd;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzd = iZzb;
        }
        return iZzb;
    }

    protected final int zza() {
        return this.zzd;
    }

    static zzahv zzc(int i2) {
        return new zzahv(i2);
    }

    public static zzahm zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzahm zza(byte[] bArr, int i2, int i3) {
        zza(i2, i2 + i3, bArr.length);
        return new zzahw(zzb.zza(bArr, i2, i3));
    }

    public static zzahm zza(String str) {
        return new zzahw(str.getBytes(zzajc.zza));
    }

    static zzahm zzb(byte[] bArr) {
        return new zzahw(bArr);
    }

    public final String toString() {
        String strZza;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzb = zzb();
        if (zzb() <= 50) {
            strZza = zzalx.zza(this);
        } else {
            strZza = zzalx.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, Integer.valueOf(iZzb), strZza);
    }

    public final String zzd() {
        return zzb() == 0 ? "" : zza(zzajc.zza);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzahp(this);
    }

    zzahm() {
    }

    public final boolean zze() {
        return zzb() == 0;
    }

    public final byte[] zzg() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzajc.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }
}
