package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class buildTextNodeList<T> extends JsonReaderUnknownNumberParsing<T> implements Callable<T> {
    final Callable<? extends T> onWarmupCompleted;

    public buildTextNodeList(Callable<? extends T> callable) {
        this.onWarmupCompleted = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        addLogs addlogs = new addLogs(ycxexternalsyntheticlambda0);
        ycxexternalsyntheticlambda0.onExtraCallback(addlogs);
        try {
            addlogs.IAuthTabCallback(floatExponent.onExtraCallbackWithResult((Object) this.onWarmupCompleted.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            if (addlogs.onWarmupCompleted()) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                ycxexternalsyntheticlambda0.onWarmupCompleted(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) floatExponent.onExtraCallbackWithResult((Object) this.onWarmupCompleted.call(), "The callable returned a null value");
    }
}
