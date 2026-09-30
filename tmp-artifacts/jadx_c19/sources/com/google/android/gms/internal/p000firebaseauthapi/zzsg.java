package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzsg extends zzaja<zzsg, zza> implements zzakm {
    private static final zzsg zzc;
    private static volatile zzakx<zzsg> zzd;
    private int zze;
    private zzsk zzf;
    private zzuf zzg;

    public static zza zza() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzsg, zza> implements zzakm {
        public final zza zza(zzsk zzskVar) {
            zzh();
            ((zzsg) this.zza).zza(zzskVar);
            return this;
        }

        public final zza zza(zzuf zzufVar) {
            zzh();
            ((zzsg) this.zza).zza(zzufVar);
            return this;
        }

        private zza() {
            super(zzsg.zzc);
        }

        /* synthetic */ zza(zzsf zzsfVar) {
            this();
        }
    }

    public static zzsg zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzsg) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzsk zzc() {
        zzsk zzskVar = this.zzf;
        return zzskVar == null ? zzsk.zzd() : zzskVar;
    }

    public final zzuf zzd() {
        zzuf zzufVar = this.zzg;
        return zzufVar == null ? zzuf.zze() : zzufVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsf zzsfVar = null;
        switch (zzsf.zza[i2 - 1]) {
            case 1:
                return new zzsg();
            case 2:
                return new zza(zzsfVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsg> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzsg.class) {
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
        zzsg zzsgVar = new zzsg();
        zzc = zzsgVar;
        zzaja.zza((Class<zzsg>) zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsk zzskVar) {
        zzskVar.getClass();
        this.zzf = zzskVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuf zzufVar) {
        zzufVar.getClass();
        this.zzg = zzufVar;
        this.zze |= 2;
    }
}
