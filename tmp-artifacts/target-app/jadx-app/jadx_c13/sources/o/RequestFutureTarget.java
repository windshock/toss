package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestFutureTarget extends CheckRequestBodyModelGroup {
    private final Thread onNavigationEvent;

    @Override // o.CheckRequestBodyModelChannels
    protected Thread onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public RequestFutureTarget(@NotNull Thread thread) {
        this.onNavigationEvent = thread;
    }
}
