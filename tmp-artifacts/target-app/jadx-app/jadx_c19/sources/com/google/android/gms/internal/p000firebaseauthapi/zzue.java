package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzue extends zzaja<zzue, zza> implements zzakm {
    private static final zzue zzc;
    private static volatile zzakx<zzue> zzd;
    private int zze;
    private int zzf;
    private zzui zzg;
    private zzahm zzh = zzahm.zza;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzue, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzue) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(zzui zzuiVar) {
            zzh();
            ((zzue) this.zza).zza(zzuiVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzue) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzue.zzc);
        }

        /* synthetic */ zza(zzud zzudVar) {
            this();
        }
    }

    public static zzue zzd() {
        return zzc;
    }

    public static zzue zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzue) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzui zze() {
        zzui zzuiVar = this.zzg;
        return zzuiVar == null ? zzui.zze() : zzuiVar;
    }

    public final zzahm zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzud zzudVar = null;
        switch (zzud.zza[i2 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza(zzudVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzue> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzue.class) {
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
        zzue zzueVar = new zzue();
        zzc = zzueVar;
        zzaja.zza((Class<zzue>) zzue.class, zzueVar);
    }

    private zzue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzui zzuiVar) {
        zzuiVar.getClass();
        this.zzg = zzuiVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }
}
