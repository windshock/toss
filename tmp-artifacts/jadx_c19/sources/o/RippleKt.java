package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class RippleKt extends TextAnnotatedStringNodeExternalSyntheticLambda0 implements RadioButtonKt {
    private RadioButtonKt onExtraCallback;
    private long onWarmupCompleted;

    public void onExtraCallback(long j, RadioButtonKt radioButtonKt, long j2) {
        this.onNavigationEvent = j;
        this.onExtraCallback = radioButtonKt;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.onWarmupCompleted = j;
    }

    @Override // o.RadioButtonKt
    public int onExtraCallbackWithResult() {
        return ((RadioButtonKt) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onExtraCallbackWithResult();
    }

    @Override // o.RadioButtonKt
    public long IAuthTabCallback(int i2) {
        return ((RadioButtonKt) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).IAuthTabCallback(i2) + this.onWarmupCompleted;
    }

    @Override // o.RadioButtonKt
    public int onWarmupCompleted(long j) {
        return ((RadioButtonKt) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onWarmupCompleted(j - this.onWarmupCompleted);
    }

    @Override // o.RadioButtonKt
    public List<ImeEditCommand_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult(long j) {
        return ((RadioButtonKt) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onExtraCallbackWithResult(j - this.onWarmupCompleted);
    }

    @Override // o.TextAnnotatedStringNodeExternalSyntheticLambda0, o.TextFieldSelectionState_androidKtExternalSyntheticLambda5
    public void onNavigationEvent() {
        super.onNavigationEvent();
        this.onExtraCallback = null;
    }
}
