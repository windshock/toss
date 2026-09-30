package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface getAppStack {
    boolean onExtraCallback(@NotNull String str);

    boolean onExtraCallbackWithResult(@NotNull String str);

    default boolean IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        return onExtraCallback(str) || onExtraCallbackWithResult(str);
    }
}
