package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SavedStateConfiguration_androidKtExternalSyntheticLambda0 {
    private final float IAuthTabCallback;
    private final float onExtraCallback;
    private final float onExtraCallbackWithResult;
    private final float onNavigationEvent;

    public SavedStateConfiguration_androidKtExternalSyntheticLambda0() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedStateConfiguration_androidKtExternalSyntheticLambda0)) {
            return false;
        }
        SavedStateConfiguration_androidKtExternalSyntheticLambda0 savedStateConfiguration_androidKtExternalSyntheticLambda0 = (SavedStateConfiguration_androidKtExternalSyntheticLambda0) obj;
        return Float.compare(this.onNavigationEvent, savedStateConfiguration_androidKtExternalSyntheticLambda0.onNavigationEvent) == 0 && Float.compare(this.onExtraCallbackWithResult, savedStateConfiguration_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult) == 0 && Float.compare(this.onExtraCallback, savedStateConfiguration_androidKtExternalSyntheticLambda0.onExtraCallback) == 0 && Float.compare(this.IAuthTabCallback, savedStateConfiguration_androidKtExternalSyntheticLambda0.IAuthTabCallback) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.onNavigationEvent) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "ContentInset(top=" + this.onNavigationEvent + ", left=" + this.onExtraCallbackWithResult + ", bottom=" + this.onExtraCallback + ", right=" + this.IAuthTabCallback + ")";
    }

    public SavedStateConfiguration_androidKtExternalSyntheticLambda0(float f, float f2, float f3, float f4) {
        this.onNavigationEvent = f;
        this.onExtraCallbackWithResult = f2;
        this.onExtraCallback = f3;
        this.IAuthTabCallback = f4;
    }

    public /* synthetic */ SavedStateConfiguration_androidKtExternalSyntheticLambda0(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final float onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public final float onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final float onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final float onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }
}
