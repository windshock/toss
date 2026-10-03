package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accessgetReactApplicationContextIfActiveOrWarn implements Parcelable {
    public static final Parcelable.Creator<accessgetReactApplicationContextIfActiveOrWarn> CREATOR = new IAuthTabCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("name")
    private final String name;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("userNo")
    private final long userNo;

    public static final class IAuthTabCallback implements Parcelable.Creator<accessgetReactApplicationContextIfActiveOrWarn> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ accessgetReactApplicationContextIfActiveOrWarn createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 123;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(parcel);
                throw null;
            }
            accessgetReactApplicationContextIfActiveOrWarn accessgetreactapplicationcontextifactiveorwarnOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i3 = onNavigationEvent + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return accessgetreactapplicationcontextifactiveorwarnOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ accessgetReactApplicationContextIfActiveOrWarn[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 117;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            accessgetReactApplicationContextIfActiveOrWarn[] accessgetreactapplicationcontextifactiveorwarnArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onNavigationEvent + 43;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return accessgetreactapplicationcontextifactiveorwarnArrOnWarmupCompleted;
        }

        public final accessgetReactApplicationContextIfActiveOrWarn onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            accessgetReactApplicationContextIfActiveOrWarn accessgetreactapplicationcontextifactiveorwarn = new accessgetReactApplicationContextIfActiveOrWarn(parcel.readString(), parcel.readString(), parcel.readLong());
            int i2 = onExtraCallback + 39;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return accessgetreactapplicationcontextifactiveorwarn;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final accessgetReactApplicationContextIfActiveOrWarn[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 85;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            accessgetReactApplicationContextIfActiveOrWarn[] accessgetreactapplicationcontextifactiveorwarnArr = new accessgetReactApplicationContextIfActiveOrWarn[i];
            int i6 = i4 + 37;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return accessgetreactapplicationcontextifactiveorwarnArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 47;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 113;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof accessgetReactApplicationContextIfActiveOrWarn)) {
            return false;
        }
        accessgetReactApplicationContextIfActiveOrWarn accessgetreactapplicationcontextifactiveorwarn = (accessgetReactApplicationContextIfActiveOrWarn) obj;
        return Intrinsics.areEqual(this.name, accessgetreactapplicationcontextifactiveorwarn.name) && Intrinsics.areEqual(this.phone, accessgetreactapplicationcontextifactiveorwarn.phone) && this.userNo == accessgetreactapplicationcontextifactiveorwarn.userNo;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.name.hashCode() * 31) + this.phone.hashCode()) * 31) + Long.hashCode(this.userNo);
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DutchPayInvitation(name=" + this.name + ", phone=" + this.phone + ", userNo=" + this.userNo + ")";
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.phone);
        parcel.writeLong(this.userNo);
        int i5 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public accessgetReactApplicationContextIfActiveOrWarn(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.phone = str2;
        this.userNo = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ accessgetReactApplicationContextIfActiveOrWarn(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted + 37;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 88 / 0;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i4 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            j = -1;
        }
        this(str, str2, j);
    }

    public final String onNavigationEvent() {
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 == 0) {
            str = this.name;
            int i4 = 95 / 0;
        } else {
            str = this.name;
        }
        int i5 = i3 + 17;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.phone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        long j = this.userNo;
        int i5 = i3 + 111;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
