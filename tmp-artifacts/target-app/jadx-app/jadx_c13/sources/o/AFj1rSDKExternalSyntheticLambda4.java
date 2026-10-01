package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1rSDKExternalSyntheticLambda4 {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private final long IAuthTabCallback;
    private final Boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final long onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFj1rSDKExternalSyntheticLambda4)) {
            return false;
        }
        AFj1rSDKExternalSyntheticLambda4 aFj1rSDKExternalSyntheticLambda4 = (AFj1rSDKExternalSyntheticLambda4) obj;
        if (!Intrinsics.areEqual(this.onExtraCallback, aFj1rSDKExternalSyntheticLambda4.onExtraCallback) || this.IAuthTabCallback != aFj1rSDKExternalSyntheticLambda4.IAuthTabCallback || this.onNavigationEvent != aFj1rSDKExternalSyntheticLambda4.onNavigationEvent || this.onWarmupCompleted != aFj1rSDKExternalSyntheticLambda4.onWarmupCompleted) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, aFj1rSDKExternalSyntheticLambda4.onExtraCallbackWithResult)) {
            return true;
        }
        int i3 = IAuthTabCallbackStub + 101;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        Boolean bool;
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0 ? (bool = this.onExtraCallback) != null : (bool = this.onExtraCallback) != null) {
            iHashCode = bool.hashCode();
            int i3 = IAuthTabCallbackStub + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = 0;
        }
        int iHashCode2 = Long.hashCode(this.IAuthTabCallback);
        int iHashCode3 = Long.hashCode(this.onNavigationEvent);
        int iHashCode4 = Long.hashCode(this.onWarmupCompleted);
        String str = this.onExtraCallbackWithResult;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LaunchEnvironment(isPowerSaveMode=" + this.onExtraCallback + ", availableMemoryMb=" + this.IAuthTabCallback + ", diskSpaceGb=" + this.onNavigationEvent + ", systemUptimeHours=" + this.onWarmupCompleted + ", thermalState=" + this.onExtraCallbackWithResult + ")";
        int i2 = IAuthTabCallbackStub + 91;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public AFj1rSDKExternalSyntheticLambda4(@Nullable Boolean bool, long j, long j2, long j3, @Nullable String str) {
        this.onExtraCallback = bool;
        this.IAuthTabCallback = j;
        this.onNavigationEvent = j2;
        this.onWarmupCompleted = j3;
        this.onExtraCallbackWithResult = str;
    }

    public final Boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.onExtraCallback;
        int i5 = i2 + 9;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        long j = this.onWarmupCompleted;
        int i5 = i3 + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        int i3 = i2 % 128;
        asBinder = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.onExtraCallbackWithResult;
        int i4 = i3 + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}
