package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdViewParentApi {
    public static final int $stable = 8;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("description")
    private String description;

    @SerializedName("icon")
    private String icon;

    @SerializedName("iconFormat")
    private String iconFormat;

    @SerializedName("subValue")
    private String subValue;

    @SerializedName("title")
    private String title;

    @SerializedName("value")
    private String value;

    public AdViewParentApi() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdViewParentApi)) {
            int i4 = i3 + 3;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        AdViewParentApi adViewParentApi = (AdViewParentApi) obj;
        if (!Intrinsics.areEqual(this.title, adViewParentApi.title) || !Intrinsics.areEqual(this.description, adViewParentApi.description) || !Intrinsics.areEqual(this.value, adViewParentApi.value)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subValue, adViewParentApi.subValue)) {
            int i6 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.icon, adViewParentApi.icon)) {
            int i7 = onNavigationEvent + 59;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.iconFormat, adViewParentApi.iconFormat)) {
            return true;
        }
        int i9 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        int iHashCode4 = 0;
        int iHashCode5 = (i2 % 2 == 0 ? (str = this.title) != null : (str = this.title) != null) ? str.hashCode() : 0;
        String str2 = this.description;
        if (str2 == null) {
            int i3 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.value;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subValue;
        if (str4 == null) {
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.icon;
        if (str5 == null) {
            int i6 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.iconFormat;
        if (str6 != null) {
            int i8 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int iHashCode7 = str6.hashCode();
                int i9 = 1 / 0;
                iHashCode4 = iHashCode7;
            } else {
                iHashCode4 = str6.hashCode();
            }
        }
        return (((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardBannerStyle(title=" + this.title + ", description=" + this.description + ", value=" + this.value + ", subValue=" + this.subValue + ", icon=" + this.icon + ", iconFormat=" + this.iconFormat + ")";
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return str;
    }

    public AdViewParentApi(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.title = str;
        this.description = str2;
        this.value = str3;
        this.subValue = str4;
        this.icon = str5;
        this.iconFormat = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdViewParentApi(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i3 = 2 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        String str12 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i4 = onNavigationEvent + 39;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
            }
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i6 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            str10 = null;
        } else {
            str10 = str6;
        }
        this(str11, str7, str8, str12, str9, str10);
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreEqual = Intrinsics.areEqual(this.iconFormat, "LOTTIE");
        int i4 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return zAreEqual;
        }
        throw null;
    }
}
