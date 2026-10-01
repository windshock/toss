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
public final class ResizeAndRotateProducerTransformingConsumer implements Parcelable {
    public static final Parcelable.Creator<ResizeAndRotateProducerTransformingConsumer> CREATOR = new onExtraCallback();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("contentsUrl")
    private final String contentsUrl;

    @SerializedName("ref")
    private final Long ref;

    @SerializedName("termsId")
    private final long termsId;

    @SerializedName("title")
    private final String title;

    public static final class onExtraCallback implements Parcelable.Creator<ResizeAndRotateProducerTransformingConsumer> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final ResizeAndRotateProducerTransformingConsumer[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ResizeAndRotateProducerTransformingConsumer[] resizeAndRotateProducerTransformingConsumerArr = new ResizeAndRotateProducerTransformingConsumer[i];
            int i6 = i3 + 81;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 15 / 0;
            }
            return resizeAndRotateProducerTransformingConsumerArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ResizeAndRotateProducerTransformingConsumer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onWarmupCompleted(parcel);
            }
            onWarmupCompleted(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ResizeAndRotateProducerTransformingConsumer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ResizeAndRotateProducerTransformingConsumer[] resizeAndRotateProducerTransformingConsumerArrIAuthTabCallback = IAuthTabCallback(i);
            int i5 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return resizeAndRotateProducerTransformingConsumerArrIAuthTabCallback;
        }

        public final ResizeAndRotateProducerTransformingConsumer onWarmupCompleted(Parcel parcel) {
            Long l;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            long j = parcel.readLong();
            if (parcel.readInt() == 0) {
                int i4 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 96 / 0;
                }
                l = null;
            } else {
                Long lValueOf = Long.valueOf(parcel.readLong());
                int i6 = onWarmupCompleted + 67;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                l = lValueOf;
            }
            return new ResizeAndRotateProducerTransformingConsumer(j, l, parcel.readString(), parcel.readString());
        }
    }

    static {
        int i = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ResizeAndRotateProducerTransformingConsumer() {
        this(0L, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ResizeAndRotateProducerTransformingConsumer)) {
            return false;
        }
        ResizeAndRotateProducerTransformingConsumer resizeAndRotateProducerTransformingConsumer = (ResizeAndRotateProducerTransformingConsumer) obj;
        if (this.termsId != resizeAndRotateProducerTransformingConsumer.termsId) {
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ref, resizeAndRotateProducerTransformingConsumer.ref) && !(!Intrinsics.areEqual(this.title, resizeAndRotateProducerTransformingConsumer.title))) {
            if (Intrinsics.areEqual(this.contentsUrl, resizeAndRotateProducerTransformingConsumer.contentsUrl)) {
                return true;
            }
            int i6 = onWarmupCompleted + 103;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Long.hashCode(this.termsId);
            throw null;
        }
        int iHashCode = Long.hashCode(this.termsId);
        Long l = this.ref;
        if (l == null) {
            i = 0;
        } else {
            int iHashCode2 = l.hashCode();
            int i4 = onWarmupCompleted + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            i = iHashCode2;
        }
        return (((((iHashCode * 31) + i) * 31) + this.title.hashCode()) * 31) + this.contentsUrl.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccTermItem(termsId=" + this.termsId + ", ref=" + this.ref + ", title=" + this.title + ", contentsUrl=" + this.contentsUrl + ")";
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeLong(this.termsId);
        Long l = this.ref;
        if (l == null) {
            parcel.writeInt(0);
            int i5 = onWarmupCompleted + 39;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.contentsUrl);
    }

    public ResizeAndRotateProducerTransformingConsumer(long j, @Nullable Long l, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.termsId = j;
        this.ref = l;
        this.title = str;
        this.contentsUrl = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResizeAndRotateProducerTransformingConsumer(long j, Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        String str4;
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 5;
            } else {
                int i4 = 2 % 2;
            }
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            l = null;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            int i6 = onWarmupCompleted + 11;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = str;
        }
        if ((i & 8) != 0) {
            int i9 = onWarmupCompleted + 83;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 80 / 0;
            }
            str4 = BuildConfig.FLAVOR;
        } else {
            str4 = str2;
        }
        this(j2, l2, str3, str4);
    }
}
