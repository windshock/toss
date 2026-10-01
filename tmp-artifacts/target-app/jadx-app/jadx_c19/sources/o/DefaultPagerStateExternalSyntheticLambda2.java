package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DefaultPagerStateExternalSyntheticLambda2 {
    private final ConcurrentMap<Class<?>, PagerDefaultsExternalSyntheticLambda0<?>> onExtraCallback = new ConcurrentHashMap();
    private final PagerCacheWindowScopeExternalSyntheticLambda0 onWarmupCompleted = new LazyStaggeredGridDslKtExternalSyntheticLambda5();
    private static final DefaultPagerStateExternalSyntheticLambda2 onNavigationEvent = new DefaultPagerStateExternalSyntheticLambda2();
    static boolean onExtraCallbackWithResult = false;

    public static DefaultPagerStateExternalSyntheticLambda2 onNavigationEvent() {
        return onNavigationEvent;
    }

    public <T> PagerDefaultsExternalSyntheticLambda0<T> IAuthTabCallback(Class<T> cls) {
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(cls, "messageType");
        PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0OnExtraCallback = (PagerDefaultsExternalSyntheticLambda0) this.onExtraCallback.get(cls);
        if (pagerDefaultsExternalSyntheticLambda0OnExtraCallback == null) {
            pagerDefaultsExternalSyntheticLambda0OnExtraCallback = this.onWarmupCompleted.onExtraCallback(cls);
            PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0 = (PagerDefaultsExternalSyntheticLambda0<T>) onExtraCallback(cls, pagerDefaultsExternalSyntheticLambda0OnExtraCallback);
            if (pagerDefaultsExternalSyntheticLambda0 != null) {
                return pagerDefaultsExternalSyntheticLambda0;
            }
        }
        return pagerDefaultsExternalSyntheticLambda0OnExtraCallback;
    }

    public <T> PagerDefaultsExternalSyntheticLambda0<T> onExtraCallbackWithResult(T t) {
        return IAuthTabCallback(t.getClass());
    }

    public PagerDefaultsExternalSyntheticLambda0<?> onExtraCallback(Class<?> cls, PagerDefaultsExternalSyntheticLambda0<?> pagerDefaultsExternalSyntheticLambda0) {
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(cls, "messageType");
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(pagerDefaultsExternalSyntheticLambda0, "schema");
        return this.onExtraCallback.putIfAbsent(cls, pagerDefaultsExternalSyntheticLambda0);
    }

    private DefaultPagerStateExternalSyntheticLambda2() {
    }
}
