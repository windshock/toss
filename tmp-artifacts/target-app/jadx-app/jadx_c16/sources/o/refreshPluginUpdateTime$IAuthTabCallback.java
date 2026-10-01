package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class refreshPluginUpdateTime$IAuthTabCallback extends refreshPluginUpdateTime {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    public static final refreshPluginUpdateTime$IAuthTabCallback onExtraCallbackWithResult = new refreshPluginUpdateTime$IAuthTabCallback();
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 77;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 91;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 17;
            onExtraCallback = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(!(obj instanceof refreshPluginUpdateTime$IAuthTabCallback))) {
            return true;
        }
        int i6 = i4 + 25;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return 189530338;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return "ShowWarningBottomSheet";
        }
        int i3 = 72 / 0;
        return "ShowWarningBottomSheet";
    }

    private refreshPluginUpdateTime$IAuthTabCallback() {
        super((DefaultConstructorMarker) null);
    }
}
