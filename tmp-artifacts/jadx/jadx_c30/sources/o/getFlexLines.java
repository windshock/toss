package o;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import o.maybeRemoveAttachStateListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class getFlexLines<T> implements Runnable {
    private final ListenableFuture<T> onExtraCallback;
    private final maybeRemoveAttachStateListener<T> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public getFlexLines(@NotNull ListenableFuture<T> listenableFuture, @NotNull maybeRemoveAttachStateListener<? super T> mayberemoveattachstatelistener) {
        this.onExtraCallback = listenableFuture;
        this.onWarmupCompleted = mayberemoveattachstatelistener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.onExtraCallback.isCancelled()) {
            maybeRemoveAttachStateListener.onWarmupCompleted.IAuthTabCallback(this.onWarmupCompleted, (Throwable) null, 1, (Object) null);
            return;
        }
        try {
            maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener = this.onWarmupCompleted;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Uninterruptibles.getUninterruptibly(this.onExtraCallback)));
        } catch (ExecutionException e) {
            maybeRemoveAttachStateListener<T> mayberemoveattachstatelistener2 = this.onWarmupCompleted;
            Result.Companion companion2 = Result.Companion;
            mayberemoveattachstatelistener2.resumeWith(Result.constructor-impl(ResultKt.createFailure(getFlexWrap.onExtraCallback(e))));
        }
    }
}
