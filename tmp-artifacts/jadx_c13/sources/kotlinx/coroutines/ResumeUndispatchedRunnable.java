package kotlinx.coroutines;

import kotlin.Unit;
import o.GeckoHubImp;
import o.maybeRemoveAttachStateListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResumeUndispatchedRunnable implements Runnable {
    private final GeckoHubImp onExtraCallback;
    private final maybeRemoveAttachStateListener<Unit> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(@NotNull GeckoHubImp geckoHubImp, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        this.onExtraCallback = geckoHubImp;
        this.onNavigationEvent = mayberemoveattachstatelistener;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.onNavigationEvent.onNavigationEvent(this.onExtraCallback, Unit.INSTANCE);
    }
}
