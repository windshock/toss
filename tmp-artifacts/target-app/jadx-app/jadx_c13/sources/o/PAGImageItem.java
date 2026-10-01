package o;

import java.nio.charset.StandardCharsets;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class PAGImageItem {
    public static boolean onExtraCallbackWithResult(byte[] bArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean onNavigationEvent(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, boolean z) {
        int iMin = Math.min(i2, i4);
        for (int i5 = 0; i5 < iMin; i5++) {
            if (bArr[i + i5] != bArr2[i3 + i5]) {
                return false;
            }
        }
        if (i2 == i4) {
            return true;
        }
        if (!z) {
            return false;
        }
        if (i2 > i4) {
            while (i4 < i2) {
                if (bArr[i + i4] != 0) {
                    return false;
                }
                i4++;
            }
        } else {
            while (i2 < i4) {
                if (bArr2[i3 + i2] != 0) {
                    return false;
                }
                i2++;
            }
        }
        return true;
    }

    public static boolean onExtraCallback(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        return onNavigationEvent(bytes, 0, bytes.length, bArr, i, i2, false);
    }
}
