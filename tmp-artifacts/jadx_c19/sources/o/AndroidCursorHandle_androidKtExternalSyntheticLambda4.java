package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidCursorHandle_androidKtExternalSyntheticLambda4 {
    private final float IAuthTabCallback;
    private final float asBinder;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;
    private final float onWarmupCompleted;

    public /* synthetic */ AndroidCursorHandle_androidKtExternalSyntheticLambda4(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidCursorHandle_androidKtExternalSyntheticLambda4)) {
            return false;
        }
        AndroidCursorHandle_androidKtExternalSyntheticLambda4 androidCursorHandle_androidKtExternalSyntheticLambda4 = (AndroidCursorHandle_androidKtExternalSyntheticLambda4) obj;
        return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onNavigationEvent, androidCursorHandle_androidKtExternalSyntheticLambda4.onNavigationEvent) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onWarmupCompleted, androidCursorHandle_androidKtExternalSyntheticLambda4.onWarmupCompleted) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.asBinder, androidCursorHandle_androidKtExternalSyntheticLambda4.asBinder) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback, androidCursorHandle_androidKtExternalSyntheticLambda4.IAuthTabCallback) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallback, androidCursorHandle_androidKtExternalSyntheticLambda4.onExtraCallback) && VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(this.onExtraCallbackWithResult, androidCursorHandle_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult);
    }

    public int hashCode() {
        return (((((((((VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onNavigationEvent) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onWarmupCompleted)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.asBinder)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.IAuthTabCallback)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallback)) * 31) + VirtualCameraControlExternalSyntheticLambda1.onWarmupCompleted(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "PaddingInDp(left=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onNavigationEvent)) + ", start=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onWarmupCompleted)) + ", top=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder)) + ", right=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallback)) + ", end=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallback)) + ", bottom=" + ((Object) VirtualCameraControlExternalSyntheticLambda1.onExtraCallbackWithResult(this.onExtraCallbackWithResult)) + ')';
    }

    private AndroidCursorHandle_androidKtExternalSyntheticLambda4(float f, float f2, float f3, float f4, float f5, float f6) {
        this.onNavigationEvent = f;
        this.onWarmupCompleted = f2;
        this.asBinder = f3;
        this.IAuthTabCallback = f4;
        this.onExtraCallback = f5;
        this.onExtraCallbackWithResult = f6;
    }

    public final float onExtraCallback() {
        return this.onNavigationEvent;
    }

    public final float IAuthTabCallback() {
        return this.asBinder;
    }

    public final float onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public final float onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public final AndroidCursorHandle_androidKtExternalSyntheticLambda4 onWarmupCompleted(boolean z) {
        return new AndroidCursorHandle_androidKtExternalSyntheticLambda4(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.onNavigationEvent + (z ? this.onExtraCallback : this.onWarmupCompleted)), 0.0f, this.asBinder, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.IAuthTabCallback + (z ? this.onWarmupCompleted : this.onExtraCallback)), 0.0f, this.onExtraCallbackWithResult, 18, null);
    }

    public /* synthetic */ AndroidCursorHandle_androidKtExternalSyntheticLambda4(float f, float f2, float f3, float f4, float f5, float f6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f, (i2 & 2) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2, (i2 & 4) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f3, (i2 & 8) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f4, (i2 & 16) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f5, (i2 & 32) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f6, null);
    }
}
