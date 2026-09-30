package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzov extends zzit implements zzkf {
    private static final zzov zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzov zzovVar = new zzov();
        zzb = zzovVar;
        zzit.zzD(zzov.class, zzovVar);
    }

    private zzov() {
    }

    public static zzou zzf() {
        return (zzou) zzb.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i3 == 3) {
            return new zzov();
        }
        zzor zzorVar = null;
        if (i3 == 4) {
            return new zzou(zzorVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
