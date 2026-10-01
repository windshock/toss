package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ComponentRegistryBuilderExternalSyntheticLambda3 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final void onNavigationEvent(@NotNull getMaxSupportedFrameRate getmaxsupportedframerate) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getmaxsupportedframerate, "");
        try {
            getMaxSupportedFrameRate.onNavigationEvent(getmaxsupportedframerate, 0, 1, (Object) null);
            int i4 = onNavigationEvent + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 90 / 0;
            }
        } catch (IllegalStateException unused) {
        }
    }
}
