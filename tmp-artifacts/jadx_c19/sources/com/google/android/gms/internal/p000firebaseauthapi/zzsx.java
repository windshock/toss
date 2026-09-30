package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzsx extends zzaja<zzsx, zza> implements zzakm {
    private static final zzsx zzc;
    private static volatile zzakx<zzsx> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzsx, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzsx) this.zza).zza(zzahmVar);
            return this;
        }

        private zza() {
            super(zzsx.zzc);
        }

        /* synthetic */ zza(zzsy zzsyVar) {
            this();
        }
    }

    public static zzsx zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzsx) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzahm zzd() {
        return this.zzf;
    }

    public static zzakx<zzsx> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsy zzsyVar = null;
        switch (zzsy.zza[i2 - 1]) {
            case 1:
                return new zzsx();
            case 2:
                return new zza(zzsyVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsx> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzsx.class) {
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
        zzsx zzsxVar = new zzsx();
        zzc = zzsxVar;
        zzaja.zza((Class<zzsx>) zzsx.class, zzsxVar);
    }

    private zzsx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }
}
