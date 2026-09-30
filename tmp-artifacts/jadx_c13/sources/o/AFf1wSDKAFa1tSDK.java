package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFf1wSDKAFa1tSDK {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final float IAuthTabCallback;
    private final float onExtraCallback;

    public /* synthetic */ AFf1wSDKAFa1tSDK(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof AFf1wSDKAFa1tSDK)) {
            int i7 = i2 + 67;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        AFf1wSDKAFa1tSDK aFf1wSDKAFa1tSDK = (AFf1wSDKAFa1tSDK) obj;
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, aFf1wSDKAFa1tSDK.IAuthTabCallback)) {
            int i9 = onNavigationEvent + 61;
            onWarmupCompleted = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, aFf1wSDKAFa1tSDK.onExtraCallback)) {
            int i10 = onNavigationEvent + 63;
            onWarmupCompleted = i10 % 128;
            return i10 % 2 != 0;
        }
        int i11 = onNavigationEvent + 115;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
        return i3 == 0 ? (iOnWarmupCompleted - 85) / VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback) : (iOnWarmupCompleted * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TabPosition(left=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ", width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback) + ")";
        int i2 = onNavigationEvent + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFf1wSDKAFa1tSDK(float f, float f2) {
        this.IAuthTabCallback = f;
        this.onExtraCallback = f2;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i3 + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onExtraCallback;
        int i5 = i2 + 43;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.IAuthTabCallback + this.onExtraCallback);
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return fIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
