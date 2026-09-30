package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzmo extends zzit implements zzkf {
    private static final zziz zzb = new zzmm();
    private static final zzmo zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zziy zzk = zzit.zzv();

    static {
        zzmo zzmoVar = new zzmo();
        zzd = zzmoVar;
        zzit.zzD(zzmo.class, zzmoVar);
    }

    private zzmo() {
    }

    public static zzmn zzf() {
        return (zzmn) zzd.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzd, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i3 == 3) {
            return new zzmo();
        }
        zzmm zzmmVar = null;
        if (i3 == 4) {
            return new zzmn(zzmmVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzd;
    }
}
