package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class onLoadCleared {
    public static /* synthetic */ Object onExtraCallback(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        return maybeUpdateAnimatable.onWarmupCompleted(coroutineContext, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T onNavigationEvent(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) throws InterruptedException {
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannelOnExtraCallback;
        CoroutineContext coroutineContextIAuthTabCallback;
        Thread threadCurrentThread = Thread.currentThread();
        access13700 access13700Var = (access13700) coroutineContext.get(access13700.onWarmupCompleted);
        if (access13700Var == null) {
            checkRequestBodyModelLocalChannelOnExtraCallback = isDeleteIfFail.onExtraCallbackWithResult.IAuthTabCallback();
            coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(ComponentModelb.onExtraCallback, coroutineContext.plus(checkRequestBodyModelLocalChannelOnExtraCallback));
        } else {
            CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel = access13700Var instanceof CheckRequestBodyModelLocalChannel ? (CheckRequestBodyModelLocalChannel) access13700Var : null;
            if (checkRequestBodyModelLocalChannel == null) {
                checkRequestBodyModelLocalChannelOnExtraCallback = isDeleteIfFail.onExtraCallbackWithResult.onExtraCallback();
                coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(ComponentModelb.onExtraCallback, coroutineContext);
            } else {
                CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel2 = checkRequestBodyModelLocalChannel.onTransact() ? checkRequestBodyModelLocalChannel : null;
                if (checkRequestBodyModelLocalChannel2 != null) {
                    checkRequestBodyModelLocalChannelOnExtraCallback = checkRequestBodyModelLocalChannel2;
                }
                coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(ComponentModelb.onExtraCallback, coroutineContext);
            }
        }
        RequestOptions requestOptions = new RequestOptions(coroutineContextIAuthTabCallback, threadCurrentThread, checkRequestBodyModelLocalChannelOnExtraCallback);
        requestOptions.onExtraCallback(setRandomHost.DEFAULT, (setRandomHost) requestOptions, (Function2<? super setRandomHost, ? super access13800<? super T>, ? extends Object>) function2);
        return (T) requestOptions.IAuthTabCallback();
    }
}
