package o;

import java.math.RoundingMode;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda10 implements OutlinedTextFieldKtExternalSyntheticLambda12 {
    private final ExposedDropdownMenu_androidExternalSyntheticLambda1 onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public OutlinedTextFieldKtExternalSyntheticLambda10(long j, long j2, long j3) {
        this.onExtraCallback = new ExposedDropdownMenu_androidExternalSyntheticLambda1(new long[]{j2}, new long[]{0}, j);
        this.onWarmupCompleted = j2;
        this.onNavigationEvent = j3;
        int i2 = -2147483647;
        if (j != -9223372036854775807L) {
            long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2 - j3, 8L, j, RoundingMode.HALF_UP);
            if (jOnExtraCallback > 0 && jOnExtraCallback <= 2147483647L) {
                i2 = (int) jOnExtraCallback;
            }
            this.onExtraCallbackWithResult = i2;
            return;
        }
        this.onExtraCallbackWithResult = -2147483647;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult(long j) {
        return this.onExtraCallback.onWarmupCompleted(j);
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return this.onExtraCallback.onNavigationEvent();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onExtraCallback.onExtraCallback();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        return this.onExtraCallback.onExtraCallback(j);
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public void onExtraCallback(long j, long j2) {
        if (onNavigationEvent(j)) {
            return;
        }
        this.onExtraCallback.IAuthTabCallback(j, j2);
    }

    public boolean onNavigationEvent(long j) {
        return this.onExtraCallback.onExtraCallbackWithResult(j, 100000L);
    }

    void onWarmupCompleted(long j) {
        this.onExtraCallback.onNavigationEvent(j);
    }
}
