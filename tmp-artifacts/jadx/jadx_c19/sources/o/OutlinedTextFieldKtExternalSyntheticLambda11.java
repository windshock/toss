package o;

import o.ExposedDropdownMenuDefaultsExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldKtExternalSyntheticLambda11 extends DrawerKtExternalSyntheticLambda8 implements OutlinedTextFieldKtExternalSyntheticLambda12 {
    private final int IAuthTabCallback;
    private final long onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final long onWarmupCompleted;

    public OutlinedTextFieldKtExternalSyntheticLambda11(long j, long j2, ExposedDropdownMenuDefaultsExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, boolean z) {
        this(j, j2, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallback, z);
    }

    public OutlinedTextFieldKtExternalSyntheticLambda11(long j, long j2, int i2, int i3, boolean z) {
        super(j, j2, i2, i3, z);
        this.onExtraCallback = j2;
        this.IAuthTabCallback = i2;
        this.onExtraCallbackWithResult = i3;
        this.onNavigationEvent = z;
        this.onWarmupCompleted = j == -1 ? -1L : j;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult(long j) {
        return onWarmupCompleted(j);
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public long onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // o.OutlinedTextFieldKtExternalSyntheticLambda12
    public int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public OutlinedTextFieldKtExternalSyntheticLambda11 IAuthTabCallback(long j) {
        return new OutlinedTextFieldKtExternalSyntheticLambda11(j, this.onExtraCallback, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onNavigationEvent);
    }
}
