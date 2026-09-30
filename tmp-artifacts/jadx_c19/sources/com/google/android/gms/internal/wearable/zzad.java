package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzad {
    private final String zza;
    private final zzab zzb;
    private zzab zzc;

    /* synthetic */ zzad(String str, zzac zzacVar) {
        zzab zzabVar = new zzab(null);
        this.zzb = zzabVar;
        this.zzc = zzabVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzab zzabVar = this.zzb.zzc;
        String str = "";
        while (zzabVar != null) {
            Object obj = zzabVar.zzb;
            sb.append(str);
            String str2 = zzabVar.zza;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzabVar = zzabVar.zzc;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzad zza(String str, int i2) {
        zzz zzzVar = new zzz(null);
        this.zzc.zzc = zzzVar;
        this.zzc = zzzVar;
        zzzVar.zzb = String.valueOf(i2);
        zzzVar.zza = "filterType";
        return this;
    }

    public final zzad zzb(String str, @CheckForNull Object obj) {
        zzab zzabVar = new zzab(null);
        this.zzc.zzc = zzabVar;
        this.zzc = zzabVar;
        zzabVar.zzb = obj;
        zzabVar.zza = str;
        return this;
    }
}
