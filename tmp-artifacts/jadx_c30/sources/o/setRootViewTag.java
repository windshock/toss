package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setRootViewTag implements Parcelable {
    public static final Parcelable.Creator<setRootViewTag> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final long amount;
    private final String description;
    private final String message;
    private final long regTimestamp;
    private final String title;
    private final long transferNo;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<setRootViewTag> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setRootViewTag createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setRootViewTag setrootviewtagOnExtraCallbackWithResult = onExtraCallbackWithResult(parcel);
            if (i3 != 0) {
                int i4 = 20 / 0;
            }
            return setrootviewtagOnExtraCallbackWithResult;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setRootViewTag[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 87;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            setRootViewTag[] setrootviewtagArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            if (i4 != 0) {
                int i5 = 56 / 0;
            }
            int i6 = onExtraCallback + 7;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return setrootviewtagArrOnExtraCallbackWithResult;
            }
            throw null;
        }

        public final setRootViewTag onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            setRootViewTag setrootviewtag = new setRootViewTag(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
            int i2 = onWarmupCompleted + 125;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 44 / 0;
            }
            return setrootviewtag;
        }

        public final setRootViewTag[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 41;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            setRootViewTag[] setrootviewtagArr = new setRootViewTag[i];
            int i6 = i4 + 59;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                return setrootviewtagArr;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 47;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 2 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRootViewTag)) {
            int i2 = onWarmupCompleted + 31;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        setRootViewTag setrootviewtag = (setRootViewTag) obj;
        if (this.transferNo != setrootviewtag.transferNo) {
            return false;
        }
        if (this.regTimestamp != setrootviewtag.regTimestamp) {
            int i4 = IAuthTabCallback + 79;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.title, setrootviewtag.title)) {
            return false;
        }
        if (Intrinsics.areEqual(this.description, setrootviewtag.description)) {
            return Intrinsics.areEqual(this.message, setrootviewtag.message) && this.amount == setrootviewtag.amount;
        }
        int i6 = onWarmupCompleted + 89;
        IAuthTabCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.transferNo) * 31) + Long.hashCode(this.regTimestamp)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.message.hashCode()) * 31) + Long.hashCode(this.amount);
        int i4 = IAuthTabCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferHistoryItem(transferNo=" + this.transferNo + ", regTimestamp=" + this.regTimestamp + ", title=" + this.title + ", description=" + this.description + ", message=" + this.message + ", amount=" + this.amount + ")";
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeLong(this.transferNo);
        parcel.writeLong(this.regTimestamp);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.message);
        parcel.writeLong(this.amount);
        int i5 = onWarmupCompleted + 21;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
    }

    public setRootViewTag(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j3) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str3, BuildConfig.FLAVOR);
        this.transferNo = j;
        this.regTimestamp = j2;
        this.title = str;
        this.description = str2;
        this.message = str3;
        this.amount = j3;
    }
}
