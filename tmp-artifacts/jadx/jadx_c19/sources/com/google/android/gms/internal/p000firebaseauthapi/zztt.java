package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zztt extends zzaja<zztt, zza> implements zzakm {
    private static final zztt zzc;
    private static volatile zzakx<zztt> zzd;
    private int zze;
    private int zzf;
    private zztp zzg;
    private zzahm zzh;
    private zzahm zzi;

    public final int zza() {
        return this.zzf;
    }

    public final zztp zzb() {
        zztp zztpVar = this.zzg;
        return zztpVar == null ? zztp.zze() : zztpVar;
    }

    public static final class zza extends zzaja.zzb<zztt, zza> implements zzakm {
        public final zza zza(zztp zztpVar) {
            zzh();
            ((zztt) this.zza).zza(zztpVar);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zztt) this.zza).zza(0);
            return this;
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zztt) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zzb(zzahm zzahmVar) {
            zzh();
            ((zztt) this.zza).zzb(zzahmVar);
            return this;
        }

        private zza() {
            super(zztt.zzc);
        }

        /* synthetic */ zza(zztu zztuVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zztt zze() {
        return zzc;
    }

    public static zztt zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zztt) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzahm zzf() {
        return this.zzh;
    }

    public final zzahm zzg() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zztu zztuVar = null;
        switch (zztu.zza[i2 - 1]) {
            case 1:
                return new zztt();
            case 2:
                return new zza(zztuVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztt> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zztt.class) {
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
        zztt zzttVar = new zztt();
        zzc = zzttVar;
        zzaja.zza((Class<zztt>) zztt.class, zzttVar);
    }

    private zztt() {
        zzahm zzahmVar = zzahm.zza;
        this.zzh = zzahmVar;
        this.zzi = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztp zztpVar) {
        zztpVar.getClass();
        this.zzg = zztpVar;
        this.zze |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzf = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzi = zzahmVar;
    }
}
