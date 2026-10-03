package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class MediaViewApi {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    @SerializedName("cardCode")
    private final Integer cardCode;

    @SerializedName("cardVendorName")
    private final String cardVendorName;

    @SerializedName("linkUrl")
    private final String linkUrl;

    @SerializedName("message")
    private final String message;

    @SerializedName("phoneNumber")
    private final String phoneNumber;

    @SerializedName("title")
    private final String title;

    public MediaViewApi() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof MediaViewApi)) {
            return false;
        }
        MediaViewApi mediaViewApi = (MediaViewApi) obj;
        if (!Intrinsics.areEqual(this.cardCode, mediaViewApi.cardCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cardVendorName, mediaViewApi.cardVendorName)) {
            int i4 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.linkUrl, mediaViewApi.linkUrl)) {
            int i6 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.message, mediaViewApi.message)) {
            return false;
        }
        if (Intrinsics.areEqual(this.phoneNumber, mediaViewApi.phoneNumber)) {
            return Intrinsics.areEqual(this.title, mediaViewApi.title);
        }
        int i8 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.cardCode;
        int iHashCode3 = 0;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str = this.cardVendorName;
        if (str == null) {
            int i2 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.linkUrl;
        int iHashCode5 = 1;
        if (str2 == null) {
            int i4 = onExtraCallbackWithResult + 9;
            IAuthTabCallback = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.message;
        if (str3 == null) {
            int i5 = IAuthTabCallback + 71;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode5 = 0;
            }
        } else {
            iHashCode5 = str3.hashCode();
        }
        String str4 = this.phoneNumber;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.title;
        if (str5 != null) {
            int i6 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = str5.hashCode();
        }
        return (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardNotificationUnsubscribeInfoResp(cardCode=" + this.cardCode + ", cardVendorName=" + this.cardVendorName + ", linkUrl=" + this.linkUrl + ", message=" + this.message + ", phoneNumber=" + this.phoneNumber + ", title=" + this.title + ")";
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return str;
    }

    public MediaViewApi(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.cardCode = num;
        this.cardVendorName = str;
        this.linkUrl = str2;
        this.message = str3;
        this.phoneNumber = str4;
        this.title = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MediaViewApi(Integer num, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        String str9 = null;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            int i8 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        String str10 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            int i11 = 2 % 2;
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            int i12 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            str9 = str5;
        }
        this(num, str6, str7, str10, str8, str9);
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.cardVendorName;
        int i5 = i3 + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.linkUrl;
        }
        throw null;
    }

    public final String IAuthTabCallback() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.message;
            int i4 = 2 / 0;
        } else {
            str = this.message;
        }
        int i5 = i2 + 27;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.phoneNumber;
        }
        throw null;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }
}
