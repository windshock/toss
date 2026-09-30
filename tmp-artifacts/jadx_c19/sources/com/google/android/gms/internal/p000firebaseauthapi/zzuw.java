package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzuw extends zzaja<zzuw, zza> implements zzakm {
    private static final zzuw zzc;
    private static volatile zzakx<zzuw> zzd;
    private int zze;
    private int zzf;
    private zzus zzg;
    private zzahm zzh = zzahm.zza;

    public final int zza() {
        return this.zzf;
    }

    public final zzus zzb() {
        zzus zzusVar = this.zzg;
        return zzusVar == null ? zzus.zzf() : zzusVar;
    }

    public static final class zza extends zzaja.zzb<zzuw, zza> implements zzakm {
        public final zza zza(zzus zzusVar) {
            zzh();
            ((zzuw) this.zza).zza(zzusVar);
            return this;
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzuw) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzuw) this.zza).zza(0);
            return this;
        }

        private zza() {
            super(zzuw.zzc);
        }

        /* synthetic */ zza(zzuv zzuvVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzuw zze() {
        return zzc;
    }

    public static zzuw zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzuw) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzahm zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzuv zzuvVar = null;
        switch (zzuv.zza[i2 - 1]) {
            case 1:
                return new zzuw();
            case 2:
                return new zza(zzuvVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzuw> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzuw.class) {
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
        zzuw zzuwVar = new zzuw();
        zzc = zzuwVar;
        zzaja.zza((Class<zzuw>) zzuw.class, zzuwVar);
    }

    private zzuw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzus zzusVar) {
        zzusVar.getClass();
        this.zzg = zzusVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }

    public final boolean zzg() {
        return (this.zze & 1) != 0;
    }
}
