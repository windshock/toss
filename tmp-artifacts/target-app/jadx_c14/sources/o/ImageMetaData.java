package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ImageMetaData {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    @SerializedName("marketingNotificationTerm")
    private final HeifExifUtil marketingNotificationTerm;

    @SerializedName("myDataAgreementTerm")
    private final HeifExifUtil myDataAgreementTerm;

    @SerializedName("targetedAdTerm")
    private final HeifExifUtil targetedAdTerm;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof ImageMetaData)) {
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ImageMetaData imageMetaData = (ImageMetaData) obj;
        if (!Intrinsics.areEqual(this.marketingNotificationTerm, imageMetaData.marketingNotificationTerm)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.targetedAdTerm, imageMetaData.targetedAdTerm))) {
            return Intrinsics.areEqual(this.myDataAgreementTerm, imageMetaData.myDataAgreementTerm);
        }
        int i6 = onExtraCallback + 23;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        HeifExifUtil heifExifUtil = this.marketingNotificationTerm;
        int iHashCode2 = 0;
        int iHashCode3 = heifExifUtil == null ? 0 : heifExifUtil.hashCode();
        HeifExifUtil heifExifUtil2 = this.targetedAdTerm;
        if (heifExifUtil2 == null) {
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = heifExifUtil2.hashCode();
        }
        HeifExifUtil heifExifUtil3 = this.myDataAgreementTerm;
        if (heifExifUtil3 != null) {
            iHashCode2 = heifExifUtil3.hashCode();
            int i4 = IAuthTabCallback + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SignificantOptionalTermDto(marketingNotificationTerm=" + this.marketingNotificationTerm + ", targetedAdTerm=" + this.targetedAdTerm + ", myDataAgreementTerm=" + this.myDataAgreementTerm + ")";
        int i2 = IAuthTabCallback + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
