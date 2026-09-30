package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zzaib {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzaig zzd;
    private boolean zzf;

    public static long zza(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int zze(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public abstract double zza() throws IOException;

    public abstract int zza(int i2) throws zzajj;

    public abstract float zzb() throws IOException;

    public abstract void zzb(int i2) throws zzajj;

    public abstract int zzc();

    public abstract void zzc(int i2);

    public abstract int zzd() throws IOException;

    public abstract boolean zzd(int i2) throws IOException;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract long zzk() throws IOException;

    public abstract long zzl() throws IOException;

    abstract long zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzp() throws IOException;

    public abstract zzahm zzq() throws IOException;

    public abstract String zzr() throws IOException;

    public abstract String zzs() throws IOException;

    public abstract boolean zzt() throws IOException;

    public abstract boolean zzu() throws IOException;

    static zzaib zza(byte[] bArr, int i2, int i3, boolean z) {
        zzaia zzaiaVar = new zzaia(bArr, i2, i3, z);
        try {
            zzaiaVar.zza(i3);
            return zzaiaVar;
        } catch (zzajj e) {
            throw new IllegalArgumentException(e);
        }
    }

    private zzaib() {
        this.zzb = zze;
        this.zzc = Integer.MAX_VALUE;
        this.zzf = false;
    }
}
