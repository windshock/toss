package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setLoop {
    public static final <T> void onNavigationEvent(@NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) throws Throwable {
        try {
            access13800 access13800VarOnExtraCallbackWithResult = access14200.onExtraCallbackWithResult(access14200.onNavigationEvent(function1, access13800Var));
            Result.Companion companion = Result.Companion;
            setMaxLine.onNavigationEvent(access13800VarOnExtraCallbackWithResult, Result.m31constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            onExtraCallbackWithResult(access13800Var, th);
        }
    }

    public static final <R, T> void onExtraCallbackWithResult(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        try {
            access13800 access13800VarOnExtraCallbackWithResult = access14200.onExtraCallbackWithResult(access14200.onNavigationEvent(function2, r, access13800Var));
            Result.Companion companion = Result.Companion;
            setMaxLine.onNavigationEvent(access13800VarOnExtraCallbackWithResult, Result.m31constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            onExtraCallbackWithResult(access13800Var, th);
        }
    }

    public static final void onExtraCallback(@NotNull access13800<? super Unit> access13800Var, @NotNull access13800<?> access13800Var2) throws Throwable {
        try {
            access13800 access13800VarOnExtraCallbackWithResult = access14200.onExtraCallbackWithResult(access13800Var);
            Result.Companion companion = Result.Companion;
            setMaxLine.onNavigationEvent(access13800VarOnExtraCallbackWithResult, Result.m31constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            onExtraCallbackWithResult(access13800Var2, th);
        }
    }

    private static final void onExtraCallbackWithResult(access13800<?> access13800Var, Throwable th) throws Throwable {
        if (th instanceof DefaultLogger) {
            th = ((DefaultLogger) th).getCause();
        }
        Result.Companion companion = Result.Companion;
        access13800Var.resumeWith(Result.m31constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }
}
