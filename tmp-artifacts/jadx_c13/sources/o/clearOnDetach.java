package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class clearOnDetach extends isPatchUpdate {
    public final setResourceInternal<?> onExtraCallbackWithResult;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return true;
    }

    public clearOnDetach(@NotNull setResourceInternal<?> setresourceinternal) {
        this.onExtraCallbackWithResult = setresourceinternal;
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        setResourceInternal<?> setresourceinternal = this.onExtraCallbackWithResult;
        setresourceinternal.onExtraCallbackWithResult(setresourceinternal.onWarmupCompleted((getPackageType) IAuthTabCallback()));
    }
}
