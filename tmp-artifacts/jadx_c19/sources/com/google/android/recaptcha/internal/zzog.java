package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzog extends zzit implements zzkf {
    private static final zzog zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzog zzogVar = new zzog();
        zzb = zzogVar;
        zzit.zzD(zzog.class, zzogVar);
    }

    private zzog() {
    }

    static /* synthetic */ void zzJ(zzog zzogVar, String str) {
        zzogVar.zzd |= 1;
        zzogVar.zze = str;
    }

    public static zzof zzf() {
        return (zzof) zzb.zzp();
    }

    public static zzog zzi(byte[] bArr) throws zzje {
        return (zzog) zzit.zzu(zzb, bArr);
    }

    public final String zzH() {
        return this.zzf;
    }

    public final String zzI() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i3 == 3) {
            return new zzog();
        }
        zzoa zzoaVar = null;
        if (i3 == 4) {
            return new zzof(zzoaVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzj() {
        return this.zzh;
    }

    public final String zzk() {
        return this.zze;
    }
}
