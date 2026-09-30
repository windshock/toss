package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class startSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final JsonPrimitive onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt.equals(str, "true", true)) {
            int i2 = onExtraCallbackWithResult + 109;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.equals(str, "false", true)) {
                Long longOrNull = StringsKt.toLongOrNull(str);
                if (longOrNull != null) {
                    int i4 = onExtraCallbackWithResult + 101;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 == 0) {
                        return initRenderFinish.IAuthTabCallback(Long.valueOf(longOrNull.longValue()));
                    }
                    initRenderFinish.IAuthTabCallback(Long.valueOf(longOrNull.longValue()));
                    throw null;
                }
                Double doubleOrNull = StringsKt.toDoubleOrNull(str);
                if (doubleOrNull != null) {
                    int i5 = onExtraCallbackWithResult + 37;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return initRenderFinish.IAuthTabCallback(Double.valueOf(doubleOrNull.doubleValue()));
                }
                JsonPrimitive jsonPrimitiveOnNavigationEvent = initRenderFinish.onNavigationEvent(str);
                int i7 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                return jsonPrimitiveOnNavigationEvent;
            }
        }
        return initRenderFinish.onWarmupCompleted(Boolean.valueOf(Boolean.parseBoolean(str)));
    }
}
