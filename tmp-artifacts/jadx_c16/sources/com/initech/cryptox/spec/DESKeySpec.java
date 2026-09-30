package com.initech.cryptox.spec;

import java.security.InvalidKeyException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class DESKeySpec extends javax.crypto.spec.DESKeySpec {
    public static final int DES_KEY_LEN = 8;
    private static final short[] BIT_MASK = {2, 4, 8, 16, 32, 64, 128};
    private static int N_WEAK_KEYS = 16;
    private static short[] weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, 14, 224, 224, 224, 241, 241, 241, 241, 254, 254, 254, 254, 254, 254, 254, 254, 1, 254, 1, 254, 1, 254, 1, 254, 31, 224, 31, 224, 14, 241, 14, 241, 1, 224, 1, 241, 1, 241, 1, 241, 31, 254, 31, 254, 14, 254, 239, 254, 1, 31, 1, 31, 1, 14, 16, 14, 224, 254, 224, 254, 241, 254, 241, 254, 254, 1, 254, 1, 254, 1, 254, 1, 224, 31, 224, 31, 241, 14, 241, 14, 224, 1, 224, 1, 241, 1, 241, 1, 254, 31, 254, 31, 254, 14, 254, 14, 31, 1, 31, 1, 14, 1, 14, 1, 254, 224, 254, 224, 254, 241, 254, 241};

    public DESKeySpec(javax.crypto.spec.DESKeySpec dESKeySpec) throws InvalidKeyException {
        super(dESKeySpec.getKey());
    }

    public DESKeySpec(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    public DESKeySpec(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    public static boolean isParityAdjusted(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length - i < 8) {
            throw new InvalidKeyException("It is not DESKey");
        }
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            boolean z = false;
            while (true) {
                short[] sArr = BIT_MASK;
                if (i3 >= sArr.length) {
                    break;
                }
                if ((sArr[i3] & bArr[i2 + i]) != 0) {
                    z = !z;
                }
                i3++;
            }
            if (z && (bArr[i2 + i] & 1) != 0) {
                return false;
            }
            if (!z && (1 & bArr[i2 + i]) == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isWeak(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length - i < 8) {
            throw new InvalidKeyException("It is not DESKey");
        }
        int i2 = 0;
        while (i2 < N_WEAK_KEYS) {
            for (int i3 = 0; i3 < 8; i3++) {
                if (bArr[i3] != weak_keys[(i2 << 3) + i3]) {
                    break;
                }
            }
            return true;
        }
        return true;
    }
}
