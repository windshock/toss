package o;

import androidx.annotation.Nullable;
import java.util.Objects;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionAdjustmentCompanionExternalSyntheticLambda4 {
    public final long IAuthTabCallback;
    public final boolean IAuthTabCallbackDefault;
    public final long IAuthTabCallbackStub;
    public final boolean asBinder;
    public final boolean asInterface;
    public final BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallback;
    public final boolean onExtraCallbackWithResult;
    public final boolean onNavigationEvent;
    public final long onTransact;
    public final long onWarmupCompleted;

    SelectionAdjustmentCompanionExternalSyntheticLambda4(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = false;
        RecordingInputConnection_androidKt.onNavigationEvent(!z5 || z3);
        RecordingInputConnection_androidKt.onNavigationEvent(!z4 || z3);
        if (!z2 || (!z3 && !z4 && !z5)) {
            z6 = true;
        }
        RecordingInputConnection_androidKt.onNavigationEvent(z6);
        this.onExtraCallback = onextracallbackwithresult;
        this.onTransact = j;
        this.IAuthTabCallbackStub = j2;
        this.onWarmupCompleted = j3;
        this.IAuthTabCallback = j4;
        this.IAuthTabCallbackDefault = z;
        this.onNavigationEvent = z2;
        this.asInterface = z3;
        this.asBinder = z4;
        this.onExtraCallbackWithResult = z5;
    }

    public SelectionAdjustmentCompanionExternalSyntheticLambda4 onExtraCallbackWithResult(long j) {
        return j == this.onTransact ? this : new SelectionAdjustmentCompanionExternalSyntheticLambda4(this.onExtraCallback, j, this.IAuthTabCallbackStub, this.onWarmupCompleted, this.IAuthTabCallback, this.IAuthTabCallbackDefault, this.onNavigationEvent, this.asInterface, this.asBinder, this.onExtraCallbackWithResult);
    }

    public SelectionAdjustmentCompanionExternalSyntheticLambda4 onNavigationEvent(long j) {
        return j == this.IAuthTabCallbackStub ? this : new SelectionAdjustmentCompanionExternalSyntheticLambda4(this.onExtraCallback, this.onTransact, j, this.onWarmupCompleted, this.IAuthTabCallback, this.IAuthTabCallbackDefault, this.onNavigationEvent, this.asInterface, this.asBinder, this.onExtraCallbackWithResult);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectionAdjustmentCompanionExternalSyntheticLambda4.class != obj.getClass()) {
            return false;
        }
        SelectionAdjustmentCompanionExternalSyntheticLambda4 selectionAdjustmentCompanionExternalSyntheticLambda4 = (SelectionAdjustmentCompanionExternalSyntheticLambda4) obj;
        return this.onTransact == selectionAdjustmentCompanionExternalSyntheticLambda4.onTransact && this.IAuthTabCallbackStub == selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackStub && this.onWarmupCompleted == selectionAdjustmentCompanionExternalSyntheticLambda4.onWarmupCompleted && this.IAuthTabCallback == selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallback && this.IAuthTabCallbackDefault == selectionAdjustmentCompanionExternalSyntheticLambda4.IAuthTabCallbackDefault && this.onNavigationEvent == selectionAdjustmentCompanionExternalSyntheticLambda4.onNavigationEvent && this.asInterface == selectionAdjustmentCompanionExternalSyntheticLambda4.asInterface && this.asBinder == selectionAdjustmentCompanionExternalSyntheticLambda4.asBinder && this.onExtraCallbackWithResult == selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallbackWithResult && Objects.equals(this.onExtraCallback, selectionAdjustmentCompanionExternalSyntheticLambda4.onExtraCallback);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallback.hashCode();
        int i2 = (int) this.onTransact;
        int i3 = (int) this.IAuthTabCallbackStub;
        int i4 = (int) this.onWarmupCompleted;
        return ((((((((((((((((((iHashCode + 527) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + ((int) this.IAuthTabCallback)) * 31) + (this.IAuthTabCallbackDefault ? 1 : 0)) * 31) + (this.onNavigationEvent ? 1 : 0)) * 31) + (this.asInterface ? 1 : 0)) * 31) + (this.asBinder ? 1 : 0)) * 31) + (this.onExtraCallbackWithResult ? 1 : 0);
    }
}
