package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdt implements zzdd {
    public static final zzdt zza = new zzdt();

    private zzdt() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws IllegalAccessException, IllegalArgumentException, zzae {
        if (zzpqVarArr.length != 3) {
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
            field.set(zzcjVar.zzc().zza(zzpqVarArr[1]), zzcjVar.zzc().zza(zzpqVarArr[2]));
        } catch (Exception e) {
            throw new zzae(6, 11, e);
        }
    }
}
