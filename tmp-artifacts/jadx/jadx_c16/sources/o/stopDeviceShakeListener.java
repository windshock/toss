package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class stopDeviceShakeListener {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final int onExtraCallbackWithResult;
    private final long onNavigationEvent;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 63;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stopDeviceShakeListener)) {
            return false;
        }
        stopDeviceShakeListener stopdeviceshakelistener = (stopDeviceShakeListener) obj;
        if (this.onNavigationEvent != stopdeviceshakelistener.onNavigationEvent) {
            int i5 = i2 + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.onExtraCallbackWithResult == stopdeviceshakelistener.onExtraCallbackWithResult) {
            return true;
        }
        int i7 = i4 + 13;
        onWarmupCompleted = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallback = i2 % 128;
        return i2 % 2 != 0 ? (Long.hashCode(this.onNavigationEvent) >>> 22) << Integer.hashCode(this.onExtraCallbackWithResult) : (Long.hashCode(this.onNavigationEvent) * 31) + Integer.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PremiumPointButtonItem(pointBalance=" + this.onNavigationEvent + ", totalCardCount=" + this.onExtraCallbackWithResult + ")";
        int i2 = onExtraCallback + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        int i5 = i3 + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return j;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.onExtraCallbackWithResult;
        int i5 = i3 + 89;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }
}
