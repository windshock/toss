package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearAllocationTid<T> extends writeRaw<T> {
    final T onExtraCallbackWithResult;

    public clearAllocationTid(T t) {
        this.onExtraCallbackWithResult = t;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        deserializeipnullablecollection.IAuthTabCallback(bigDecimalOrDouble.onExtraCallback());
        deserializeipnullablecollection.onNavigationEvent(this.onExtraCallbackWithResult);
    }
}
