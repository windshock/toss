package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import o.lt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class htf<E> extends dj<E> implements ok<E> {
    @Override // o.ok
    public /* synthetic */ lt onActivityLayout() {
        return onNavigationEvent();
    }

    public htf(@NotNull CoroutineContext coroutineContext, @NotNull nLockFileSegment<E> nlockfilesegment) {
        super(coroutineContext, nlockfilesegment, true, true);
    }

    @Override // o.RequestCoordinator, o.setFullPackage, o.getPackageType
    public boolean onExtraCallback() {
        return super.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.RequestCoordinator
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(@NotNull Unit unit) {
        lt.onWarmupCompleted.onExtraCallbackWithResult(onTransact(), null, 1, null);
    }

    @Override // o.RequestCoordinator
    public void onExtraCallback(@NotNull Throwable th, boolean z) {
        if (onTransact().onExtraCallback(th) || z) {
            return;
        }
        inst.onNavigationEvent(getContext(), th);
    }
}
