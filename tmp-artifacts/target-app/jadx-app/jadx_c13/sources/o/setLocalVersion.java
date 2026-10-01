package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setLocalVersion extends setUrlList {
    private final access13800<Unit> onWarmupCompleted;

    public setLocalVersion(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.onWarmupCompleted = access14200.onNavigationEvent(function2, this, this);
    }

    @Override // o.setFullPackage
    protected void onActivityResized() throws Throwable {
        setLoop.onExtraCallback(this.onWarmupCompleted, this);
    }
}
