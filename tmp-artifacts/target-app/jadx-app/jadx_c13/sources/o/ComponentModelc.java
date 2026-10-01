package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ComponentModelc extends isPatchUpdate {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onWarmupCompleted = AtomicIntegerFieldUpdater.newUpdater(ComponentModelc.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    private final Function1<Throwable, Unit> onExtraCallbackWithResult;

    @Override // o.isPatchUpdate
    public boolean onExtraCallback() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentModelc(@NotNull Function1<? super Throwable, Unit> function1) {
        this.onExtraCallbackWithResult = function1;
    }

    @Override // o.isPatchUpdate
    public void onWarmupCompleted(@Nullable Throwable th) {
        if (onWarmupCompleted.compareAndSet(this, 0, 1)) {
            this.onExtraCallbackWithResult.invoke(th);
        }
    }
}
