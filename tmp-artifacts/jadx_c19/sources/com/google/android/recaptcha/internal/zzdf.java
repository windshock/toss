package com.google.android.recaptcha.internal;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdf implements zzdd {
    public static final zzdf zza = new zzdf();

    private zzdf() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        if (objZza instanceof String) {
            try {
                objZza = zzcjVar.zzh().zza((String) objZza);
            } catch (zzae e) {
                throw e;
            } catch (Exception e2) {
                throw new zzae(6, 8, e2);
            }
        }
        zzcjVar.zzc().zzf(i2, zzci.zza(objZza));
    }
}
