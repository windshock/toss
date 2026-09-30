package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class parseUnsignedLong<T> {
    private static int asInterface = 1;
    private static int onNavigationEvent;
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final convertBreadcrumbInternalbugsnag_android_core_release onExtraCallbackWithResult;
    private final T onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 15;
            asInterface = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof parseUnsignedLong)) {
            int i3 = asInterface + 67;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        parseUnsignedLong parseunsignedlong = (parseUnsignedLong) obj;
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, parseunsignedlong.onExtraCallbackWithResult)) {
            int i5 = asInterface + 113;
            onNavigationEvent = i5 % 128;
            return !(i5 % 2 == 0);
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, parseunsignedlong.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallback, parseunsignedlong.onExtraCallback)) {
            return Intrinsics.areEqual(this.onWarmupCompleted, parseunsignedlong.onWarmupCompleted);
        }
        int i6 = asInterface + 25;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asInterface + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.onExtraCallbackWithResult.hashCode();
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onExtraCallback.hashCode();
        T t = this.onWarmupCompleted;
        if (t == null) {
            iHashCode = 0;
        } else {
            iHashCode = t.hashCode();
            int i4 = onNavigationEvent + 37;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        int i7 = asInterface + 23;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 23 / 0;
        }
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossWebSocketMessageData(metadata=" + this.onExtraCallbackWithResult + ", service=" + this.IAuthTabCallback + ", action=" + this.onExtraCallback + ", payload=" + this.onWarmupCompleted + ")";
        int i2 = asInterface + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public parseUnsignedLong(@NotNull convertBreadcrumbInternalbugsnag_android_core_release convertbreadcrumbinternalbugsnag_android_core_release, @NotNull String str, @NotNull String str2, T t) {
        Intrinsics.checkNotNullParameter(convertbreadcrumbinternalbugsnag_android_core_release, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onExtraCallbackWithResult = convertbreadcrumbinternalbugsnag_android_core_release;
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
        this.onWarmupCompleted = t;
    }

    public final convertBreadcrumbInternalbugsnag_android_core_release onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 59;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        convertBreadcrumbInternalbugsnag_android_core_release convertbreadcrumbinternalbugsnag_android_core_release = this.onExtraCallbackWithResult;
        int i5 = i2 + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return convertbreadcrumbinternalbugsnag_android_core_release;
    }

    public final T onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        T t = this.onWarmupCompleted;
        int i5 = i3 + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
