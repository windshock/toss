package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzut extends zzaja<zzut, zza> implements zzakm {
    private static final zzut zzc;
    private static volatile zzakx<zzut> zzd;
    private int zze;
    private int zzf;
    private zzuw zzg;
    private zzahm zzh = zzahm.zza;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzut, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzut) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(zzuw zzuwVar) {
            zzh();
            ((zzut) this.zza).zza(zzuwVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzut) this.zza).zza(0);
            return this;
        }

        private zza() {
            super(zzut.zzc);
        }

        /* synthetic */ zza(zzuu zzuuVar) {
            this();
        }
    }

    public static zzut zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzut) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzuw zzd() {
        zzuw zzuwVar = this.zzg;
        return zzuwVar == null ? zzuw.zze() : zzuwVar;
    }

    public final zzahm zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzuu zzuuVar = null;
        switch (zzuu.zza[i2 - 1]) {
            case 1:
                return new zzut();
            case 2:
                return new zza(zzuuVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzut> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzut.class) {
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
        zzut zzutVar = new zzut();
        zzc = zzutVar;
        zzaja.zza((Class<zzut>) zzut.class, zzutVar);
    }

    private zzut() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzuw zzuwVar) {
        zzuwVar.getClass();
        this.zzg = zzuwVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }
}
