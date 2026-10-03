package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class hasActiveCatalystInstance {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("appVersion")
    private final String appVersion;

    @SerializedName("clientOs")
    private final String clientOs;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("deviceInfo")
    private final String deviceInfo;

    @SerializedName("osVersion")
    private final String osVersion;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName("useWebKey")
    private final boolean useWebKey;

    @SerializedName("widevineID")
    private final String widevineID;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasActiveCatalystInstance)) {
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        hasActiveCatalystInstance hasactivecatalystinstance = (hasActiveCatalystInstance) obj;
        if (!Intrinsics.areEqual(this.deviceId, hasactivecatalystinstance.deviceId)) {
            int i4 = IAuthTabCallback + 77;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.clientOs, hasactivecatalystinstance.clientOs) || !Intrinsics.areEqual(this.osVersion, hasactivecatalystinstance.osVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.appVersion, hasactivecatalystinstance.appVersion)) {
            int i6 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceInfo, hasactivecatalystinstance.deviceInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.widevineID, hasactivecatalystinstance.widevineID)) {
            int i8 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.timestamp, hasactivecatalystinstance.timestamp)) {
            return false;
        }
        if (this.useWebKey == hasactivecatalystinstance.useWebKey) {
            return true;
        }
        int i10 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            this.deviceId.hashCode();
            this.clientOs.hashCode();
            this.osVersion.hashCode();
            this.appVersion.hashCode();
            this.deviceInfo.hashCode();
            throw null;
        }
        int iHashCode2 = this.deviceId.hashCode();
        int iHashCode3 = this.clientOs.hashCode();
        int iHashCode4 = this.osVersion.hashCode();
        int iHashCode5 = this.appVersion.hashCode();
        int iHashCode6 = this.deviceInfo.hashCode();
        String str = this.widevineID;
        if (str == null) {
            int i3 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + this.timestamp.hashCode()) * 31) + Boolean.hashCode(this.useWebKey);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "InitDeviceRequest(deviceId=" + this.deviceId + ", clientOs=" + this.clientOs + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ", deviceInfo=" + this.deviceInfo + ", widevineID=" + this.widevineID + ", timestamp=" + this.timestamp + ", useWebKey=" + this.useWebKey + ")";
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public hasActiveCatalystInstance(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull String str7, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.deviceId = str;
        this.clientOs = str2;
        this.osVersion = str3;
        this.appVersion = str4;
        this.deviceInfo = str5;
        this.widevineID = str6;
        this.timestamp = str7;
        this.useWebKey = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hasActiveCatalystInstance(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        String str10;
        boolean z2;
        String str11 = (i & 1) != 0 ? "" : str;
        String str12 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i2 = 2 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            int i3 = 2 % 2;
            str9 = "";
        } else {
            str9 = str4;
        }
        String str13 = (i & 16) != 0 ? "" : str5;
        if ((i & 64) != 0) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 111;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i4 + 109;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 2;
            } else {
                int i8 = 2 % 2;
            }
            str10 = "";
        } else {
            str10 = str7;
        }
        if ((i & 128) != 0) {
            int i9 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        this(str11, str12, str8, str9, str13, str6, str10, z2);
    }
}
