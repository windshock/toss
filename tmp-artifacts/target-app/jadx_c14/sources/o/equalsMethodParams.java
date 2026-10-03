package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class equalsMethodParams implements RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1 {
    public static final Parcelable.Creator<equalsMethodParams> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String arsOtp;
    private final String arsRequestID;

    public static final class onNavigationEvent implements Parcelable.Creator<equalsMethodParams> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final equalsMethodParams IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            equalsMethodParams equalsmethodparams = new equalsMethodParams(parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 27;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return equalsmethodparams;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ equalsMethodParams createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                IAuthTabCallback(parcel);
                throw null;
            }
            equalsMethodParams equalsmethodparamsIAuthTabCallback = IAuthTabCallback(parcel);
            int i3 = onExtraCallback + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return equalsmethodparamsIAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ equalsMethodParams[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 81;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            equalsMethodParams[] equalsmethodparamsArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 101;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return equalsmethodparamsArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final equalsMethodParams[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 95;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            equalsMethodParams[] equalsmethodparamsArr = new equalsMethodParams[i];
            int i6 = i4 + 63;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return equalsmethodparamsArr;
            }
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 111;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 113;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof equalsMethodParams)) {
            return false;
        }
        equalsMethodParams equalsmethodparams = (equalsMethodParams) obj;
        if (!(!Intrinsics.areEqual(this.arsRequestID, equalsmethodparams.arsRequestID))) {
            return Intrinsics.areEqual(this.arsOtp, equalsmethodparams.arsOtp);
        }
        int i4 = onExtraCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.arsRequestID.hashCode() * 31) + this.arsOtp.hashCode();
        int i4 = onExtraCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ARSAuthFormValue(arsRequestID=" + this.arsRequestID + ", arsOtp=" + this.arsOtp + ")";
        int i2 = onExtraCallbackWithResult + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.arsRequestID);
        parcel.writeString(this.arsOtp);
        int i5 = onExtraCallbackWithResult + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public equalsMethodParams(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.arsRequestID = str;
        this.arsOtp = str2;
    }
}
