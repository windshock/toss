package im.toss.features.mobileid.impl.setting;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class MobileIdVerifyHistoryActivity$IAuthTabCallback {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String IAuthTabCallback;
    private final String onExtraCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 99;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        if (obj instanceof MobileIdVerifyHistoryActivity$IAuthTabCallback) {
            MobileIdVerifyHistoryActivity$IAuthTabCallback mobileIdVerifyHistoryActivity$IAuthTabCallback = (MobileIdVerifyHistoryActivity$IAuthTabCallback) obj;
            return Intrinsics.areEqual(this.IAuthTabCallback, mobileIdVerifyHistoryActivity$IAuthTabCallback.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, mobileIdVerifyHistoryActivity$IAuthTabCallback.onExtraCallback);
        }
        int i3 = onNavigationEvent + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.IAuthTabCallback.hashCode();
        return i3 != 0 ? (iHashCode % 75) * this.onExtraCallback.hashCode() : (iHashCode * 31) + this.onExtraCallback.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UiItem(spName=" + this.IAuthTabCallback + ", verifiedDate=" + this.onExtraCallback + ")";
        int i2 = onNavigationEvent + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public MobileIdVerifyHistoryActivity$IAuthTabCallback(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback = str;
        this.onExtraCallback = str2;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.IAuthTabCallback;
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallback;
        }
        throw null;
    }
}
