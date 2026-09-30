package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BreadcrumbState<H> {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private final H IAuthTabCallback;
    private final getObserversbugsnag_android_core_release onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof BreadcrumbState)) {
            return false;
        }
        BreadcrumbState breadcrumbState = (BreadcrumbState) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, breadcrumbState.IAuthTabCallback)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, breadcrumbState.onExtraCallbackWithResult)) {
            return true;
        }
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 103;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        H h = this.IAuthTabCallback;
        if (h == null) {
            int i5 = i2 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = h.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
        int i7 = onExtraCallback + 63;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MatchedRoute(handler=" + this.IAuthTabCallback + ", matchResult=" + this.onExtraCallbackWithResult + ")";
        int i2 = onNavigationEvent + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BreadcrumbState(H h, @NotNull getObserversbugsnag_android_core_release getobserversbugsnag_android_core_release) {
        Intrinsics.checkNotNullParameter(getobserversbugsnag_android_core_release, "");
        this.IAuthTabCallback = h;
        this.onExtraCallbackWithResult = getobserversbugsnag_android_core_release;
    }

    public final H onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        H h = this.IAuthTabCallback;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return h;
    }

    public final getObserversbugsnag_android_core_release onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        getObserversbugsnag_android_core_release getobserversbugsnag_android_core_release = this.onExtraCallbackWithResult;
        int i5 = i2 + 125;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getobserversbugsnag_android_core_release;
    }
}
