package o;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ld {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final Rect onNavigationEvent(@NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Rect rect = new Rect(surfaceProcessorNodeOut.asInterface(i), surfaceProcessorNodeOut.IAuthTabCallbackDefault(i), surfaceProcessorNodeOut.onTransact(i), surfaceProcessorNodeOut.onExtraCallbackWithResult(i));
        int i3 = IAuthTabCallback + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return rect;
        }
        throw null;
    }
}
