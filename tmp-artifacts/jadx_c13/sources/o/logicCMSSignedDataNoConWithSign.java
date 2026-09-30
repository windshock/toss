package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class logicCMSSignedDataNoConWithSign implements logicCMSSignedData {
    private boolean IAuthTabCallback;
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private logicCMSEnvelopedData onWarmupCompleted;

    public logicCMSSignedDataNoConWithSign() {
        this(false, false, false, false, null, 31, null);
    }

    public static /* synthetic */ logicCMSSignedDataNoConWithSign IAuthTabCallback(logicCMSSignedDataNoConWithSign logiccmssigneddatanoconwithsign, boolean z, boolean z2, boolean z3, boolean z4, logicCMSEnvelopedData logiccmsenvelopeddata, int i, Object obj) {
        if ((i & 1) != 0) {
            z = logiccmssigneddatanoconwithsign.IAuthTabCallback;
        }
        if ((i & 2) != 0) {
            z2 = logiccmssigneddatanoconwithsign.onNavigationEvent;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = logiccmssigneddatanoconwithsign.onExtraCallback;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = logiccmssigneddatanoconwithsign.onExtraCallbackWithResult;
        }
        boolean z7 = z4;
        if ((i & 16) != 0) {
            logiccmsenvelopeddata = logiccmssigneddatanoconwithsign.onWarmupCompleted;
        }
        return logiccmssigneddatanoconwithsign.IAuthTabCallback(z, z5, z6, z7, logiccmsenvelopeddata);
    }

    public final logicCMSSignedDataNoConWithSign IAuthTabCallback(boolean z, boolean z2, boolean z3, boolean z4, @Nullable logicCMSEnvelopedData logiccmsenvelopeddata) {
        return new logicCMSSignedDataNoConWithSign(z, z2, z3, z4, logiccmsenvelopeddata);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logicCMSSignedDataNoConWithSign)) {
            return false;
        }
        logicCMSSignedDataNoConWithSign logiccmssigneddatanoconwithsign = (logicCMSSignedDataNoConWithSign) obj;
        return this.IAuthTabCallback == logiccmssigneddatanoconwithsign.IAuthTabCallback && this.onNavigationEvent == logiccmssigneddatanoconwithsign.onNavigationEvent && this.onExtraCallback == logiccmssigneddatanoconwithsign.onExtraCallback && this.onExtraCallbackWithResult == logiccmssigneddatanoconwithsign.onExtraCallbackWithResult && Intrinsics.areEqual(this.onWarmupCompleted, logiccmssigneddatanoconwithsign.onWarmupCompleted);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.IAuthTabCallback);
        int iHashCode2 = Boolean.hashCode(this.onNavigationEvent);
        int iHashCode3 = Boolean.hashCode(this.onExtraCallback);
        int iHashCode4 = Boolean.hashCode(this.onExtraCallbackWithResult);
        logicCMSEnvelopedData logiccmsenvelopeddata = this.onWarmupCompleted;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (logiccmsenvelopeddata == null ? 0 : logiccmsenvelopeddata.hashCode());
    }

    public String toString() {
        return "CreationArgumentsBuilderImpl(autoDestroyOnStatesReuse=" + this.IAuthTabCallback + ", isUndoEnabled=" + this.onNavigationEvent + ", doNotThrowOnMultipleTransitionsMatch=" + this.onExtraCallback + ", requireNonBlankNames=" + this.onExtraCallbackWithResult + ", eventRecordingArguments=" + this.onWarmupCompleted + ")";
    }

    public logicCMSSignedDataNoConWithSign(boolean z, boolean z2, boolean z3, boolean z4, @Nullable logicCMSEnvelopedData logiccmsenvelopeddata) {
        this.IAuthTabCallback = z;
        this.onNavigationEvent = z2;
        this.onExtraCallback = z3;
        this.onExtraCallbackWithResult = z4;
        this.onWarmupCompleted = logiccmsenvelopeddata;
    }

    public /* synthetic */ logicCMSSignedDataNoConWithSign(boolean z, boolean z2, boolean z3, boolean z4, logicCMSEnvelopedData logiccmsenvelopeddata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? null : logiccmsenvelopeddata);
    }

    @Override // o.InterfaceC0051getSignPrikey
    public boolean onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.InterfaceC0051getSignPrikey
    public boolean onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.InterfaceC0051getSignPrikey
    public boolean onNavigationEvent() {
        return this.onExtraCallback;
    }

    @Override // o.InterfaceC0051getSignPrikey
    public boolean IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.InterfaceC0051getSignPrikey
    public logicCMSEnvelopedData onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }
}
