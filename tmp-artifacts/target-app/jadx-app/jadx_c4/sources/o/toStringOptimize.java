package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class toStringOptimize {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final long onExtraCallback(@NotNull setMemoryMappings setmemorymappings) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setmemorymappings, "");
        long jAsBinder = setLogBuffers.asBinder(setmemorymappings.onNavigationEvent());
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return jAsBinder;
        }
        throw null;
    }
}
