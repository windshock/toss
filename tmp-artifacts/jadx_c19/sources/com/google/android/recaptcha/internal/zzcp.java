package com.google.android.recaptcha.internal;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcp implements zzdd {
    public static final zzcp zza = new zzcp();

    private zzcp() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 3) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Integer)) {
            objZza = null;
        }
        Integer num = (Integer) objZza;
        if (num == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            throw new zzae(4, 6, (Throwable) null);
        }
        Object objZza2 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Object objZza3 = zzcjVar.zzc().zza(zzpqVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        if (Intrinsics.areEqual(objZza2, objZza3)) {
            zzcjVar.zzg(zzcjVar.zza() + iIntValue);
        }
    }
}
