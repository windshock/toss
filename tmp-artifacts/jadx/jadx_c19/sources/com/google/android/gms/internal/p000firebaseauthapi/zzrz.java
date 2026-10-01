package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzrz extends zzaja<zzrz, zza> implements zzakm {
    private static final zzrz zzc;
    private static volatile zzakx<zzrz> zzd;
    private int zze;
    private int zzf;
    private zzsc zzg;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzrz, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzrz) this.zza).zza(i2);
            return this;
        }

        public final zza zza(zzsc zzscVar) {
            zzh();
            ((zzrz) this.zza).zza(zzscVar);
            return this;
        }

        private zza() {
            super(zzrz.zzc);
        }

        /* synthetic */ zza(zzsa zzsaVar) {
            this();
        }
    }

    public static zzrz zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzrz) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzsc zzd() {
        zzsc zzscVar = this.zzg;
        return zzscVar == null ? zzsc.zzd() : zzscVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsa zzsaVar = null;
        switch (zzsa.zza[i2 - 1]) {
            case 1:
                return new zzrz();
            case 2:
                return new zza(zzsaVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzrz> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzrz.class) {
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
        zzrz zzrzVar = new zzrz();
        zzc = zzrzVar;
        zzaja.zza((Class<zzrz>) zzrz.class, zzrzVar);
    }

    private zzrz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsc zzscVar) {
        zzscVar.getClass();
        this.zzg = zzscVar;
        this.zze |= 1;
    }
}
