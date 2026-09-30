package o;

import androidx.annotation.Nullable;
import com.google.common.primitives.Floats;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetStateCompanionExternalSyntheticLambda1 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final float onExtraCallbackWithResult;
    public final int onNavigationEvent;

    public ModalBottomSheetStateCompanionExternalSyntheticLambda1(float f, int i2) {
        this.onExtraCallbackWithResult = f;
        this.onNavigationEvent = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetStateCompanionExternalSyntheticLambda1.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetStateCompanionExternalSyntheticLambda1 modalBottomSheetStateCompanionExternalSyntheticLambda1 = (ModalBottomSheetStateCompanionExternalSyntheticLambda1) obj;
        return this.onExtraCallbackWithResult == modalBottomSheetStateCompanionExternalSyntheticLambda1.onExtraCallbackWithResult && this.onNavigationEvent == modalBottomSheetStateCompanionExternalSyntheticLambda1.onNavigationEvent;
    }

    public int hashCode() {
        return ((Floats.hashCode(this.onExtraCallbackWithResult) + 527) * 31) + this.onNavigationEvent;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.onExtraCallbackWithResult + ", svcTemporalLayerCount=" + this.onNavigationEvent;
    }
}
