package o;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getFlexLinesInternal {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CompletableFuture completableFuture, GeckoHubImp1 geckoHubImp1, Throwable th) {
        try {
            completableFuture.complete(geckoHubImp1.IAuthTabCallback());
        } catch (Throwable th2) {
            completableFuture.completeExceptionally(th2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CompletableFuture completableFuture, Throwable th) {
        if (th == null) {
            completableFuture.complete(Unit.INSTANCE);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Function2 function2, Object obj, Throwable th) {
        return (Unit) function2.invoke(obj, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallback(Function2 function2, Object obj, Throwable th) {
        return function2.invoke(obj, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallbackWithResult(pauseMyRequest pausemyrequest, Object obj, Throwable th) {
        boolean zOnExtraCallback;
        Throwable cause;
        try {
            if (th == null) {
                zOnExtraCallback = pausemyrequest.IAuthTabCallback(obj);
            } else {
                CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                zOnExtraCallback = pausemyrequest.onExtraCallback(th);
            }
            return Boolean.valueOf(zOnExtraCallback);
        } catch (Throwable th2) {
            inst.onNavigationEvent(access13600.IAuthTabCallback, th2);
            return Unit.INSTANCE;
        }
    }
}
