package o;

import android.os.SystemClock;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class forceDomainCheck {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static int onExtraCallbackWithResult;
    public static int onNavigationEvent;

    public static final boolean onExtraCallbackWithResult(@NotNull WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        if (windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.onTransact()).onExtraCallback >= windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface()).onExtraCallback) {
            return false;
        }
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static int IAuthTabCallback() {
        int i = onNavigationEvent;
        int i2 = i % 8405833;
        onNavigationEvent = i + 1;
        if (i2 != 0) {
            return onExtraCallbackWithResult;
        }
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        onExtraCallbackWithResult = iUptimeMillis;
        return iUptimeMillis;
    }
}
