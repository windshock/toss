package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class CheckRequestBodyModelChannelInfo implements BitmapImageViewTarget {
    private final setDeployments IAuthTabCallback;

    public CheckRequestBodyModelChannelInfo(@NotNull setDeployments setdeployments) {
        this.IAuthTabCallback = setdeployments;
    }

    @Override // o.BitmapImageViewTarget
    public void onExtraCallbackWithResult(@Nullable Throwable th) {
        this.IAuthTabCallback.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.IAuthTabCallback + ']';
    }
}
