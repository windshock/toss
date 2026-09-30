package im.toss.ads_sdk.remote.model;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getDynamicHeight;
import o.getWriggleLayout;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SdkErrorTrackingLogRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final String automationSessionId;
    private final Integer errorCode;
    private final String errorMessage;
    private final String eventContextToken;
    private final String eventTs;
    private final String mediationId;
    private final String rawError;
    private final String stackTrace;
    private final Integer vendorCode;
    private final String vendorDomain;
    private final String vendorMessage;

    static {
        int i = IAuthTabCallback + 9;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    public SdkErrorTrackingLogRequest() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 1;
            onWarmupCompleted = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(obj instanceof SdkErrorTrackingLogRequest)) {
            return false;
        }
        SdkErrorTrackingLogRequest sdkErrorTrackingLogRequest = (SdkErrorTrackingLogRequest) obj;
        if (!Intrinsics.areEqual(this.mediationId, sdkErrorTrackingLogRequest.mediationId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.eventContextToken, sdkErrorTrackingLogRequest.eventContextToken)) {
            int i6 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.stackTrace, sdkErrorTrackingLogRequest.stackTrace) || !Intrinsics.areEqual(this.errorCode, sdkErrorTrackingLogRequest.errorCode) || !Intrinsics.areEqual(this.errorMessage, sdkErrorTrackingLogRequest.errorMessage) || !Intrinsics.areEqual(this.vendorCode, sdkErrorTrackingLogRequest.vendorCode) || !Intrinsics.areEqual(this.vendorDomain, sdkErrorTrackingLogRequest.vendorDomain)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.vendorMessage, sdkErrorTrackingLogRequest.vendorMessage)) {
            int i8 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.rawError, sdkErrorTrackingLogRequest.rawError)) {
            int i10 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.automationSessionId, sdkErrorTrackingLogRequest.automationSessionId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.eventTs, sdkErrorTrackingLogRequest.eventTs)) {
            return true;
        }
        int i12 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.mediationId;
        if (str == null) {
            int i5 = i3 + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.eventContextToken;
        if (str2 == null) {
            int i7 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.stackTrace;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.errorCode;
        if (num == null) {
            int i9 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num.hashCode();
        }
        String str4 = this.errorMessage;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.vendorCode;
        if (num2 == null) {
            int i11 = onWarmupCompleted + 119;
            onExtraCallbackWithResult = i11 % 128;
            iHashCode4 = i11 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = num2.hashCode();
        }
        String str5 = this.vendorDomain;
        if (str5 == null) {
            int i12 = onExtraCallbackWithResult + 17;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str5.hashCode();
        }
        String str6 = this.vendorMessage;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.rawError;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.automationSessionId;
        if (str8 == null) {
            iHashCode6 = 0;
        } else {
            iHashCode6 = str8.hashCode();
            int i14 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
        }
        String str9 = this.eventTs;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode6) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SdkErrorTrackingLogRequest(mediationId=" + this.mediationId + ", eventContextToken=" + this.eventContextToken + ", stackTrace=" + this.stackTrace + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", vendorCode=" + this.vendorCode + ", vendorDomain=" + this.vendorDomain + ", vendorMessage=" + this.vendorMessage + ", rawError=" + this.rawError + ", automationSessionId=" + this.automationSessionId + ", eventTs=" + this.eventTs + ")";
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class Companion {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SdkErrorTrackingLogRequest> serializer() {
            SdkErrorTrackingLogRequest$$serializer sdkErrorTrackingLogRequest$$serializer;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                sdkErrorTrackingLogRequest$$serializer = SdkErrorTrackingLogRequest$$serializer.INSTANCE;
                int i3 = 32 / 0;
            } else {
                sdkErrorTrackingLogRequest$$serializer = SdkErrorTrackingLogRequest$$serializer.INSTANCE;
            }
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 75 / 0;
            }
            return sdkErrorTrackingLogRequest$$serializer;
        }
    }

    public /* synthetic */ SdkErrorTrackingLogRequest(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, String str9, okycx okycxVar) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.mediationId = null;
        } else {
            this.mediationId = str;
        }
        if ((i & 2) == 0) {
            int i2 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.eventContextToken = null;
            if (i3 != 0) {
                throw null;
            }
        } else {
            this.eventContextToken = str2;
        }
        if ((i & 4) == 0) {
            this.stackTrace = null;
        } else {
            this.stackTrace = str3;
            int i4 = 2 % 2;
        }
        if ((i & 8) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 16) == 0) {
            int i5 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            this.errorMessage = null;
            if (i6 != 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.errorMessage = str4;
        }
        if ((i & 32) == 0) {
            this.vendorCode = null;
        } else {
            this.vendorCode = num2;
        }
        if ((i & 64) == 0) {
            int i7 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            this.vendorDomain = null;
            if (i8 != 0) {
                throw null;
            }
            int i9 = 2 % 2;
        } else {
            this.vendorDomain = str5;
        }
        if ((i & 128) == 0) {
            int i10 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            this.vendorMessage = null;
        } else {
            this.vendorMessage = str6;
            int i12 = 2 % 2;
        }
        if ((i & 256) == 0) {
            this.rawError = null;
        } else {
            this.rawError = str7;
        }
        if ((i & 512) == 0) {
            this.automationSessionId = null;
        } else {
            this.automationSessionId = str8;
        }
        int i13 = 2 % 2;
        if ((i & 1024) == 0) {
            this.eventTs = null;
        } else {
            this.eventTs = str9;
        }
    }

    public SdkErrorTrackingLogRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable Integer num2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.mediationId = str;
        this.eventContextToken = str2;
        this.stackTrace = str3;
        this.errorCode = num;
        this.errorMessage = str4;
        this.vendorCode = num2;
        this.vendorDomain = str5;
        this.vendorMessage = str6;
        this.rawError = str7;
        this.automationSessionId = str8;
        this.eventTs = str9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(SdkErrorTrackingLogRequest sdkErrorTrackingLogRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        if (vylVar.onWarmupCompleted(serialDescriptor, 0) || sdkErrorTrackingLogRequest.mediationId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 0, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.mediationId);
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 1))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.eventContextToken);
        } else {
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (sdkErrorTrackingLogRequest.eventContextToken != null) {
            }
        }
        Object obj = null;
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 2))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.stackTrace);
        } else {
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                String str = sdkErrorTrackingLogRequest.stackTrace;
                obj.hashCode();
                throw null;
            }
            if (sdkErrorTrackingLogRequest.stackTrace != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 3) || sdkErrorTrackingLogRequest.errorCode != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 3, getDynamicHeight.onWarmupCompleted, sdkErrorTrackingLogRequest.errorCode);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 4)) {
            int i5 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (sdkErrorTrackingLogRequest.errorMessage != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 4, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.errorMessage);
            }
        }
        if (!(!vylVar.onWarmupCompleted(serialDescriptor, 5))) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 5, getDynamicHeight.onWarmupCompleted, sdkErrorTrackingLogRequest.vendorCode);
        } else {
            int i7 = onWarmupCompleted + 125;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (sdkErrorTrackingLogRequest.vendorCode != null) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 6) || sdkErrorTrackingLogRequest.vendorDomain != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 6, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.vendorDomain);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 7)) {
            int i9 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i9 % 128;
            if (i9 % 2 != 0) {
                String str2 = sdkErrorTrackingLogRequest.vendorMessage;
                obj.hashCode();
                throw null;
            }
            if (sdkErrorTrackingLogRequest.vendorMessage != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 7, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.vendorMessage);
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || sdkErrorTrackingLogRequest.rawError != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.rawError);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i10 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            if (sdkErrorTrackingLogRequest.automationSessionId != null) {
                vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.automationSessionId);
            }
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 10) && sdkErrorTrackingLogRequest.eventTs == null) {
            return;
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 10, getWriggleLayout.onNavigationEvent, sdkErrorTrackingLogRequest.eventTs);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SdkErrorTrackingLogRequest(String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        Integer num3;
        String str11;
        Integer num4;
        String str12;
        String str13;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str10 = null;
        } else {
            str10 = str;
        }
        String str14 = (i & 2) != 0 ? null : str2;
        String str15 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i3 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                str.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 16) != 0) {
            int i5 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str11 = null;
        } else {
            str11 = str4;
        }
        if ((i & 32) != 0) {
            int i7 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 19 / 0;
            }
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 64) != 0) {
            int i9 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            str12 = null;
        } else {
            str12 = str5;
        }
        if ((i & 128) != 0) {
            int i10 = 2 % 2;
            str13 = null;
        } else {
            str13 = str6;
        }
        this(str10, str14, str15, num3, str11, num4, str12, str13, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }
}
