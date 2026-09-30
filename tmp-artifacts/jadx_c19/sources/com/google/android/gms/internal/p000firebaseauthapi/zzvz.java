package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzvz extends zzaja<zzvz, zza> implements zzakm {
    private static final zzvz zzc;
    private static volatile zzakx<zzvz> zzd;
    private int zze;

    public final int zza() {
        return this.zze;
    }

    public static final class zza extends zzaja.zzb<zzvz, zza> implements zzakm {
        private zza() {
            super(zzvz.zzc);
        }

        /* synthetic */ zza(zzvy zzvyVar) {
            this();
        }
    }

    public static zzvz zzc() {
        return zzc;
    }

    public static zzvz zza(zzahm zzahmVar, zzaip zzaipVar) throws zzajj {
        return (zzvz) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzvy zzvyVar = null;
        switch (zzvy.zza[i2 - 1]) {
            case 1:
                return new zzvz();
            case 2:
                return new zza(zzvyVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvz> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzvz.class) {
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
        zzvz zzvzVar = new zzvz();
        zzc = zzvzVar;
        zzaja.zza((Class<zzvz>) zzvz.class, zzvzVar);
    }

    private zzvz() {
    }
}
