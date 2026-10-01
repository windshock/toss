package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkValidPitchUnder {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final String IAuthTabCallback(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        String strOnExtraCallback = GetDetectingInterval.Companion.onExtraCallback(interfaceC0059deInitialize.onPostMessage(), interfaceC0059deInitialize.onMinimized());
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }
}
