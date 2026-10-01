package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final float IAuthTabCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;

    public /* synthetic */ r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }

    private r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE(float f, float f2, float f3) {
        this.onNavigationEvent = f;
        this.onExtraCallbackWithResult = f2;
        this.IAuthTabCallback = f3;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        float f = this.IAuthTabCallback;
        int i5 = i3 + 67;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return f;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.onNavigationEvent;
        int i4 = i2 + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE)) {
            int i4 = onWarmupCompleted + 9;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE r8lambdaeefvmne8k6v5fl9rzzhexzkg1me = (r8lambdaEefVMNE8K6V5fL9RzzheXzkG1mE) obj;
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.onNavigationEvent)) {
            int i6 = onExtraCallback + 123;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.onExtraCallbackWithResult)) {
            return false;
        }
        if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, r8lambdaeefvmne8k6v5fl9rzzhexzkg1me.IAuthTabCallback)) {
            return true;
        }
        int i7 = onWarmupCompleted + 45;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent) % 60) - VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult)) / 36) * VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
        }
        return (((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ItemPosition(left=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent) + ", right=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(onNavigationEvent()) + ", width=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult) + ", height=" + VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback) + ")";
        int i2 = onExtraCallback + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i2 % 2 != 0 ? this.onNavigationEvent * this.onExtraCallbackWithResult : this.onNavigationEvent + this.onExtraCallbackWithResult);
        int i3 = onWarmupCompleted + 23;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return fIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
