package kotlinx.coroutines.rx2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import o.ComponentModelb;
import o.JsonWriterWriteObject;
import o.NetConverter;
import o.StatisticData;
import o.access13600;
import o.access13800;
import o.deserializeFloatArray;
import o.findResAndMsg;
import o.getPackageType;
import o.setRandomHost;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxSingleKt {
    public static /* synthetic */ writeRaw IAuthTabCallback(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        return IAuthTabCallback(coroutineContext, function2);
    }

    public static final <T> writeRaw<T> IAuthTabCallback(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        if (coroutineContext.get(getPackageType.onNavigationEvent) != null) {
            throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
        }
        return onNavigationEvent(ComponentModelb.onExtraCallback, coroutineContext, function2);
    }

    private static final <T> writeRaw<T> onNavigationEvent(final findResAndMsg findresandmsg, final CoroutineContext coroutineContext, final Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        return writeRaw.onNavigationEvent(new NetConverter() { // from class: kotlinx.coroutines.rx2.RxSingleKt$$ExternalSyntheticLambda0
            @Override // o.NetConverter
            public final void subscribe(JsonWriterWriteObject jsonWriterWriteObject) {
                RxSingleKt.onWarmupCompleted(findresandmsg, coroutineContext, function2, jsonWriterWriteObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(findResAndMsg findresandmsg, CoroutineContext coroutineContext, Function2 function2, JsonWriterWriteObject jsonWriterWriteObject) {
        RxSingleCoroutine rxSingleCoroutine = new RxSingleCoroutine(StatisticData.IAuthTabCallback(findresandmsg, coroutineContext), jsonWriterWriteObject);
        jsonWriterWriteObject.onNavigationEvent((deserializeFloatArray) new RxCancellable(rxSingleCoroutine));
        rxSingleCoroutine.onExtraCallback(setRandomHost.DEFAULT, (setRandomHost) rxSingleCoroutine, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
    }
}
