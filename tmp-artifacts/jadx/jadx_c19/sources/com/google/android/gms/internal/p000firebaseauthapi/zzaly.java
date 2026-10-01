package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzaly extends zzaja<zzaly, zza> implements zzakm {
    private static final zzaly zzc;
    private static volatile zzakx<zzaly> zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzaja.zzb<zzaly, zza> implements zzakm {
        public final zza zza(int i2) {
            if (!this.zza.zzv()) {
                zzi();
            }
            ((zzaly) this.zza).zza(i2);
            return this;
        }

        public final zza zza(long j) {
            if (!this.zza.zzv()) {
                zzi();
            }
            ((zzaly) this.zza).zza(j);
            return this;
        }

        private zza() {
            super(zzaly.zzc);
        }

        /* synthetic */ zza(zzama zzamaVar) {
            this();
        }
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzama zzamaVar = null;
        switch (zzama.zza[i2 - 1]) {
            case 1:
                return new zzaly();
            case 2:
                return new zza(zzamaVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzaly> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzaly.class) {
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
        zzaly zzalyVar = new zzaly();
        zzc = zzalyVar;
        zzaja.zza((Class<zzaly>) zzaly.class, zzalyVar);
    }

    private zzaly() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        this.zze = j;
    }
}
