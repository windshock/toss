package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdm implements zzdd {
    public static final zzdm zza = new zzdm();

    private zzdm() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length == 0) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Method)) {
            objZza = null;
        }
        Method method = (Method) objZza;
        if (method == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Object[] objArrZzh = zzcjVar.zzc().zzh(ArraysKt.toList(zzpqVarArr).subList(1, length));
        try {
            zzcjVar.zzc().zzf(i2, method.invoke(null, Arrays.copyOf(objArrZzh, objArrZzh.length)));
        } catch (Exception e) {
            throw new zzae(6, 15, e);
        }
    }
}
