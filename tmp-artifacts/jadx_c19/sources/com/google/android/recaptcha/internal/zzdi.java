package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdi implements zzdd {
    public static final zzdi zza = new zzdi();

    private zzdi() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        int length = zzpqVarArr.length;
        if (length < 2) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Class<?> clsZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        String strZza = zzcjVar.zzh().zza(str);
        if (Intrinsics.areEqual(strZza, "forName")) {
            throw new zzae(6, 48, (Throwable) null);
        }
        Class[] clsArrZzg = zzcjVar.zzc().zzg(ArraysKt.toList(zzpqVarArr).subList(2, length));
        try {
            zzcjVar.zzc().zzf(i2, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzg, clsArrZzg.length)));
        } catch (Exception e) {
            throw new zzae(6, 13, e);
        }
    }
}
