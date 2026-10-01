package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzta extends zzaja<zzta, zza> implements zzakm {
    private static final zzta zzc;
    private static volatile zzakx<zzta> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static final class zza extends zzaja.zzb<zzta, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzta) this.zza).zza(i2);
            return this;
        }

        private zza() {
            super(zzta.zzc);
        }

        /* synthetic */ zza(zzsz zzszVar) {
            this();
        }
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public static zzta zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzta) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsz zzszVar = null;
        switch (zzsz.zza[i2 - 1]) {
            case 1:
                return new zzta();
            case 2:
                return new zza(zzszVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzta> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzta.class) {
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
        zzta zztaVar = new zzta();
        zzc = zztaVar;
        zzaja.zza((Class<zzta>) zzta.class, zztaVar);
    }

    private zzta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zze = i2;
    }
}
