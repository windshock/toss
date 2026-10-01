package o;

import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BrickModulesListExternalSyntheticLambda0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Spanned onNavigationEvent(String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 29;
            onNavigationEvent = i6 % 128;
            z = i6 % 2 != 0;
        }
        return onWarmupCompleted(str, z);
    }

    public static final Spanned onWarmupCompleted(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Spanned spannedOnWarmupCompleted = isExecuted.onWarmupCompleted(isExecuted.IAuthTabCallback, str, new Object[0], (Html.TagHandler) null, z, false, 20, (Object) null);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return spannedOnWarmupCompleted;
    }
}
