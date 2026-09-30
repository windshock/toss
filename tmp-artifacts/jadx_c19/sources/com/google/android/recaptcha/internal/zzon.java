package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzon extends zzit implements zzkf {
    private static final zzon zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzon zzonVar = new zzon();
        zzb = zzonVar;
        zzit.zzD(zzon.class, zzonVar);
    }

    private zzon() {
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzon();
        }
        zzoh zzohVar = null;
        if (i3 == 4) {
            return new zzom(zzohVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzf;
    }
}
