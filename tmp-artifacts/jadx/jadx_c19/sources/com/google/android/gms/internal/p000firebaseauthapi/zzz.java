package com.google.android.gms.internal.p000firebaseauthapi;

import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzz {
    public static int zza(int i2, int i3) {
        String strZza;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZza = zzah.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i3 >= 0) {
            strZza = zzah.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            throw new IllegalArgumentException("negative size: " + i3);
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzb(i2, i3, "index"));
        }
        return i2;
    }

    public static int zza(int i2, int i3, String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zzb(i2, i3, str));
        }
        return i2;
    }

    public static <T> T zza(@CheckForNull T t) {
        t.getClass();
        return t;
    }

    private static String zzb(int i2, int i3, String str) {
        if (i2 < 0) {
            return zzah.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("negative size: " + i3);
        }
        return zzah.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void zza(int i2, int i3, int i4) {
        String strZzb;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strZzb = zzb(i2, i4, "start index");
            } else if (i3 < 0 || i3 > i4) {
                strZzb = zzb(i3, i4, "end index");
            } else {
                strZzb = zzah.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
