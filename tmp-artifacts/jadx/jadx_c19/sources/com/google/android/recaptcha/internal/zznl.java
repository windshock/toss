package com.google.android.recaptcha.internal;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zznl extends zzit implements zzkf {
    private static final zznl zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzno zzg;
    private int zzh;
    private zzmr zzi;
    private zzna zzj;

    static {
        zznl zznlVar = new zznl();
        zzb = zznlVar;
        zzit.zzD(zznl.class, zznlVar);
    }

    private zznl() {
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000(\u0001\u0001\u0001((\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019ဉ\u0002\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000'?\u0000(?\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i3 == 3) {
            return new zznl();
        }
        zznj zznjVar = null;
        if (i3 == 4) {
            return new zznk(zznjVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }
}
