package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import o.ComponentModelb;
import o.StatisticData;
import o.access13600;
import o.access13800;
import o.findResAndMsg;
import o.getByteBuffer;
import o.getPackageType;
import o.ok;
import o.serializeObject;
import o.setRandomHost;
import o.writeBinary;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RxObservableKt {
    public static /* synthetic */ getByteBuffer onExtraCallbackWithResult(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        return IAuthTabCallback(coroutineContext, function2);
    }

    public static final <T> getByteBuffer<T> IAuthTabCallback(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(getPackageType.onNavigationEvent) != null) {
            throw new IllegalArgumentException(("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
        }
        return IAuthTabCallback(ComponentModelb.onExtraCallback, coroutineContext, function2);
    }

    private static final <T> getByteBuffer<T> IAuthTabCallback(final findResAndMsg findresandmsg, final CoroutineContext coroutineContext, final Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2) {
        return getByteBuffer.IAuthTabCallback(new serializeObject() { // from class: kotlinx.coroutines.rx2.RxObservableKt$$ExternalSyntheticLambda0
            public final void subscribe(writeBinary writebinary) {
                RxObservableKt.onWarmupCompleted(findresandmsg, coroutineContext, function2, writebinary);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(findResAndMsg findresandmsg, CoroutineContext coroutineContext, Function2 function2, writeBinary writebinary) {
        RxObservableCoroutine rxObservableCoroutine = new RxObservableCoroutine(StatisticData.IAuthTabCallback(findresandmsg, coroutineContext), writebinary);
        writebinary.onWarmupCompleted(new RxCancellable(rxObservableCoroutine));
        rxObservableCoroutine.onExtraCallback(setRandomHost.DEFAULT, rxObservableCoroutine, function2);
    }
}
