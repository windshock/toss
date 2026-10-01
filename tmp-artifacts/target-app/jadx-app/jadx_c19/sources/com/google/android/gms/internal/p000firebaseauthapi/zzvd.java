package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzvd extends zzaja<zzvd, zza> implements zzakm {
    private static final zzvd zzc;
    private static volatile zzakx<zzvd> zzd;
    private String zze = "";
    private zzahm zzf = zzahm.zza;
    private int zzg;

    public static zza zza() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzvd, zza> implements zzakm {
        public final zza zza(zzvt zzvtVar) {
            zzh();
            ((zzvd) this.zza).zza(zzvtVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            ((zzvd) this.zza).zza(str);
            return this;
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzvd) this.zza).zza(zzahmVar);
            return this;
        }

        private zza() {
            super(zzvd.zzc);
        }

        /* synthetic */ zza(zzvc zzvcVar) {
            this();
        }
    }

    public static zzvd zzc() {
        return zzc;
    }

    public static zzvd zza(byte[] bArr, zzaip zzaipVar) throws zzajj {
        return (zzvd) zzaja.zza(zzc, bArr, zzaipVar);
    }

    public final zzvt zzd() {
        zzvt zzvtVarZza = zzvt.zza(this.zzg);
        return zzvtVarZza == null ? zzvt.UNRECOGNIZED : zzvtVarZza;
    }

    public final zzahm zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzvc zzvcVar = null;
        switch (zzvc.zza[i2 - 1]) {
            case 1:
                return new zzvd();
            case 2:
                return new zza(zzvcVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvd> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzvd.class) {
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

    public final String zzf() {
        return this.zze;
    }

    static {
        zzvd zzvdVar = new zzvd();
        zzc = zzvdVar;
        zzaja.zza((Class<zzvd>) zzvd.class, zzvdVar);
    }

    private zzvd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvt zzvtVar) {
        this.zzg = zzvtVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }
}
