package o;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setShadowDrawable {
    void IAuthTabCallback(@NotNull View view);

    void IAuthTabCallback(@NotNull String str, @NotNull View view);

    default void IAuthTabCallback(boolean z, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    void onExtraCallback(@NotNull View view);

    void onExtraCallback(@NotNull String str, @NotNull View view);

    View onExtraCallbackWithResult(@NotNull Context context);

    void onExtraCallbackWithResult(@NotNull View view);

    default void onExtraCallbackWithResult(@Nullable String str, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    default void onExtraCallbackWithResult(@NotNull getKeyTemplate getkeytemplate, @NotNull View view) {
        Intrinsics.checkNotNullParameter(getkeytemplate, "");
        Intrinsics.checkNotNullParameter(view, "");
    }

    default void onWarmupCompleted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    default void onWarmupCompleted(@Nullable String str, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    default void onWarmupCompleted(@Nullable SavedStateConfiguration_androidKtExternalSyntheticLambda0 savedStateConfiguration_androidKtExternalSyntheticLambda0, @NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
    }
}
