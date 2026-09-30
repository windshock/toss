package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import java.io.IOException;
import o.PagerKtExternalSyntheticLambda6;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LazyStaggeredGridItemProviderImplExternalSyntheticLambda1<K, V> {
    private final IAuthTabCallback<K, V> IAuthTabCallback;

    public static class IAuthTabCallback<K, V> {
        public final PagerKtExternalSyntheticLambda6.onNavigationEvent IAuthTabCallback;
        public final V onExtraCallback;
        public final K onNavigationEvent;
        public final PagerKtExternalSyntheticLambda6.onNavigationEvent onWarmupCompleted;
    }

    static <K, V> void onWarmupCompleted(CodedOutputStream codedOutputStream, IAuthTabCallback<K, V> iAuthTabCallback, K k, V v) throws IOException {
        LazySaveableStateHolderExternalSyntheticLambda2.onNavigationEvent(codedOutputStream, iAuthTabCallback.IAuthTabCallback, 1, k);
        LazySaveableStateHolderExternalSyntheticLambda2.onNavigationEvent(codedOutputStream, iAuthTabCallback.onWarmupCompleted, 2, v);
    }

    static <K, V> int onWarmupCompleted(IAuthTabCallback<K, V> iAuthTabCallback, K k, V v) {
        return LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult(iAuthTabCallback.IAuthTabCallback, 1, k) + LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted, 2, v);
    }

    public int onExtraCallback(int i2, K k, V v) {
        return CodedOutputStream.asInterface(i2) + CodedOutputStream.IAuthTabCallback(onWarmupCompleted(this.IAuthTabCallback, k, v));
    }

    IAuthTabCallback<K, V> onNavigationEvent() {
        return this.IAuthTabCallback;
    }
}
