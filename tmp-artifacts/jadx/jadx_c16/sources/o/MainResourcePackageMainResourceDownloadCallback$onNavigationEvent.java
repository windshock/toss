package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class MainResourcePackageMainResourceDownloadCallback$onNavigationEvent extends MainResourcePackageMainResourceDownloadCallback {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final long IAuthTabCallback;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 85;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainResourcePackageMainResourceDownloadCallback$onNavigationEvent)) {
            int i5 = i2 + 25;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.IAuthTabCallback == ((MainResourcePackageMainResourceDownloadCallback$onNavigationEvent) obj).IAuthTabCallback) {
            return true;
        }
        int i7 = i4 + 73;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.IAuthTabCallback);
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShowMaxWithdrawLimitDialog(maxWithdrawAmount=" + this.IAuthTabCallback + ")";
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return str;
    }

    public MainResourcePackageMainResourceDownloadCallback$onNavigationEvent(long j) {
        super((DefaultConstructorMarker) null);
        this.IAuthTabCallback = j;
    }
}
