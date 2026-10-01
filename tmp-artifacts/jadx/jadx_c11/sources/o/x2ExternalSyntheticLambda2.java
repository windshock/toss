package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final float IAuthTabCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;

    public /* synthetic */ x2ExternalSyntheticLambda2(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }

    private x2ExternalSyntheticLambda2(float f, float f2, float f3) {
        this.IAuthTabCallback = f;
        this.onNavigationEvent = f2;
        this.onExtraCallbackWithResult = f3;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 7;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i2 + 35;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return f;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        float f = this.onNavigationEvent;
        int i5 = i3 + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onExtraCallbackWithResult;
        int i5 = i2 + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof x2ExternalSyntheticLambda2) {
            x2ExternalSyntheticLambda2 x2externalsyntheticlambda2 = (x2ExternalSyntheticLambda2) obj;
            return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, x2externalsyntheticlambda2.IAuthTabCallback) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, x2externalsyntheticlambda2.onNavigationEvent) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, x2externalsyntheticlambda2.onExtraCallbackWithResult);
        }
        int i4 = onWarmupCompleted + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult);
        int i4 = onWarmupCompleted + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ItemPosition(left=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ", right=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(onExtraCallbackWithResult()) + ", width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ")";
        int i2 = onExtraCallback + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return str;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallback = i2 % 128;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i2 % 2 == 0 ? this.IAuthTabCallback * this.onNavigationEvent : this.IAuthTabCallback + this.onNavigationEvent);
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }
}
