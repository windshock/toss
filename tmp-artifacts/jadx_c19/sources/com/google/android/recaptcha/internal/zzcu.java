package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcu implements zzdd {
    public static final zzcu zza = new zzcu();

    private zzcu() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Object objZza2 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str2 = (String) objZza2;
        if (str2 == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        zzcjVar.zzc().zzf(i2, str.concat(str2));
    }
}
