package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.toCircle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RoundedCornersPostprocessor implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoundedCornersPostprocessor> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("designCode")
    private final toCircle.IAuthTabCallback designCode;

    @SerializedName("directIssueCard")
    private final boolean directIssueCard;

    @SerializedName("traffic")
    private final boolean traffic;

    public static final class onNavigationEvent implements Parcelable.Creator<RoundedCornersPostprocessor> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RoundedCornersPostprocessor createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            RoundedCornersPostprocessor roundedCornersPostprocessorOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return roundedCornersPostprocessorOnWarmupCompleted;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ RoundedCornersPostprocessor[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            RoundedCornersPostprocessor[] roundedCornersPostprocessorArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return roundedCornersPostprocessorArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final RoundedCornersPostprocessor onWarmupCompleted(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                int i4 = onExtraCallbackWithResult + 47;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            toCircle.IAuthTabCallback iAuthTabCallbackValueOf = parcel.readInt() == 0 ? null : toCircle.IAuthTabCallback.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i6 = onExtraCallbackWithResult + 125;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                z2 = false;
            }
            return new RoundedCornersPostprocessor(z, iAuthTabCallbackValueOf, z2);
        }

        public final RoundedCornersPostprocessor[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i3 % 128;
            RoundedCornersPostprocessor[] roundedCornersPostprocessorArr = new RoundedCornersPostprocessor[i];
            if (i3 % 2 != 0) {
                int i4 = 61 / 0;
            }
            return roundedCornersPostprocessorArr;
        }
    }

    static {
        int i = onNavigationEvent + 101;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public RoundedCornersPostprocessor() {
        this(false, null, false, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundedCornersPostprocessor)) {
            return false;
        }
        RoundedCornersPostprocessor roundedCornersPostprocessor = (RoundedCornersPostprocessor) obj;
        if (this.directIssueCard != roundedCornersPostprocessor.directIssueCard) {
            int i2 = IAuthTabCallback + 47;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.designCode != roundedCornersPostprocessor.designCode) {
            int i4 = IAuthTabCallback + 3;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.traffic == roundedCornersPostprocessor.traffic) {
            return true;
        }
        int i5 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.directIssueCard);
        toCircle.IAuthTabCallback iAuthTabCallback = this.designCode;
        if (iAuthTabCallback == null) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = iAuthTabCallback.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode) * 31) + Boolean.hashCode(this.traffic);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccIssueResp(directIssueCard=" + this.directIssueCard + ", designCode=" + this.designCode + ", traffic=" + this.traffic + ")";
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeInt(this.directIssueCard ? 1 : 0);
        toCircle.IAuthTabCallback iAuthTabCallback = this.designCode;
        if (iAuthTabCallback == null) {
            int i3 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            parcel.writeInt(0);
            int i5 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeString(iAuthTabCallback.name());
        }
        parcel.writeInt(this.traffic ? 1 : 0);
    }

    public RoundedCornersPostprocessor(boolean z, @Nullable toCircle.IAuthTabCallback iAuthTabCallback, boolean z2) {
        this.directIssueCard = z;
        this.designCode = iAuthTabCallback;
        this.traffic = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RoundedCornersPostprocessor(boolean z, toCircle.IAuthTabCallback iAuthTabCallback, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            iAuthTabCallback = null;
        }
        if ((i & 4) != 0) {
            int i7 = 2 % 2;
            z2 = false;
        }
        this(z, iAuthTabCallback, z2);
    }
}
