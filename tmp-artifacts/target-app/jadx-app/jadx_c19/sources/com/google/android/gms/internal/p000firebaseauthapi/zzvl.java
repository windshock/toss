package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzvl extends zzaja<zzvl, zza> implements zzakm {
    private static final zzvl zzc;
    private static volatile zzakx<zzvl> zzd;
    private int zze;
    private int zzf;
    private zzvm zzg;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzvl, zza> implements zzakm {
        public final zza zza(zzvm zzvmVar) {
            zzh();
            ((zzvl) this.zza).zza(zzvmVar);
            return this;
        }

        private zza() {
            super(zzvl.zzc);
        }

        /* synthetic */ zza(zzvk zzvkVar) {
            this();
        }
    }

    public static zzvl zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzvl) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final zzvm zzd() {
        zzvm zzvmVar = this.zzg;
        return zzvmVar == null ? zzvm.zzc() : zzvmVar;
    }

    public static zzakx<zzvl> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzvk zzvkVar = null;
        switch (zzvk.zza[i2 - 1]) {
            case 1:
                return new zzvl();
            case 2:
                return new zza(zzvkVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvl> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzvl.class) {
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
        zzvl zzvlVar = new zzvl();
        zzc = zzvlVar;
        zzaja.zza((Class<zzvl>) zzvl.class, zzvlVar);
    }

    private zzvl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvm zzvmVar) {
        zzvmVar.getClass();
        this.zzg = zzvmVar;
        this.zze |= 1;
    }
}
