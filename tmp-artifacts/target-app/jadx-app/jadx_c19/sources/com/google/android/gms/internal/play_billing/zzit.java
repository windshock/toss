package com.google.android.gms.internal.play_billing;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class zzit {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.play_billing.zzgs */
    static /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzgs {
        if (zze(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || zze(b3) || zze(b4)) {
            throw new zzgs("Protocol message had invalid UTF-8.");
        }
        int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.play_billing.zzgs */
    static /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i2) throws zzgs {
        if (b < -62 || zze(b2)) {
            throw new zzgs("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    static /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    private static boolean zze(byte b) {
        return b > -65;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.internal.play_billing.zzgs */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i2) throws zzgs {
        if (!zze(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!zze(b3)) {
                        cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zze(b3)) {
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                }
            }
        }
        throw new zzgs("Protocol message had invalid UTF-8.");
    }
}
