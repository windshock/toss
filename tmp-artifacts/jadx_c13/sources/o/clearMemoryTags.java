package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearMemoryTags<T> extends ObjectConverter2<T, T> {
    final deserializeIntNullableCollection<? super Throwable, ? extends T> onWarmupCompleted;

    public clearMemoryTags(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onWarmupCompleted = deserializeintnullablecollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onNavigationEvent(ycxexternalsyntheticlambda0, this.onWarmupCompleted));
    }

    static final class onNavigationEvent<T> extends access25800<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final deserializeIntNullableCollection<? super Throwable, ? extends T> valueSupplier;

        onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection) {
            super(ycxexternalsyntheticlambda0);
            this.valueSupplier = deserializeintnullablecollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            this.produced++;
            this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) t);
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            try {
                onExtraCallbackWithResult(floatExponent.onExtraCallbackWithResult((Object) this.valueSupplier.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.downstream.onWarmupCompleted((Throwable) new deserializeDecimal(th, th2));
            }
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            this.downstream.onExtraCallbackWithResult();
        }
    }
}
