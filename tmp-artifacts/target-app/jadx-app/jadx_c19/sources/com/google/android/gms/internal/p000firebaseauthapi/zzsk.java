package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.internal.p000firebaseauthapi.zzaja;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzsk extends zzaja<zzsk, zza> implements zzakm {
    private static final zzsk zzc;
    private static volatile zzakx<zzsk> zzd;
    private int zze;
    private zzsl zzf;
    private int zzg;

    public final int zza() {
        return this.zzg;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static final class zza extends zzaja.zzb<zzsk, zza> implements zzakm {
        public final zza zza(int i2) {
            zzh();
            ((zzsk) this.zza).zza(i2);
            return this;
        }

        public final zza zza(zzsl zzslVar) {
            zzh();
            ((zzsk) this.zza).zza(zzslVar);
            return this;
        }

        private zza() {
            super(zzsk.zzc);
        }

        /* synthetic */ zza(zzsj zzsjVar) {
            this();
        }
    }

    public static zzsk zzd() {
        return zzc;
    }

    public final zzsl zze() {
        zzsl zzslVar = this.zzf;
        return zzslVar == null ? zzsl.zzd() : zzslVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzaja
    protected final Object zza(int i2, Object obj, Object obj2) {
        zzakx zzaVar;
        zzsj zzsjVar = null;
        switch (zzsj.zza[i2 - 1]) {
            case 1:
                return new zzsk();
            case 2:
                return new zza(zzsjVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsk> zzakxVar = zzd;
                if (zzakxVar != null) {
                    return zzakxVar;
                }
                synchronized (zzsk.class) {
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
        zzsk zzskVar = new zzsk();
        zzc = zzskVar;
        zzaja.zza((Class<zzsk>) zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i2) {
        this.zzg = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzsl zzslVar) {
        zzslVar.getClass();
        this.zzf = zzslVar;
        this.zze |= 1;
    }
}
