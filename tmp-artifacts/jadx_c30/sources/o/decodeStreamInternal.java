package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class decodeStreamInternal {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @SerializedName("ctaTitle")
    private final String ctaTitle;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("landingUrl")
    private final String landingUrl;

    @SerializedName("subTitle")
    private final String subTitle;

    @SerializedName("title")
    private final String title;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallbackWithResult + 33;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof decodeStreamInternal)) {
            int i4 = onExtraCallbackWithResult + 69;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        decodeStreamInternal decodestreaminternal = (decodeStreamInternal) obj;
        if (!Intrinsics.areEqual(this.imageUrl, decodestreaminternal.imageUrl) || !Intrinsics.areEqual(this.title, decodestreaminternal.title) || !Intrinsics.areEqual(this.subTitle, decodestreaminternal.subTitle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ctaTitle, decodestreaminternal.ctaTitle)) {
            int i6 = onExtraCallbackWithResult + 113;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.landingUrl, decodestreaminternal.landingUrl)) {
            return false;
        }
        int i8 = onExtraCallback + 67;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.imageUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.ctaTitle.hashCode()) * 31) + this.landingUrl.hashCode();
        int i4 = onExtraCallbackWithResult + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TossBankConversionBottomSheet(imageUrl=" + this.imageUrl + ", title=" + this.title + ", subTitle=" + this.subTitle + ", ctaTitle=" + this.ctaTitle + ", landingUrl=" + this.landingUrl + ")";
        int i2 = onExtraCallbackWithResult + 37;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
