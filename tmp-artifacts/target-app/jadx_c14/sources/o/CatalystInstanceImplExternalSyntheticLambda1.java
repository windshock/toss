package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstanceImplExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("authLevel")
    private final loadScriptFromPathToMemory authLevel;

    @SerializedName("clientOs")
    private final String clientOs;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("requesterCode")
    private final String requesterCode;

    @SerializedName("requesterId")
    private final int requesterId;

    @SerializedName("userName")
    private final String userName;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof CatalystInstanceImplExternalSyntheticLambda1)) {
            return false;
        }
        CatalystInstanceImplExternalSyntheticLambda1 catalystInstanceImplExternalSyntheticLambda1 = (CatalystInstanceImplExternalSyntheticLambda1) obj;
        if (!Intrinsics.areEqual(this.clientOs, catalystInstanceImplExternalSyntheticLambda1.clientOs)) {
            int i4 = onExtraCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceId, catalystInstanceImplExternalSyntheticLambda1.deviceId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.phone, catalystInstanceImplExternalSyntheticLambda1.phone)) {
            int i6 = onExtraCallbackWithResult + 7;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.requesterCode, catalystInstanceImplExternalSyntheticLambda1.requesterCode)) {
            return this.requesterId == catalystInstanceImplExternalSyntheticLambda1.requesterId && !(Intrinsics.areEqual(this.userName, catalystInstanceImplExternalSyntheticLambda1.userName) ^ true) && this.authLevel == catalystInstanceImplExternalSyntheticLambda1.authLevel;
        }
        int i8 = onExtraCallback;
        int i9 = i8 + 85;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 75;
        onExtraCallbackWithResult = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.clientOs.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.requesterCode.hashCode()) * 31) + Integer.hashCode(this.requesterId)) * 31) + this.userName.hashCode()) * 31) + this.authLevel.hashCode();
        int i4 = onExtraCallbackWithResult + 45;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PrepareUnblockSelfieRequest(clientOs=" + this.clientOs + ", deviceId=" + this.deviceId + ", phone=" + this.phone + ", requesterCode=" + this.requesterCode + ", requesterId=" + this.requesterId + ", userName=" + this.userName + ", authLevel=" + this.authLevel + ")";
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CatalystInstanceImplExternalSyntheticLambda1(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull loadScriptFromPathToMemory loadscriptfrompathtomemory) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(loadscriptfrompathtomemory, "");
        this.clientOs = str;
        this.deviceId = str2;
        this.phone = str3;
        this.requesterCode = str4;
        this.requesterId = i;
        this.userName = str5;
        this.authLevel = loadscriptfrompathtomemory;
    }
}
