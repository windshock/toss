package com.google.android.recaptcha.internal;

import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zzff {
    public static void zza(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(zzfi.zza(str, Character.valueOf(c)));
        }
    }

    public static void zze(boolean z, @CheckForNull Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i2, int i3, String str) {
        return i2 < 0 ? zzfi.zza("%s (%s) must not be negative", str, Integer.valueOf(i2)) : zzfi.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void zzd(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? zzf(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? zzf(i3, i4, "end index") : zzfi.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }
}
