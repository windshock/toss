package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzvm extends zzaja<zzvm, zza> implements zzakm {
    private static final zzvm zzc;
    private static volatile zzakx<zzvm> zzd;
    private String zze = "";

    public static zza zza() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzvm, zza> implements zzakm {
        public final zza zza(String str) {
            zzh();
            ((zzvm) this.zza).zza(str);
            return this;
        }

        private zza() {
            super(zzvm.zzc);
        }

        /* synthetic */ zza(zzvn zzvnVar) {
            this();
        }
    }

    public static zzvm zzc() {
        return zzc;
    }

    public static zzvm zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzvm) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzvn zzvnVar = null;
        switch (zzvn.zza[i2 - 1]) {
            case 1:
                return new zzvm();
            case 2:
                return new zza(zzvnVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvm> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzvm.class) {
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

    public final String zzd() {
        return this.zze;
    }

    static {
        zzvm zzvmVar = new zzvm();
        zzc = zzvmVar;
        zzaja.zza((Class<zzvm>) zzvm.class, zzvmVar);
    }

    private zzvm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }
}
