package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class setAccessKey<T> extends IThreadPoolCallback<T> {
    private final access13800<Unit> onExtraCallbackWithResult;

    public setAccessKey(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.onExtraCallbackWithResult = access14200.onNavigationEvent(function2, this, this);
    }

    @Override // o.setFullPackage
    protected void onActivityResized() throws Throwable {
        setLoop.onExtraCallback(this.onExtraCallbackWithResult, this);
    }
}
