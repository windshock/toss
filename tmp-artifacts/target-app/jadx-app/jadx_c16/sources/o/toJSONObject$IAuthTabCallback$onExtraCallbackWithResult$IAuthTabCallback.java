package o;

import o.toJSONObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback implements toJSONObject.IAuthTabCallback.onExtraCallbackWithResult {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    public static final toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback onNavigationEvent = new toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            return obj instanceof toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback;
        }
        int i2 = onExtraCallback + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return 861538022;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return "Investment";
        }
        throw null;
    }

    private toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$IAuthTabCallback() {
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return "investment";
        }
        throw null;
    }
}
