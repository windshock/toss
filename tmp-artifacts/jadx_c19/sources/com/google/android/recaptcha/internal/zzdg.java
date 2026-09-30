package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdg implements zzdd {
    public static final zzdg zza = new zzdg();

    private zzdg() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length == 0) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Class[] clsArrZzg = zzcjVar.zzc().zzg(ArraysKt.toList(zzpqVarArr).subList(1, length));
        try {
            zzcjVar.zzc().zzf(i2, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzg, clsArrZzg.length)));
        } catch (Exception e) {
            throw new zzae(6, 9, e);
        }
    }
}
