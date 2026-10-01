package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PluginResourcePackage$onTransact implements PluginResourcePackage {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final PluginResourcePackage$onTransact onWarmupCompleted = new PluginResourcePackage$onTransact();

    static {
        int i = onExtraCallback + 115;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 41;
            onNavigationEvent = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(!(obj instanceof PluginResourcePackage$onTransact))) {
            return true;
        }
        int i5 = i2 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return -1297216806;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return "PopupDialog";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private PluginResourcePackage$onTransact() {
    }
}
