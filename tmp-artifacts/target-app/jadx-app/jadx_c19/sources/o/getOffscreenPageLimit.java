package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getOffscreenPageLimit {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final Map<String, String> IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOffscreenPageLimit)) {
            int i3 = onWarmupCompleted + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        getOffscreenPageLimit getoffscreenpagelimit = (getOffscreenPageLimit) obj;
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, getoffscreenpagelimit.onExtraCallbackWithResult)) {
            return Intrinsics.areEqual(this.onExtraCallback, getoffscreenpagelimit.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, getoffscreenpagelimit.IAuthTabCallback);
        }
        int i5 = onWarmupCompleted + 87;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode()) * 31) + this.IAuthTabCallback.hashCode();
        int i5 = onWarmupCompleted + 21;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "NativeAdsOmSdkTrackingEvent(type=" + this.onExtraCallbackWithResult + ", url=" + this.onExtraCallback + ", payload=" + this.IAuthTabCallback + ")";
        int i3 = onWarmupCompleted + 51;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public getOffscreenPageLimit(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallbackWithResult = str;
        this.onExtraCallback = str2;
        this.IAuthTabCallback = map;
    }

    public final String IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i6 = i4 + 17;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.onExtraCallback;
        int i5 = i3 + 31;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, String> onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }
}
