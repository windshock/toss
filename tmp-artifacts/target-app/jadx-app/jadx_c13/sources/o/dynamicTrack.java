package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class dynamicTrack {
    public static final JsonElement onExtraCallbackWithResult(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        return pangleEncryptManager.onExtraCallbackWithResult(str, initRenderFinish.onWarmupCompleted(bool));
    }

    public static final JsonElement onNavigationEvent(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        return pangleEncryptManager.onExtraCallbackWithResult(str, initRenderFinish.IAuthTabCallback(number));
    }

    public static final JsonElement onExtraCallback(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        return pangleEncryptManager.onExtraCallbackWithResult(str, initRenderFinish.onNavigationEvent(str2));
    }

    public static final JsonElement onExtraCallback(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @Nullable Void r2) {
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        return pangleEncryptManager.onExtraCallbackWithResult(str, JsonNull.INSTANCE);
    }

    public static final boolean onWarmupCompleted(@NotNull xkz2 xkz2Var, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(xkz2Var, "");
        return xkz2Var.onWarmupCompleted(initRenderFinish.onWarmupCompleted(bool));
    }

    public static final boolean onExtraCallback(@NotNull xkz2 xkz2Var, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(xkz2Var, "");
        return xkz2Var.onWarmupCompleted(initRenderFinish.IAuthTabCallback(number));
    }

    public static final boolean onWarmupCompleted(@NotNull xkz2 xkz2Var, @Nullable String str) {
        Intrinsics.checkNotNullParameter(xkz2Var, "");
        return xkz2Var.onWarmupCompleted(initRenderFinish.onNavigationEvent(str));
    }

    public static final JsonElement IAuthTabCallback(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @NotNull Function1<? super PangleEncryptManager, Unit> function1) {
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        PangleEncryptManager pangleEncryptManager2 = new PangleEncryptManager();
        function1.invoke(pangleEncryptManager2);
        return pangleEncryptManager.onExtraCallbackWithResult(str, pangleEncryptManager2.onExtraCallbackWithResult());
    }

    public static final JsonElement onExtraCallback(@NotNull PangleEncryptManager pangleEncryptManager, @NotNull String str, @NotNull Function1<? super xkz2, Unit> function1) {
        Intrinsics.checkNotNullParameter(pangleEncryptManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        xkz2 xkz2Var = new xkz2();
        function1.invoke(xkz2Var);
        return pangleEncryptManager.onExtraCallbackWithResult(str, xkz2Var.onNavigationEvent());
    }
}
