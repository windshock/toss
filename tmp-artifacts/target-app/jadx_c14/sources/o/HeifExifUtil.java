package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class HeifExifUtil {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("contentsType")
    private final String contentsType;

    @SerializedName("contentsUrl")
    private final String contentsUrl;

    @SerializedName("isSigned")
    private final boolean isSigned;

    @SerializedName("priority")
    private final int priority;

    @SerializedName("termsId")
    private final long termsId;

    @SerializedName("title")
    private final String title;

    @SerializedName("updatedAt")
    private final String updatedAt;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this == obj) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof HeifExifUtil)) {
            int i6 = onNavigationEvent + 11;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        HeifExifUtil heifExifUtil = (HeifExifUtil) obj;
        if (!Intrinsics.areEqual(this.contentsType, heifExifUtil.contentsType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contentsUrl, heifExifUtil.contentsUrl)) {
            int i8 = onNavigationEvent + 63;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 51;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (this.isSigned != heifExifUtil.isSigned) {
            return false;
        }
        if (this.priority != heifExifUtil.priority) {
            int i12 = onWarmupCompleted + 85;
            onNavigationEvent = i12 % 128;
            return i12 % 2 == 0;
        }
        if (this.termsId == heifExifUtil.termsId) {
            return Intrinsics.areEqual(this.title, heifExifUtil.title) && Intrinsics.areEqual(this.updatedAt, heifExifUtil.updatedAt);
        }
        int i13 = onNavigationEvent + 45;
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.contentsType.hashCode();
        int iHashCode2 = this.contentsUrl.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isSigned);
        int iHashCode4 = Integer.hashCode(this.priority);
        int iHashCode5 = Long.hashCode(this.termsId);
        int iHashCode6 = this.title.hashCode();
        String str = this.updatedAt;
        if (str == null) {
            int i3 = onWarmupCompleted + 89;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode7 = str.hashCode();
            int i5 = onWarmupCompleted + 63;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode7;
        }
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OptionalTermDto(contentsType=" + this.contentsType + ", contentsUrl=" + this.contentsUrl + ", isSigned=" + this.isSigned + ", priority=" + this.priority + ", termsId=" + this.termsId + ", title=" + this.title + ", updatedAt=" + this.updatedAt + ")";
        int i2 = onNavigationEvent + 19;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 1 / 0;
        }
        return str;
    }
}
