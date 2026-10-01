package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzeg implements zzee {
    private final zzef zza;
    private final zzed zzb;

    public zzeg(@NotNull zzef zzefVar, @NotNull zzed zzedVar) {
        this.zza = zzefVar;
        this.zzb = zzedVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    private final zzpf zzb(String str, List list) throws zzae {
        if (str.length() == 0) {
            throw new zzae(3, 17, (Throwable) null);
        }
        try {
            zzec zzecVar = new zzec(this.zza.zza(CollectionsKt.toLongArray(list)), 255L, zzec.zzb());
            StringBuilder sb = new StringBuilder(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                sb.append((char) UInt.constructor-impl(UInt.constructor-impl(str.charAt(i2)) ^ UInt.constructor-impl((int) zzecVar.zza())));
            }
            return zzpf.zzg(zzfy.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            throw new zzae(3, 18, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final zzpf zza(@NotNull zzpn zzpnVar) throws zzae {
        zzfh zzfhVarZzb = zzfh.zzb();
        zzpf zzpfVarZzb = zzb(zzpnVar.zzi(), zzpnVar.zzj());
        zzfhVarZzb.zzf();
        zzv.zza(zzx.zzm.zza(), zzfhVarZzb.zza(TimeUnit.MICROSECONDS));
        return zzpfVarZzb;
    }
}
