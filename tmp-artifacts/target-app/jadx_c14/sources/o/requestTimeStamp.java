package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class requestTimeStamp implements Parcelable {
    public static final Parcelable.Creator<requestTimeStamp> CREATOR = new onExtraCallback();
    private final String IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String onExtraCallback;
    private Function0<Unit> onExtraCallbackWithResult;
    private Object onNavigationEvent;
    private final Boolean onTransact;
    private final int onWarmupCompleted;

    public static final class onExtraCallback implements Parcelable.Creator<requestTimeStamp> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final requestTimeStamp[] newArray(int i) {
            return new requestTimeStamp[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final requestTimeStamp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new requestTimeStamp(string, i, string2, z, boolValueOf, parcel.readString());
        }
    }

    public requestTimeStamp() {
        this(null, 0, null, false, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof requestTimeStamp)) {
            return false;
        }
        requestTimeStamp requesttimestamp = (requestTimeStamp) obj;
        return Intrinsics.areEqual(this.IAuthTabCallbackStub, requesttimestamp.IAuthTabCallbackStub) && this.onWarmupCompleted == requesttimestamp.onWarmupCompleted && Intrinsics.areEqual(this.IAuthTabCallback, requesttimestamp.IAuthTabCallback) && this.IAuthTabCallbackDefault == requesttimestamp.IAuthTabCallbackDefault && Intrinsics.areEqual(this.onTransact, requesttimestamp.onTransact) && Intrinsics.areEqual(this.onExtraCallback, requesttimestamp.onExtraCallback);
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallbackStub.hashCode();
        int iHashCode2 = Integer.hashCode(this.onWarmupCompleted);
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = Boolean.hashCode(this.IAuthTabCallbackDefault);
        Boolean bool = this.onTransact;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str = this.onExtraCallback;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BottomSheetItem(title=" + this.IAuthTabCallbackStub + ", iconResId=" + this.onWarmupCompleted + ", iconUrl=" + this.IAuthTabCallback + ", visibleArrow=" + this.IAuthTabCallbackDefault + ", isSelected=" + this.onTransact + ", description=" + this.onExtraCallback + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iBooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.IAuthTabCallbackStub);
        parcel.writeInt(this.onWarmupCompleted);
        parcel.writeString(this.IAuthTabCallback);
        parcel.writeInt(this.IAuthTabCallbackDefault ? 1 : 0);
        Boolean bool = this.onTransact;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            parcel.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        parcel.writeInt(iBooleanValue);
        parcel.writeString(this.onExtraCallback);
    }

    public requestTimeStamp(@NotNull String str, int i, @NotNull String str2, boolean z, @Nullable Boolean bool, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallbackStub = str;
        this.onWarmupCompleted = i;
        this.IAuthTabCallback = str2;
        this.IAuthTabCallbackDefault = z;
        this.onTransact = bool;
        this.onExtraCallback = str3;
    }

    public /* synthetic */ requestTimeStamp(String str, int i, String str2, boolean z, Boolean bool, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? str2 : "", (i2 & 8) == 0 ? z : false, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str3);
    }

    public final String asInterface() {
        return this.IAuthTabCallbackStub;
    }

    public final int onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public final String onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public final boolean IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    public final Boolean IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public final String onNavigationEvent() {
        return this.onExtraCallback;
    }

    public final Object IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public final void onWarmupCompleted(@Nullable Object obj) {
        this.onNavigationEvent = obj;
    }

    public final void onExtraCallback(@Nullable Function0<Unit> function0) {
        this.onExtraCallbackWithResult = function0;
    }

    public final Function0<Unit> onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }
}
