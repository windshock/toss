package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BufferedDiskCacheExternalSyntheticLambda5 implements Parcelable {
    public static final Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda5> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("daysBefore")
    private final int daysBefore;

    @SerializedName("interestDiff")
    private final float interestDiff;

    @SerializedName("lowestInterest")
    private final float lowestInterest;

    @SerializedName("lowestInterestBefore")
    private final float lowestInterestBefore;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<BufferedDiskCacheExternalSyntheticLambda5> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda5 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onExtraCallback(parcel);
                throw null;
            }
            BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5OnExtraCallback = onExtraCallback(parcel);
            int i3 = onNavigationEvent + 9;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return bufferedDiskCacheExternalSyntheticLambda5OnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda5[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 113;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return onExtraCallbackWithResult(i);
            }
            onExtraCallbackWithResult(i);
            throw null;
        }

        public final BufferedDiskCacheExternalSyntheticLambda5 onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5 = new BufferedDiskCacheExternalSyntheticLambda5(parcel.readFloat(), parcel.readInt(), parcel.readFloat(), parcel.readFloat());
            int i2 = onNavigationEvent + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return bufferedDiskCacheExternalSyntheticLambda5;
        }

        public final BufferedDiskCacheExternalSyntheticLambda5[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 117;
            onNavigationEvent = i4 % 128;
            BufferedDiskCacheExternalSyntheticLambda5[] bufferedDiskCacheExternalSyntheticLambda5Arr = new BufferedDiskCacheExternalSyntheticLambda5[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 45;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return bufferedDiskCacheExternalSyntheticLambda5Arr;
        }
    }

    static {
        int i = onWarmupCompleted + 3;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 11 / 0;
        }
    }

    public BufferedDiskCacheExternalSyntheticLambda5() {
        this(0.0f, 0, 0.0f, 0.0f, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = (i3 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i2 + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof BufferedDiskCacheExternalSyntheticLambda5) {
                BufferedDiskCacheExternalSyntheticLambda5 bufferedDiskCacheExternalSyntheticLambda5 = (BufferedDiskCacheExternalSyntheticLambda5) obj;
                return Float.compare(this.interestDiff, bufferedDiskCacheExternalSyntheticLambda5.interestDiff) == 0 && this.daysBefore == bufferedDiskCacheExternalSyntheticLambda5.daysBefore && Float.compare(this.lowestInterestBefore, bufferedDiskCacheExternalSyntheticLambda5.lowestInterestBefore) == 0 && Float.compare(this.lowestInterest, bufferedDiskCacheExternalSyntheticLambda5.lowestInterest) == 0;
            }
            int i2 = IAuthTabCallback + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = onExtraCallback;
        int i5 = i4 + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 55;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Float.hashCode(this.interestDiff) * 31) + Integer.hashCode(this.daysBefore)) * 31) + Float.hashCode(this.lowestInterestBefore)) * 31) + Float.hashCode(this.lowestInterest);
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BetterThanBeforeInfo(interestDiff=" + this.interestDiff + ", daysBefore=" + this.daysBefore + ", lowestInterestBefore=" + this.lowestInterestBefore + ", lowestInterest=" + this.lowestInterest + ")";
        int i2 = IAuthTabCallback + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 != 0) {
            parcel.writeFloat(this.interestDiff);
            parcel.writeInt(this.daysBefore);
            parcel.writeFloat(this.lowestInterestBefore);
            parcel.writeFloat(this.lowestInterest);
            throw null;
        }
        parcel.writeFloat(this.interestDiff);
        parcel.writeInt(this.daysBefore);
        parcel.writeFloat(this.lowestInterestBefore);
        parcel.writeFloat(this.lowestInterest);
        int i5 = onExtraCallback + 123;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public BufferedDiskCacheExternalSyntheticLambda5(float f, int i, float f2, float f3) {
        this.interestDiff = f;
        this.daysBefore = i;
        this.lowestInterestBefore = f2;
        this.lowestInterest = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BufferedDiskCacheExternalSyntheticLambda5(float f, int i, float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallback + 51;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            int i6 = IAuthTabCallback + 19;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        if ((i2 & 4) != 0) {
            int i9 = onExtraCallback + 77;
            IAuthTabCallback = i9 % 128;
            f2 = i9 % 2 == 0 ? 1.0f : 0.0f;
        }
        this(f, i, f2, (i2 & 8) != 0 ? 0.0f : f3);
    }
}
