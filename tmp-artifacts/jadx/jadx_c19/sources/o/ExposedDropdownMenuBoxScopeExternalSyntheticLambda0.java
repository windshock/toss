package o;

import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ExposedDropdownMenuBoxScopeExternalSyntheticLambda0 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda4 IAuthTabCallback;

    public ExposedDropdownMenuBoxScopeExternalSyntheticLambda0(ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
        this.IAuthTabCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda4;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return this.IAuthTabCallback.onNavigationEvent();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.IAuthTabCallback.onExtraCallback();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        return this.IAuthTabCallback.onExtraCallback(j);
    }
}
