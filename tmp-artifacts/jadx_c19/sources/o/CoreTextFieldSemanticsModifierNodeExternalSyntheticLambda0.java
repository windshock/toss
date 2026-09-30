package o;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0 {
    public final int IAuthTabCallback;
    public final int onExtraCallback;
    public final Surface onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final boolean onWarmupCompleted;

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0(Surface surface, int i2, int i3) {
        this(surface, i2, i3, 0);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0(Surface surface, int i2, int i3, int i4) {
        this(surface, i2, i3, i4, false);
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0(Surface surface, int i2, int i3, int i4, boolean z) {
        RecordingInputConnection_androidKt.onExtraCallback(i4 == 0 || i4 == 90 || i4 == 180 || i4 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.onExtraCallbackWithResult = surface;
        this.onExtraCallback = i2;
        this.onNavigationEvent = i3;
        this.IAuthTabCallback = i4;
        this.onWarmupCompleted = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0)) {
            return false;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda0 = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda0) obj;
        return this.onExtraCallback == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda0.onExtraCallback && this.onNavigationEvent == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda0.onNavigationEvent && this.IAuthTabCallback == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda0.IAuthTabCallback && this.onWarmupCompleted == coreTextFieldSemanticsModifierNodeExternalSyntheticLambda0.onWarmupCompleted && this.onExtraCallbackWithResult.equals(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int i2 = this.onExtraCallback;
        return (((((((iHashCode * 31) + i2) * 31) + this.onNavigationEvent) * 31) + this.IAuthTabCallback) * 31) + (this.onWarmupCompleted ? 1 : 0);
    }
}
