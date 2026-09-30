package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setResource implements BitmapImageViewTarget {
    private final Future<?> onNavigationEvent;

    public setResource(@NotNull Future<?> future) {
        this.onNavigationEvent = future;
    }

    @Override // o.BitmapImageViewTarget
    public void onExtraCallbackWithResult(@Nullable Throwable th) {
        this.onNavigationEvent.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.onNavigationEvent + ']';
    }
}
