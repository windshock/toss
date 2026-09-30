package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzamk {
    private static boolean zza(byte b) {
        return b > -65;
    }

    static /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzajj {
        if (zza(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zza(b3) || zza(b4)) {
            throw zzajj.zzd();
        }
        int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    static /* synthetic */ void zza(byte b, char[] cArr, int i2) {
        cArr[i2] = (char) b;
    }

    static /* synthetic */ void zza(byte b, byte b2, byte b3, char[] cArr, int i2) throws zzajj {
        if (zza(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || zza(b3)))) {
            throw zzajj.zzd();
        }
        cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    static /* synthetic */ void zza(byte b, byte b2, char[] cArr, int i2) throws zzajj {
        if (b < -62 || zza(b2)) {
            throw zzajj.zzd();
        }
        cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
    }
}
