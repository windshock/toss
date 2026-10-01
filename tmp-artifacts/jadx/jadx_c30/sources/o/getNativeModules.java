package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getNativeModules {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("imageType")
    private final String imageType;

    @SerializedName("rrn7th")
    private final int rrn7th;

    @SerializedName("rrnBirthday")
    private final int rrnBirthday;

    @SerializedName("unifiedId")
    private final long unifiedId;

    @SerializedName("userName")
    private final String userName;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeModules)) {
            return false;
        }
        getNativeModules getnativemodules = (getNativeModules) obj;
        if (!Intrinsics.areEqual(this.imageType, getnativemodules.imageType) || this.rrn7th != getnativemodules.rrn7th) {
            return false;
        }
        if (this.rrnBirthday == getnativemodules.rrnBirthday) {
            return this.unifiedId == getnativemodules.unifiedId && Intrinsics.areEqual(this.userName, getnativemodules.userName);
        }
        int i3 = onExtraCallback + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.imageType.hashCode() * 31) + Integer.hashCode(this.rrn7th)) * 31) + Integer.hashCode(this.rrnBirthday)) * 31) + Long.hashCode(this.unifiedId)) * 31) + this.userName.hashCode();
        int i4 = IAuthTabCallback + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetSelfieUploadTokenRequest(imageType=" + this.imageType + ", rrn7th=" + this.rrn7th + ", rrnBirthday=" + this.rrnBirthday + ", unifiedId=" + this.unifiedId + ", userName=" + this.userName + ")";
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
