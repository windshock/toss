package o;

import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda1 {
    private static final long[] onExtraCallbackWithResult = {128, 64, 32, 16, 8, 4, 2, 1};
    private int onExtraCallback;
    private int onNavigationEvent;
    private final byte[] onWarmupCompleted = new byte[8];

    public void IAuthTabCallback() {
        this.onNavigationEvent = 0;
        this.onExtraCallback = 0;
    }

    public long onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, boolean z, boolean z2, int i2) throws IOException {
        if (this.onNavigationEvent == 0) {
            if (!drawerKtExternalSyntheticLambda9.onExtraCallback(this.onWarmupCompleted, 0, 1, z)) {
                return -1L;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(this.onWarmupCompleted[0] & 255);
            this.onExtraCallback = iOnExtraCallbackWithResult;
            if (iOnExtraCallbackWithResult == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.onNavigationEvent = 1;
        }
        int i3 = this.onExtraCallback;
        if (i3 > i2) {
            this.onNavigationEvent = 0;
            return -2L;
        }
        if (i3 != 1) {
            drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onWarmupCompleted, 1, i3 - 1);
        }
        this.onNavigationEvent = 0;
        return IAuthTabCallback(this.onWarmupCompleted, this.onExtraCallback, z2);
    }

    public int onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    public static int onExtraCallbackWithResult(int i2) {
        long j;
        int i3 = 0;
        do {
            long[] jArr = onExtraCallbackWithResult;
            if (i3 >= jArr.length) {
                return -1;
            }
            j = jArr[i3] & i2;
            i3++;
        } while (j == 0);
        return i3;
    }

    public static long IAuthTabCallback(byte[] bArr, int i2, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~onExtraCallbackWithResult[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j = (j << 8) | (bArr[i3] & 255);
        }
        return j;
    }
}
