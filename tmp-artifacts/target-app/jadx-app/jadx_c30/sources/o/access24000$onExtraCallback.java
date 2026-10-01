package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access24000$onExtraCallback<T, U> implements deserializeIntNullableCollection<T, serializeRaw<T>> {
    final deserializeIntNullableCollection<? super T, ? extends serializeRaw<U>> IAuthTabCallback;

    access24000$onExtraCallback(deserializeIntNullableCollection<? super T, ? extends serializeRaw<U>> deserializeintnullablecollection) {
        this.IAuthTabCallback = deserializeintnullablecollection;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public serializeRaw<T> apply(T t) throws Exception {
        return new access10300((serializeRaw) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallback.apply(t), "The itemDelay returned a null ObservableSource"), 1L).asInterface(doubleExponent.onNavigationEvent(t)).IAuthTabCallback(t);
    }
}
