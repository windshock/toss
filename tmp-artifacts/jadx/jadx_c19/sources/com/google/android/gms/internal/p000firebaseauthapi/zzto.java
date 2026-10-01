package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzto extends zzaja<zzto, zza> implements zzakm {
    private static final zzto zzc;
    private static volatile zzakx<zzto> zzd;
    private int zze;
    private zztp zzf;

    public static zza zza() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzto, zza> implements zzakm {
        public final zza zza(zztp zztpVar) {
            zzh();
            ((zzto) this.zza).zza(zztpVar);
            return this;
        }

        private zza() {
            super(zzto.zzc);
        }

        /* synthetic */ zza(zztn zztnVar) {
            this();
        }
    }

    public static zzto zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzto) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zztp zzc() {
        zztp zztpVar = this.zzf;
        return zztpVar == null ? zztp.zze() : zztpVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zztn zztnVar = null;
        switch (zztn.zza[i2 - 1]) {
            case 1:
                return new zzto();
            case 2:
                return new zza(zztnVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzto> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzto.class) {
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
        zzto zztoVar = new zzto();
        zzc = zztoVar;
        zzaja.zza((Class<zzto>) zzto.class, zztoVar);
    }

    private zzto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zztp zztpVar) {
        zztpVar.getClass();
        this.zzf = zztpVar;
        this.zze |= 1;
    }
}
