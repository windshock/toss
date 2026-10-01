package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setLocal extends isPatchUpdate {
    private final setDeployments onExtraCallback;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return false;
    }

    public setLocal(@NotNull setDeployments setdeployments) {
        this.onExtraCallback = setdeployments;
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        this.onExtraCallback.dispose();
    }
}
