package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isInWifiConnectNewImplWhiteList$IAuthTabCallback extends isInWifiConnectNewImplWhiteList {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Throwable onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof isInWifiConnectNewImplWhiteList$IAuthTabCallback)) {
            int i3 = onExtraCallback + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.onNavigationEvent, ((isInWifiConnectNewImplWhiteList$IAuthTabCallback) obj).onNavigationEvent)) {
            return true;
        }
        int i5 = onExtraCallback + 87;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = onExtraCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Error(err=" + this.onNavigationEvent + ")";
        int i2 = onWarmupCompleted + 67;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isInWifiConnectNewImplWhiteList$IAuthTabCallback(@NotNull Throwable th) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(th, "");
        this.onNavigationEvent = th;
    }

    public final Throwable onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Throwable th = this.onNavigationEvent;
        int i5 = i2 + 39;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return th;
        }
        throw null;
    }
}
