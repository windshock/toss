package o;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getReactQueueConfiguration {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("allow")
    private final boolean allow;
    private transient boolean isOneTimePermission;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof getReactQueueConfiguration) {
            return this.allow == ((getReactQueueConfiguration) obj).allow;
        }
        int i4 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.allow);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.allow);
        int i3 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UrlVerifyResponse(allow=" + this.allow + ")";
        int i2 = onExtraCallbackWithResult + 31;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getReactQueueConfiguration(boolean z) {
        this.allow = z;
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        boolean z = this.allow;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return z;
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        this.isOneTimePermission = z;
        int i5 = i3 + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isOneTimePermission;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        return z;
    }
}
