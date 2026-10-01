package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzoz extends zzit implements zzkf {
    private static final zzoz zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzoz zzozVar = new zzoz();
        zzb = zzozVar;
        zzit.zzD(zzoz.class, zzozVar);
    }

    private zzoz() {
    }

    public static zzoz zzg(InputStream inputStream) throws IOException {
        return (zzoz) zzit.zzt(zzb, inputStream);
    }

    @Override // com.google.android.recaptcha.internal.zzit
    protected final Object zzh(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzit.zzA(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzoz();
        }
        zzor zzorVar = null;
        if (i3 == 4) {
            return new zzoy(zzorVar);
        }
        if (i3 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzpb zzi() {
        zzpb zzpbVarZzb = zzpb.zzb(this.zzf);
        return zzpbVarZzb == null ? zzpb.UNRECOGNIZED : zzpbVarZzb;
    }
}
