package o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createNativeBannerAdViewApi implements createNativeAdRatingApi, Parcelable {
    public static final Parcelable.Creator<createNativeBannerAdViewApi> CREATOR = new IAuthTabCallback();
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final createAdSizeApi action;
    private final String iconType;
    private final String key;
    private final String text;
    private final String type;

    public static final class IAuthTabCallback implements Parcelable.Creator<createNativeBannerAdViewApi> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeBannerAdViewApi createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            createNativeBannerAdViewApi createnativebanneradviewapiOnNavigationEvent = onNavigationEvent(parcel);
            if (i3 == 0) {
                int i4 = 62 / 0;
            }
            int i5 = onExtraCallback + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return createnativebanneradviewapiOnNavigationEvent;
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ createNativeBannerAdViewApi[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 61;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            createNativeBannerAdViewApi[] createnativebanneradviewapiArrOnExtraCallback = onExtraCallback(i);
            int i4 = onExtraCallback + 11;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 10 / 0;
            }
            return createnativebanneradviewapiArrOnExtraCallback;
        }

        public final createNativeBannerAdViewApi[] onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback;
            int i4 = i3 + 103;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            createNativeBannerAdViewApi[] createnativebanneradviewapiArr = new createNativeBannerAdViewApi[i];
            int i6 = i3 + 115;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return createnativebanneradviewapiArr;
        }

        public final createNativeBannerAdViewApi onNavigationEvent(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            createNativeBannerAdViewApi createnativebanneradviewapi = new createNativeBannerAdViewApi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (createAdSizeApi) parcel.readParcelable(createNativeBannerAdViewApi.class.getClassLoader()));
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return createnativebanneradviewapi;
            }
            throw null;
        }
    }

    static {
        int i = onExtraCallback + 59;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public createNativeBannerAdViewApi() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 115;
            onNavigationEvent = i3 % 128;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 19;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof createNativeBannerAdViewApi)) {
            return false;
        }
        createNativeBannerAdViewApi createnativebanneradviewapi = (createNativeBannerAdViewApi) obj;
        if (!Intrinsics.areEqual(this.key, createnativebanneradviewapi.key)) {
            int i5 = onWarmupCompleted + 125;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.type, createnativebanneradviewapi.type) || !Intrinsics.areEqual(this.iconType, createnativebanneradviewapi.iconType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.text, createnativebanneradviewapi.text)) {
            int i7 = onWarmupCompleted + 57;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.action, createnativebanneradviewapi.action)) {
            return true;
        }
        int i9 = onWarmupCompleted + 59;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.key.hashCode();
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.iconType.hashCode();
        int iHashCode5 = this.text.hashCode();
        createAdSizeApi createadsizeapi = this.action;
        if (createadsizeapi == null) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 93;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = createadsizeapi.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LayoutHelpArea(key=" + this.key + ", type=" + this.type + ", iconType=" + this.iconType + ", text=" + this.text + ", action=" + this.action + ")";
        int i2 = onWarmupCompleted + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.key);
        parcel.writeString(this.type);
        parcel.writeString(this.iconType);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.action, i);
        int i5 = onWarmupCompleted + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public createNativeBannerAdViewApi(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable createAdSizeApi createadsizeapi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.key = str;
        this.type = str2;
        this.iconType = str3;
        this.text = str4;
        this.action = createadsizeapi;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ createNativeBannerAdViewApi(String str, String str2, String str3, String str4, createAdSizeApi createadsizeapi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7 = "";
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent;
            int i3 = i2 + 125;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i7 = onNavigationEvent + 21;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i9 = onNavigationEvent + 39;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str6 = "";
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i12 = onWarmupCompleted;
            int i13 = i12 + 29;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            int i15 = i12 + 123;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i18 = onWarmupCompleted + 21;
            onNavigationEvent = i18 % 128;
            int i19 = i18 % 2;
            createadsizeapi = null;
        }
        this(str, str5, str6, str7, createadsizeapi);
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.iconType;
        int i5 = i3 + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final createAdSizeApi onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        createAdSizeApi createadsizeapi = this.action;
        int i5 = i3 + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return createadsizeapi;
    }
}
