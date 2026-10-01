package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzry extends zzaja<zzry, zza> implements zzakm {
    private static final zzry zzc;
    private static volatile zzakx<zzry> zzd;
    private int zze;
    private int zzf;
    private zzahm zzg = zzahm.zza;
    private zzsc zzh;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzry, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzry) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(zzsc zzscVar) {
            zzh();
            ((zzry) this.zza).zza(zzscVar);
            return this;
        }

        private zza() {
            super(zzry.zzc);
        }

        /* synthetic */ zza(zzrx zzrxVar) {
            this();
        }
    }

    public static zzry zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzry) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzsc zzd() {
        zzsc zzscVar = this.zzh;
        return zzscVar == null ? zzsc.zzd() : zzscVar;
    }

    public final zzahm zze() {
        return this.zzg;
    }

    public static zzakx<zzry> zzf() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzrx zzrxVar = null;
        switch (zzrx.zza[i2 - 1]) {
            case 1:
                return new zzry();
            case 2:
                return new zza(zzrxVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzry> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzry.class) {
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
        zzry zzryVar = new zzry();
        zzc = zzryVar;
        zzaja.zza((Class<zzry>) zzry.class, zzryVar);
    }

    private zzry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzg = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsc zzscVar) {
        zzscVar.getClass();
        this.zzh = zzscVar;
        this.zze |= 1;
    }
}
