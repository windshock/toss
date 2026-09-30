package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class NativeAccessibilityManagerSpec implements Parcelable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    @SerializedName("cddExpireDate")
    private final String cddExpireDate;

    @SerializedName("cddState")
    private final isAccessibilityServiceEnabled cddState;

    @SerializedName("eddExpireDate")
    private final String eddExpireDate;

    @SerializedName("eddState")
    private final announceForAccessibilityWithOptions eddState;

    @SerializedName("lastCddDoneDate")
    private final String lastCddDoneDate;

    @SerializedName("lastEddDoneDate")
    private final String lastEddDoneDate;
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final Parcelable.Creator<NativeAccessibilityManagerSpec> CREATOR = new onWarmupCompleted();

    public static final class onWarmupCompleted implements Parcelable.Creator<NativeAccessibilityManagerSpec> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAccessibilityManagerSpec createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            NativeAccessibilityManagerSpec nativeAccessibilityManagerSpecOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            int i5 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return nativeAccessibilityManagerSpecOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NativeAccessibilityManagerSpec[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            NativeAccessibilityManagerSpec[] nativeAccessibilityManagerSpecArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 == 0) {
                int i5 = 47 / 0;
            }
            int i6 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return nativeAccessibilityManagerSpecArrOnNavigationEvent;
        }

        public final NativeAccessibilityManagerSpec onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            NativeAccessibilityManagerSpec nativeAccessibilityManagerSpec = new NativeAccessibilityManagerSpec(isAccessibilityServiceEnabled.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), announceForAccessibilityWithOptions.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return nativeAccessibilityManagerSpec;
        }

        public final NativeAccessibilityManagerSpec[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 33;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            NativeAccessibilityManagerSpec[] nativeAccessibilityManagerSpecArr = new NativeAccessibilityManagerSpec[i];
            int i6 = i4 + 45;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return nativeAccessibilityManagerSpecArr;
        }
    }

    static {
        int i = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public NativeAccessibilityManagerSpec() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 53;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeAccessibilityManagerSpec)) {
            return false;
        }
        NativeAccessibilityManagerSpec nativeAccessibilityManagerSpec = (NativeAccessibilityManagerSpec) obj;
        if (this.cddState != nativeAccessibilityManagerSpec.cddState) {
            int i4 = i2 + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cddExpireDate, nativeAccessibilityManagerSpec.cddExpireDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lastCddDoneDate, nativeAccessibilityManagerSpec.lastCddDoneDate)) {
            int i6 = IAuthTabCallback + 47;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.eddState == nativeAccessibilityManagerSpec.eddState) {
            return Intrinsics.areEqual(this.eddExpireDate, nativeAccessibilityManagerSpec.eddExpireDate) && Intrinsics.areEqual(this.lastEddDoneDate, nativeAccessibilityManagerSpec.lastEddDoneDate);
        }
        int i8 = onExtraCallback + 21;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.cddState.hashCode();
        String str = this.cddExpireDate;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = onExtraCallback + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.lastCddDoneDate;
        if (str2 == null) {
            int i4 = onExtraCallback + 97;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        int iHashCode5 = this.eddState.hashCode();
        String str3 = this.eddExpireDate;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lastEddDoneDate;
        if (str4 != null) {
            iHashCode4 = str4.hashCode();
            int i6 = onExtraCallback + 17;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "KycInfo(cddState=" + this.cddState + ", cddExpireDate=" + this.cddExpireDate + ", lastCddDoneDate=" + this.lastCddDoneDate + ", eddState=" + this.eddState + ", eddExpireDate=" + this.eddExpireDate + ", lastEddDoneDate=" + this.lastEddDoneDate + ")";
        int i2 = IAuthTabCallback + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.cddState.name());
        parcel.writeString(this.cddExpireDate);
        parcel.writeString(this.lastCddDoneDate);
        parcel.writeString(this.eddState.name());
        parcel.writeString(this.eddExpireDate);
        parcel.writeString(this.lastEddDoneDate);
        int i5 = onExtraCallback + 81;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public NativeAccessibilityManagerSpec(@NotNull isAccessibilityServiceEnabled isaccessibilityserviceenabled, @Nullable String str, @Nullable String str2, @NotNull announceForAccessibilityWithOptions announceforaccessibilitywithoptions, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(isaccessibilityserviceenabled, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(announceforaccessibilitywithoptions, BuildConfig.FLAVOR);
        this.cddState = isaccessibilityserviceenabled;
        this.cddExpireDate = str;
        this.lastCddDoneDate = str2;
        this.eddState = announceforaccessibilitywithoptions;
        this.eddExpireDate = str3;
        this.lastEddDoneDate = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NativeAccessibilityManagerSpec(isAccessibilityServiceEnabled isaccessibilityserviceenabled, String str, String str2, announceForAccessibilityWithOptions announceforaccessibilitywithoptions, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                isAccessibilityServiceEnabled isaccessibilityserviceenabled2 = isAccessibilityServiceEnabled.NOT_NEEDED;
                throw null;
            }
            isaccessibilityserviceenabled = isAccessibilityServiceEnabled.NOT_NEEDED;
        }
        if ((i & 2) != 0) {
            int i3 = onExtraCallback + 61;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 % 3;
            } else {
                int i5 = 2 % 2;
            }
            str5 = null;
        } else {
            str5 = str;
        }
        String str6 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            int i6 = IAuthTabCallback + 31;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                announceForAccessibilityWithOptions announceforaccessibilitywithoptions2 = announceForAccessibilityWithOptions.NOT_NEEDED;
                str.hashCode();
                throw null;
            }
            announceforaccessibilitywithoptions = announceForAccessibilityWithOptions.NOT_NEEDED;
            int i7 = 2 % 2;
        }
        this(isaccessibilityserviceenabled, str5, str6, announceforaccessibilitywithoptions, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
