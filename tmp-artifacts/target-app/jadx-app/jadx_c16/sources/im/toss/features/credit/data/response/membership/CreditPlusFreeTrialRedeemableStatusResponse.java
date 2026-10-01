package im.toss.features.credit.data.response.membership;

import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.credit.data.response.DisclaimerV2$$serializer;
import im.toss.features.credit.data.response.membership.CreditPlusFreeTrialRedeemableStatusResponse$;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AOMPFileTinyAppUtils;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.updateRenderInfoForVideo;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusFreeTrialRedeemableStatusResponse {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final DisclaimerV2 disclaimer;
    private final AOMPFileTinyAppUtils status;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new CreditPlusFreeTrialRedeemableStatusResponse$.ExternalSyntheticLambda0()), null};

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return kSerializerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ KSerializer onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.credit.data.response.membership.CreditPlusFreeTrialRedeemStatus", AOMPFileTinyAppUtils.values());
        }
        updateRenderInfoForVideo.onExtraCallbackWithResult("im.toss.features.credit.data.response.membership.CreditPlusFreeTrialRedeemStatus", AOMPFileTinyAppUtils.values());
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 65;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof CreditPlusFreeTrialRedeemableStatusResponse) {
            CreditPlusFreeTrialRedeemableStatusResponse creditPlusFreeTrialRedeemableStatusResponse = (CreditPlusFreeTrialRedeemableStatusResponse) obj;
            return this.status == creditPlusFreeTrialRedeemableStatusResponse.status && Intrinsics.areEqual(this.disclaimer, creditPlusFreeTrialRedeemableStatusResponse.disclaimer);
        }
        int i7 = i2 + 9;
        onExtraCallback = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AOMPFileTinyAppUtils aOMPFileTinyAppUtils = this.status;
        if (aOMPFileTinyAppUtils == null) {
            int i5 = i2 + 45;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = aOMPFileTinyAppUtils.hashCode();
        }
        DisclaimerV2 disclaimerV2 = this.disclaimer;
        int iHashCode2 = (iHashCode * 31) + (disclaimerV2 != null ? disclaimerV2.hashCode() : 0);
        int i7 = onExtraCallback + 49;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 44 / 0;
        }
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreditPlusFreeTrialRedeemableStatusResponse(status=" + this.status + ", disclaimer=" + this.disclaimer + ")";
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static {
        int i = onExtraCallbackWithResult + 27;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ CreditPlusFreeTrialRedeemableStatusResponse(int i, AOMPFileTinyAppUtils aOMPFileTinyAppUtils, DisclaimerV2 disclaimerV2, okycx okycxVar) {
        if (2 != (i & 2)) {
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                htf31.onExtraCallbackWithResult(i, 4, CreditPlusFreeTrialRedeemableStatusResponse$.serializer.INSTANCE.getDescriptor());
            } else {
                htf31.onExtraCallbackWithResult(i, 2, CreditPlusFreeTrialRedeemableStatusResponse$.serializer.INSTANCE.getDescriptor());
            }
            int i3 = 2 % 2;
        }
        Object obj = null;
        if ((i & 1) == 0) {
            this.status = null;
            int i4 = 2 % 2;
        } else {
            this.status = aOMPFileTinyAppUtils;
        }
        this.disclaimer = disclaimerV2;
        int i5 = onExtraCallback + 25;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy[] IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        int i4 = i3 + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return lazyArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[PHI: r1
      0x0025: PHI (r1v6 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:10:0x0023, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r1
      0x0021: PHI (r1v5 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[]) = 
      (r1v4 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
      (r1v13 kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[])
     binds: [B:8:0x001f, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onExtraCallback(CreditPlusFreeTrialRedeemableStatusResponse creditPlusFreeTrialRedeemableStatusResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        Lazy<KSerializer<Object>>[] lazyArr;
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                if (creditPlusFreeTrialRedeemableStatusResponse.status != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 0, (py) lazyArr[0].getValue(), creditPlusFreeTrialRedeemableStatusResponse.status);
                    int i3 = IAuthTabCallback + 97;
                    onExtraCallback = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
        } else {
            lazyArr = $childSerializers;
            if (!vylVar.onWarmupCompleted(serialDescriptor, 0)) {
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 1, DisclaimerV2$$serializer.INSTANCE, creditPlusFreeTrialRedeemableStatusResponse.disclaimer);
    }

    public final AOMPFileTinyAppUtils onWarmupCompleted() {
        AOMPFileTinyAppUtils aOMPFileTinyAppUtils;
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 91;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            aOMPFileTinyAppUtils = this.status;
            int i4 = 58 / 0;
        } else {
            aOMPFileTinyAppUtils = this.status;
        }
        int i5 = i2 + 123;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return aOMPFileTinyAppUtils;
    }

    public final DisclaimerV2 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        DisclaimerV2 disclaimerV2 = this.disclaimer;
        int i5 = i3 + 59;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return disclaimerV2;
    }
}
