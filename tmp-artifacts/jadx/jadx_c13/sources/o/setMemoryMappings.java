package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface setMemoryMappings extends TimeMark, Comparable<setMemoryMappings> {
    long onNavigationEvent(@NotNull setMemoryMappings setmemorymappings);

    public static final class IAuthTabCallback {
        public static int IAuthTabCallback(@NotNull setMemoryMappings setmemorymappings, @NotNull setMemoryMappings setmemorymappings2) {
            Intrinsics.checkNotNullParameter(setmemorymappings2, "");
            return setLogBuffers.onExtraCallbackWithResult(setmemorymappings.onNavigationEvent(setmemorymappings2), setLogBuffers.Companion.onWarmupCompleted());
        }
    }
}
