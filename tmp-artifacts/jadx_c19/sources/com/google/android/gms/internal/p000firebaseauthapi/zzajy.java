package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzajy implements zzalf {
    private static final zzakl zza = new zzakb();
    private final zzakl zzb;

    private static zzakl zza() {
        try {
            return (zzakl) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return zza;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.zzalf
    public final <T> zzalc<T> zza(Class<T> cls) {
        zzale.zza((Class<?>) cls);
        zzaki zzakiVarZza = this.zzb.zza(cls);
        if (zzakiVarZza.zzc()) {
            if (zzaja.class.isAssignableFrom(cls)) {
                return zzakq.zza(zzale.zzb(), zzait.zzb(), zzakiVarZza.zza());
            }
            return zzakq.zza(zzale.zza(), zzait.zza(), zzakiVarZza.zza());
        }
        if (zzaja.class.isAssignableFrom(cls)) {
            if (zza(zzakiVarZza)) {
                return zzako.zza(cls, zzakiVarZza, zzaku.zzb(), zzajt.zzb(), zzale.zzb(), zzait.zzb(), zzakj.zzb());
            }
            return zzako.zza(cls, zzakiVarZza, zzaku.zzb(), zzajt.zzb(), zzale.zzb(), (zzair<?>) null, zzakj.zzb());
        }
        if (zza(zzakiVarZza)) {
            return zzako.zza(cls, zzakiVarZza, zzaku.zza(), zzajt.zza(), zzale.zza(), zzait.zza(), zzakj.zza());
        }
        return zzako.zza(cls, zzakiVarZza, zzaku.zza(), zzajt.zza(), zzale.zza(), (zzair<?>) null, zzakj.zza());
    }

    public zzajy() {
        this(new zzakd(zzajb.zza(), zza()));
    }

    private zzajy(zzakl zzaklVar) {
        this.zzb = (zzakl) zzajc.zza(zzaklVar, "messageInfoFactory");
    }

    private static boolean zza(zzaki zzakiVar) {
        return zzaka.zza[zzakiVar.zzb().ordinal()] != 1;
    }
}
