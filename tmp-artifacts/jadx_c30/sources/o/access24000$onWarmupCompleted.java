package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access24000$onWarmupCompleted<T, R, U> implements deserializeIntNullableCollection<T, serializeRaw<R>> {
    private final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> IAuthTabCallback;
    private final deserializeFloatNullableCollection<? super T, ? super U, ? extends R> onWarmupCompleted;

    access24000$onWarmupCompleted(deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection) {
        this.onWarmupCompleted = deserializefloatnullablecollection;
        this.IAuthTabCallback = deserializeintnullablecollection;
    }

    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public serializeRaw<R> apply(final T t) throws Exception {
        serializeRaw serializeraw = (serializeRaw) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallback.apply(t), "The mapper returned a null ObservableSource");
        final deserializeFloatNullableCollection<? super T, ? super U, ? extends R> deserializefloatnullablecollection = this.onWarmupCompleted;
        return new access24600(serializeraw, new deserializeIntNullableCollection<U, R>(deserializefloatnullablecollection, t) { // from class: o.access24000$onExtraCallbackWithResult
            private final deserializeFloatNullableCollection<? super T, ? super U, ? extends R> onExtraCallbackWithResult;
            private final T onWarmupCompleted;

            {
                this.onExtraCallbackWithResult = deserializefloatnullablecollection;
                this.onWarmupCompleted = t;
            }

            public R apply(U u) throws Exception {
                return (R) this.onExtraCallbackWithResult.apply(this.onWarmupCompleted, u);
            }
        });
    }
}
