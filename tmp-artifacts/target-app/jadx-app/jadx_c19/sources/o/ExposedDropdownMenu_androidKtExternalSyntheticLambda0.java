package o;

import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidKtExternalSyntheticLambda0 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {
    private final long IAuthTabCallback;
    private final long onExtraCallbackWithResult;

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    public ExposedDropdownMenu_androidKtExternalSyntheticLambda0(long j) {
        this(j, 0L);
    }

    public ExposedDropdownMenu_androidKtExternalSyntheticLambda0(long j, long j2) {
        this.onExtraCallbackWithResult = j;
        this.IAuthTabCallback = j2;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(j, this.IAuthTabCallback));
    }
}
