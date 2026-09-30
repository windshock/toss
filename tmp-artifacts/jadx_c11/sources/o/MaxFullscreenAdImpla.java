package o;

import android.os.SystemClock;
import com.facebook.react.ReactHost;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImpla {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ long onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jOnNavigationEvent = onNavigationEvent(j);
        int i4 = onWarmupCompleted + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return jOnNavigationEvent;
    }

    public static final boolean onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = 2 % 2;
        if (!z2) {
            return false;
        }
        if (!z3) {
            return z;
        }
        Object obj = null;
        if (z) {
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (z4) {
                return true;
            }
        }
        int i3 = onWarmupCompleted + 109;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    private static final long onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - j) / 1000000;
        int i4 = onWarmupCompleted + 31;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jElapsedRealtimeNanos;
    }

    public static final boolean onWarmupCompleted(boolean z, @Nullable ReactHost reactHost, boolean z2) {
        int i = 2 % 2;
        if (!z) {
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (z2) {
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (reactHost == null || reactHost.onExtraCallbackWithResult() != null) {
            return false;
        }
        int i6 = onExtraCallback + 9;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static final Map<String, String> IAuthTabCallback(@NotNull String str, @Nullable String str2, boolean z, boolean z2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("from", "TossReactNativeFragment");
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("fragment_hash", str);
        if (str2 == null) {
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
            }
            str2 = "null";
        }
        Map<String, String> mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback("react_host_hash", str2), getWrite.IAuthTabCallback("react_host_started", String.valueOf(z)), getWrite.IAuthTabCallback("internal_granite_host_created", String.valueOf(z2))});
        int i4 = onExtraCallback + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return mapOnWarmupCompleted;
    }
}
