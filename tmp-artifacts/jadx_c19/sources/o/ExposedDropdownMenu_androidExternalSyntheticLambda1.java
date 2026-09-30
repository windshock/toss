package o;

import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidExternalSyntheticLambda1 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda17 onExtraCallback;
    private long onExtraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda17 onNavigationEvent;

    public ExposedDropdownMenu_androidExternalSyntheticLambda1(long[] jArr, long[] jArr2, long j) {
        RecordingInputConnection_androidKt.onNavigationEvent(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i2 = length + 1;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda17 textFieldDecoratorModifierNodeExternalSyntheticLambda17 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda17(i2);
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda17;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda17 textFieldDecoratorModifierNodeExternalSyntheticLambda172 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda17(i2);
            this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda172;
            textFieldDecoratorModifierNodeExternalSyntheticLambda17.onWarmupCompleted(0L);
            textFieldDecoratorModifierNodeExternalSyntheticLambda172.onWarmupCompleted(0L);
        } else {
            this.onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda17(length);
            this.onNavigationEvent = new TextFieldDecoratorModifierNodeExternalSyntheticLambda17(length);
        }
        this.onExtraCallback.onExtraCallback(jArr);
        this.onNavigationEvent.onExtraCallback(jArr2);
        this.onExtraCallbackWithResult = j;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return this.onNavigationEvent.onExtraCallbackWithResult() > 0;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        if (this.onNavigationEvent.onExtraCallbackWithResult() == 0) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda3.onWarmupCompleted);
        }
        int iIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.onNavigationEvent, j, true, true);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(this.onNavigationEvent.onWarmupCompleted(iIAuthTabCallback), this.onExtraCallback.onWarmupCompleted(iIAuthTabCallback));
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult == j || iIAuthTabCallback == this.onNavigationEvent.onExtraCallbackWithResult() - 1) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
        }
        int i2 = iIAuthTabCallback + 1;
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(this.onNavigationEvent.onWarmupCompleted(i2), this.onExtraCallback.onWarmupCompleted(i2)));
    }

    public void IAuthTabCallback(long j, long j2) {
        if (this.onNavigationEvent.onExtraCallbackWithResult() == 0 && j > 0) {
            this.onExtraCallback.onWarmupCompleted(0L);
            this.onNavigationEvent.onWarmupCompleted(0L);
        }
        this.onExtraCallback.onWarmupCompleted(j2);
        this.onNavigationEvent.onWarmupCompleted(j);
    }

    public long onWarmupCompleted(long j) {
        if (this.onNavigationEvent.onExtraCallbackWithResult() == 0) {
            return -9223372036854775807L;
        }
        return this.onNavigationEvent.onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.onExtraCallback, j, true, true));
    }

    public boolean onExtraCallbackWithResult(long j, long j2) {
        if (this.onNavigationEvent.onExtraCallbackWithResult() == 0) {
            return false;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda17 textFieldDecoratorModifierNodeExternalSyntheticLambda17 = this.onNavigationEvent;
        return j - textFieldDecoratorModifierNodeExternalSyntheticLambda17.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda17.onExtraCallbackWithResult() - 1) < j2;
    }

    public void onNavigationEvent(long j) {
        this.onExtraCallbackWithResult = j;
    }
}
