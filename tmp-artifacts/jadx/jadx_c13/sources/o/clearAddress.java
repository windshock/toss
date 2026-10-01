package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearAddress<T> extends writeRaw<T> {
    final deserializeIp<T> onExtraCallback;

    public clearAddress(deserializeIp<T> deserializeip) {
        this.onExtraCallback = deserializeip;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onExtraCallback.IAuthTabCallback(deserializeipnullablecollection);
    }
}
