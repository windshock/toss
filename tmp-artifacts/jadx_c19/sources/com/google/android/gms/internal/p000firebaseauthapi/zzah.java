package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzah {
    @CheckForNull
    public static String zza(@CheckForNull String str) {
        return zzy.zzb(str);
    }

    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            objArr[i3] = zza(objArr[i3]);
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i4)) != -1) {
            sb.append((CharSequence) strValueOf, i4, iIndexOf);
            sb.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) strValueOf, i4, strValueOf.length());
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zza(@CheckForNull Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for " + str, (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }

    public static String zzb(@CheckForNull String str) {
        return zzy.zzc(str);
    }

    public static boolean zzc(@CheckForNull String str) {
        return zzy.zzd(str);
    }
}
