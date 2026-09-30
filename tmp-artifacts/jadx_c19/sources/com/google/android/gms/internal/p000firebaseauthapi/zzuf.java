package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzuf extends zzaja<zzuf, zza> implements zzakm {
    private static final zzuf zzc;
    private static volatile zzakx<zzuf> zzd;
    private int zze;
    private zzui zzf;
    private int zzg;
    private int zzh;

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public static final class zza extends zzaja.zzb<zzuf, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzuf) this.zza).zza(i2);
            return this;
        }

        public final zza zza(zzui zzuiVar) {
            zzh();
            ((zzuf) this.zza).zza(zzuiVar);
            return this;
        }

        private zza() {
            super(zzuf.zzc);
        }

        /* synthetic */ zza(zzug zzugVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzuf zze() {
        return zzc;
    }

    public static zzuf zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzuf) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzui zzf() {
        zzui zzuiVar = this.zzf;
        return zzuiVar == null ? zzui.zze() : zzuiVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzug zzugVar = null;
        switch (zzug.zza[i2 - 1]) {
            case 1:
                return new zzuf();
            case 2:
                return new zza(zzugVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzuf> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzuf.class) {
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
        zzuf zzufVar = new zzuf();
        zzc = zzufVar;
        zzaja.zza((Class<zzuf>) zzuf.class, zzufVar);
    }

    private zzuf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzg = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzui zzuiVar) {
        zzuiVar.getClass();
        this.zzf = zzuiVar;
        this.zze |= 1;
    }
}
