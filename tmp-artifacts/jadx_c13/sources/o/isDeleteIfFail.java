package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isDeleteIfFail {
    public static final isDeleteIfFail onExtraCallbackWithResult = new isDeleteIfFail();
    private static final ThreadLocal<CheckRequestBodyModelLocalChannel> onWarmupCompleted = setTwoItems.IAuthTabCallback(new djExternalSyntheticApiModelOutline0("ThreadLocalEventLoop"));

    private isDeleteIfFail() {
    }

    public final CheckRequestBodyModelLocalChannel IAuthTabCallback() {
        ThreadLocal<CheckRequestBodyModelLocalChannel> threadLocal = onWarmupCompleted;
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel = threadLocal.get();
        if (checkRequestBodyModelLocalChannel != null) {
            return checkRequestBodyModelLocalChannel;
        }
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannelOnWarmupCompleted = CheckRequestBodyModelProcessorParams.onWarmupCompleted();
        threadLocal.set(checkRequestBodyModelLocalChannelOnWarmupCompleted);
        return checkRequestBodyModelLocalChannelOnWarmupCompleted;
    }

    public final CheckRequestBodyModelLocalChannel onExtraCallback() {
        return onWarmupCompleted.get();
    }

    public final void onExtraCallbackWithResult() {
        onWarmupCompleted.set(null);
    }

    public final void onNavigationEvent(@NotNull CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel) {
        onWarmupCompleted.set(checkRequestBodyModelLocalChannel);
    }
}
