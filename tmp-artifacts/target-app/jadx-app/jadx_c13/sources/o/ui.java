package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ui {
    private static final String IAuthTabCallback;
    private static final StackTraceElement onNavigationEvent = new onExtraCallback().onExtraCallback();
    private static final String onWarmupCompleted;

    public static final <E extends Throwable> E onExtraCallback(@NotNull E e) {
        return e;
    }

    static {
        Object objM31constructorimpl;
        Object objM31constructorimpl2;
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
            objM31constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        onWarmupCompleted = (String) objM31constructorimpl;
        try {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl2 = Result.m31constructorimpl(ui.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM31constructorimpl2 = Result.m31constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m32exceptionOrNullimpl(objM31constructorimpl2) != null) {
            objM31constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        IAuthTabCallback = (String) objM31constructorimpl2;
    }
}
