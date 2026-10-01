package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextKtExternalSyntheticLambda12 {
    private final AvoidCaptureProcessProgressAvailabilityCheckQuirk IAuthTabCallback;
    private final BasicTextFieldKtExternalSyntheticLambda6 IAuthTabCallbackDefault;
    private final BasicTextFieldKtExternalSyntheticLambda7 asBinder;
    private final BasicTextFieldKtExternalSyntheticLambda8 onExtraCallback;
    private final BasicTextKtExternalSyntheticLambda11 onExtraCallbackWithResult;
    private final BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 onNavigationEvent;
    private final BasicTextFieldKtExternalSyntheticLambda5 onWarmupCompleted;

    public /* synthetic */ BasicTextKtExternalSyntheticLambda12(BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirk, BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0, BasicTextFieldKtExternalSyntheticLambda8 basicTextFieldKtExternalSyntheticLambda8, BasicTextFieldKtExternalSyntheticLambda6 basicTextFieldKtExternalSyntheticLambda6, BasicTextFieldKtExternalSyntheticLambda7 basicTextFieldKtExternalSyntheticLambda7, BasicTextFieldKtExternalSyntheticLambda5 basicTextFieldKtExternalSyntheticLambda5, DefaultConstructorMarker defaultConstructorMarker) {
        this(basicTextKtExternalSyntheticLambda11, avoidCaptureProcessProgressAvailabilityCheckQuirk, basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0, basicTextFieldKtExternalSyntheticLambda8, basicTextFieldKtExternalSyntheticLambda6, basicTextFieldKtExternalSyntheticLambda7, basicTextFieldKtExternalSyntheticLambda5);
    }

    private BasicTextKtExternalSyntheticLambda12(BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirk, BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0, BasicTextFieldKtExternalSyntheticLambda8 basicTextFieldKtExternalSyntheticLambda8, BasicTextFieldKtExternalSyntheticLambda6 basicTextFieldKtExternalSyntheticLambda6, BasicTextFieldKtExternalSyntheticLambda7 basicTextFieldKtExternalSyntheticLambda7, BasicTextFieldKtExternalSyntheticLambda5 basicTextFieldKtExternalSyntheticLambda5) {
        this.onExtraCallbackWithResult = basicTextKtExternalSyntheticLambda11;
        this.IAuthTabCallback = avoidCaptureProcessProgressAvailabilityCheckQuirk;
        this.onNavigationEvent = basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0;
        this.onExtraCallback = basicTextFieldKtExternalSyntheticLambda8;
        this.IAuthTabCallbackDefault = basicTextFieldKtExternalSyntheticLambda6;
        this.asBinder = basicTextFieldKtExternalSyntheticLambda7;
        this.onWarmupCompleted = basicTextFieldKtExternalSyntheticLambda5;
    }

    public /* synthetic */ BasicTextKtExternalSyntheticLambda12(BasicTextKtExternalSyntheticLambda11 basicTextKtExternalSyntheticLambda11, AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirk, BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0, BasicTextFieldKtExternalSyntheticLambda8 basicTextFieldKtExternalSyntheticLambda8, BasicTextFieldKtExternalSyntheticLambda6 basicTextFieldKtExternalSyntheticLambda6, BasicTextFieldKtExternalSyntheticLambda7 basicTextFieldKtExternalSyntheticLambda7, BasicTextFieldKtExternalSyntheticLambda5 basicTextFieldKtExternalSyntheticLambda5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? BasicTextFieldKtExternalSyntheticLambda9.onExtraCallbackWithResult.onNavigationEvent() : basicTextKtExternalSyntheticLambda11, (i2 & 2) != 0 ? null : avoidCaptureProcessProgressAvailabilityCheckQuirk, (i2 & 4) != 0 ? null : basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0, (i2 & 8) != 0 ? null : basicTextFieldKtExternalSyntheticLambda8, (i2 & 16) != 0 ? null : basicTextFieldKtExternalSyntheticLambda6, (i2 & 32) != 0 ? null : basicTextFieldKtExternalSyntheticLambda7, (i2 & 64) == 0 ? basicTextFieldKtExternalSyntheticLambda5 : null, null);
    }

    public final BasicTextKtExternalSyntheticLambda11 onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final AvoidCaptureProcessProgressAvailabilityCheckQuirk onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public final BasicTextFieldKtExternalSyntheticLambda8 IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final BasicTextFieldKtExternalSyntheticLambda6 asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    public final BasicTextFieldKtExternalSyntheticLambda7 onTransact() {
        return this.asBinder;
    }

    public final BasicTextFieldKtExternalSyntheticLambda5 onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicTextKtExternalSyntheticLambda12)) {
            return false;
        }
        BasicTextKtExternalSyntheticLambda12 basicTextKtExternalSyntheticLambda12 = (BasicTextKtExternalSyntheticLambda12) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, basicTextKtExternalSyntheticLambda12.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, basicTextKtExternalSyntheticLambda12.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, basicTextKtExternalSyntheticLambda12.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallback, basicTextKtExternalSyntheticLambda12.onExtraCallback) && Intrinsics.areEqual(this.asBinder, basicTextKtExternalSyntheticLambda12.asBinder) && Intrinsics.areEqual(this.IAuthTabCallbackDefault, basicTextKtExternalSyntheticLambda12.IAuthTabCallbackDefault) && Intrinsics.areEqual(this.onWarmupCompleted, basicTextKtExternalSyntheticLambda12.onWarmupCompleted);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        AvoidCaptureProcessProgressAvailabilityCheckQuirk avoidCaptureProcessProgressAvailabilityCheckQuirk = this.IAuthTabCallback;
        int iHashCode2 = avoidCaptureProcessProgressAvailabilityCheckQuirk != null ? avoidCaptureProcessProgressAvailabilityCheckQuirk.hashCode() : 0;
        BasicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 = this.onNavigationEvent;
        int iHashCode3 = basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0 != null ? basicTextFieldKtDefaultTextFieldDecorator1ExternalSyntheticLambda0.hashCode() : 0;
        BasicTextFieldKtExternalSyntheticLambda8 basicTextFieldKtExternalSyntheticLambda8 = this.onExtraCallback;
        int iHashCode4 = basicTextFieldKtExternalSyntheticLambda8 != null ? basicTextFieldKtExternalSyntheticLambda8.hashCode() : 0;
        BasicTextFieldKtExternalSyntheticLambda7 basicTextFieldKtExternalSyntheticLambda7 = this.asBinder;
        int iHashCode5 = basicTextFieldKtExternalSyntheticLambda7 != null ? basicTextFieldKtExternalSyntheticLambda7.hashCode() : 0;
        BasicTextFieldKtExternalSyntheticLambda6 basicTextFieldKtExternalSyntheticLambda6 = this.IAuthTabCallbackDefault;
        int iHashCode6 = basicTextFieldKtExternalSyntheticLambda6 != null ? basicTextFieldKtExternalSyntheticLambda6.hashCode() : 0;
        BasicTextFieldKtExternalSyntheticLambda5 basicTextFieldKtExternalSyntheticLambda5 = this.onWarmupCompleted;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (basicTextFieldKtExternalSyntheticLambda5 != null ? basicTextFieldKtExternalSyntheticLambda5.hashCode() : 0);
    }

    public String toString() {
        return "TextStyle(color=" + this.onExtraCallbackWithResult + ", fontSize=" + this.IAuthTabCallback + ", fontWeight=" + this.onNavigationEvent + ", fontStyle=" + this.onExtraCallback + ", textDecoration=" + this.asBinder + ", textAlign=" + this.IAuthTabCallbackDefault + ", fontFamily=" + this.onWarmupCompleted + ')';
    }
}
