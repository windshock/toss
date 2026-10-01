package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class refreshPluginUpdateTime$onWarmupCompleted extends refreshPluginUpdateTime {
    private static int IAuthTabCallback = 0;
    public static final refreshPluginUpdateTime$onWarmupCompleted onExtraCallback = new refreshPluginUpdateTime$onWarmupCompleted();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj || (obj instanceof refreshPluginUpdateTime$onWarmupCompleted)) {
            return true;
        }
        int i4 = i2 + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return -432612377;
        }
        int i3 = 9 / 0;
        return -432612377;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return "HideWarningBottomSheet";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private refreshPluginUpdateTime$onWarmupCompleted() {
        super((DefaultConstructorMarker) null);
    }
}
