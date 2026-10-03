package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda2 implements Parcelable {
    public static final Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda2> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("interestRate")
    private final float interestRate;

    @SerializedName("preScreenedAt")
    private final String preScreenedAt;

    public static final class onNavigationEvent implements Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda2> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final ProducerSequenceFactoryExternalSyntheticLambda2 IAuthTabCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2 = new ProducerSequenceFactoryExternalSyntheticLambda2(parcel.readFloat(), parcel.readString());
            int i2 = onWarmupCompleted + 31;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return producerSequenceFactoryExternalSyntheticLambda2;
            }
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda2 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2IAuthTabCallback = IAuthTabCallback(parcel);
            if (i3 == 0) {
                int i4 = 78 / 0;
            }
            return producerSequenceFactoryExternalSyntheticLambda2IAuthTabCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda2[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 41;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda2[] producerSequenceFactoryExternalSyntheticLambda2ArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 != 0) {
                int i5 = 31 / 0;
            }
            return producerSequenceFactoryExternalSyntheticLambda2ArrOnNavigationEvent;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda2[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda2[] producerSequenceFactoryExternalSyntheticLambda2Arr = new ProducerSequenceFactoryExternalSyntheticLambda2[i];
            int i6 = i3 + 65;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda2Arr;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 65;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProducerSequenceFactoryExternalSyntheticLambda2() {
        String str = null;
        this(0.0f, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ProducerSequenceFactoryExternalSyntheticLambda2)) {
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return false;
        }
        ProducerSequenceFactoryExternalSyntheticLambda2 producerSequenceFactoryExternalSyntheticLambda2 = (ProducerSequenceFactoryExternalSyntheticLambda2) obj;
        if (Float.compare(this.interestRate, producerSequenceFactoryExternalSyntheticLambda2.interestRate) != 0) {
            return false;
        }
        if (Intrinsics.areEqual(this.preScreenedAt, producerSequenceFactoryExternalSyntheticLambda2.preScreenedAt)) {
            return true;
        }
        int i6 = onExtraCallback + 111;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Float.hashCode(this.interestRate) * 31) + this.preScreenedAt.hashCode();
        int i4 = IAuthTabCallback + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreviousPrescreenInfo(interestRate=" + this.interestRate + ", preScreenedAt=" + this.preScreenedAt + ")";
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeFloat(this.interestRate);
        parcel.writeString(this.preScreenedAt);
        if (i4 == 0) {
            throw null;
        }
    }

    public ProducerSequenceFactoryExternalSyntheticLambda2(float f, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interestRate = f;
        this.preScreenedAt = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda2(float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            int i4 = IAuthTabCallback + 23;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            str = "";
            int i6 = 2 % 2;
        }
        this(f, str);
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        float f = this.interestRate;
        int i5 = i2 + 55;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return f;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.preScreenedAt;
        int i5 = i2 + 91;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return str;
    }
}
