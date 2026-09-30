package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcn implements zzdd {
    public static final zzcn zza = new zzcn();

    private zzcn() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws zzae {
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
        try {
            zzcjVar.zzc().zzf(i2, objZza instanceof String ? String.valueOf(((String) objZza).charAt(iIntValue)) : objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue));
        } catch (Exception e) {
            if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzae(4, 23, e);
            }
            throw new zzae(4, 22, e);
        }
    }
}
