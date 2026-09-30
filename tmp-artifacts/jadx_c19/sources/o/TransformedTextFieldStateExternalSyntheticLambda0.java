package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TransformedTextFieldStateExternalSyntheticLambda0 {
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private byte[] onNavigationEvent;
    private int onWarmupCompleted;

    public TransformedTextFieldStateExternalSyntheticLambda0(byte[] bArr, int i2, int i3) {
        onExtraCallback(bArr, i2, i3);
    }

    public void onExtraCallback(byte[] bArr, int i2, int i3) {
        this.onNavigationEvent = bArr;
        this.onExtraCallback = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallbackWithResult = 0;
        IAuthTabCallbackStub();
    }

    public void asInterface() {
        int i2 = this.onExtraCallbackWithResult + 1;
        this.onExtraCallbackWithResult = i2;
        if (i2 == 8) {
            this.onExtraCallbackWithResult = 0;
            int i3 = this.onExtraCallback;
            this.onExtraCallback = i3 + (onNavigationEvent(i3 + 1) ? 2 : 1);
        }
        IAuthTabCallbackStub();
    }

    public void onWarmupCompleted(int i2) {
        int i3 = this.onExtraCallback;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.onExtraCallback = i5;
        int i6 = this.onExtraCallbackWithResult + (i2 - (i4 << 3));
        this.onExtraCallbackWithResult = i6;
        if (i6 > 7) {
            this.onExtraCallback = i5 + 1;
            this.onExtraCallbackWithResult = i6 - 8;
        }
        while (true) {
            int i7 = i3 + 1;
            if (i7 <= this.onExtraCallback) {
                if (onNavigationEvent(i7)) {
                    this.onExtraCallback++;
                    i3 += 3;
                } else {
                    i3 = i7;
                }
            } else {
                IAuthTabCallbackStub();
                return;
            }
        }
    }

    public void onWarmupCompleted() {
        int i2 = this.onExtraCallbackWithResult;
        if (i2 > 0) {
            onWarmupCompleted(8 - i2);
        }
    }

    public boolean onExtraCallbackWithResult(int i2) {
        int i3 = this.onExtraCallback;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.onExtraCallbackWithResult + i2) - (i4 << 3);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            int i7 = i3 + 1;
            if (i7 > i5 || i5 >= this.onWarmupCompleted) {
                break;
            }
            if (onNavigationEvent(i7)) {
                i5++;
                i3 += 3;
            } else {
                i3 = i7;
            }
        }
        int i8 = this.onWarmupCompleted;
        if (i5 >= i8) {
            return i5 == i8 && i6 == 0;
        }
        return true;
    }

    public boolean onExtraCallback() {
        boolean z = (this.onNavigationEvent[this.onExtraCallback] & (128 >> this.onExtraCallbackWithResult)) != 0;
        asInterface();
        return z;
    }

    public int onExtraCallback(int i2) {
        int i3;
        this.onExtraCallbackWithResult += i2;
        int i4 = 0;
        while (true) {
            i3 = this.onExtraCallbackWithResult;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.onExtraCallbackWithResult = i5;
            byte[] bArr = this.onNavigationEvent;
            int i6 = this.onExtraCallback;
            i4 |= (bArr[i6] & 255) << i5;
            if (onNavigationEvent(i6 + 1)) {
                i = 2;
            }
            this.onExtraCallback = i6 + i;
        }
        byte[] bArr2 = this.onNavigationEvent;
        int i7 = this.onExtraCallback;
        byte b = bArr2[i7];
        if (i3 == 8) {
            this.onExtraCallbackWithResult = 0;
            this.onExtraCallback = i7 + (onNavigationEvent(i7 + 1) ? 2 : 1);
        }
        IAuthTabCallbackStub();
        return ((-1) >>> (32 - i2)) & (((b & 255) >> (8 - i3)) | i4);
    }

    public boolean IAuthTabCallback() {
        int i2 = this.onExtraCallback;
        int i3 = this.onExtraCallbackWithResult;
        int i4 = 0;
        while (this.onExtraCallback < this.onWarmupCompleted && !onExtraCallback()) {
            i4++;
        }
        boolean z = this.onExtraCallback == this.onWarmupCompleted;
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = i3;
        return !z && onExtraCallbackWithResult((i4 << 1) + 1);
    }

    public int onExtraCallbackWithResult() {
        return IAuthTabCallbackDefault();
    }

    public int onNavigationEvent() {
        int iIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        return (iIAuthTabCallbackDefault % 2 == 0 ? -1 : 1) * ((iIAuthTabCallbackDefault + 1) / 2);
    }

    private int IAuthTabCallbackDefault() {
        int i2 = 0;
        while (!onExtraCallback()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? onExtraCallback(i2) : 0);
    }

    private boolean onNavigationEvent(int i2) {
        if (2 > i2 || i2 >= this.onWarmupCompleted) {
            return false;
        }
        byte[] bArr = this.onNavigationEvent;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    private void IAuthTabCallbackStub() {
        int i2;
        int i3 = this.onExtraCallback;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(i3 >= 0 && (i3 < (i2 = this.onWarmupCompleted) || (i3 == i2 && this.onExtraCallbackWithResult == 0)));
    }
}
