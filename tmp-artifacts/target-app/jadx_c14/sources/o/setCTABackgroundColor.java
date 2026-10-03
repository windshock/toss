package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setCTABackgroundColor implements Parcelable {
    public static final Parcelable.Creator<setCTABackgroundColor> CREATOR = new onExtraCallback();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    private final String encryptionKeyNo;
    private final String mode;
    private final String publicKey;

    public static final class onExtraCallback implements Parcelable.Creator<setCTABackgroundColor> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setCTABackgroundColor createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onExtraCallbackWithResult(parcel);
            }
            onExtraCallbackWithResult(parcel);
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setCTABackgroundColor[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 103;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(i);
            }
            onNavigationEvent(i);
            throw null;
        }

        public final setCTABackgroundColor onExtraCallbackWithResult(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            setCTABackgroundColor setctabackgroundcolor = new setCTABackgroundColor(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 79;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 53 / 0;
            }
            return setctabackgroundcolor;
        }

        public final setCTABackgroundColor[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 57;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            setCTABackgroundColor[] setctabackgroundcolorArr = new setCTABackgroundColor[i];
            int i6 = i3 + 69;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return setctabackgroundcolorArr;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 35;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setCTABackgroundColor)) {
            int i4 = onWarmupCompleted + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        setCTABackgroundColor setctabackgroundcolor = (setCTABackgroundColor) obj;
        if (!Intrinsics.areEqual(this.publicKey, setctabackgroundcolor.publicKey) || !Intrinsics.areEqual(this.mode, setctabackgroundcolor.mode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.encryptionKeyNo, setctabackgroundcolor.encryptionKeyNo)) {
            return true;
        }
        int i6 = onWarmupCompleted + 15;
        onExtraCallback = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.publicKey.hashCode();
        int iHashCode2 = this.mode.hashCode();
        String str = this.encryptionKeyNo;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode3 = str.hashCode();
            int i5 = onExtraCallback + 1;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode3;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardIssueECCEncryptInfo(publicKey=" + this.publicKey + ", mode=" + this.mode + ", encryptionKeyNo=" + this.encryptionKeyNo + ")";
        int i2 = onExtraCallback + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.publicKey);
        parcel.writeString(this.mode);
        parcel.writeString(this.encryptionKeyNo);
        int i5 = onWarmupCompleted + 13;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setCTABackgroundColor(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.publicKey = str;
        this.mode = str2;
        this.encryptionKeyNo = str3;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.publicKey;
        int i4 = i3 + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mode;
        int i5 = i2 + 81;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        String str = this.encryptionKeyNo;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return str;
    }
}
