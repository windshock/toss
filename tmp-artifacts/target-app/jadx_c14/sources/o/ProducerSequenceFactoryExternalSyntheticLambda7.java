package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda7 implements Parcelable {
    public static final Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda7> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("landingScheme")
    private final String landingScheme;

    @SerializedName("remainApplyCnt")
    private final int remainingCount;

    @SerializedName("secondApplyRewardAmount")
    private final long rewardAmount;

    public static final class IAuthTabCallback implements Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda7> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final ProducerSequenceFactoryExternalSyntheticLambda7 IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7 = new ProducerSequenceFactoryExternalSyntheticLambda7(parcel.readString(), parcel.readInt(), parcel.readLong());
            int i2 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
            return producerSequenceFactoryExternalSyntheticLambda7;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda7 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7IAuthTabCallback = IAuthTabCallback(parcel);
            int i4 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return producerSequenceFactoryExternalSyntheticLambda7IAuthTabCallback;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda7[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda7[] producerSequenceFactoryExternalSyntheticLambda7ArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onWarmupCompleted + 101;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda7ArrOnNavigationEvent;
            }
            throw null;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda7[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 33;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            ProducerSequenceFactoryExternalSyntheticLambda7[] producerSequenceFactoryExternalSyntheticLambda7Arr = new ProducerSequenceFactoryExternalSyntheticLambda7[i];
            if (i3 % 2 == 0) {
                int i5 = 46 / 0;
            }
            int i6 = i4 + 5;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda7Arr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 87;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ProducerSequenceFactoryExternalSyntheticLambda7() {
        this(null, 0, 0L, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProducerSequenceFactoryExternalSyntheticLambda7)) {
            int i2 = IAuthTabCallback + 63;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ProducerSequenceFactoryExternalSyntheticLambda7 producerSequenceFactoryExternalSyntheticLambda7 = (ProducerSequenceFactoryExternalSyntheticLambda7) obj;
        if (!Intrinsics.areEqual(this.landingScheme, producerSequenceFactoryExternalSyntheticLambda7.landingScheme)) {
            return false;
        }
        if (this.remainingCount != producerSequenceFactoryExternalSyntheticLambda7.remainingCount) {
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.rewardAmount == producerSequenceFactoryExternalSyntheticLambda7.rewardAmount) {
            return true;
        }
        int i6 = IAuthTabCallback + 109;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.landingScheme;
        if (str == null) {
            int i2 = IAuthTabCallback + 111;
            onExtraCallback = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = (((iHashCode * 31) + Integer.hashCode(this.remainingCount)) * 31) + Long.hashCode(this.rewardAmount);
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public final int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.remainingCount;
        int i5 = i2 + 61;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return i4;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        String str = this.landingScheme;
        int i5 = i3 + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        long j = this.rewardAmount;
        int i5 = i3 + 29;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecondApplyRewardInfo(landingScheme=" + this.landingScheme + ", remainingCount=" + this.remainingCount + ", rewardAmount=" + this.rewardAmount + ")";
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.landingScheme);
        parcel.writeInt(this.remainingCount);
        parcel.writeLong(this.rewardAmount);
        int i5 = onExtraCallback + 27;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public ProducerSequenceFactoryExternalSyntheticLambda7(@Nullable String str, int i, long j) {
        this.landingScheme = str;
        this.remainingCount = i;
        this.rewardAmount = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda7(String str, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = IAuthTabCallback + 71;
            onExtraCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str = null;
        }
        if ((i2 & 2) != 0) {
            int i4 = 2 % 2;
            i = 0;
        }
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallback + 31;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            j = 0;
        }
        this(str, i, j);
    }

    public final int onNavigationEvent() {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 77;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.remainingCount;
            int i5 = 29 / 0;
        } else {
            i = this.remainingCount;
        }
        int i6 = i3 + 47;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.rewardAmount;
        }
        throw null;
    }
}
