package o;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_authenticator {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final verifyClientState onNavigationEvent(@NotNull String str, @NotNull deprecated_callTimeoutMillis deprecated_calltimeoutmillis) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deprecated_calltimeoutmillis, "");
        accessgetDEFAULT_CONNECTION_SPECScp accessgetdefault_connection_specscp = new accessgetDEFAULT_CONNECTION_SPECScp(str, deprecated_calltimeoutmillis);
        int i2 = onExtraCallbackWithResult + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return accessgetdefault_connection_specscp;
    }

    public static final verifyClientState onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        accessgetDEFAULT_CONNECTION_SPECScp accessgetdefault_connection_specscp = new accessgetDEFAULT_CONNECTION_SPECScp(str, deprecated_callTimeoutMillis.Companion.IAuthTabCallback());
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return accessgetdefault_connection_specscp;
    }

    public static final verifyClientState onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        accessgetDEFAULT_CONNECTION_SPECScp accessgetdefault_connection_specscp = new accessgetDEFAULT_CONNECTION_SPECScp(str, deprecated_callTimeoutMillis.Companion.onWarmupCompleted());
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return accessgetdefault_connection_specscp;
    }

    public static final boolean onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        boolean z = !deprecated_cache.onNavigationEvent(f, i2 % 2 == 0 ? deprecated_cache.Companion.IAuthTabCallback() : deprecated_cache.Companion.IAuthTabCallback());
        int i3 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public static final String IAuthTabCallback(@NotNull verifyClientState verifyclientstate, @NotNull Resources resources) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(verifyclientstate, "");
        Intrinsics.checkNotNullParameter(resources, "");
        String strIAuthTabCallback = verifyclientstate.IAuthTabCallback(onWarmupCompleted(resources));
        int i4 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public static final String onWarmupCompleted(@NotNull verifyClientState verifyclientstate, @NotNull Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(verifyclientstate, "");
            Intrinsics.checkNotNullParameter(context, "");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return IAuthTabCallback(verifyclientstate, resources);
        }
        Intrinsics.checkNotNullParameter(verifyclientstate, "");
        Intrinsics.checkNotNullParameter(context, "");
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        String strIAuthTabCallback = IAuthTabCallback(verifyclientstate, resources2);
        int i3 = 62 / 0;
        return strIAuthTabCallback;
    }

    private static final float onWarmupCompleted(Resources resources) {
        int i = 2 % 2;
        int i2 = resources.getDisplayMetrics().densityDpi;
        if (i2 <= 160) {
            return deprecated_cache.onExtraCallbackWithResult(1);
        }
        if (i2 <= 320) {
            return deprecated_cache.onExtraCallbackWithResult(2);
        }
        if (i2 <= 480) {
            int i3 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return deprecated_cache.onExtraCallbackWithResult(3);
        }
        if (i2 <= 640) {
            return deprecated_cache.onExtraCallbackWithResult(4);
        }
        float fIAuthTabCallback = deprecated_cache.Companion.IAuthTabCallback();
        int i5 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return fIAuthTabCallback;
    }
}
