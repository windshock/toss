package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import o.ComponentModelb;
import o.IAnimation;
import o.JsonReaderUnknownNumberParsing;
import o.access13600;
import o.access13800;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.serializeRaw;
import o.setRandomHost;
import o.writeBinary;
import o.ycxycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RxConvertKt {
    public static final <T> IAnimation<T> IAuthTabCallback(@NotNull serializeRaw<T> serializeraw) {
        return ycxycx.onNavigationEvent(new RxConvertKt$asFlow$1(serializeraw, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(CoroutineContext coroutineContext, IAnimation iAnimation, writeBinary writebinary) {
        writebinary.onWarmupCompleted(new RxCancellable(maybeUpdateAnimatable.onWarmupCompleted(ComponentModelb.onExtraCallback, putChannelInfo.onExtraCallbackWithResult().plus(coroutineContext), setRandomHost.ATOMIC, (Function2<? super findResAndMsg, ? super access13800<? super Unit>, ? extends Object>) new asObservable.1.job.1(iAnimation, writebinary, (access13800) null))));
    }

    public static /* synthetic */ JsonReaderUnknownNumberParsing IAuthTabCallback(IAnimation iAnimation, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        return onExtraCallbackWithResult(iAnimation, coroutineContext);
    }

    public static final <T> JsonReaderUnknownNumberParsing<T> onExtraCallbackWithResult(@NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext) {
        return JsonReaderUnknownNumberParsing.onExtraCallbackWithResult(ReactiveFlowKt.onExtraCallback(iAnimation, coroutineContext));
    }
}
