package o;

import o.toJSONObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult implements toJSONObject.IAuthTabCallback.onExtraCallbackWithResult {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult onWarmupCompleted = new toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult();

    static {
        int i = onExtraCallback + 75;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult)) {
            return false;
        }
        int i4 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return 897992845;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return "Saving";
    }

    private toJSONObject$IAuthTabCallback$onExtraCallbackWithResult$onExtraCallbackWithResult() {
    }

    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return "saving";
        }
        obj.hashCode();
        throw null;
    }
}
