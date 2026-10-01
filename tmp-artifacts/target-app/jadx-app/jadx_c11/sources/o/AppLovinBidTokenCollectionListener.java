package o;

import kotlin.jvm.internal.Intrinsics;
import o.accessinit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinBidTokenCollectionListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final AppLovinEventParameters onWarmupCompleted(@NotNull accessinit.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        AppLovinEventParameters appLovinEventParameters = AppLovinEventParameters.onNavigationEvent;
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return appLovinEventParameters;
    }
}
