package o;

import java.util.concurrent.locks.LockSupport;
import o.CheckRequestBodyModelGroup;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class CheckRequestBodyModelChannels extends CheckRequestBodyModelLocalChannel {
    protected abstract Thread onExtraCallbackWithResult();

    protected final void access100() {
        Thread threadOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (Thread.currentThread() == threadOnExtraCallbackWithResult || ResourceEncoderRegistryEntry.IAuthTabCallback != null) {
            return;
        }
        LockSupport.unpark(threadOnExtraCallbackWithResult);
    }

    protected void onExtraCallbackWithResult(long j, @NotNull CheckRequestBodyModelGroup.onExtraCallback onextracallback) {
        GeckoHubImpa.onExtraCallback.IAuthTabCallback(j, onextracallback);
    }
}
