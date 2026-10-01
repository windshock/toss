package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class parsePresetStream$onExtraCallback implements parsePresetStream {
    public static final parsePresetStream$onExtraCallback IAuthTabCallback = new parsePresetStream$onExtraCallback();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 67;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof parsePresetStream$onExtraCallback)) {
            int i5 = i2 + 25;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i4 + 51;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 71 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return 1075420688;
        }
        int i3 = 69 / 0;
        return 1075420688;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return "ShowError";
        }
        int i3 = 34 / 0;
        return "ShowError";
    }

    private parsePresetStream$onExtraCallback() {
    }
}
