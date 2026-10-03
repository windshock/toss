package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class toLocaleLowerCase implements Parcelable {
    public static final Parcelable.Creator<toLocaleLowerCase> CREATOR = new onWarmupCompleted();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @SerializedName("bottomRowText")
    private final String bottomRowText;

    @SerializedName("bottomRowTextAlt")
    private final String bottomRowTextAlt;

    @SerializedName("middleRowText")
    private final String middleRowText;

    @SerializedName("middleRowTextAlt")
    private final String middleRowTextAlt;

    @SerializedName("topRowText")
    private final String topRowText;

    @SerializedName("topRowTextAlt")
    private final String topRowTextAlt;

    public static final class onWarmupCompleted implements Parcelable.Creator<toLocaleLowerCase> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toLocaleLowerCase createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            toLocaleLowerCase tolocalelowercaseOnExtraCallback = onExtraCallback(parcel);
            int i4 = onExtraCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return tolocalelowercaseOnExtraCallback;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ toLocaleLowerCase[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 53;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            toLocaleLowerCase[] tolocalelowercaseArrOnExtraCallback = onExtraCallback(i);
            int i5 = onExtraCallback + 3;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return tolocalelowercaseArrOnExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final toLocaleLowerCase onExtraCallback(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            toLocaleLowerCase tolocalelowercase = new toLocaleLowerCase(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 21;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return tolocalelowercase;
            }
            throw null;
        }

        public final toLocaleLowerCase[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            toLocaleLowerCase[] tolocalelowercaseArr = new toLocaleLowerCase[i];
            int i6 = i3 + 23;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return tolocalelowercaseArr;
        }
    }

    static {
        int i = onWarmupCompleted + 117;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof toLocaleLowerCase)) {
            int i4 = onExtraCallback + 31;
            IAuthTabCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        toLocaleLowerCase tolocalelowercase = (toLocaleLowerCase) obj;
        if (!Intrinsics.areEqual(this.topRowText, tolocalelowercase.topRowText)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.topRowTextAlt, tolocalelowercase.topRowTextAlt)) {
            int i5 = IAuthTabCallback + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.middleRowText, tolocalelowercase.middleRowText) || !Intrinsics.areEqual(this.middleRowTextAlt, tolocalelowercase.middleRowTextAlt)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bottomRowText, tolocalelowercase.bottomRowText)) {
            return !(Intrinsics.areEqual(this.bottomRowTextAlt, tolocalelowercase.bottomRowTextAlt) ^ true);
        }
        int i7 = onExtraCallback + 11;
        IAuthTabCallback = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode3 = this.topRowText.hashCode();
        int iHashCode4 = this.topRowTextAlt.hashCode();
        String str = this.middleRowText;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.middleRowTextAlt;
        if (str2 == null) {
            int i4 = IAuthTabCallback + 65;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.bottomRowText;
        if (str3 == null) {
            int i6 = IAuthTabCallback + 115;
            onExtraCallback = i6 % 128;
            iHashCode2 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.bottomRowTextAlt;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Content(topRowText=" + this.topRowText + ", topRowTextAlt=" + this.topRowTextAlt + ", middleRowText=" + this.middleRowText + ", middleRowTextAlt=" + this.middleRowTextAlt + ", bottomRowText=" + this.bottomRowText + ", bottomRowTextAlt=" + this.bottomRowTextAlt + ")";
        int i2 = onExtraCallback + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.topRowText);
        parcel.writeString(this.topRowTextAlt);
        parcel.writeString(this.middleRowText);
        parcel.writeString(this.middleRowTextAlt);
        parcel.writeString(this.bottomRowText);
        parcel.writeString(this.bottomRowTextAlt);
        int i5 = onExtraCallback + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
    }

    public toLocaleLowerCase(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.topRowText = str;
        this.topRowTextAlt = str2;
        this.middleRowText = str3;
        this.middleRowTextAlt = str4;
        this.bottomRowText = str5;
        this.bottomRowTextAlt = str6;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 51;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.topRowText;
        int i5 = i2 + 93;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.topRowTextAlt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.middleRowText;
        int i5 = i3 + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.middleRowTextAlt;
        int i4 = i2 + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bottomRowText;
        if (i3 == 0) {
            int i4 = 5 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 9;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bottomRowTextAlt;
        int i5 = i2 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
