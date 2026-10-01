package im.toss.features.home.core.remote.request.consumption;

import im.toss.features.home.core.remote.request.consumption.ConsumptionCardBenefitCalculationRequest$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ConsumptionCardBenefitCalculationRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final String cardId;
    private final String category;
    private final String yearMonth;

    static {
        int i = onExtraCallback + 83;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 58 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumptionCardBenefitCalculationRequest)) {
            return false;
        }
        ConsumptionCardBenefitCalculationRequest consumptionCardBenefitCalculationRequest = (ConsumptionCardBenefitCalculationRequest) obj;
        if (!Intrinsics.areEqual(this.cardId, consumptionCardBenefitCalculationRequest.cardId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.category, consumptionCardBenefitCalculationRequest.category)) {
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.yearMonth, consumptionCardBenefitCalculationRequest.yearMonth)) {
            return true;
        }
        int i4 = onWarmupCompleted + 17;
        IAuthTabCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
      0x0028: PHI (r1v11 int) = (r1v5 int), (r1v13 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        IAuthTabCallback = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.cardId.hashCode();
            str = this.category;
            int i3 = 48 / 0;
            if (str != null) {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.cardId.hashCode();
            str = this.category;
            if (str != null) {
            }
        }
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + this.yearMonth.hashCode();
        int i4 = IAuthTabCallback + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConsumptionCardBenefitCalculationRequest(cardId=" + this.cardId + ", category=" + this.category + ", yearMonth=" + this.yearMonth + ")";
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ ConsumptionCardBenefitCalculationRequest(int i, String str, String str2, String str3, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 7;
        if (7 != (i & 7)) {
            int i3 = onWarmupCompleted + 81;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = ConsumptionCardBenefitCalculationRequest$.serializer.INSTANCE.getDescriptor();
                i2 = 24;
            } else {
                descriptor = ConsumptionCardBenefitCalculationRequest$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = IAuthTabCallback + 21;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.cardId = str;
        this.category = str2;
        this.yearMonth = str3;
    }

    public ConsumptionCardBenefitCalculationRequest(@NotNull String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.cardId = str;
        this.category = str2;
        this.yearMonth = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(ConsumptionCardBenefitCalculationRequest consumptionCardBenefitCalculationRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, consumptionCardBenefitCalculationRequest.cardId);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, consumptionCardBenefitCalculationRequest.category);
            vylVar.onExtraCallback(serialDescriptor, 4, consumptionCardBenefitCalculationRequest.yearMonth);
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, consumptionCardBenefitCalculationRequest.cardId);
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, consumptionCardBenefitCalculationRequest.category);
            vylVar.onExtraCallback(serialDescriptor, 2, consumptionCardBenefitCalculationRequest.yearMonth);
        }
        int i3 = IAuthTabCallback + 93;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
