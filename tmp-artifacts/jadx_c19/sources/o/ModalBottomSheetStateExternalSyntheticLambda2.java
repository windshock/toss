package o;

import androidx.annotation.Nullable;
import com.google.common.primitives.Longs;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetStateExternalSyntheticLambda2 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final long IAuthTabCallback;
    public final long onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final long onNavigationEvent;
    public final long onWarmupCompleted;

    public ModalBottomSheetStateExternalSyntheticLambda2(long j, long j2, long j3, long j4, long j5) {
        this.onExtraCallbackWithResult = j;
        this.onWarmupCompleted = j2;
        this.IAuthTabCallback = j3;
        this.onExtraCallback = j4;
        this.onNavigationEvent = j5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetStateExternalSyntheticLambda2.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetStateExternalSyntheticLambda2 modalBottomSheetStateExternalSyntheticLambda2 = (ModalBottomSheetStateExternalSyntheticLambda2) obj;
        return this.onExtraCallbackWithResult == modalBottomSheetStateExternalSyntheticLambda2.onExtraCallbackWithResult && this.onWarmupCompleted == modalBottomSheetStateExternalSyntheticLambda2.onWarmupCompleted && this.IAuthTabCallback == modalBottomSheetStateExternalSyntheticLambda2.IAuthTabCallback && this.onExtraCallback == modalBottomSheetStateExternalSyntheticLambda2.onExtraCallback && this.onNavigationEvent == modalBottomSheetStateExternalSyntheticLambda2.onNavigationEvent;
    }

    public int hashCode() {
        int iHashCode = Longs.hashCode(this.onExtraCallbackWithResult);
        int iHashCode2 = Longs.hashCode(this.onWarmupCompleted);
        return ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + Longs.hashCode(this.IAuthTabCallback)) * 31) + Longs.hashCode(this.onExtraCallback)) * 31) + Longs.hashCode(this.onNavigationEvent);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.onExtraCallbackWithResult + ", photoSize=" + this.onWarmupCompleted + ", photoPresentationTimestampUs=" + this.IAuthTabCallback + ", videoStartPosition=" + this.onExtraCallback + ", videoSize=" + this.onNavigationEvent;
    }
}
