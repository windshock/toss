package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class enableIpcClientKernelUtilsOpt {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final String IAuthTabCallback;
    private final int onExtraCallback;
    private final float onNavigationEvent;

    public static /* synthetic */ enableIpcClientKernelUtilsOpt onNavigationEvent(enableIpcClientKernelUtilsOpt enableipcclientkernelutilsopt, float f, int i, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            f = enableipcclientkernelutilsopt.onNavigationEvent;
        }
        if ((i2 & 2) != 0) {
            i = enableipcclientkernelutilsopt.onExtraCallback;
            int i4 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                str = enableipcclientkernelutilsopt.IAuthTabCallback;
                int i7 = 60 / 0;
            } else {
                str = enableipcclientkernelutilsopt.IAuthTabCallback;
            }
        }
        return enableipcclientkernelutilsopt.onExtraCallback(f, i, str);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableIpcClientKernelUtilsOpt)) {
            return false;
        }
        enableIpcClientKernelUtilsOpt enableipcclientkernelutilsopt = (enableIpcClientKernelUtilsOpt) obj;
        if (Float.compare(this.onNavigationEvent, enableipcclientkernelutilsopt.onNavigationEvent) != 0) {
            return false;
        }
        if (this.onExtraCallback != enableipcclientkernelutilsopt.onExtraCallback) {
            int i2 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.IAuthTabCallback, enableipcclientkernelutilsopt.IAuthTabCallback))) {
            return true;
        }
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Float.hashCode(this.onNavigationEvent);
        int iHashCode3 = Integer.hashCode(this.onExtraCallback);
        String str = this.IAuthTabCallback;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i5 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final enableIpcClientKernelUtilsOpt onExtraCallback(float f, int i, @Nullable String str) {
        int i2 = 2 % 2;
        enableIpcClientKernelUtilsOpt enableipcclientkernelutilsopt = new enableIpcClientKernelUtilsOpt(f, i, str);
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return enableipcclientkernelutilsopt;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "NiceScore(rankPercent=" + this.onNavigationEvent + ", score=" + this.onExtraCallback + ", resultCode=" + this.IAuthTabCallback + ")";
        int i2 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return str;
    }

    public enableIpcClientKernelUtilsOpt(float f, int i, @Nullable String str) {
        this.onNavigationEvent = f;
        this.onExtraCallback = i;
        this.IAuthTabCallback = str;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float f = this.onNavigationEvent;
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return f;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.onExtraCallback;
        int i5 = i2 + 117;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 21;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.areEqual(this.IAuthTabCallback, "UNKNOWN_DI");
            obj.hashCode();
            throw null;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.IAuthTabCallback, "UNKNOWN_DI");
        int i3 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return zAreEqual;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.IAuthTabCallback, "MAINTENANCE");
        int i4 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
