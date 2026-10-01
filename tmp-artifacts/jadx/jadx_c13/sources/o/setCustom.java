package o;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setCustom implements setDeployments {
    private final Future<?> onExtraCallbackWithResult;

    public setCustom(@NotNull Future<?> future) {
        this.onExtraCallbackWithResult = future;
    }

    @Override // o.setDeployments
    public void dispose() {
        this.onExtraCallbackWithResult.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.onExtraCallbackWithResult + ']';
    }
}
