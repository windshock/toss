package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzst extends zzaja<zzst, zza> implements zzakm {
    private static final zzst zzc;
    private static volatile zzakx<zzst> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzst, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzst) this.zza).zza(zzahmVar);
            return this;
        }

        private zza() {
            super(zzst.zzc);
        }

        /* synthetic */ zza(zzsu zzsuVar) {
            this();
        }
    }

    public static zzst zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzst) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzahm zzd() {
        return this.zzf;
    }

    public static zzakx<zzst> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsu zzsuVar = null;
        switch (zzsu.zza[i2 - 1]) {
            case 1:
                return new zzst();
            case 2:
                return new zza(zzsuVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzst> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzst.class) {
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
        zzst zzstVar = new zzst();
        zzc = zzstVar;
        zzaja.zza((Class<zzst>) zzst.class, zzstVar);
    }

    private zzst() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }
}
