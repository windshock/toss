package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda15 {
    private int IAuthTabCallback;
    private int onExtraCallback;
    private long[] onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda15() {
        this(16);
    }

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda15(int i2) {
        RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i2 <= 1073741824);
        i2 = i2 == 0 ? 1 : i2;
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.onExtraCallback = 0;
        this.onWarmupCompleted = -1;
        this.IAuthTabCallback = 0;
        this.onExtraCallbackWithResult = new long[i2];
        this.onNavigationEvent = i2 - 1;
    }

    public void onWarmupCompleted(long j) {
        if (this.IAuthTabCallback == this.onExtraCallbackWithResult.length) {
            onWarmupCompleted();
        }
        int i2 = (this.onWarmupCompleted + 1) & this.onNavigationEvent;
        this.onWarmupCompleted = i2;
        this.onExtraCallbackWithResult[i2] = j;
        this.IAuthTabCallback++;
    }

    public long onExtraCallback() {
        int i2 = this.IAuthTabCallback;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.onExtraCallbackWithResult;
        int i3 = this.onExtraCallback;
        long j = jArr[i3];
        this.onExtraCallback = this.onNavigationEvent & (i3 + 1);
        this.IAuthTabCallback = i2 - 1;
        return j;
    }

    public long IAuthTabCallback() {
        if (this.IAuthTabCallback == 0) {
            throw new NoSuchElementException();
        }
        return this.onExtraCallbackWithResult[this.onExtraCallback];
    }

    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback == 0;
    }

    public void onNavigationEvent() {
        this.onExtraCallback = 0;
        this.onWarmupCompleted = -1;
        this.IAuthTabCallback = 0;
    }

    private void onWarmupCompleted() {
        long[] jArr = this.onExtraCallbackWithResult;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i2 = this.onExtraCallback;
        int i3 = length2 - i2;
        System.arraycopy(jArr, i2, jArr2, 0, i3);
        System.arraycopy(this.onExtraCallbackWithResult, 0, jArr2, i3, i2);
        this.onExtraCallback = 0;
        this.onWarmupCompleted = this.IAuthTabCallback - 1;
        this.onExtraCallbackWithResult = jArr2;
        this.onNavigationEvent = length - 1;
    }
}
