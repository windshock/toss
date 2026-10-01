package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getTriggeredContentAuthorities {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final float onWarmupCompleted(float f, @NotNull Context context) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            i = 5;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        return f + varyMatches.IAuthTabCallback(Integer.valueOf(i), context);
    }
}
