package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class mkdirChecked implements makeLoaderUnsafe, Parcelable {
    public static final Parcelable.Creator<mkdirChecked> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final String darkModeImageUrl;
    private final String lightModeImageUrl;
    private final String type;

    public static final class onWarmupCompleted implements Parcelable.Creator<mkdirChecked> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ mkdirChecked createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            mkdirChecked mkdircheckedOnWarmupCompleted = onWarmupCompleted(parcel);
            int i4 = onExtraCallbackWithResult + 45;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return mkdircheckedOnWarmupCompleted;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ mkdirChecked[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            mkdirChecked[] mkdircheckedArrOnNavigationEvent = onNavigationEvent(i);
            int i5 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return mkdircheckedArrOnNavigationEvent;
        }

        public final mkdirChecked[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 55;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            mkdirChecked[] mkdircheckedArr = new mkdirChecked[i];
            int i6 = i4 + 17;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 91 / 0;
            }
            return mkdircheckedArr;
        }

        public final mkdirChecked onWarmupCompleted(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            mkdirChecked mkdirchecked = new mkdirChecked(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return mkdirchecked;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 13;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 45;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkdirChecked)) {
            int i2 = onExtraCallbackWithResult + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        mkdirChecked mkdirchecked = (mkdirChecked) obj;
        if (!Intrinsics.areEqual(this.type, mkdirchecked.type)) {
            int i4 = onExtraCallback + 93;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.lightModeImageUrl, mkdirchecked.lightModeImageUrl)) {
            return false;
        }
        if (Intrinsics.areEqual(this.darkModeImageUrl, mkdirchecked.darkModeImageUrl)) {
            return true;
        }
        int i6 = onExtraCallback + 49;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.type.hashCode() * 31) + this.lightModeImageUrl.hashCode()) * 31) + this.darkModeImageUrl.hashCode();
        int i4 = onExtraCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImageTypeModel(type=" + this.type + ", lightModeImageUrl=" + this.lightModeImageUrl + ", darkModeImageUrl=" + this.darkModeImageUrl + ")";
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 49;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.lightModeImageUrl);
        parcel.writeString(this.darkModeImageUrl);
        int i5 = onExtraCallback + 111;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public mkdirChecked(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.lightModeImageUrl = str2;
        this.darkModeImageUrl = str3;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.lightModeImageUrl;
        int i4 = i2 + 17;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.darkModeImageUrl;
        int i5 = i2 + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
