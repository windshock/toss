package o;

import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProgressIndicatorKtExternalSyntheticLambda14 {
    public final long[] IAuthTabCallback;
    public final ProgressIndicatorKtExternalSyntheticLambda12 IAuthTabCallbackDefault;
    public final long[] IAuthTabCallbackStub;
    public final int onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int[] onTransact;
    public final int[] onWarmupCompleted;

    public ProgressIndicatorKtExternalSyntheticLambda14(ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j) {
        RecordingInputConnection_androidKt.onNavigationEvent(iArr.length == jArr2.length);
        RecordingInputConnection_androidKt.onNavigationEvent(jArr.length == jArr2.length);
        RecordingInputConnection_androidKt.onNavigationEvent(iArr2.length == jArr2.length);
        this.IAuthTabCallbackDefault = progressIndicatorKtExternalSyntheticLambda12;
        this.IAuthTabCallback = jArr;
        this.onTransact = iArr;
        this.onExtraCallback = i2;
        this.IAuthTabCallbackStub = jArr2;
        this.onWarmupCompleted = iArr2;
        this.onExtraCallbackWithResult = j;
        this.onNavigationEvent = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int onExtraCallback(long j) {
        for (int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallbackStub, j, true, false); iOnExtraCallback >= 0; iOnExtraCallback--) {
            if ((this.onWarmupCompleted[iOnExtraCallback] & 1) != 0) {
                return iOnExtraCallback;
            }
        }
        return -1;
    }

    public int onExtraCallbackWithResult(long j) {
        Object[] objArr = {this.IAuthTabCallbackStub, Long.valueOf(j), true, false};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        for (int iIntValue = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1100701149, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1100701127)).intValue(); iIntValue < this.IAuthTabCallbackStub.length; iIntValue++) {
            if ((this.onWarmupCompleted[iIntValue] & 1) != 0) {
                return iIntValue;
            }
        }
        return -1;
    }
}
