package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0 implements Parcelable {
    private final int IAuthTabCallback;
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final Parcelable.Creator<DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0> CREATOR = new onWarmupCompleted();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0) && this.IAuthTabCallback == ((DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0) obj).IAuthTabCallback;
    }

    public int hashCode() {
        return Integer.hashCode(this.IAuthTabCallback);
    }

    public String toString() {
        return "PagingPlaceholderKey(index=" + this.IAuthTabCallback + ')';
    }

    public DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0(int i2) {
        this.IAuthTabCallback = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i2) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.IAuthTabCallback);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static final class onWarmupCompleted implements Parcelable.Creator<DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0> {
        onWarmupCompleted() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0 createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0[] newArray(int i2) {
            return new DateRangePickerKtDateRangePicker6ExternalSyntheticLambda0[i2];
        }
    }
}
