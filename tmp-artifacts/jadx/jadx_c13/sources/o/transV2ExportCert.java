package o;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface transV2ExportCert {
    View IAuthTabCallback(@NotNull Context context);

    void IAuthTabCallback(@NotNull View view);

    void IAuthTabCallback(@NotNull String str, @NotNull View view, @NotNull cancelExport cancelexport);

    void IAuthTabCallback(@Nullable getKeyC getkeyc, @NotNull View view);

    void onExtraCallback(@NotNull String str, @NotNull View view, @NotNull cancelExport cancelexport);

    void onExtraCallbackWithResult(float f, @NotNull View view);

    void onExtraCallbackWithResult(@NotNull View view);

    void onExtraCallbackWithResult(@NotNull View view, int i, int i2);

    void onExtraCallbackWithResult(@NotNull String str, @NotNull View view, @NotNull cancelExport cancelexport);

    default void onExtraCallbackWithResult(@NotNull List<getIvG> list, @NotNull View view) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(view, "");
    }

    void onExtraCallbackWithResult(boolean z, @NotNull View view);

    void onNavigationEvent(@NotNull View view);

    default void onNavigationEvent(@NotNull List<transV2AuthURLForQRCode> list, @NotNull View view) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(view, "");
    }

    void onWarmupCompleted(float f, @NotNull View view);

    void onWarmupCompleted(@NotNull View view);

    void onWarmupCompleted(@NotNull String str, @NotNull View view, @NotNull cancelExport cancelexport);
}
