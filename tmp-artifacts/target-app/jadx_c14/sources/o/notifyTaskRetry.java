package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class notifyTaskRetry implements Parcelable {
    public static final Parcelable.Creator<notifyTaskRetry> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("groupId")
    private final long groupId;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName("koreanName")
    private final String koreanName;

    @SerializedName("name")
    private final String name;

    public static final class onExtraCallback implements Parcelable.Creator<notifyTaskRetry> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ notifyTaskRetry createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            notifyTaskRetry notifytaskretryOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = onNavigationEvent + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 94 / 0;
            }
            return notifytaskretryOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ notifyTaskRetry[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            notifyTaskRetry[] notifytaskretryArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return notifytaskretryArrOnWarmupCompleted;
        }

        public final notifyTaskRetry onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            notifyTaskRetry notifytaskretry = new notifyTaskRetry(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
            return notifytaskretry;
        }

        public final notifyTaskRetry[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 5;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            notifyTaskRetry[] notifytaskretryArr = new notifyTaskRetry[i];
            int i6 = i3 + 89;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return notifytaskretryArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 87;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public notifyTaskRetry() {
        this(0L, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 121;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 35;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(obj instanceof notifyTaskRetry)) {
            int i7 = i4 + 55;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        notifyTaskRetry notifytaskretry = (notifyTaskRetry) obj;
        if (this.groupId != notifytaskretry.groupId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconUrl, notifytaskretry.iconUrl)) {
            int i9 = IAuthTabCallback + 95;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.name, notifytaskretry.name)) {
            int i11 = IAuthTabCallback + 115;
            onWarmupCompleted = i11 % 128;
            return i11 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.koreanName, notifytaskretry.koreanName)) {
            int i12 = onWarmupCompleted + 55;
            IAuthTabCallback = i12 % 128;
            return i12 % 2 == 0;
        }
        int i13 = IAuthTabCallback + 105;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        IAuthTabCallback = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((((Long.hashCode(this.groupId) << 100) / this.iconUrl.hashCode()) >> 50) + this.name.hashCode()) + 93) - this.koreanName.hashCode() : (((((Long.hashCode(this.groupId) * 31) + this.iconUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.koreanName.hashCode();
        int i3 = IAuthTabCallback + 89;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FangirlSavingBoxGroup(groupId=" + this.groupId + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", koreanName=" + this.koreanName + ")";
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.groupId);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.koreanName);
        int i5 = onWarmupCompleted + 13;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public notifyTaskRetry(long j, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.groupId = j;
        this.iconUrl = str;
        this.name = str2;
        this.koreanName = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ notifyTaskRetry(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 1;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            j = -1;
        }
        long j2 = j;
        String str5 = (i & 2) != 0 ? "" : str;
        String str6 = (i & 4) != 0 ? "" : str2;
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 73;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str4 = "";
        } else {
            str4 = str3;
        }
        this(j2, str5, str6, str4);
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.groupId;
        int i5 = i2 + 87;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
        return j;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i3 + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 79;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.koreanName;
        int i5 = i3 + 65;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
