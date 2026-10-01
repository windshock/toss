package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DatePickerKtExternalSyntheticLambda16 {
    private final DatePickerKtExternalSyntheticLambda31 IAuthTabCallback;
    private final DatePickerKtExternalSyntheticLambda31 onExtraCallback;
    private final DatePickerKtExternalSyntheticLambda31 onExtraCallbackWithResult;
    private final DatePickerKtExternalSyntheticLambda32 onNavigationEvent;
    private final DatePickerKtExternalSyntheticLambda32 onWarmupCompleted;

    public DatePickerKtExternalSyntheticLambda16(@NotNull DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31, @NotNull DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda312, @NotNull DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda313, @NotNull DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, @Nullable DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322) {
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda31, "");
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda312, "");
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda313, "");
        Intrinsics.checkNotNullParameter(datePickerKtExternalSyntheticLambda32, "");
        this.onExtraCallbackWithResult = datePickerKtExternalSyntheticLambda31;
        this.IAuthTabCallback = datePickerKtExternalSyntheticLambda312;
        this.onExtraCallback = datePickerKtExternalSyntheticLambda313;
        this.onWarmupCompleted = datePickerKtExternalSyntheticLambda32;
        this.onNavigationEvent = datePickerKtExternalSyntheticLambda322;
    }

    public /* synthetic */ DatePickerKtExternalSyntheticLambda16(DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda31, DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda312, DatePickerKtExternalSyntheticLambda31 datePickerKtExternalSyntheticLambda313, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32, DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda322, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(datePickerKtExternalSyntheticLambda31, datePickerKtExternalSyntheticLambda312, datePickerKtExternalSyntheticLambda313, datePickerKtExternalSyntheticLambda32, (i2 & 16) != 0 ? null : datePickerKtExternalSyntheticLambda322);
    }

    public final DatePickerKtExternalSyntheticLambda31 IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    public final DatePickerKtExternalSyntheticLambda31 onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public final DatePickerKtExternalSyntheticLambda31 onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final DatePickerKtExternalSyntheticLambda32 onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public final DatePickerKtExternalSyntheticLambda32 onExtraCallback() {
        return this.onNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(DatePickerKtExternalSyntheticLambda16.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        DatePickerKtExternalSyntheticLambda16 datePickerKtExternalSyntheticLambda16 = (DatePickerKtExternalSyntheticLambda16) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, datePickerKtExternalSyntheticLambda16.onExtraCallbackWithResult) && Intrinsics.areEqual(this.IAuthTabCallback, datePickerKtExternalSyntheticLambda16.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, datePickerKtExternalSyntheticLambda16.onExtraCallback) && Intrinsics.areEqual(this.onWarmupCompleted, datePickerKtExternalSyntheticLambda16.onWarmupCompleted) && Intrinsics.areEqual(this.onNavigationEvent, datePickerKtExternalSyntheticLambda16.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallbackWithResult.hashCode();
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.onExtraCallback.hashCode();
        int iHashCode4 = this.onWarmupCompleted.hashCode();
        DatePickerKtExternalSyntheticLambda32 datePickerKtExternalSyntheticLambda32 = this.onNavigationEvent;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (datePickerKtExternalSyntheticLambda32 != null ? datePickerKtExternalSyntheticLambda32.hashCode() : 0);
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.onExtraCallbackWithResult + ", prepend=" + this.IAuthTabCallback + ", append=" + this.onExtraCallback + ", source=" + this.onWarmupCompleted + ", mediator=" + this.onNavigationEvent + ')';
    }
}
