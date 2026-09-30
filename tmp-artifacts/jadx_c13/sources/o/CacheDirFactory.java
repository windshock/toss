package o;

import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class CacheDirFactory {
    CacheDirFactory() {
    }

    static byte[] IAuthTabCallback(@Nullable byte[] bArr, int i, int i2) {
        if (bArr == null || i > bArr.length) {
            return null;
        }
        int iMin = Math.min(bArr.length - i, i2);
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, i, bArr2, 0, iMin);
        return bArr2;
    }

    static byte[] onWarmupCompleted(@Nullable byte[] bArr, @Nullable byte[] bArr2, int i) {
        byte[] bArr3 = new byte[(bArr2 != null ? bArr2.length : 0) + i];
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        }
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr3, i, bArr2.length);
        }
        return bArr3;
    }
}
