package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAdvertisingIdWithGps {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final <T> T onExtraCallbackWithResult(@NotNull JsonPrimitive jsonPrimitive, @NotNull Class<T> cls) {
        Object objOnWarmupCompleted;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonPrimitive, "");
        Intrinsics.checkNotNullParameter(cls, "");
        if (Intrinsics.areEqual(cls, String.class)) {
            objOnWarmupCompleted = initRenderFinish.onNavigationEvent(jsonPrimitive);
        } else if (Intrinsics.areEqual(cls, Boolean.class)) {
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            objOnWarmupCompleted = initRenderFinish.onExtraCallbackWithResult(jsonPrimitive);
        } else if (Intrinsics.areEqual(cls, Integer.class)) {
            objOnWarmupCompleted = initRenderFinish.asInterface(jsonPrimitive);
        } else if (Intrinsics.areEqual(cls, Long.class)) {
            objOnWarmupCompleted = initRenderFinish.access000(jsonPrimitive);
        } else if (Intrinsics.areEqual(cls, Float.class)) {
            objOnWarmupCompleted = initRenderFinish.asBinder(jsonPrimitive);
        } else if (Intrinsics.areEqual(cls, Double.class)) {
            objOnWarmupCompleted = initRenderFinish.onWarmupCompleted(jsonPrimitive);
            int i4 = IAuthTabCallback + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
        } else {
            objOnWarmupCompleted = null;
        }
        if (objOnWarmupCompleted != null) {
            return cls.cast(objOnWarmupCompleted);
        }
        return null;
    }
}
