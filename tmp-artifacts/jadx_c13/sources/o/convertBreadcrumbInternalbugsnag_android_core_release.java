package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class convertBreadcrumbInternalbugsnag_android_core_release {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final String IAuthTabCallback;
    private final boolean onExtraCallback;
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 97;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof convertBreadcrumbInternalbugsnag_android_core_release)) {
            int i8 = i4 + 3;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        convertBreadcrumbInternalbugsnag_android_core_release convertbreadcrumbinternalbugsnag_android_core_release = (convertBreadcrumbInternalbugsnag_android_core_release) obj;
        if (!Intrinsics.areEqual(this.onWarmupCompleted, convertbreadcrumbinternalbugsnag_android_core_release.onWarmupCompleted)) {
            int i10 = onNavigationEvent + 81;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallback, convertbreadcrumbinternalbugsnag_android_core_release.IAuthTabCallback)) {
            return false;
        }
        if (this.onExtraCallback == convertbreadcrumbinternalbugsnag_android_core_release.onExtraCallback) {
            return true;
        }
        int i12 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallbackWithResult = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.onWarmupCompleted.hashCode() << 119) << this.IAuthTabCallback.hashCode()) + 87) >>> Boolean.hashCode(this.onExtraCallback) : (((this.onWarmupCompleted.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + Boolean.hashCode(this.onExtraCallback);
        int i3 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossWebSocketMessageMetaData(connectEventId=" + this.onWarmupCompleted + ", socketPushId=" + this.IAuthTabCallback + ", isTrace=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public convertBreadcrumbInternalbugsnag_android_core_release(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onWarmupCompleted = str;
        this.IAuthTabCallback = str2;
        this.onExtraCallback = z;
    }
}
