package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdr implements zzdd {
    public static final zzdr zza = new zzdr();

    private zzdr() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, (Throwable) null);
        }
        zzcjVar.zzc().zzf(i2, zzcjVar.zzc().zza(zzpqVarArr[0]));
    }
}
