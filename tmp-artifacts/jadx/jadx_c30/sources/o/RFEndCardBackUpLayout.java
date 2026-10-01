package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class RFEndCardBackUpLayout {
    private byte[] onExtraCallback;
    private int[] onWarmupCompleted;

    RFEndCardBackUpLayout() {
    }

    static void onExtraCallback(RFEndCardBackUpLayout rFEndCardBackUpLayout, byte[] bArr, int[] iArr) {
        rFEndCardBackUpLayout.onExtraCallback = bArr;
        rFEndCardBackUpLayout.onWarmupCompleted = iArr;
    }

    static void IAuthTabCallback(RFEndCardBackUpLayout rFEndCardBackUpLayout, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = rFEndCardBackUpLayout.onWarmupCompleted;
            byte[] bArr = rFEndCardBackUpLayout.onExtraCallback;
            int i3 = i2 << 2;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }
}
