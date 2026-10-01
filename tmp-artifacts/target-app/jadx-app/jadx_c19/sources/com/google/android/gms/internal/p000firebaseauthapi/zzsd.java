package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzsd extends zzaja<zzsd, zza> implements zzakm {
    private static final zzsd zzc;
    private static volatile zzakx<zzsd> zzd;
    private int zze;
    private int zzf;
    private zzsh zzg;
    private zzue zzh;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzsd, zza> implements zzakm {
        public final zza zza(zzsh zzshVar) {
            zzh();
            ((zzsd) this.zza).zza(zzshVar);
            return this;
        }

        public final zza zza(zzue zzueVar) {
            zzh();
            ((zzsd) this.zza).zza(zzueVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzsd) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzsd.zzc);
        }

        /* synthetic */ zza(zzse zzseVar) {
            this();
        }
    }

    public static zzsd zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzsd) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzsh zzd() {
        zzsh zzshVar = this.zzg;
        return zzshVar == null ? zzsh.zzd() : zzshVar;
    }

    public final zzue zze() {
        zzue zzueVar = this.zzh;
        return zzueVar == null ? zzue.zzd() : zzueVar;
    }

    public static zzakx<zzsd> zzf() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzse zzseVar = null;
        switch (zzse.zza[i2 - 1]) {
            case 1:
                return new zzsd();
            case 2:
                return new zza(zzseVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsd> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzsd.class) {
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
        zzsd zzsdVar = new zzsd();
        zzc = zzsdVar;
        zzaja.zza((Class<zzsd>) zzsd.class, zzsdVar);
    }

    private zzsd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsh zzshVar) {
        zzshVar.getClass();
        this.zzg = zzshVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzue zzueVar) {
        zzueVar.getClass();
        this.zzh = zzueVar;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }
}
