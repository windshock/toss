package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzus extends zzaja<zzus, zza> implements zzakm {
    private static final zzus zzc;
    private static volatile zzakx<zzus> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final zzuj zza() {
        zzuj zzujVarZza = zzuj.zza(this.zzg);
        return zzujVarZza == null ? zzuj.zze : zzujVarZza;
    }

    public static final class zza extends zzaja.zzb<zzus, zza> implements zzakm {
        public final zza zza(zzuj zzujVar) {
            zzh();
            ((zzus) this.zza).zza(zzujVar);
            return this;
        }

        public final zza zza(zzuk zzukVar) {
            zzh();
            ((zzus) this.zza).zza(zzukVar);
            return this;
        }

        public final zza zza(zzum zzumVar) {
            zzh();
            ((zzus) this.zza).zza(zzumVar);
            return this;
        }

        private zza() {
            super(zzus.zzc);
        }

        /* synthetic */ zza(zzur zzurVar) {
            this();
        }
    }

    public final zzuk zzb() {
        zzuk zzukVarZza = zzuk.zza(this.zzf);
        return zzukVarZza == null ? zzuk.UNRECOGNIZED : zzukVarZza;
    }

    public final zzum zzc() {
        zzum zzumVarZza = zzum.zza(this.zze);
        return zzumVarZza == null ? zzum.UNRECOGNIZED : zzumVarZza;
    }

    public static zza zzd() {
        return zzc.zzl();
    }

    public static zzus zzf() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzur zzurVar = null;
        switch (zzur.zza[i2 - 1]) {
            case 1:
                return new zzus();
            case 2:
                return new zza(zzurVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzus> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzus.class) {
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
        zzus zzusVar = new zzus();
        zzc = zzusVar;
        zzaja.zza((Class<zzus>) zzus.class, zzusVar);
    }

    private zzus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuj zzujVar) {
        this.zzg = zzujVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuk zzukVar) {
        this.zzf = zzukVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzum zzumVar) {
        this.zze = zzumVar.zza();
    }
}
