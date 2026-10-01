package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0 {
    private boolean IAuthTabCallback;
    private final int onExtraCallback;
    public byte[] onExtraCallbackWithResult;
    public int onNavigationEvent;
    private boolean onWarmupCompleted;

    public SliderKtRangeSlider2gestureEndAction111ExternalSyntheticLambda0(int i2, int i3) {
        this.onExtraCallback = i2;
        byte[] bArr = new byte[i3 + 3];
        this.onExtraCallbackWithResult = bArr;
        bArr[2] = 1;
    }

    public void onNavigationEvent() {
        this.IAuthTabCallback = false;
        this.onWarmupCompleted = false;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public void onWarmupCompleted(int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.IAuthTabCallback);
        boolean z = i2 == this.onExtraCallback;
        this.IAuthTabCallback = z;
        if (z) {
            this.onNavigationEvent = 3;
            this.onWarmupCompleted = false;
        }
    }

    public void onExtraCallbackWithResult(byte[] bArr, int i2, int i3) {
        if (this.IAuthTabCallback) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.onExtraCallbackWithResult;
            int length = bArr2.length;
            int i5 = this.onNavigationEvent + i4;
            if (length < i5) {
                this.onExtraCallbackWithResult = Arrays.copyOf(bArr2, i5 << 1);
            }
            System.arraycopy(bArr, i2, this.onExtraCallbackWithResult, this.onNavigationEvent, i4);
            this.onNavigationEvent += i4;
        }
    }

    public boolean onNavigationEvent(int i2) {
        if (!this.IAuthTabCallback) {
            return false;
        }
        this.onNavigationEvent -= i2;
        this.IAuthTabCallback = false;
        this.onWarmupCompleted = true;
        return true;
    }
}
