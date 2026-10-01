package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzsw extends zzaja<zzsw, zza> implements zzakm {
    private static final zzsw zzc;
    private static volatile zzakx<zzsw> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static final class zza extends zzaja.zzb<zzsw, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzsw) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzsw.zzc);
        }

        /* synthetic */ zza(zzsv zzsvVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzsw zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzsw) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsv zzsvVar = null;
        switch (zzsv.zza[i2 - 1]) {
            case 1:
                return new zzsw();
            case 2:
                return new zza(zzsvVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsw> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzsw.class) {
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
        zzsw zzswVar = new zzsw();
        zzc = zzswVar;
        zzaja.zza((Class<zzsw>) zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zze = i2;
    }
}
