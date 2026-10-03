package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class VideoStartReason extends AdComponentViewParentApi implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<VideoStartReason> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("accountName")
    private final String accountName;

    @SerializedName("accountNo")
    private final String accountNo;

    @SerializedName("subscriptionRequestType")
    private final onExtraCallback subscriptionRequestType;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<VideoStartReason> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        public final VideoStartReason IAuthTabCallback(Parcel parcel) {
            onExtraCallback onextracallbackValueOf;
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i4 = onExtraCallback + 29;
                onWarmupCompleted = i4 % 128;
                onextracallbackValueOf = null;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                }
            } else {
                onextracallbackValueOf = onExtraCallback.valueOf(parcel.readString());
            }
            VideoStartReason videoStartReason = new VideoStartReason(onextracallbackValueOf, parcel.readString(), parcel.readString());
            int i6 = onExtraCallback + 45;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return videoStartReason;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ VideoStartReason createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            VideoStartReason videoStartReasonIAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onWarmupCompleted + 61;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return videoStartReasonIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ VideoStartReason[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 27;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            VideoStartReason[] videoStartReasonArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onExtraCallback + 31;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return videoStartReasonArrOnWarmupCompleted;
        }

        public final VideoStartReason[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 37;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            VideoStartReason[] videoStartReasonArr = new VideoStartReason[i];
            if (i3 % 2 == 0) {
                int i5 = 17 / 0;
            }
            int i6 = i4 + 49;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return videoStartReasonArr;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 41;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    public VideoStartReason() {
        this(null, null, null, 7, null);
    }

    @Override // o.AdComponentViewParentApi, android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof VideoStartReason)) {
            int i3 = IAuthTabCallback + 121;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0;
        }
        VideoStartReason videoStartReason = (VideoStartReason) obj;
        if (this.subscriptionRequestType != videoStartReason.subscriptionRequestType) {
            int i4 = onNavigationEvent + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.accountNo, videoStartReason.accountNo)) {
            int i6 = onNavigationEvent + 81;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.accountName, videoStartReason.accountName)) {
            return true;
        }
        int i8 = IAuthTabCallback + 121;
        onNavigationEvent = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback onextracallback = this.subscriptionRequestType;
        int i4 = 0;
        int iHashCode = onextracallback == null ? 0 : onextracallback.hashCode();
        String str = this.accountNo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.accountName;
        if (str2 != null) {
            int i5 = IAuthTabCallback + 81;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode3 = str2.hashCode();
            if (i6 != 0) {
                int i7 = 25 / 0;
            }
            i4 = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AccountNotificationSubscription(subscriptionRequestType=" + this.subscriptionRequestType + ", accountNo=" + this.accountNo + ", accountName=" + this.accountName + ")";
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
        return str;
    }

    @Override // o.AdComponentViewParentApi, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        onExtraCallback onextracallback = this.subscriptionRequestType;
        if (onextracallback == null) {
            int i5 = IAuthTabCallback + 97;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            parcel.writeInt(0);
            int i7 = onNavigationEvent + 101;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeString(onextracallback.name());
        }
        parcel.writeString(this.accountNo);
        parcel.writeString(this.accountName);
    }

    public VideoStartReason(@Nullable onExtraCallback onextracallback, @Nullable String str, @Nullable String str2) {
        super(0, null, 0, false, null, false, false, null, 255, null);
        this.subscriptionRequestType = onextracallback;
        this.accountNo = str;
        this.accountName = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoStartReason(onExtraCallback onextracallback, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 31;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 3;
            } else {
                int i4 = 2 % 2;
            }
            onextracallback = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 85;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        }
        if ((i & 4) != 0) {
            int i6 = onNavigationEvent;
            int i7 = i6 + 111;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i8 = i6 + 5;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str2 = null;
        }
        this(onextracallback, str, str2);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNo;
        int i5 = i2 + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.accountName;
        int i5 = i3 + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoStartReason(@NotNull onExtraCallback onextracallback, int i, @Nullable String str) {
        this(onextracallback, str, (String) null);
        Intrinsics.checkNotNullParameter(onextracallback, "");
        onExtraCallbackWithResult(i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;

        @SerializedName("SUBSCRIBE")
        public static final onExtraCallback SUBSCRIBE = new onExtraCallback("SUBSCRIBE", 0);

        @SerializedName("UNSUBSCRIBE")
        public static final onExtraCallback UNSUBSCRIBE = new onExtraCallback("UNSUBSCRIBE", 1);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 81;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {SUBSCRIBE, UNSUBSCRIBE};
            int i5 = i2 + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i3 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            if (i3 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 25;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i3 = onWarmupCompleted + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallback + 67;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
