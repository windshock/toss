package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidKtExternalSyntheticLambda7 {
    private int IAuthTabCallback;
    private final int onExtraCallbackWithResult;
    private final byte[] onNavigationEvent;
    private int onWarmupCompleted;

    public ExposedDropdownMenu_androidKtExternalSyntheticLambda7(byte[] bArr) {
        this.onNavigationEvent = bArr;
        this.onExtraCallbackWithResult = bArr.length;
    }

    public boolean onNavigationEvent() {
        boolean z = (((this.onNavigationEvent[this.onWarmupCompleted] & 255) >> this.IAuthTabCallback) & 1) == 1;
        onExtraCallback(1);
        return z;
    }

    public int onExtraCallbackWithResult(int i2) {
        int i3 = this.onWarmupCompleted;
        int iMin = Math.min(i2, 8 - this.IAuthTabCallback);
        int i4 = i3 + 1;
        int i5 = ((this.onNavigationEvent[i3] & 255) >> this.IAuthTabCallback) & (OggPageHeader.MAX_SEGMENT_COUNT >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.onNavigationEvent[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        onExtraCallback(i2);
        return ((-1) >>> (32 - i2)) & i5;
    }

    public void onExtraCallback(int i2) {
        int i3 = i2 / 8;
        int i4 = this.onWarmupCompleted + i3;
        this.onWarmupCompleted = i4;
        int i5 = this.IAuthTabCallback + (i2 - (i3 << 3));
        this.IAuthTabCallback = i5;
        if (i5 > 7) {
            this.onWarmupCompleted = i4 + 1;
            this.IAuthTabCallback = i5 - 8;
        }
        onExtraCallbackWithResult();
    }

    public int onExtraCallback() {
        return (this.onWarmupCompleted << 3) + this.IAuthTabCallback;
    }

    private void onExtraCallbackWithResult() {
        int i2;
        int i3 = this.onWarmupCompleted;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(i3 >= 0 && (i3 < (i2 = this.onExtraCallbackWithResult) || (i3 == i2 && this.IAuthTabCallback == 0)));
    }
}
