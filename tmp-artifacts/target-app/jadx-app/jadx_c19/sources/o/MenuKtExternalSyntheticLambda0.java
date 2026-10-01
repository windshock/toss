package o;

import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MenuKtExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda1 {
    private final DrawerStateExternalSyntheticLambda1 IAuthTabCallback;
    private final long onWarmupCompleted;

    public MenuKtExternalSyntheticLambda0(long j, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda1;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult(int i2, int i3) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(i2, i3);
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void IAuthTabCallback(final ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
        this.IAuthTabCallback.IAuthTabCallback(new ExposedDropdownMenuBoxScopeExternalSyntheticLambda0(exposedDropdownMenu_androidKtExternalSyntheticLambda4) { // from class: o.MenuKtExternalSyntheticLambda0.5
            @Override // o.ExposedDropdownMenuBoxScopeExternalSyntheticLambda0, o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
            public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
                ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onnavigationeventOnExtraCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallback(j);
                ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = onnavigationeventOnExtraCallback.IAuthTabCallback;
                ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda32 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(exposedDropdownMenu_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult, exposedDropdownMenu_androidKtExternalSyntheticLambda3.onNavigationEvent + MenuKtExternalSyntheticLambda0.this.onWarmupCompleted);
                ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda33 = onnavigationeventOnExtraCallback.onWarmupCompleted;
                return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda32, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(exposedDropdownMenu_androidKtExternalSyntheticLambda33.onExtraCallbackWithResult, exposedDropdownMenu_androidKtExternalSyntheticLambda33.onNavigationEvent + MenuKtExternalSyntheticLambda0.this.onWarmupCompleted));
            }
        });
    }
}
