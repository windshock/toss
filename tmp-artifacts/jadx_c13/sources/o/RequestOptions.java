package o;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RequestOptions<T> extends RequestCoordinator<T> {
    private final CheckRequestBodyModelLocalChannel onExtraCallback;
    private final Thread onWarmupCompleted;

    @Override // o.setFullPackage
    protected boolean onExtraCallbackWithResult() {
        return true;
    }

    public RequestOptions(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel) {
        super(coroutineContext, true, true);
        this.onWarmupCompleted = thread;
        this.onExtraCallback = checkRequestBodyModelLocalChannel;
    }

    @Override // o.setFullPackage
    protected void b_(@Nullable Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.onWarmupCompleted)) {
            return;
        }
        Thread thread = this.onWarmupCompleted;
        if (ResourceEncoderRegistryEntry.IAuthTabCallback != null) {
            return;
        }
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T IAuthTabCallback() throws Throwable {
        CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel = this.onExtraCallback;
        if (checkRequestBodyModelLocalChannel != null) {
            CheckRequestBodyModelLocalChannel.onNavigationEvent(checkRequestBodyModelLocalChannel, false, 1, null);
        }
        while (true) {
            try {
                CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel2 = this.onExtraCallback;
                long jAsBinder = checkRequestBodyModelLocalChannel2 != null ? checkRequestBodyModelLocalChannel2.asBinder() : LongCompanionObject.MAX_VALUE;
                if (IAuthTabCallbackStubProxy()) {
                    break;
                }
                if (ResourceEncoderRegistryEntry.IAuthTabCallback == null) {
                    LockSupport.parkNanos(this, jAsBinder);
                }
                if (Thread.interrupted()) {
                    onWarmupCompleted((Throwable) new InterruptedException());
                }
            } finally {
                CheckRequestBodyModelLocalChannel checkRequestBodyModelLocalChannel3 = this.onExtraCallback;
                if (checkRequestBodyModelLocalChannel3 != null) {
                    CheckRequestBodyModelLocalChannel.onExtraCallbackWithResult(checkRequestBodyModelLocalChannel3, false, 1, null);
                }
            }
        }
        T t = (T) setChannelIndex.IAuthTabCallback(cq_());
        iLoader = t instanceof ILoader ? (ILoader) t : null;
        if (iLoader == null) {
            return t;
        }
        throw iLoader.IAuthTabCallback;
    }
}
