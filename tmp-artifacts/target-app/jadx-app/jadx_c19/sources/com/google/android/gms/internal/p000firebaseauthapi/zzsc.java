package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzsc extends zzaja<zzsc, zza> implements zzakm {
    private static final zzsc zzc;
    private static volatile zzakx<zzsc> zzd;
    private int zze;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzsc, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzsc) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzsc.zzc);
        }

        /* synthetic */ zza(zzsb zzsbVar) {
            this();
        }
    }

    public static zzsc zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsb zzsbVar = null;
        switch (zzsb.zza[i2 - 1]) {
            case 1:
                return new zzsc();
            case 2:
                return new zza(zzsbVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsc> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzsc.class) {
                    zzaVar = zzd;
                    if (zzaVar == null) {
                        zzaVar = new zzaja.zza(zzc);
                        zzd = zzaVar;
                    }
                }
                return zzaVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzsc zzscVar = new zzsc();
        zzc = zzscVar;
        zzaja.zza((Class<zzsc>) zzsc.class, zzscVar);
    }

    private zzsc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zze = i2;
    }
}
