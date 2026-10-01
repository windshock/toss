package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class parsePresetStream$onWarmupCompleted implements parsePresetStream {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final parsePresetStream$onWarmupCompleted onNavigationEvent = new parsePresetStream$onWarmupCompleted();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 7;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 11;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(!(obj instanceof parsePresetStream$onWarmupCompleted))) {
            return true;
        }
        int i7 = i2 + 49;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return -684424816;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = i3 + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return "ShowRegisterRefundOtherAccount";
    }

    private parsePresetStream$onWarmupCompleted() {
    }
}
