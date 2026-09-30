package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zztf extends zzaja<zztf, zza> implements zzakm {
    private static final zztf zzc;
    private static volatile zzakx<zztf> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zztf, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zztf) this.zza).zza(zzahmVar);
            return this;
        }

        private zza() {
            super(zztf.zzc);
        }

        /* synthetic */ zza(zztg zztgVar) {
            this();
        }
    }

    public static zztf zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zztf) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzahm zzd() {
        return this.zzf;
    }

    public static zzakx<zztf> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zztg zztgVar = null;
        switch (zztg.zza[i2 - 1]) {
            case 1:
                return new zztf();
            case 2:
                return new zza(zztgVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztf> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zztf.class) {
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
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzaja.zza((Class<zztf>) zztf.class, zztfVar);
    }

    private zztf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }
}
