package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicReference;
import o.deserializeIpNullableCollection;
import o.deserializeNumber;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResumeSingleObserver<T> implements deserializeIpNullableCollection<T> {
    final AtomicReference<deserializeUriNullableCollection> onExtraCallbackWithResult;
    final deserializeIpNullableCollection<? super T> onNavigationEvent;

    public ResumeSingleObserver(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onExtraCallbackWithResult = atomicReference;
        this.onNavigationEvent = deserializeipnullablecollection;
    }

    @Override // o.deserializeIpNullableCollection
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.replace(this.onExtraCallbackWithResult, deserializeurinullablecollection);
    }

    @Override // o.deserializeIpNullableCollection
    public void onNavigationEvent(T t) {
        this.onNavigationEvent.onNavigationEvent(t);
    }

    @Override // o.deserializeIpNullableCollection
    public void onExtraCallbackWithResult(Throwable th) {
        this.onNavigationEvent.onExtraCallbackWithResult(th);
    }
}
