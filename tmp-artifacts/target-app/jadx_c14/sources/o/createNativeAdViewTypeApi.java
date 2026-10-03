package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeAdViewTypeApi implements Parcelable {
    public static final Parcelable.Creator<createNativeAdViewTypeApi> CREATOR = new onExtraCallbackWithResult();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String href;
    private final String key;
    private final String value;
    private final String valueColor;

    public static final class onExtraCallbackWithResult implements Parcelable.Creator<createNativeAdViewTypeApi> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdViewTypeApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                onNavigationEvent(parcel);
                obj.hashCode();
                throw null;
            }
            createNativeAdViewTypeApi createnativeadviewtypeapiOnNavigationEvent = onNavigationEvent(parcel);
            int i3 = IAuthTabCallback + 91;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return createnativeadviewtypeapiOnNavigationEvent;
            }
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeAdViewTypeApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 33;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            createNativeAdViewTypeApi[] createnativeadviewtypeapiArrOnNavigationEvent = onNavigationEvent(i);
            if (i4 == 0) {
                int i5 = 16 / 0;
            }
            int i6 = onExtraCallback + 111;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 36 / 0;
            }
            return createnativeadviewtypeapiArrOnNavigationEvent;
        }

        public final createNativeAdViewTypeApi onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createNativeAdViewTypeApi createnativeadviewtypeapi = new createNativeAdViewTypeApi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return createnativeadviewtypeapi;
        }

        public final createNativeAdViewTypeApi[] onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 43;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            createNativeAdViewTypeApi[] createnativeadviewtypeapiArr = new createNativeAdViewTypeApi[i];
            int i6 = i4 + 91;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return createnativeadviewtypeapiArr;
        }
    }

    static {
        int i = onWarmupCompleted + 41;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 28 / 0;
            }
            return true;
        }
        if (!(obj instanceof createNativeAdViewTypeApi)) {
            int i4 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        createNativeAdViewTypeApi createnativeadviewtypeapi = (createNativeAdViewTypeApi) obj;
        if (!Intrinsics.areEqual(this.key, createnativeadviewtypeapi.key)) {
            int i6 = onExtraCallbackWithResult + 53;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.value, createnativeadviewtypeapi.value) || !Intrinsics.areEqual(this.href, createnativeadviewtypeapi.href)) {
            return false;
        }
        if (Intrinsics.areEqual(this.valueColor, createnativeadviewtypeapi.valueColor)) {
            return true;
        }
        int i8 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.key.hashCode();
        int iHashCode3 = this.value.hashCode();
        String str = this.href;
        int iHashCode4 = 0;
        if (str == null) {
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.valueColor;
        if (str2 != null) {
            int i4 = onExtraCallbackWithResult + 45;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode4 = str2.hashCode();
        }
        int i6 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4;
        int i7 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TableData(key=" + this.key + ", value=" + this.value + ", href=" + this.href + ", valueColor=" + this.valueColor + ")";
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        String str = this.key;
        if (i4 == 0) {
            parcel.writeString(str);
            parcel.writeString(this.value);
            parcel.writeString(this.href);
            parcel.writeString(this.valueColor);
            return;
        }
        parcel.writeString(str);
        parcel.writeString(this.value);
        parcel.writeString(this.href);
        parcel.writeString(this.valueColor);
        throw null;
    }

    public createNativeAdViewTypeApi(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
        this.href = str3;
        this.valueColor = str4;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 105;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String str = this.href;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.valueColor;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return str;
    }
}
