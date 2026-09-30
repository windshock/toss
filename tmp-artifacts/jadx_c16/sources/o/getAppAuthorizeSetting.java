package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getAppAuthorizeSetting extends SensorBridgeExtension3 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final int IAuthTabCallback;
    private final boolean onNavigationEvent;
    private final long onWarmupCompleted;

    public static /* synthetic */ getAppAuthorizeSetting onExtraCallbackWithResult(getAppAuthorizeSetting getappauthorizesetting, long j, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            j = getappauthorizesetting.onWarmupCompleted;
        }
        if ((i2 & 2) != 0) {
            int i6 = i4 + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            i = getappauthorizesetting.IAuthTabCallback;
        }
        if ((i2 & 4) != 0) {
            z = getappauthorizesetting.onNavigationEvent;
            int i8 = onExtraCallbackWithResult + 119;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return getappauthorizesetting.IAuthTabCallback(j, i, z);
    }

    public final getAppAuthorizeSetting IAuthTabCallback(long j, int i, boolean z) {
        int i2 = 2 % 2;
        getAppAuthorizeSetting getappauthorizesetting = new getAppAuthorizeSetting(j, i, z);
        int i3 = onExtraCallback + 49;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return getappauthorizesetting;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAppAuthorizeSetting)) {
            int i4 = i3 + 95;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        getAppAuthorizeSetting getappauthorizesetting = (getAppAuthorizeSetting) obj;
        if (this.onWarmupCompleted == getappauthorizesetting.onWarmupCompleted) {
            return this.IAuthTabCallback == getappauthorizesetting.IAuthTabCallback && this.onNavigationEvent == getappauthorizesetting.onNavigationEvent;
        }
        int i5 = i3 + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        return i2 % 2 == 0 ? (((Long.hashCode(this.onWarmupCompleted) / 34) + Integer.hashCode(this.IAuthTabCallback)) << 120) >> Boolean.hashCode(this.onNavigationEvent) : (((Long.hashCode(this.onWarmupCompleted) * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Boolean.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SlimPointSectionItem(pointBalance=" + this.onWarmupCompleted + ", totalCardCount=" + this.IAuthTabCallback + ", showBackGroundColor=" + this.onNavigationEvent + ")";
        int i2 = onExtraCallbackWithResult + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getAppAuthorizeSetting(long j, int i, boolean z) {
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = i;
        this.onNavigationEvent = z;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 51;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onWarmupCompleted;
        int i4 = i2 + 3;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.IAuthTabCallback;
        int i5 = i3 + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        throw null;
    }
}
