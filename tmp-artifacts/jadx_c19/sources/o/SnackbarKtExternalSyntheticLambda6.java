package o;

import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SnackbarKtExternalSyntheticLambda6 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    private final SnackbarKtExternalSyntheticLambda4 IAuthTabCallback;
    private final int onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    public SnackbarKtExternalSyntheticLambda6(SnackbarKtExternalSyntheticLambda4 snackbarKtExternalSyntheticLambda4, int i2, long j, long j2) {
        this.IAuthTabCallback = snackbarKtExternalSyntheticLambda4;
        this.onExtraCallback = i2;
        this.onExtraCallbackWithResult = j;
        long j3 = (j2 - j) / snackbarKtExternalSyntheticLambda4.onWarmupCompleted;
        this.onWarmupCompleted = j3;
        this.onNavigationEvent = onWarmupCompleted(j3);
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        long jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted((this.IAuthTabCallback.onTransact * j) / (this.onExtraCallback * 1000000), 0L, this.onWarmupCompleted - 1);
        long j2 = this.onExtraCallbackWithResult;
        long j3 = this.IAuthTabCallback.onWarmupCompleted;
        long jOnWarmupCompleted2 = onWarmupCompleted(jOnWarmupCompleted);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(jOnWarmupCompleted2, j2 + (j3 * jOnWarmupCompleted));
        if (jOnWarmupCompleted2 >= j || jOnWarmupCompleted == this.onWarmupCompleted - 1) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
        }
        long j4 = jOnWarmupCompleted + 1;
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(onWarmupCompleted(j4), this.onExtraCallbackWithResult + (this.IAuthTabCallback.onWarmupCompleted * j4)));
    }

    private long onWarmupCompleted(long j) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j * this.onExtraCallback, 1000000L, this.IAuthTabCallback.onTransact);
    }
}
