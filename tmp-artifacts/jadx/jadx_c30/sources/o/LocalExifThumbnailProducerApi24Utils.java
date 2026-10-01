package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import o.toCircle;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class LocalExifThumbnailProducerApi24Utils {
    public static final int $stable = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    @SerializedName("designCode")
    private final toCircle.IAuthTabCallback designCode;

    @SerializedName("englishFirstName")
    private final String englishFirstName;

    @SerializedName("englishLastName")
    private final String englishLastName;

    @SerializedName("traffic")
    private final boolean traffic;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof LocalExifThumbnailProducerApi24Utils)) {
            return false;
        }
        LocalExifThumbnailProducerApi24Utils localExifThumbnailProducerApi24Utils = (LocalExifThumbnailProducerApi24Utils) obj;
        if (this.designCode != localExifThumbnailProducerApi24Utils.designCode || !Intrinsics.areEqual(this.englishFirstName, localExifThumbnailProducerApi24Utils.englishFirstName) || !Intrinsics.areEqual(this.englishLastName, localExifThumbnailProducerApi24Utils.englishLastName)) {
            return false;
        }
        if (this.traffic == localExifThumbnailProducerApi24Utils.traffic) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.designCode.hashCode() * 31) + this.englishFirstName.hashCode()) * 31) + this.englishLastName.hashCode()) * 31) + Boolean.hashCode(this.traffic);
        int i4 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccModifyAuditInfoReq(designCode=" + this.designCode + ", englishFirstName=" + this.englishFirstName + ", englishLastName=" + this.englishLastName + ", traffic=" + this.traffic + ")";
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
