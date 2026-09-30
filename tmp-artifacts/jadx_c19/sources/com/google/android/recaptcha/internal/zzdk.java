package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdk implements zzdd {
    public static final zzdk zza = new zzdk();

    private zzdk() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        try {
            zzcjVar.zzc().zzf(i2, field.get(null));
        } catch (Exception e) {
            throw new zzae(6, 16, e);
        }
    }
}
