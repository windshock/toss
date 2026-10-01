package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zztb extends zzaja<zztb, zza> implements zzakm {
    private static final zztb zzc;
    private static volatile zzakx<zztb> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zztb, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zztb) this.zza).zza(zzahmVar);
            return this;
        }

        private zza() {
            super(zztb.zzc);
        }

        /* synthetic */ zza(zztc zztcVar) {
            this();
        }
    }

    public static zztb zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zztb) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzahm zzd() {
        return this.zzf;
    }

    public static zzakx<zztb> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zztc zztcVar = null;
        switch (zztc.zza[i2 - 1]) {
            case 1:
                return new zztb();
            case 2:
                return new zza(zztcVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztb> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zztb.class) {
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
        zztb zztbVar = new zztb();
        zzc = zztbVar;
        zzaja.zza((Class<zztb>) zztb.class, zztbVar);
    }

    private zztb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }
}
