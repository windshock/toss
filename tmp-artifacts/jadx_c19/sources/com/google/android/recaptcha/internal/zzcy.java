package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzcy implements zzdd {
    public static final zzcy zza = new zzcy();

    private zzcy() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzae */
    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i2, @NotNull zzcj zzcjVar, @NotNull zzpq... zzpqVarArr) throws IllegalArgumentException, zzae {
        int iIntValue;
        int length = zzpqVarArr.length;
        if (length != 4 && length != 5) {
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
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        Object objZza3 = zzcjVar.zzc().zza(zzpqVarArr[2]);
        if (true != (objZza3 instanceof String)) {
            objZza3 = null;
        }
        String str2 = (String) objZza3;
        if (str2 == null) {
            throw new zzae(4, 5, (Throwable) null);
        }
        String strZza = zzcjVar.zzh().zza(str2);
        Object objZza4 = zzcjVar.zzc().zza(zzpqVarArr[3]);
        if (length == 5) {
            Object objZza5 = zzcjVar.zzc().zza(zzpqVarArr[4]);
            if (true != (objZza5 instanceof Integer)) {
                objZza5 = null;
            }
            Integer num = (Integer) objZza5;
            if (num == null) {
                throw new zzae(4, 5, (Throwable) null);
            }
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (objZza2 instanceof String) {
            try {
                objZza2 = zzcjVar.zzh().zza((String) objZza2);
            } catch (Exception e) {
                throw new zzae(6, 20, e);
            }
        }
        Class clsZza = zzci.zza(objZza2);
        zzcjVar.zzc().zzf(i2, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zzcf(new zzcx(zzcjVar, str, iIntValue), strZza, objZza4)));
    }
}
