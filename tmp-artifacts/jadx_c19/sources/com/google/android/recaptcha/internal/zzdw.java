package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzdw implements zzdd {
    public static final zzdw zza = new zzdw();

    private zzdw() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
        Object array;
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, (Throwable) null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Object objZza2 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        int iIntValue = num.intValue();
        if (objZza instanceof Integer) {
            array = Integer.valueOf(((Number) objZza).intValue() - iIntValue);
        } else {
            if (!(objZza instanceof int[])) {
                throw new zzae(4, 5, (Throwable) null);
            }
            int[] iArr = (int[]) objZza;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i3 : iArr) {
                arrayList.add(Integer.valueOf(i3 - iIntValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzcjVar.zzc().zzf(i2, array);
    }
}
