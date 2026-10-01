package o;

import java.util.Map;
import o.LazyStaggeredGridItemProviderImplExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridIntervalContentExternalSyntheticLambda2 implements LazyStaggeredGridIntervalContentExternalSyntheticLambda3 {
    LazyStaggeredGridIntervalContentExternalSyntheticLambda2() {
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public Map<?, ?> onWarmupCompleted(Object obj) {
        return (LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj;
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public LazyStaggeredGridItemProviderImplExternalSyntheticLambda1.IAuthTabCallback<?, ?> onExtraCallback(Object obj) {
        return ((LazyStaggeredGridItemProviderImplExternalSyntheticLambda1) obj).onNavigationEvent();
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public Map<?, ?> IAuthTabCallback(Object obj) {
        return (LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj;
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public boolean onNavigationEvent(Object obj) {
        return !((LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj).onExtraCallback();
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public Object onTransact(Object obj) {
        ((LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj).onExtraCallbackWithResult();
        return obj;
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public Object onExtraCallbackWithResult(Object obj) {
        return LazyStaggeredGridItemProviderImplExternalSyntheticLambda0.onWarmupCompleted().onNavigationEvent();
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public Object IAuthTabCallback(Object obj, Object obj2) {
        return onExtraCallback(obj, obj2);
    }

    private static <K, V> LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> onExtraCallback(Object obj, Object obj2) {
        LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> lazyStaggeredGridItemProviderImplExternalSyntheticLambda0OnNavigationEvent = (LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj;
        LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> lazyStaggeredGridItemProviderImplExternalSyntheticLambda0 = (LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj2;
        if (!lazyStaggeredGridItemProviderImplExternalSyntheticLambda0.isEmpty()) {
            if (!lazyStaggeredGridItemProviderImplExternalSyntheticLambda0OnNavigationEvent.onExtraCallback()) {
                lazyStaggeredGridItemProviderImplExternalSyntheticLambda0OnNavigationEvent = lazyStaggeredGridItemProviderImplExternalSyntheticLambda0OnNavigationEvent.onNavigationEvent();
            }
            lazyStaggeredGridItemProviderImplExternalSyntheticLambda0OnNavigationEvent.onExtraCallbackWithResult((LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) lazyStaggeredGridItemProviderImplExternalSyntheticLambda0);
        }
        return lazyStaggeredGridItemProviderImplExternalSyntheticLambda0OnNavigationEvent;
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda3
    public int IAuthTabCallback(int i2, Object obj, Object obj2) {
        return onExtraCallbackWithResult(i2, obj, obj2);
    }

    private static <K, V> int onExtraCallbackWithResult(int i2, Object obj, Object obj2) {
        LazyStaggeredGridItemProviderImplExternalSyntheticLambda0 lazyStaggeredGridItemProviderImplExternalSyntheticLambda0 = (LazyStaggeredGridItemProviderImplExternalSyntheticLambda0) obj;
        LazyStaggeredGridItemProviderImplExternalSyntheticLambda1 lazyStaggeredGridItemProviderImplExternalSyntheticLambda1 = (LazyStaggeredGridItemProviderImplExternalSyntheticLambda1) obj2;
        int iOnExtraCallback = 0;
        if (lazyStaggeredGridItemProviderImplExternalSyntheticLambda0.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : lazyStaggeredGridItemProviderImplExternalSyntheticLambda0.entrySet()) {
            iOnExtraCallback += lazyStaggeredGridItemProviderImplExternalSyntheticLambda1.onExtraCallback(i2, entry.getKey(), entry.getValue());
        }
        return iOnExtraCallback;
    }
}
