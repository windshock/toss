package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SetDetectableSize {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final Map<String, Object> onExtraCallback = new LinkedHashMap();

    public final Map<String, Object> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.onExtraCallback;
        int i5 = i2 + 33;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    @Deprecated
    public final void onNavigationEvent(@NotNull String str, @Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallback(str, obj);
        int i4 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onExtraCallback.put(str, obj);
        int i4 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@Nullable Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (map != null) {
            this.onExtraCallback.putAll(map);
            int i3 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final Map<String, Object> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.onExtraCallback;
        int i5 = i3 + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }
}
