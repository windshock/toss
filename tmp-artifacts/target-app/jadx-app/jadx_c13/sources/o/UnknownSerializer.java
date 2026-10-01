package o;

import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UnknownSerializer<T> extends JsonReaderUnknownNumberParsing<T> {
    final Callable<? extends Throwable> onWarmupCompleted;

    public UnknownSerializer(Callable<? extends Throwable> callable) {
        this.onWarmupCompleted = callable;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        try {
            th = (Throwable) floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            NumberConverter.onWarmupCompleted(th);
        }
        access25900.error(th, ycxexternalsyntheticlambda0);
    }
}
