package o;

import java.util.List;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class LazyStaggeredGridDslKtExternalSyntheticLambda3 implements LazyStaggeredGridIntervalContentExternalSyntheticLambda0 {
    LazyStaggeredGridDslKtExternalSyntheticLambda3() {
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda0
    public <L> List<L> onExtraCallbackWithResult(Object obj, long j) {
        LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder asbinderOnExtraCallback = onExtraCallback(obj, j);
        if (asbinderOnExtraCallback.onExtraCallbackWithResult()) {
            return asbinderOnExtraCallback;
        }
        int size = asbinderOnExtraCallback.size();
        LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder asbinderOnNavigationEvent = asbinderOnExtraCallback.onNavigationEvent(size == 0 ? 10 : size << 1);
        PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, j, asbinderOnNavigationEvent);
        return asbinderOnNavigationEvent;
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda0
    public void IAuthTabCallback(Object obj, long j) {
        onExtraCallback(obj, j).onNavigationEvent();
    }

    @Override // o.LazyStaggeredGridIntervalContentExternalSyntheticLambda0
    public <E> void onNavigationEvent(Object obj, Object obj2, long j) {
        LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder asbinderOnExtraCallback = onExtraCallback(obj, j);
        LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder asbinderOnExtraCallback2 = onExtraCallback(obj2, j);
        int size = asbinderOnExtraCallback.size();
        int size2 = asbinderOnExtraCallback2.size();
        if (size > 0 && size2 > 0) {
            if (!asbinderOnExtraCallback.onExtraCallbackWithResult()) {
                asbinderOnExtraCallback = asbinderOnExtraCallback.onNavigationEvent(size2 + size);
            }
            asbinderOnExtraCallback.addAll(asbinderOnExtraCallback2);
        }
        if (size > 0) {
            asbinderOnExtraCallback2 = asbinderOnExtraCallback;
        }
        PagerKtExternalSyntheticLambda5.onExtraCallbackWithResult(obj, j, asbinderOnExtraCallback2);
    }

    static <E> LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder<E> onExtraCallback(Object obj, long j) {
        return (LazySaveableStateHolderKtExternalSyntheticLambda1.asBinder) PagerKtExternalSyntheticLambda5.asBinder(obj, j);
    }
}
