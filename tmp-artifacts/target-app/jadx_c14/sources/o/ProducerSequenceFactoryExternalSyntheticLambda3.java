package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ProducerSequenceFactoryExternalSyntheticLambda3 implements Parcelable {
    public static final Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda3> CREATOR = new onNavigationEvent();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static int onNavigationEvent;

    @SerializedName("description")
    private final String description;

    @SerializedName("type")
    private final String type;

    public static final class onNavigationEvent implements Parcelable.Creator<ProducerSequenceFactoryExternalSyntheticLambda3> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda3 createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallback(parcel);
            }
            onExtraCallback(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda3[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ProducerSequenceFactoryExternalSyntheticLambda3[] producerSequenceFactoryExternalSyntheticLambda3ArrOnWarmupCompleted = onWarmupCompleted(i);
            int i5 = IAuthTabCallback + 75;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return producerSequenceFactoryExternalSyntheticLambda3ArrOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda3 onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ProducerSequenceFactoryExternalSyntheticLambda3 producerSequenceFactoryExternalSyntheticLambda3 = new ProducerSequenceFactoryExternalSyntheticLambda3(parcel.readString(), parcel.readString());
            int i2 = IAuthTabCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return producerSequenceFactoryExternalSyntheticLambda3;
        }

        public final ProducerSequenceFactoryExternalSyntheticLambda3[] onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 71;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            Object obj = null;
            ProducerSequenceFactoryExternalSyntheticLambda3[] producerSequenceFactoryExternalSyntheticLambda3Arr = new ProducerSequenceFactoryExternalSyntheticLambda3[i];
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 93;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return producerSequenceFactoryExternalSyntheticLambda3Arr;
            }
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 103;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProducerSequenceFactoryExternalSyntheticLambda3() {
        String str = null;
        this(str, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 79;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProducerSequenceFactoryExternalSyntheticLambda3)) {
            int i5 = i2 + 109;
            onNavigationEvent = i5 % 128;
            return i5 % 2 != 0;
        }
        ProducerSequenceFactoryExternalSyntheticLambda3 producerSequenceFactoryExternalSyntheticLambda3 = (ProducerSequenceFactoryExternalSyntheticLambda3) obj;
        if (!Intrinsics.areEqual(this.type, producerSequenceFactoryExternalSyntheticLambda3.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.description, producerSequenceFactoryExternalSyntheticLambda3.description)) {
            int i6 = IAuthTabCallback + 99;
            onNavigationEvent = i6 % 128;
            return i6 % 2 != 0;
        }
        int i7 = onNavigationEvent + 99;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.type.hashCode() * 31) + this.description.hashCode();
        int i4 = onNavigationEvent + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProgressInfo(type=" + this.type + ", description=" + this.description + ")";
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.description);
        int i5 = onNavigationEvent + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ProducerSequenceFactoryExternalSyntheticLambda3(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = str;
        this.description = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProducerSequenceFactoryExternalSyntheticLambda3(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 79;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 101;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i6 = IAuthTabCallback + 83;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 113;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 41;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
