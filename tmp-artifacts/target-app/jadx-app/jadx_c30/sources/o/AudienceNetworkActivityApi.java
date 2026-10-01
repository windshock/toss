package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AudienceNetworkActivityApi {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    @SerializedName("eventType")
    private String eventType;

    @SerializedName("value_1")
    private String value_1;

    @SerializedName("value_2")
    private String value_2;

    @SerializedName("value_3")
    private String value_3;

    @SerializedName("value_4")
    private String value_4;

    public AudienceNetworkActivityApi() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudienceNetworkActivityApi)) {
            int i5 = i3 + 85;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        AudienceNetworkActivityApi audienceNetworkActivityApi = (AudienceNetworkActivityApi) obj;
        if (!Intrinsics.areEqual(this.eventType, audienceNetworkActivityApi.eventType)) {
            int i7 = onExtraCallbackWithResult + 91;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.value_1, audienceNetworkActivityApi.value_1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.value_2, audienceNetworkActivityApi.value_2)) {
            int i9 = onNavigationEvent + 117;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 76 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.value_3, audienceNetworkActivityApi.value_3)) {
            return false;
        }
        if (Intrinsics.areEqual(this.value_4, audienceNetworkActivityApi.value_4)) {
            return true;
        }
        int i11 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.eventType;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.value_1;
        if (str2 == null) {
            int i2 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.value_2;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value_3;
        if (str4 == null) {
            int i4 = onNavigationEvent + 11;
            onExtraCallbackWithResult = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.value_4;
        if (str5 != null) {
            iHashCode3 = str5.hashCode();
            int i5 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
        }
        int i7 = (((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + iHashCode3;
        int i8 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardEventTypeReq(eventType=" + this.eventType + ", value_1=" + this.value_1 + ", value_2=" + this.value_2 + ", value_3=" + this.value_3 + ", value_4=" + this.value_4 + ")";
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AudienceNetworkActivityApi(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.eventType = str;
        this.value_1 = str2;
        this.value_2 = str3;
        this.value_3 = str4;
        this.value_4 = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AudienceNetworkActivityApi(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        if ((i & 1) != 0) {
            int i2 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = onNavigationEvent + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        this(str, str6, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
