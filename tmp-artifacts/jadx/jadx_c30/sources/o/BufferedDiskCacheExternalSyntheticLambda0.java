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
public final class BufferedDiskCacheExternalSyntheticLambda0 implements Parcelable {
    public static final Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda0> CREATOR = new onNavigationEvent();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("rewardAmount")
    private final long rewardAmount;

    public static final class onNavigationEvent implements Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda0> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final BufferedDiskCacheExternalSyntheticLambda0[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 59;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            BufferedDiskCacheExternalSyntheticLambda0[] bufferedDiskCacheExternalSyntheticLambda0Arr = new BufferedDiskCacheExternalSyntheticLambda0[i];
            int i6 = i4 + 41;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return bufferedDiskCacheExternalSyntheticLambda0Arr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            BufferedDiskCacheExternalSyntheticLambda0 bufferedDiskCacheExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            int i4 = IAuthTabCallback + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return bufferedDiskCacheExternalSyntheticLambda0OnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda0[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            BufferedDiskCacheExternalSyntheticLambda0[] bufferedDiskCacheExternalSyntheticLambda0ArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return bufferedDiskCacheExternalSyntheticLambda0ArrIAuthTabCallback;
        }

        public final BufferedDiskCacheExternalSyntheticLambda0 onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            BufferedDiskCacheExternalSyntheticLambda0 bufferedDiskCacheExternalSyntheticLambda0 = new BufferedDiskCacheExternalSyntheticLambda0(parcel.readLong());
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return bufferedDiskCacheExternalSyntheticLambda0;
        }
    }

    static {
        int i = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public BufferedDiskCacheExternalSyntheticLambda0() {
        this(0L, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof BufferedDiskCacheExternalSyntheticLambda0)) {
            return false;
        }
        if (this.rewardAmount == ((BufferedDiskCacheExternalSyntheticLambda0) obj).rewardAmount) {
            return true;
        }
        int i3 = onExtraCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.rewardAmount);
        int i4 = onExtraCallback + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ApplyCashbackEvent(rewardAmount=" + this.rewardAmount + ")";
        int i2 = onNavigationEvent + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        if (i4 != 0) {
            parcel.writeLong(this.rewardAmount);
            int i5 = 31 / 0;
        } else {
            parcel.writeLong(this.rewardAmount);
        }
        int i6 = onNavigationEvent + 115;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public BufferedDiskCacheExternalSyntheticLambda0(long j) {
        this.rewardAmount = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda0(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 71;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            j = -1;
        }
        this(j);
    }
}
