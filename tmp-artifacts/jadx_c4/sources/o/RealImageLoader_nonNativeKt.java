package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoader_nonNativeKt {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;

    public RealImageLoader_nonNativeKt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback = str;
        if (StringsKt.isBlank(str)) {
            throw new IllegalArgumentException("name may not be blank");
        }
        this.onExtraCallback = RealImageLoader_jvmCommonKt.onNavigationEvent(str);
        int i = onNavigationEvent + 107;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onExtraCallback;
        int i4 = i3 + 59;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }
}
