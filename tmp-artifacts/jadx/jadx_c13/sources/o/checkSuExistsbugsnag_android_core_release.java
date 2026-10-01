package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class checkSuExistsbugsnag_android_core_release implements UpdatePackageStrategy<accessgetDelegatep> {
    static final CoroutineContext.onExtraCallback<checkSuExistsbugsnag_android_core_release> onNavigationEvent = new CoroutineContext.onExtraCallback<checkSuExistsbugsnag_android_core_release>() { // from class: o.checkSuExistsbugsnag_android_core_release.5
    };
    private final trimMetadataStringsTo IAuthTabCallback;

    checkSuExistsbugsnag_android_core_release(trimMetadataStringsTo trimmetadatastringsto) {
        this.IAuthTabCallback = trimmetadatastringsto;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.onExtraCallback<?> getKey() {
        return onNavigationEvent;
    }

    @Override // o.UpdatePackageStrategy
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public accessgetDelegatep onWarmupCompleted(CoroutineContext coroutineContext) {
        return this.IAuthTabCallback.onWarmupCompleted();
    }

    @Override // o.UpdatePackageStrategy
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(CoroutineContext coroutineContext, accessgetDelegatep accessgetdelegatep) {
        accessgetdelegatep.close();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.onNavigationEvent.onExtraCallback(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.onNavigationEvent.onExtraCallback(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.onExtraCallback<E> onextracallback) {
        return (E) CoroutineContext.Element.onNavigationEvent.onExtraCallback(this, onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.onExtraCallback<?> onextracallback) {
        return CoroutineContext.Element.onNavigationEvent.onNavigationEvent(this, onextracallback);
    }
}
