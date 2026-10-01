package im.toss.features.cardissue.event.model.eligibility;

import im.toss.features.cardissue.event.model.eligibility.EligibilityResultInfoResponse$;
import im.toss.features.cardissue.event.model.eligibility.EligibilityResultModel$;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class EligibilityResultInfoResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final boolean promotionTargetYn;
    private final String resultCode;
    private final EligibilityResultModel resultInfo;

    static {
        int i = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 3;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 19;
            onNavigationEvent = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof EligibilityResultInfoResponse)) {
            return false;
        }
        EligibilityResultInfoResponse eligibilityResultInfoResponse = (EligibilityResultInfoResponse) obj;
        if (this.promotionTargetYn != eligibilityResultInfoResponse.promotionTargetYn) {
            int i6 = i2 + 33;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.resultCode, eligibilityResultInfoResponse.resultCode)) {
            int i8 = onNavigationEvent + 69;
            onExtraCallback = i8 % 128;
            return i8 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.resultInfo, eligibilityResultInfoResponse.resultInfo)) {
            return true;
        }
        int i9 = onExtraCallback + 13;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.promotionTargetYn);
        int iHashCode3 = this.resultCode.hashCode();
        EligibilityResultModel eligibilityResultModel = this.resultInfo;
        if (eligibilityResultModel == null) {
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
            int i4 = i3 + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = eligibilityResultModel.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EligibilityResultInfoResponse(promotionTargetYn=" + this.promotionTargetYn + ", resultCode=" + this.resultCode + ", resultInfo=" + this.resultInfo + ")";
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EligibilityResultInfoResponse(int i, boolean z, String str, EligibilityResultModel eligibilityResultModel, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, EligibilityResultInfoResponse$.serializer.INSTANCE.getDescriptor());
        }
        this.promotionTargetYn = z;
        if ((i & 2) == 0) {
            this.resultCode = "";
            int i4 = onNavigationEvent + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
            }
            if ((i & 4) == 0) {
                this.resultInfo = eligibilityResultModel;
                return;
            }
            int i5 = onNavigationEvent + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.resultInfo = null;
            return;
        }
        this.resultCode = str;
        int i7 = 2 % 2;
        if ((i & 4) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallbackWithResult(EligibilityResultInfoResponse eligibilityResultInfoResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onNavigationEvent(serialDescriptor, 0, eligibilityResultInfoResponse.promotionTargetYn);
        if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            int i4 = onNavigationEvent + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!Intrinsics.areEqual(eligibilityResultInfoResponse.resultCode, "")) {
                vylVar.onExtraCallback(serialDescriptor, 1, eligibilityResultInfoResponse.resultCode);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 2)) {
            int i6 = onNavigationEvent + 69;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                EligibilityResultModel eligibilityResultModel = eligibilityResultInfoResponse.resultInfo;
                throw null;
            }
            if (eligibilityResultInfoResponse.resultInfo == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 2, EligibilityResultModel$.serializer.INSTANCE, eligibilityResultInfoResponse.resultInfo);
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.resultCode;
        int i4 = i3 + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final EligibilityResultModel IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 7;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        EligibilityResultModel eligibilityResultModel = this.resultInfo;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return eligibilityResultModel;
    }
}
