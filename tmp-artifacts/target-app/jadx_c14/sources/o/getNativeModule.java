package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getNativeModule {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    @SerializedName("idn")
    private final String idn;

    @SerializedName("nameEng")
    private final String nameEng;

    @SerializedName("nameKor")
    private final String nameKor;

    @SerializedName("verifyId")
    private final long verifyId;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeModule)) {
            return false;
        }
        getNativeModule getnativemodule = (getNativeModule) obj;
        if (!Intrinsics.areEqual(this.idn, getnativemodule.idn)) {
            int i2 = IAuthTabCallback + 45;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.nameKor, getnativemodule.nameKor)) {
            return false;
        }
        if (Intrinsics.areEqual(this.nameEng, getnativemodule.nameEng)) {
            return this.verifyId == getnativemodule.verifyId;
        }
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.idn.hashCode() * 31) + this.nameKor.hashCode()) * 31) + this.nameEng.hashCode()) * 31) + Long.hashCode(this.verifyId);
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IdCardVerificationCheckInfoRequest(idn=" + this.idn + ", nameKor=" + this.nameKor + ", nameEng=" + this.nameEng + ", verifyId=" + this.verifyId + ")";
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public getNativeModule(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.idn = str;
        this.nameKor = str2;
        this.nameEng = str3;
        this.verifyId = j;
    }
}
