package o;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getFlexWrap {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(ListenableFuture listenableFuture, Throwable th) {
        listenableFuture.cancel(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable onExtraCallback(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(getFlexDirection getflexdirection, GeckoHubImp1 geckoHubImp1, Throwable th) {
        if (th == null) {
            getflexdirection.IAuthTabCallback(geckoHubImp1.IAuthTabCallback());
        } else {
            getflexdirection.onNavigationEvent(th);
        }
        return Unit.INSTANCE;
    }

    public static final <T> Object onExtraCallback(@NotNull ListenableFuture<T> listenableFuture, @NotNull access13800<? super T> access13800Var) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return Uninterruptibles.getUninterruptibly(listenableFuture);
            }
            setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
            setresourceinternal.onTransact();
            listenableFuture.addListener(new getFlexLines(listenableFuture, setresourceinternal), MoreExecutors.directExecutor());
            setresourceinternal.IAuthTabCallback(new IAuthTabCallback(listenableFuture));
            Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
            if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
                access14600.IAuthTabCallback(access13800Var);
            }
            return objIAuthTabCallbackDefault;
        } catch (ExecutionException e) {
            throw onExtraCallback(e);
        }
    }

    static final class IAuthTabCallback implements Function1<Throwable, Unit> {
        final /* synthetic */ ListenableFuture<T> onExtraCallback;

        IAuthTabCallback(ListenableFuture<T> listenableFuture) {
            this.onExtraCallback = listenableFuture;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onNavigationEvent((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void onNavigationEvent(Throwable th) {
            this.onExtraCallback.cancel(false);
        }
    }
}
