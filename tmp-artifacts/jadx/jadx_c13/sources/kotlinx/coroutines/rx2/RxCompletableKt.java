package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import o.ComponentModelb;
import o.JsonReaderEmptyEOFException;
import o.StatisticData;
import o.access13600;
import o.access13800;
import o.fillInStackTrace;
import o.findResAndMsg;
import o.getPackageType;
import o.setRandomHost;
import o.wasLastName;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxCompletableKt {
    public static /* synthetic */ wasLastName onExtraCallback(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        return onExtraCallback(coroutineContext, function2);
    }

    public static final wasLastName onExtraCallback(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(getPackageType.onNavigationEvent) != null) {
            throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
        }
        return onExtraCallbackWithResult(ComponentModelb.onExtraCallback, coroutineContext, function2);
    }

    private static final wasLastName onExtraCallbackWithResult(final findResAndMsg findresandmsg, final CoroutineContext coroutineContext, final Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object> function2) {
        return wasLastName.onExtraCallbackWithResult(new fillInStackTrace() { // from class: kotlinx.coroutines.rx2.RxCompletableKt$$ExternalSyntheticLambda0
            @Override // o.fillInStackTrace
            public final void subscribe(JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
                RxCompletableKt.onNavigationEvent(findresandmsg, coroutineContext, function2, jsonReaderEmptyEOFException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(findResAndMsg findresandmsg, CoroutineContext coroutineContext, Function2 function2, JsonReaderEmptyEOFException jsonReaderEmptyEOFException) {
        RxCompletableCoroutine rxCompletableCoroutine = new RxCompletableCoroutine(StatisticData.IAuthTabCallback(findresandmsg, coroutineContext), jsonReaderEmptyEOFException);
        jsonReaderEmptyEOFException.IAuthTabCallback(new RxCancellable(rxCompletableCoroutine));
        rxCompletableCoroutine.onExtraCallback(setRandomHost.DEFAULT, (setRandomHost) rxCompletableCoroutine, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
    }
}
