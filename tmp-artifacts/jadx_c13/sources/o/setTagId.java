package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setTagId extends isPatchUpdate implements resumeMyRequest {
    public final removeCallback onWarmupCompleted;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return true;
    }

    public setTagId(@NotNull removeCallback removecallback) {
        this.onWarmupCompleted = removecallback;
    }

    @Override // o.resumeMyRequest
    public getPackageType onExtraCallbackWithResult() {
        return IAuthTabCallback();
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        this.onWarmupCompleted.onExtraCallbackWithResult((setMd5) IAuthTabCallback());
    }

    @Override // o.resumeMyRequest
    public boolean onExtraCallbackWithResult(@NotNull Throwable th) {
        return IAuthTabCallback().IAuthTabCallback(th);
    }
}
