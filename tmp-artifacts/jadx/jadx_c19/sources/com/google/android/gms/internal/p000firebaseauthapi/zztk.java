package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zztk extends zzaja<zztk, zza> implements zzakm {
    private static final zztk zzc;
    private static volatile zzakx<zztk> zzd;
    private int zze;
    private zzvd zzf;

    public static zza zza() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zztk, zza> implements zzakm {
        public final zza zza(zzvd zzvdVar) {
            zzh();
            ((zztk) this.zza).zza(zzvdVar);
            return this;
        }

        private zza() {
            super(zztk.zzc);
        }

        /* synthetic */ zza(zztm zztmVar) {
            this();
        }
    }

    public static zztk zzc() {
        return zzc;
    }

    public final zzvd zzd() {
        zzvd zzvdVar = this.zzf;
        return zzvdVar == null ? zzvd.zzc() : zzvdVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zztm zztmVar = null;
        switch (zztm.zza[i2 - 1]) {
            case 1:
                return new zztk();
            case 2:
                return new zza(zztmVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztk> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zztk.class) {
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
        zztk zztkVar = new zztk();
        zzc = zztkVar;
        zzaja.zza((Class<zztk>) zztk.class, zztkVar);
    }

    private zztk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvd zzvdVar) {
        zzvdVar.getClass();
        this.zzf = zzvdVar;
        this.zze |= 1;
    }
}
