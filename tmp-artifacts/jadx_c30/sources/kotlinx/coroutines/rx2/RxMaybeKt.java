package kotlinx.coroutines.rx2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import o.ComponentModelb;
import o.StatisticData;
import o.access13800;
import o.advance;
import o.enlargeOrFlush;
import o.findResAndMsg;
import o.flushed;
import o.getPackageType;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RxMaybeKt {
    public static final <T> advance<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        if (coroutineContext.get(getPackageType.onNavigationEvent) != null) {
            throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
        }
        return onWarmupCompleted(ComponentModelb.onExtraCallback, coroutineContext, function2);
    }

    private static final <T> advance<T> onWarmupCompleted(final findResAndMsg findresandmsg, final CoroutineContext coroutineContext, final Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        return advance.onWarmupCompleted(new enlargeOrFlush() { // from class: kotlinx.coroutines.rx2.RxMaybeKt$$ExternalSyntheticLambda0
            public final void subscribe(flushed flushedVar) {
                RxMaybeKt.onWarmupCompleted(findresandmsg, coroutineContext, function2, flushedVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(findResAndMsg findresandmsg, CoroutineContext coroutineContext, Function2 function2, flushed flushedVar) {
        RxMaybeCoroutine rxMaybeCoroutine = new RxMaybeCoroutine(StatisticData.IAuthTabCallback(findresandmsg, coroutineContext), flushedVar);
        flushedVar.IAuthTabCallback(new RxCancellable(rxMaybeCoroutine));
        rxMaybeCoroutine.onExtraCallback(setRandomHost.DEFAULT, rxMaybeCoroutine, function2);
    }
}
