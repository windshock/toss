package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzui extends zzaja<zzui, zza> implements zzakm {
    private static final zzui zzc;
    private static volatile zzakx<zzui> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zzf;
    }

    public final zzuc zzb() {
        zzuc zzucVarZza = zzuc.zza(this.zze);
        return zzucVarZza == null ? zzuc.UNRECOGNIZED : zzucVarZza;
    }

    public static final class zza extends zzaja.zzb<zzui, zza> implements zzakm {
        public final zza zza(zzuc zzucVar) {
            zzh();
            ((zzui) this.zza).zza(zzucVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzui) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzui.zzc);
        }

        /* synthetic */ zza(zzuh zzuhVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzui zze() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzuh zzuhVar = null;
        switch (zzuh.zza[i2 - 1]) {
            case 1:
                return new zzui();
            case 2:
                return new zza(zzuhVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzui> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzui.class) {
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
        zzui zzuiVar = new zzui();
        zzc = zzuiVar;
        zzaja.zza((Class<zzui>) zzui.class, zzuiVar);
    }

    private zzui() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuc zzucVar) {
        this.zze = zzucVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }
}
