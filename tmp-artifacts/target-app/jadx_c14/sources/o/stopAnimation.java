package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class stopAnimation implements Parcelable {
    public static final Parcelable.Creator<stopAnimation> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("autoExecute")
    private boolean autoExecute;

    @SerializedName("increaseCountOnExecute")
    private String increaseCountOnExecute;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<stopAnimation> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final stopAnimation[] IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            stopAnimation[] stopanimationArr = new stopAnimation[i];
            int i6 = i3 + 71;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return stopanimationArr;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ stopAnimation createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ stopAnimation[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 15;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                IAuthTabCallback(i);
                throw null;
            }
            stopAnimation[] stopanimationArrIAuthTabCallback = IAuthTabCallback(i);
            int i4 = onExtraCallback + 95;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return stopanimationArrIAuthTabCallback;
        }

        public final stopAnimation onExtraCallbackWithResult(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i4 = onWarmupCompleted + 25;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new stopAnimation(z, parcel.readString());
        }
    }

    static {
        int i = onNavigationEvent + 27;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public stopAnimation() {
        String str = null;
        this(false, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 123;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stopAnimation)) {
            return false;
        }
        stopAnimation stopanimation = (stopAnimation) obj;
        if (this.autoExecute != stopanimation.autoExecute) {
            int i2 = IAuthTabCallback + 61;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.increaseCountOnExecute, stopanimation.increaseCountOnExecute)) {
            return true;
        }
        int i4 = IAuthTabCallback + 113;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.autoExecute) * 31) + this.increaseCountOnExecute.hashCode();
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LinkOptions(autoExecute=" + this.autoExecute + ", increaseCountOnExecute=" + this.increaseCountOnExecute + ")";
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i4 == 0) {
            parcel.writeInt(this.autoExecute ? 1 : 0);
            parcel.writeString(this.increaseCountOnExecute);
            int i5 = 16 / 0;
        } else {
            parcel.writeInt(this.autoExecute ? 1 : 0);
            parcel.writeString(this.increaseCountOnExecute);
        }
        int i6 = IAuthTabCallback + 83;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public stopAnimation(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.autoExecute = z;
        this.increaseCountOnExecute = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ stopAnimation(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onWarmupCompleted + 91;
            IAuthTabCallback = i2 % 128;
            z = i2 % 2 == 0;
            int i3 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = "";
        }
        this(z, str);
    }
}
