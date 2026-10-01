package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ALCFaceSDK5 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final JsonPrimitive onExtraCallback(@NotNull ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1, @NotNull String str, @NotNull Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aLCFaceSDK4ExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object objOnNavigationEvent = aLCFaceSDK4ExternalSyntheticLambda1.onNavigationEvent(str, obj.getClass(), obj);
        if (objOnNavigationEvent == null) {
            return null;
        }
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        JsonPrimitive jsonPrimitiveOnExtraCallback = onExtraCallback(objOnNavigationEvent);
        if (i5 == 0) {
            int i6 = 64 / 0;
        }
        return jsonPrimitiveOnExtraCallback;
    }

    private static final JsonPrimitive onExtraCallback(Object obj) {
        int i = 2 % 2;
        if (obj instanceof Boolean) {
            int i2 = onWarmupCompleted + 89;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return initRenderFinish.onWarmupCompleted((Boolean) obj);
            }
            initRenderFinish.onWarmupCompleted((Boolean) obj);
            throw null;
        }
        if (!(!(obj instanceof Number))) {
            return initRenderFinish.IAuthTabCallback((Number) obj);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        int i3 = onWarmupCompleted + 95;
        onNavigationEvent = i3 % 128;
        String str = (String) obj;
        if (i3 % 2 != 0) {
            return initRenderFinish.onNavigationEvent(str);
        }
        initRenderFinish.onNavigationEvent(str);
        throw null;
    }
}
