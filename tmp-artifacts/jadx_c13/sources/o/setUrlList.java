package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class setUrlList extends RequestCoordinator<Unit> {
    public setUrlList(@NotNull CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // o.setFullPackage
    protected boolean asInterface(@NotNull Throwable th) {
        inst.onNavigationEvent(getContext(), th);
        return true;
    }
}
