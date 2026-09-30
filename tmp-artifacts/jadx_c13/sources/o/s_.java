package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class s_ {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;

    public /* synthetic */ s_(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s_)) {
            return false;
        }
        s_ s_Var = (s_) obj;
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, s_Var.onNavigationEvent)) {
            int i2 = IAuthTabCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, s_Var.onExtraCallbackWithResult)) {
            return true;
        }
        int i4 = IAuthTabCallback + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = (VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult);
        int i4 = onWarmupCompleted + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iOnWarmupCompleted;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LayoutInfo(offset=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ")";
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private s_(float f, float f2) {
        this.onNavigationEvent = f;
        this.onExtraCallbackWithResult = f2;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onNavigationEvent;
        int i5 = i2 + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return f;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onExtraCallbackWithResult;
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }
}
