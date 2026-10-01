package o;

import o.toJSONObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent implements toJSONObject.IAuthTabCallback.onExtraCallbackWithResult {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent onWarmupCompleted = new toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent();

    static {
        int i = onExtraCallbackWithResult + 113;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 119;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            return obj instanceof toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent;
        }
        int i5 = i2 + 49;
        onExtraCallback = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 107;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return -885292757;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return "Transaction";
    }

    private toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onNavigationEvent() {
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 113;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return "deposit";
    }
}
