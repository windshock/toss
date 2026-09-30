package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtos1<T> extends JsonReaderUnknownNumberParsing<T> implements parseNegativeNumber<T> {
    private final T onNavigationEvent;

    public TombstoneProtos1(T t) {
        this.onNavigationEvent = t;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        ycxexternalsyntheticlambda0.onExtraCallback(new removeLogs(ycxexternalsyntheticlambda0, this.onNavigationEvent));
    }

    @Override // o.parseNegativeNumber, java.util.concurrent.Callable
    public T call() {
        return this.onNavigationEvent;
    }
}
