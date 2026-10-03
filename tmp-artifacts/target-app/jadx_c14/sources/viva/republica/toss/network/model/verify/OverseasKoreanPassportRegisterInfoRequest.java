package viva.republica.toss.network.model.verify;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.OverseasKoreanPassportRegisterInfoRequest$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class OverseasKoreanPassportRegisterInfoRequest {
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String expiryDate;
    private final String idn;
    private final String nameKor;
    private final String passportNo;
    private final String residenceCountryCode;
    private final long verifyId;

    static {
        int i = onNavigationEvent + 123;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 80 / 0;
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof OverseasKoreanPassportRegisterInfoRequest)) {
            return false;
        }
        OverseasKoreanPassportRegisterInfoRequest overseasKoreanPassportRegisterInfoRequest = (OverseasKoreanPassportRegisterInfoRequest) obj;
        if (this.verifyId != overseasKoreanPassportRegisterInfoRequest.verifyId) {
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.idn, overseasKoreanPassportRegisterInfoRequest.idn) || (!Intrinsics.areEqual(this.nameKor, overseasKoreanPassportRegisterInfoRequest.nameKor))) {
            return false;
        }
        if (Intrinsics.areEqual(this.passportNo, overseasKoreanPassportRegisterInfoRequest.passportNo)) {
            return Intrinsics.areEqual(this.expiryDate, overseasKoreanPassportRegisterInfoRequest.expiryDate) && !(Intrinsics.areEqual(this.residenceCountryCode, overseasKoreanPassportRegisterInfoRequest.residenceCountryCode) ^ true);
        }
        int i6 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Long.hashCode(this.verifyId) * 31) + this.idn.hashCode()) * 31) + this.nameKor.hashCode()) * 31) + this.passportNo.hashCode()) * 31) + this.expiryDate.hashCode()) * 31) + this.residenceCountryCode.hashCode();
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OverseasKoreanPassportRegisterInfoRequest(verifyId=" + this.verifyId + ", idn=" + this.idn + ", nameKor=" + this.nameKor + ", passportNo=" + this.passportNo + ", expiryDate=" + this.expiryDate + ", residenceCountryCode=" + this.residenceCountryCode + ")";
        int i2 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public static final class Companion {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OverseasKoreanPassportRegisterInfoRequest> serializer() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            OverseasKoreanPassportRegisterInfoRequest$.serializer serializerVar = OverseasKoreanPassportRegisterInfoRequest$.serializer.INSTANCE;
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            return serializerVar;
        }
    }

    public /* synthetic */ OverseasKoreanPassportRegisterInfoRequest(int i, long j, String str, String str2, String str3, String str4, String str5, okycx okycxVar) {
        if (63 != (i & 63)) {
            int i2 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 63, OverseasKoreanPassportRegisterInfoRequest$.serializer.INSTANCE.getDescriptor());
            int i4 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.verifyId = j;
        this.idn = str;
        this.nameKor = str2;
        this.passportNo = str3;
        this.expiryDate = str4;
        this.residenceCountryCode = str5;
    }

    public OverseasKoreanPassportRegisterInfoRequest(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.verifyId = j;
        this.idn = str;
        this.nameKor = str2;
        this.passportNo = str3;
        this.expiryDate = str4;
        this.residenceCountryCode = str5;
    }

    @JvmStatic
    public static final /* synthetic */ void IAuthTabCallback(OverseasKoreanPassportRegisterInfoRequest overseasKoreanPassportRegisterInfoRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        vylVar.onExtraCallback(serialDescriptor, 0, overseasKoreanPassportRegisterInfoRequest.verifyId);
        vylVar.onExtraCallback(serialDescriptor, 1, overseasKoreanPassportRegisterInfoRequest.idn);
        vylVar.onExtraCallback(serialDescriptor, 2, overseasKoreanPassportRegisterInfoRequest.nameKor);
        vylVar.onExtraCallback(serialDescriptor, 3, overseasKoreanPassportRegisterInfoRequest.passportNo);
        vylVar.onExtraCallback(serialDescriptor, 4, overseasKoreanPassportRegisterInfoRequest.expiryDate);
        vylVar.onExtraCallback(serialDescriptor, 5, overseasKoreanPassportRegisterInfoRequest.residenceCountryCode);
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
