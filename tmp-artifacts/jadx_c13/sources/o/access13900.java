package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access13900 {
    public static final <R, T> access13800<Unit> onExtraCallback(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        return new TombstoneProtosThread(access14200.onExtraCallbackWithResult(access14200.onNavigationEvent(function2, r, access13800Var)), access14100.onExtraCallback());
    }

    public static final <T> void onWarmupCompleted(@NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        access13800 access13800VarOnExtraCallbackWithResult = access14200.onExtraCallbackWithResult(access14200.onNavigationEvent(function1, access13800Var));
        Unit unit = Unit.INSTANCE;
        Result.Companion companion = Result.Companion;
        access13800VarOnExtraCallbackWithResult.resumeWith(Result.m31constructorimpl(unit));
    }

    public static final <R, T> void onWarmupCompleted(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        access13800 access13800VarOnExtraCallbackWithResult = access14200.onExtraCallbackWithResult(access14200.onNavigationEvent(function2, r, access13800Var));
        Unit unit = Unit.INSTANCE;
        Result.Companion companion = Result.Companion;
        access13800VarOnExtraCallbackWithResult.resumeWith(Result.m31constructorimpl(unit));
    }
}
