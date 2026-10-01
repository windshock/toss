package o;

import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getOrNull implements updateSeverityInternal {
    private final String IAuthTabCallback;

    @Nullable
    private String onExtraCallback;
    private final component17<getCtx> onExtraCallbackWithResult;

    @Nullable
    private String onWarmupCompleted;

    getOrNull(component17<getCtx> component17Var, String str) {
        this.onExtraCallbackWithResult = component17Var;
        this.IAuthTabCallback = str;
    }

    @Override // o.updateSeverityInternal
    public updateSeverityInternal IAuthTabCallback(String str) {
        this.onWarmupCompleted = str;
        return this;
    }

    @Override // o.updateSeverityInternal
    public updateSeverityInternal onExtraCallback(String str) {
        this.onExtraCallback = str;
        return this;
    }

    @Override // o.updateSeverityInternal
    public updateSeverityReason onNavigationEvent() {
        return this.onExtraCallbackWithResult.IAuthTabCallback(this.IAuthTabCallback, this.onExtraCallback, this.onWarmupCompleted, getScreenDensityDpi.bB_());
    }
}
