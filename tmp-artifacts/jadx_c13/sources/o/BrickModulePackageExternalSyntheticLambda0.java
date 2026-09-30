package o;

import android.app.Activity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BrickModulePackageExternalSyntheticLambda0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ void onExtraCallbackWithResult(TdsToastV1.onNavigationEvent onnavigationevent, int i, Integer num, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 123;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        if (i5 % 2 != 0 ? (i3 & 1) != 0 : (i3 & 1) != 0) {
            int i7 = i6 + 55;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 100;
        }
        if ((i3 & 2) != 0) {
            num = null;
        }
        if ((i3 & 4) != 0) {
            int i9 = onExtraCallback + 81;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            i2 = 0;
        }
        IAuthTabCallback(onnavigationevent, i, num, i2);
    }

    public static final void IAuthTabCallback(@NotNull TdsToastV1.onNavigationEvent onnavigationevent, int i, @Nullable Integer num, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onWarmupCompleted(new setBaseURL(onnavigationevent, num, i2), i);
        int i4 = onExtraCallback + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onWarmupCompleted(setBaseURL setbaseurl, int i) {
        int i2 = 2 % 2;
        if (i == 0) {
            int i3 = onWarmupCompleted + 115;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            getIconPaddingLeft.IAuthTabCallback.onExtraCallbackWithResult(setbaseurl);
            return;
        }
        getIconPaddingLeft.IAuthTabCallback.IAuthTabCallback(setbaseurl, i, TimeUnit.MILLISECONDS);
        int i5 = onWarmupCompleted + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
    }

    public static final TdsToastV1.onNavigationEvent onExtraCallback(@NotNull TdsToastV1.onNavigationEvent onnavigationevent, @NotNull Activity activity) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onnavigationevent, "");
            Intrinsics.checkNotNullParameter(activity, "");
            TdsToastV1.onNavigationEvent.Companion.onWarmupCompleted(activity, onnavigationevent);
            throw null;
        }
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(activity, "");
        TdsToastV1.onNavigationEvent onnavigationeventOnWarmupCompleted = TdsToastV1.onNavigationEvent.Companion.onWarmupCompleted(activity, onnavigationevent);
        int i3 = onExtraCallback + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        throw null;
    }
}
