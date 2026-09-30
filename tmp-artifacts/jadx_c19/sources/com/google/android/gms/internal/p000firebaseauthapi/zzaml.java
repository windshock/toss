package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzaml {
    private static final zzamn zza;

    static /* synthetic */ int zza(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i4 == 1) {
            byte b2 = bArr[i2];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i4 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    static int zza(String str, byte[] bArr, int i2, int i3) {
        return zza.zza(str, bArr, i2, i3);
    }

    static int zza(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new zzamp(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
    }

    static String zzb(byte[] bArr, int i2, int i3) throws zzajj {
        return zza.zza(bArr, i2, i3);
    }

    static {
        if (zzamh.zzc()) {
            zzamh.zzd();
        }
        zza = new zzamm();
    }

    static boolean zza(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    static boolean zzc(byte[] bArr, int i2, int i3) {
        return zza.zzb(bArr, i2, i3);
    }
}
