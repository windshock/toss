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
public final class setAccessibilityFocus implements Parcelable {
    public static final Parcelable.Creator<setAccessibilityFocus> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    @SerializedName("isoCode")
    private final String isoCode;

    @SerializedName("name")
    private final String name;

    public static final class IAuthTabCallback implements Parcelable.Creator<setAccessibilityFocus> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setAccessibilityFocus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            setAccessibilityFocus setaccessibilityfocusOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 != 0) {
                int i4 = 63 / 0;
            }
            int i5 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return setaccessibilityfocusOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setAccessibilityFocus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 9;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                onExtraCallbackWithResult(i);
                throw null;
            }
            setAccessibilityFocus[] setaccessibilityfocusArrOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return setaccessibilityfocusArrOnExtraCallbackWithResult;
        }

        public final setAccessibilityFocus[] onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 43;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            setAccessibilityFocus[] setaccessibilityfocusArr = new setAccessibilityFocus[i];
            if (i3 % 2 != 0) {
                int i5 = 65 / 0;
            }
            int i6 = i4 + 85;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 26 / 0;
            }
            return setaccessibilityfocusArr;
        }

        public final setAccessibilityFocus onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
            setAccessibilityFocus setaccessibilityfocus = new setAccessibilityFocus(parcel.readString(), parcel.readString());
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return setaccessibilityfocus;
            }
            throw null;
        }
    }

    static {
        int i = IAuthTabCallback + 59;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setAccessibilityFocus() {
        String str = null;
        this(str, str, 3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 57;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof setAccessibilityFocus)) {
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        setAccessibilityFocus setaccessibilityfocus = (setAccessibilityFocus) obj;
        if (!Intrinsics.areEqual(this.name, setaccessibilityfocus.name)) {
            int i6 = onExtraCallback + 75;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 17 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.isoCode, setaccessibilityfocus.isoCode)) {
            return true;
        }
        int i8 = onNavigationEvent + 65;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.name.hashCode() >> 87) * this.isoCode.hashCode() : (this.name.hashCode() * 31) + this.isoCode.hashCode();
        int i3 = onExtraCallback + 23;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Country(name=" + this.name + ", isoCode=" + this.isoCode + ")";
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
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
        int i3 = onExtraCallback + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, BuildConfig.FLAVOR);
        parcel.writeString(this.name);
        parcel.writeString(this.isoCode);
        if (i4 != 0) {
            throw null;
        }
    }

    public setAccessibilityFocus(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        this.name = str;
        this.isoCode = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setAccessibilityFocus(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 101;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            int i4 = onNavigationEvent + 111;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str2 = BuildConfig.FLAVOR;
        }
        this(str, str2);
    }
}
