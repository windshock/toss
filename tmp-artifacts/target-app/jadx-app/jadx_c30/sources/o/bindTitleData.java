package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class bindTitleData {
    private static final byte[] onWarmupCompleted = new byte[1024];
    private static final int[] onExtraCallbackWithResult = new int[1024];

    bindTitleData() {
    }

    static void onWarmupCompleted(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(onWarmupCompleted, 0, bArr, i + i3, iMin);
            i3 += iMin;
        }
    }

    static void onExtraCallbackWithResult(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iMin = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(onExtraCallbackWithResult, 0, iArr, i + i3, iMin);
            i3 += iMin;
        }
    }
}
