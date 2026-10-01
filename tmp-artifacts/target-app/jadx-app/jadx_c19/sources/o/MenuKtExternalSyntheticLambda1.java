package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class MenuKtExternalSyntheticLambda1 extends ExposedDropdownMenuDefaultsExternalSyntheticLambda0 {
    private final long onExtraCallbackWithResult;

    public MenuKtExternalSyntheticLambda1(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) {
        super(drawerKtExternalSyntheticLambda9);
        RecordingInputConnection_androidKt.onNavigationEvent(drawerKtExternalSyntheticLambda9.IAuthTabCallback() >= j);
        this.onExtraCallbackWithResult = j;
    }

    @Override // o.ExposedDropdownMenuDefaultsExternalSyntheticLambda0, o.DrawerKtExternalSyntheticLambda9
    public long IAuthTabCallback() {
        return super.IAuthTabCallback() - this.onExtraCallbackWithResult;
    }

    @Override // o.ExposedDropdownMenuDefaultsExternalSyntheticLambda0, o.DrawerKtExternalSyntheticLambda9
    public long onWarmupCompleted() {
        return super.onWarmupCompleted() - this.onExtraCallbackWithResult;
    }

    @Override // o.ExposedDropdownMenuDefaultsExternalSyntheticLambda0, o.DrawerKtExternalSyntheticLambda9
    public long onExtraCallback() {
        return super.onExtraCallback() - this.onExtraCallbackWithResult;
    }
}
