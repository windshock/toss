package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class shouldIgnore {
    public static final int[] onExtraCallbackWithResult(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static final boolean IAuthTabCallback(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return !view.isAttachedToWindow();
    }
}
