package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class nativeToCircleWithBorderFilter {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    @SerializedName("cardNum")
    private final String cardNum;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("regTs")
    private final String regTs;

    @SerializedName("totalPayAmount")
    private final long totalPayAmount;

    @SerializedName("useRegTs")
    private final String useRegTs;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof nativeToCircleWithBorderFilter)) {
            int i3 = onWarmupCompleted + 105;
            onNavigationEvent = i3 % 128;
            return i3 % 2 == 0;
        }
        nativeToCircleWithBorderFilter nativetocirclewithborderfilter = (nativeToCircleWithBorderFilter) obj;
        if (!Intrinsics.areEqual(this.cardNum, nativetocirclewithborderfilter.cardNum)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, nativetocirclewithborderfilter.imageUrl)) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 55;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.regTs, nativetocirclewithborderfilter.regTs)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.useRegTs, nativetocirclewithborderfilter.useRegTs)) {
            int i9 = onNavigationEvent + 105;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.totalPayAmount == nativetocirclewithborderfilter.totalPayAmount) {
            return true;
        }
        int i11 = onWarmupCompleted + 79;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.cardNum.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.regTs.hashCode()) * 31) + this.useRegTs.hashCode()) * 31) + Long.hashCode(this.totalPayAmount);
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PlccCardInfo(cardNum=" + this.cardNum + ", imageUrl=" + this.imageUrl + ", regTs=" + this.regTs + ", useRegTs=" + this.useRegTs + ", totalPayAmount=" + this.totalPayAmount + ")";
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return str;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.cardNum;
        }
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 115;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.useRegTs;
        int i4 = i2 + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return str;
    }

    public final long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 31;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        long j = this.totalPayAmount;
        int i5 = i2 + 121;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }
}
