package o;

import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class InterceptorModel {
    public static final <T> Object onNavigationEvent(@NotNull Object obj) {
        Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(obj);
        return thM32exceptionOrNullimpl == null ? obj : new ILoader(thM32exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object onWarmupCompleted(@NotNull Object obj, @NotNull maybeRemoveAttachStateListener<?> mayberemoveattachstatelistener) {
        Throwable thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(obj);
        return thM32exceptionOrNullimpl == null ? obj : new ILoader(thM32exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> Object onExtraCallbackWithResult(@Nullable Object obj, @NotNull access13800<? super T> access13800Var) {
        if (obj instanceof ILoader) {
            Result.Companion companion = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(((ILoader) obj).IAuthTabCallback));
        }
        Result.Companion companion2 = Result.Companion;
        return Result.m31constructorimpl(obj);
    }
}
