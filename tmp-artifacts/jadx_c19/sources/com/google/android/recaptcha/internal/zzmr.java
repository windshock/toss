package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzmr extends zzit implements zzkf {
    private static final zzmr zzb;
    private int zzf;
    private int zzi;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzmr zzmrVar = new zzmr();
        zzb = zzmrVar;
        zzit.zzD(zzmr.class, zzmrVar);
    }

    private zzmr() {
    }

    public static zzmq zzg() {
        return (zzmq) zzb.zzp();
    }

    public static zzmr zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zzf", "zzh", "zzi", "zze", "zzg"});
        }
        if (i3 == 3) {
            return new zzmr();
        }
        zzmp zzmpVar = null;
        if (i3 == 4) {
            return new zzmq(zzmpVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzk() {
        return this.zzd;
    }
}
