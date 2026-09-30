package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onVisit {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final String IAuthTabCallback(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return simpleName;
    }
}
