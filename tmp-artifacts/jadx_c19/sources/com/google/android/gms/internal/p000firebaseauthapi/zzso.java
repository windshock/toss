package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzso extends zzaja<zzso, zza> implements zzakm {
    private static final zzso zzc;
    private static volatile zzakx<zzso> zzd;
    private int zze;
    private int zzf;
    private zzss zzg;
    private zzahm zzh = zzahm.zza;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzso, zza> implements zzakm {
        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzso) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(zzss zzssVar) {
            zzh();
            ((zzso) this.zza).zza(zzssVar);
            return this;
        }

        private zza() {
            super(zzso.zzc);
        }

        /* synthetic */ zza(zzsn zzsnVar) {
            this();
        }
    }

    public static zzso zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzso) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzss zzd() {
        zzss zzssVar = this.zzg;
        return zzssVar == null ? zzss.zzd() : zzssVar;
    }

    public final zzahm zze() {
        return this.zzh;
    }

    public static zzakx<zzso> zzf() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsn zzsnVar = null;
        switch (zzsn.zza[i2 - 1]) {
            case 1:
                return new zzso();
            case 2:
                return new zza(zzsnVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzso> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzso.class) {
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
        zzso zzsoVar = new zzso();
        zzc = zzsoVar;
        zzaja.zza((Class<zzso>) zzso.class, zzsoVar);
    }

    private zzso() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzh = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzss zzssVar) {
        zzssVar.getClass();
        this.zzg = zzssVar;
        this.zze |= 1;
    }
}
