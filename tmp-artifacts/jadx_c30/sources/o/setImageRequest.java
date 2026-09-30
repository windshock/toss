package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setImageRequest implements Parcelable {
    public static final Parcelable.Creator<setImageRequest> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private long jointTotalBalance;
    private String reasonType;
    private long savingTotalBalance;

    public static final class onExtraCallback implements Parcelable.Creator<setImageRequest> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setImageRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setImageRequest setimagerequestOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = onNavigationEvent + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return setimagerequestOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setImageRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 113;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            setImageRequest[] setimagerequestArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = onWarmupCompleted + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return setimagerequestArrOnWarmupCompleted;
        }

        public final setImageRequest onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            setImageRequest setimagerequest = new setImageRequest(parcel.readLong(), parcel.readString(), parcel.readLong());
            int i2 = onNavigationEvent + 75;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return setimagerequest;
            }
            throw null;
        }

        public final setImageRequest[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 7;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            setImageRequest[] setimagerequestArr = new setImageRequest[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 123;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return setimagerequestArr;
        }
    }

    static {
        int i = onExtraCallback + 1;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public setImageRequest() {
        this(0L, null, 0L, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        if (i4 != 0) {
            parcel.writeLong(this.jointTotalBalance);
            parcel.writeString(this.reasonType);
            parcel.writeLong(this.savingTotalBalance);
            obj.hashCode();
            throw null;
        }
        parcel.writeLong(this.jointTotalBalance);
        parcel.writeString(this.reasonType);
        parcel.writeLong(this.savingTotalBalance);
        int i5 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public setImageRequest(long j, @NotNull String str, long j2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        this.jointTotalBalance = j;
        this.reasonType = str;
        this.savingTotalBalance = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setImageRequest(long j, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        long j4;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 53;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            j3 = -1;
        } else {
            j3 = j;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            int i6 = onExtraCallbackWithResult + 67;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            j4 = -1;
        } else {
            j4 = j2;
        }
        this(j3, str2, j4);
    }
}
