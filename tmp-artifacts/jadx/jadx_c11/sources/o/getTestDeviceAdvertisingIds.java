package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getTestDeviceAdvertisingIds {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final setExceptionHandlerEnabled onNavigationEvent;
    private final Throwable onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getTestDeviceAdvertisingIds)) {
            return false;
        }
        getTestDeviceAdvertisingIds gettestdeviceadvertisingids = (getTestDeviceAdvertisingIds) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, gettestdeviceadvertisingids.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, gettestdeviceadvertisingids.onWarmupCompleted)) {
            int i4 = onExtraCallback + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallback + 123;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        setExceptionHandlerEnabled setexceptionhandlerenabled = this.onNavigationEvent;
        if (setexceptionhandlerenabled == null) {
            int i2 = IAuthTabCallback + 59;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
            int i4 = i3 + 85;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = setexceptionhandlerenabled.hashCode();
        }
        Throwable th = this.onWarmupCompleted;
        int iHashCode2 = (iHashCode * 31) + (th != null ? th.hashCode() : 0);
        int i6 = onExtraCallback + 31;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppInitResult(resp=" + this.onNavigationEvent + ", error=" + this.onWarmupCompleted + ")";
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return str;
    }

    public getTestDeviceAdvertisingIds(@Nullable setExceptionHandlerEnabled setexceptionhandlerenabled, @Nullable Throwable th) {
        this.onNavigationEvent = setexceptionhandlerenabled;
        this.onWarmupCompleted = th;
    }
}
