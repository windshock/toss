package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzty extends zzaja<zzty, zza> implements zzakm {
    private static final zzty zzc;
    private static volatile zzakx<zzty> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;
    private zzvi zzg;

    public static zza zza() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzty, zza> implements zzakm {
        public final zza zza() {
            zzh();
            ((zzty) this.zza).zzd();
            return this;
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzty) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(zzvi zzviVar) {
            zzh();
            ((zzty) this.zza).zza(zzviVar);
            return this;
        }

        private zza() {
            super(zzty.zzc);
        }

        /* synthetic */ zza(zzua zzuaVar) {
            this();
        }
    }

    public static zzty zza(InputStream inputStream, zzaip zzaipVar) throws IOException {
        return (zzty) zzaja.zza(zzc, inputStream, zzaipVar);
    }

    public final zzahm zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzua zzuaVar = null;
        switch (zzua.zza[i2 - 1]) {
            case 1:
                return new zzty();
            case 2:
                return new zza(zzuaVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzty> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzty.class) {
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
        zzty zztyVar = new zzty();
        zzc = zztyVar;
        zzaja.zza((Class<zzty>) zzty.class, zztyVar);
    }

    private zzty() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        this.zzg = null;
        this.zze &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzvi zzviVar) {
        zzviVar.getClass();
        this.zzg = zzviVar;
        this.zze |= 1;
    }
}
