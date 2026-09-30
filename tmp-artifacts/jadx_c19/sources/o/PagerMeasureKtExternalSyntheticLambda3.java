package o;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.LazyStaggeredGridItemProviderImplExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
interface PagerMeasureKtExternalSyntheticLambda3 {

    public enum onNavigationEvent {
        ASCENDING,
        DESCENDING
    }

    void IAuthTabCallback(int i2, int i3) throws IOException;

    void IAuthTabCallback(int i2, long j) throws IOException;

    void IAuthTabCallback(int i2, Object obj) throws IOException;

    void IAuthTabCallback(int i2, Object obj, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) throws IOException;

    void IAuthTabCallback(int i2, List<Double> list, boolean z) throws IOException;

    void IAuthTabCallbackDefault(int i2, List<Long> list, boolean z) throws IOException;

    void IAuthTabCallbackStub(int i2, List<Integer> list, boolean z) throws IOException;

    void IAuthTabCallbackStubProxy(int i2, List<Integer> list, boolean z) throws IOException;

    void access000(int i2, List<Integer> list, boolean z) throws IOException;

    void asBinder(int i2, int i3) throws IOException;

    void asBinder(int i2, List<Float> list, boolean z) throws IOException;

    void asInterface(int i2, List<Integer> list, boolean z) throws IOException;

    void getInterfaceDescriptor(int i2, List<Long> list, boolean z) throws IOException;

    onNavigationEvent onExtraCallback();

    void onExtraCallback(int i2, int i3) throws IOException;

    void onExtraCallback(int i2, long j) throws IOException;

    @Deprecated
    void onExtraCallback(int i2, Object obj, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) throws IOException;

    void onExtraCallback(int i2, List<LazyLayoutKtExternalSyntheticLambda3> list) throws IOException;

    void onExtraCallback(int i2, List<?> list, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) throws IOException;

    void onExtraCallback(int i2, List<Integer> list, boolean z) throws IOException;

    void onExtraCallback(int i2, LazyLayoutKtExternalSyntheticLambda3 lazyLayoutKtExternalSyntheticLambda3) throws IOException;

    @Deprecated
    void onExtraCallbackWithResult(int i2) throws IOException;

    void onExtraCallbackWithResult(int i2, float f) throws IOException;

    void onExtraCallbackWithResult(int i2, int i3) throws IOException;

    void onExtraCallbackWithResult(int i2, long j) throws IOException;

    void onExtraCallbackWithResult(int i2, List<String> list) throws IOException;

    void onExtraCallbackWithResult(int i2, List<Long> list, boolean z) throws IOException;

    void onNavigationEvent(int i2, int i3) throws IOException;

    void onNavigationEvent(int i2, long j) throws IOException;

    void onNavigationEvent(int i2, List<Boolean> list, boolean z) throws IOException;

    void onNavigationEvent(int i2, boolean z) throws IOException;

    void onTransact(int i2, List<Long> list, boolean z) throws IOException;

    @Deprecated
    void onWarmupCompleted(int i2) throws IOException;

    void onWarmupCompleted(int i2, double d) throws IOException;

    void onWarmupCompleted(int i2, int i3) throws IOException;

    void onWarmupCompleted(int i2, long j) throws IOException;

    void onWarmupCompleted(int i2, String str) throws IOException;

    @Deprecated
    void onWarmupCompleted(int i2, List<?> list, PagerDefaultsExternalSyntheticLambda0 pagerDefaultsExternalSyntheticLambda0) throws IOException;

    void onWarmupCompleted(int i2, List<Integer> list, boolean z) throws IOException;

    <K, V> void onWarmupCompleted(int i2, LazyStaggeredGridItemProviderImplExternalSyntheticLambda1.IAuthTabCallback<K, V> iAuthTabCallback, Map<K, V> map) throws IOException;

    void writeTypedObject(int i2, List<Long> list, boolean z) throws IOException;
}
