package com.google.android.gms.internal.play_billing;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzeh extends zzgg implements zzhn {
    private static final zzeh zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzeh zzehVar = new zzeh();
        zzb = zzehVar;
        zzgg.zzB(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    public static zzeh zzc(byte[] bArr) throws zzgs {
        return (zzeh) zzgg.zzt(zzb, bArr);
    }

    public final int zza() {
        return this.zze;
    }

    protected final Object zzd(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzgg.zzy(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i3 == 3) {
            return new zzeh();
        }
        zzek zzekVar = null;
        if (i3 == 4) {
            return new zzeg(zzekVar);
        }
        if (i3 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String zze() {
        return this.zzf;
    }
}
