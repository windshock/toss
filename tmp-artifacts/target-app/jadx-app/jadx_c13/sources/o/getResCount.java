package o;

import kotlin.Result;
import kotlin.ResultKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getResCount {
    public static final String onExtraCallbackWithResult(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String onExtraCallback(@NotNull access13800<?> access13800Var) {
        Object objM31constructorimpl;
        if (access13800Var instanceof setFlexWrap) {
            return ((setFlexWrap) access13800Var).toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(access13800Var + '@' + onExtraCallbackWithResult(access13800Var));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m32exceptionOrNullimpl(objM31constructorimpl) != null) {
            objM31constructorimpl = access13800Var.getClass().getName() + '@' + onExtraCallbackWithResult(access13800Var);
        }
        return (String) objM31constructorimpl;
    }

    public static final String IAuthTabCallback(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }
}
