package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTVideoLandingPageActivity7 {
    private final int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private final byte[] onWarmupCompleted;

    TTVideoLandingPageActivity7(int i) {
        this.onExtraCallback = i;
        this.onWarmupCompleted = new byte[i];
    }

    public boolean onWarmupCompleted() {
        return this.onNavigationEvent != this.onExtraCallbackWithResult;
    }

    public void onExtraCallback(int i, int i2) {
        int i3 = this.onExtraCallbackWithResult - i;
        for (int i4 = i3; i4 < i2 + i3; i4++) {
            byte[] bArr = this.onWarmupCompleted;
            int i5 = this.onExtraCallbackWithResult;
            int i6 = this.onExtraCallback;
            bArr[i5] = bArr[(i4 + i6) % i6];
            this.onExtraCallbackWithResult = (i5 + 1) % i6;
        }
    }

    public int onExtraCallback() {
        if (!onWarmupCompleted()) {
            return -1;
        }
        byte[] bArr = this.onWarmupCompleted;
        int i = this.onNavigationEvent;
        byte b = bArr[i];
        this.onNavigationEvent = (i + 1) % this.onExtraCallback;
        return b & 255;
    }

    public void onWarmupCompleted(int i) {
        byte[] bArr = this.onWarmupCompleted;
        int i2 = this.onExtraCallbackWithResult;
        bArr[i2] = (byte) i;
        this.onExtraCallbackWithResult = (i2 + 1) % this.onExtraCallback;
    }
}
