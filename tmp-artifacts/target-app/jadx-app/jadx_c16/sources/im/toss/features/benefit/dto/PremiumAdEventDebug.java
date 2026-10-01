package im.toss.features.benefit.dto;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PremiumAdEventDebug {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String brandName;
    private final Integer carouselCnt;
    private final String creativeType;
    private final String itemId;
    private final Integer itemIdx;
    private final String requestId;

    static {
        int i = IAuthTabCallback + 111;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public PremiumAdEventDebug() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumAdEventDebug)) {
            return false;
        }
        PremiumAdEventDebug premiumAdEventDebug = (PremiumAdEventDebug) obj;
        if (!Intrinsics.areEqual(this.itemId, premiumAdEventDebug.itemId)) {
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.itemIdx, premiumAdEventDebug.itemIdx)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.creativeType, premiumAdEventDebug.creativeType)) {
            int i4 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.carouselCnt, premiumAdEventDebug.carouselCnt)) {
            int i6 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, premiumAdEventDebug.requestId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.brandName, premiumAdEventDebug.brandName)) {
            return true;
        }
        int i8 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.itemId;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Integer num = this.itemIdx;
        if (num == null) {
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode5 = this.creativeType.hashCode();
        Integer num2 = this.carouselCnt;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.requestId;
        if (str2 == null) {
            int i4 = onExtraCallbackWithResult + 65;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 77;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.brandName;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
            int i9 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 5;
            }
        }
        int i11 = (((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3;
        int i12 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return i11;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PremiumAdEventDebug(itemId=" + this.itemId + ", itemIdx=" + this.itemIdx + ", creativeType=" + this.creativeType + ", carouselCnt=" + this.carouselCnt + ", requestId=" + this.requestId + ", brandName=" + this.brandName + ")";
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PremiumAdEventDebug(int i, String str, Integer num, String str2, Integer num2, String str3, String str4, okycx okycxVar) {
        if ((i & 1) == 0) {
            this.itemId = null;
        } else {
            this.itemId = str;
            int i2 = onWarmupCompleted + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.itemIdx = null;
        } else {
            this.itemIdx = num;
        }
        if ((i & 4) == 0) {
            this.creativeType = "";
            int i5 = onWarmupCompleted + 115;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        } else {
            this.creativeType = str2;
        }
        if ((i & 8) == 0) {
            this.carouselCnt = null;
        } else {
            this.carouselCnt = num2;
        }
        if ((i & 16) == 0) {
            int i7 = onExtraCallbackWithResult + 1;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            int i9 = i7 % 2;
            this.requestId = null;
            int i10 = i8 + 109;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
            }
            if ((i & 32) == 0) {
                this.brandName = str4;
                int i11 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                return;
            }
            int i12 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            this.brandName = null;
            if (i13 != 0) {
                throw null;
            }
            return;
        }
        this.requestId = str3;
        int i14 = 2 % 2;
        if ((i & 32) == 0) {
        }
    }

    public PremiumAdEventDebug(@Nullable String str, @Nullable Integer num, @NotNull String str2, @Nullable Integer num2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.itemId = str;
        this.itemIdx = num;
        this.creativeType = str2;
        this.carouselCnt = num2;
        this.requestId = str3;
        this.brandName = str4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(PremiumAdEventDebug premiumAdEventDebug, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0 ? vylVar.onWarmupCompleted(serialDescriptor, 0) : vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, premiumAdEventDebug.itemId);
        } else {
            int i3 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                String str = premiumAdEventDebug.itemId;
                obj.hashCode();
                throw null;
            }
            if (premiumAdEventDebug.itemId != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (premiumAdEventDebug.itemIdx != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getDynamicHeight.onWarmupCompleted, premiumAdEventDebug.itemIdx);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onWarmupCompleted + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (!Intrinsics.areEqual(premiumAdEventDebug.creativeType, "")) {
                vylVar.onExtraCallback(serialDescriptor, 2, premiumAdEventDebug.creativeType);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 3)) {
            int i8 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 63 / 0;
                if (premiumAdEventDebug.carouselCnt != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getDynamicHeight.onWarmupCompleted, premiumAdEventDebug.carouselCnt);
                }
            } else if (premiumAdEventDebug.carouselCnt != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, premiumAdEventDebug.requestId);
        } else {
            int i10 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 69 / 0;
                if (premiumAdEventDebug.requestId != null) {
                }
            } else if (premiumAdEventDebug.requestId != null) {
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 5)) {
            int i12 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i12 % 128;
            if (i12 % 2 == 0) {
                String str2 = premiumAdEventDebug.brandName;
                throw null;
            }
            if (premiumAdEventDebug.brandName == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getWriggleLayout.onNavigationEvent, premiumAdEventDebug.brandName);
        int i13 = onExtraCallbackWithResult + 57;
        onWarmupCompleted = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PremiumAdEventDebug(String str, Integer num, String str2, Integer num2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num3;
        Integer num4;
        String str5 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        String str6 = (i & 4) != 0 ? "" : str2;
        if ((i & 8) != 0) {
            int i4 = onExtraCallbackWithResult + 113;
            int i5 = i4 % 128;
            onWarmupCompleted = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 7;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            num4 = null;
        } else {
            num4 = num2;
        }
        String str7 = (i & 16) != 0 ? null : str3;
        if ((i & 32) != 0) {
            int i9 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str5 = str4;
        }
        this(str, num3, str6, num4, str7, str5);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String str = this.itemId;
        int i5 = i2 + 17;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return this.itemIdx;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.carouselCnt;
        int i4 = i3 + 19;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }
}
