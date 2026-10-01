package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzte extends zzaja<zzte, zza> implements zzakm {
    private static final zzte zzc;
    private static volatile zzakx<zzte> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static final class zza extends zzaja.zzb<zzte, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzte) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzte.zzc);
        }

        /* synthetic */ zza(zztd zztdVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzte zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzte) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zztd zztdVar = null;
        switch (zztd.zza[i2 - 1]) {
            case 1:
                return new zzte();
            case 2:
                return new zza(zztdVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzte> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzte.class) {
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
        zzte zzteVar = new zzte();
        zzc = zzteVar;
        zzaja.zza((Class<zzte>) zzte.class, zzteVar);
    }

    private zzte() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zze = i2;
    }
}
