package o;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class N_ {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    @Deprecated
    public static final RecomposerawaitIdle2.onNavigationEvent onExtraCallback(@NotNull RecomposerawaitIdle2.onNavigationEvent onnavigationevent, int i) {
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationeventOnExtraCallbackWithResult = networkCount.onExtraCallbackWithResult(onnavigationevent, i);
            int i4 = 58 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            onnavigationeventOnExtraCallbackWithResult = networkCount.onExtraCallbackWithResult(onnavigationevent, i);
        }
        int i5 = onWarmupCompleted + 47;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationeventOnExtraCallbackWithResult;
    }
}
