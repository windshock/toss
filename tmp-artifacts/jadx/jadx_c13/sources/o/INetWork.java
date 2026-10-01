package o;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class INetWork extends GeckoHubImp {
    public static final INetWork onNavigationEvent = new INetWork();

    @Override // o.GeckoHubImp
    public boolean onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext) {
        return false;
    }

    private INetWork() {
    }

    @Override // o.GeckoHubImp
    public GeckoHubImp onWarmupCompleted(int i, @Nullable String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        StatisticModelPackageStatisticModel statisticModelPackageStatisticModel = (StatisticModelPackageStatisticModel) coroutineContext.get(StatisticModelPackageStatisticModel.onWarmupCompleted);
        if (statisticModelPackageStatisticModel != null) {
            statisticModelPackageStatisticModel.onExtraCallback = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
