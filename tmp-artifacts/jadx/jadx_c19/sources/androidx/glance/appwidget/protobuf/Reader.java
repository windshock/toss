package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.LazyLayoutKtExternalSyntheticLambda3;
import o.LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2;
import o.LazyStaggeredGridItemProviderImplExternalSyntheticLambda1;
import o.PagerDefaultsExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface Reader {
    double IAuthTabCallback() throws IOException;

    <T> void IAuthTabCallback(T t, PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    void IAuthTabCallback(List<Integer> list) throws IOException;

    int IAuthTabCallbackDefault() throws IOException;

    void IAuthTabCallbackDefault(List<Integer> list) throws IOException;

    int IAuthTabCallbackStub() throws IOException;

    void IAuthTabCallbackStub(List<Float> list) throws IOException;

    int IAuthTabCallbackStubProxy() throws IOException;

    void IAuthTabCallbackStubProxy(List<Long> list) throws IOException;

    long IAuthTabCallback_Parcel() throws IOException;

    void IAuthTabCallback_Parcel(List<Long> list) throws IOException;

    String ICustomTabsCallback() throws IOException;

    long access000() throws IOException;

    void access000(List<Integer> list) throws IOException;

    int access100() throws IOException;

    void access100(List<String> list) throws IOException;

    long asBinder() throws IOException;

    void asBinder(List<Long> list) throws IOException;

    float asInterface() throws IOException;

    void asInterface(List<Integer> list) throws IOException;

    int extraCallback() throws IOException;

    void extraCallback(List<Long> list) throws IOException;

    String extraCallbackWithResult() throws IOException;

    void extraCallbackWithResult(List<Integer> list) throws IOException;

    long getInterfaceDescriptor() throws IOException;

    void getInterfaceDescriptor(List<String> list) throws IOException;

    <T> T onExtraCallback(Class<T> cls, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    void onExtraCallback(List<Integer> list) throws IOException;

    <K, V> void onExtraCallback(Map<K, V> map, LazyStaggeredGridItemProviderImplExternalSyntheticLambda1.IAuthTabCallback<K, V> iAuthTabCallback, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    boolean onExtraCallback() throws IOException;

    int onExtraCallbackWithResult();

    @Deprecated
    <T> T onExtraCallbackWithResult(Class<T> cls, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    <T> void onExtraCallbackWithResult(T t, PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    void onExtraCallbackWithResult(List<LazyLayoutKtExternalSyntheticLambda3> list) throws IOException;

    @Deprecated
    <T> void onExtraCallbackWithResult(List<T> list, PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    LazyLayoutKtExternalSyntheticLambda3 onNavigationEvent() throws IOException;

    void onNavigationEvent(List<Boolean> list) throws IOException;

    <T> void onNavigationEvent(List<T> list, PagerDefaultsExternalSyntheticLambda0<T> pagerDefaultsExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

    int onTransact() throws IOException;

    void onTransact(List<Long> list) throws IOException;

    int onWarmupCompleted() throws IOException;

    void onWarmupCompleted(List<Double> list) throws IOException;

    boolean readTypedObject() throws IOException;

    long writeTypedObject() throws IOException;
}
