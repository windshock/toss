package im.toss.ads_sdk.remote.model;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.getWriggleLayout;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class MediationExposureEventLogRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final String adUnitId;
    private final String automationSessionId;
    private final ExposureContent content;
    private final String eventContextToken;
    private final String eventName;
    private final String eventTs;
    private final String mediationId;
    private final long placementId;
    private final String requestId;
    private final String spaceUnitId;

    static {
        int i = onExtraCallbackWithResult + 1;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ MediationExposureEventLogRequest onNavigationEvent(MediationExposureEventLogRequest mediationExposureEventLogRequest, String str, String str2, String str3, String str4, String str5, String str6, long j, ExposureContent exposureContent, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        String str12 = (i & 1) != 0 ? mediationExposureEventLogRequest.mediationId : str;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            str9 = mediationExposureEventLogRequest.requestId;
        } else {
            str9 = str2;
        }
        String str13 = (i & 4) != 0 ? mediationExposureEventLogRequest.eventContextToken : str3;
        String str14 = (i & 8) != 0 ? mediationExposureEventLogRequest.eventName : str4;
        if ((i & 16) != 0) {
            str10 = mediationExposureEventLogRequest.spaceUnitId;
            int i5 = IAuthTabCallback + 105;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str10 = str5;
        }
        String str15 = (i & 32) != 0 ? mediationExposureEventLogRequest.adUnitId : str6;
        long j2 = (i & 64) != 0 ? mediationExposureEventLogRequest.placementId : j;
        ExposureContent exposureContent2 = (i & 128) != 0 ? mediationExposureEventLogRequest.content : exposureContent;
        String str16 = (i & 256) != 0 ? mediationExposureEventLogRequest.automationSessionId : str7;
        if ((i & 512) != 0) {
            int i7 = IAuthTabCallback + 51;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                str11 = mediationExposureEventLogRequest.eventTs;
                int i8 = 23 / 0;
            } else {
                str11 = mediationExposureEventLogRequest.eventTs;
            }
        } else {
            str11 = str8;
        }
        return mediationExposureEventLogRequest.onExtraCallbackWithResult(str12, str9, str13, str14, str10, str15, j2, exposureContent2, str16, str11);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediationExposureEventLogRequest)) {
            return false;
        }
        MediationExposureEventLogRequest mediationExposureEventLogRequest = (MediationExposureEventLogRequest) obj;
        if (!Intrinsics.areEqual(this.mediationId, mediationExposureEventLogRequest.mediationId)) {
            int i2 = IAuthTabCallback + 109;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, mediationExposureEventLogRequest.requestId) && Intrinsics.areEqual(this.eventContextToken, mediationExposureEventLogRequest.eventContextToken)) {
            if (!Intrinsics.areEqual(this.eventName, mediationExposureEventLogRequest.eventName)) {
                int i4 = onWarmupCompleted + 3;
                IAuthTabCallback = i4 % 128;
                return i4 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.spaceUnitId, mediationExposureEventLogRequest.spaceUnitId)) {
                if (!Intrinsics.areEqual(this.adUnitId, mediationExposureEventLogRequest.adUnitId)) {
                    int i5 = onWarmupCompleted + 15;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (this.placementId != mediationExposureEventLogRequest.placementId) {
                    int i7 = IAuthTabCallback + 93;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.content, mediationExposureEventLogRequest.content)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.automationSessionId, mediationExposureEventLogRequest.automationSessionId)) {
                    int i9 = IAuthTabCallback + 75;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.eventTs, mediationExposureEventLogRequest.eventTs)) {
                    return true;
                }
                int i11 = onWarmupCompleted + 33;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.mediationId.hashCode();
        String str = this.requestId;
        if (str == null) {
            int i2 = IAuthTabCallback + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.eventContextToken;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = onWarmupCompleted + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode6 = this.eventName.hashCode();
        int iHashCode7 = this.spaceUnitId.hashCode();
        int iHashCode8 = this.adUnitId.hashCode();
        int iHashCode9 = Long.hashCode(this.placementId);
        ExposureContent exposureContent = this.content;
        if (exposureContent == null) {
            int i6 = IAuthTabCallback + 63;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = exposureContent.hashCode();
        }
        String str3 = this.automationSessionId;
        if (str3 == null) {
            int i8 = IAuthTabCallback + 49;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 1;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str3.hashCode();
        }
        String str4 = this.eventTs;
        return (((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final MediationExposureEventLogRequest onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, @Nullable ExposureContent exposureContent, @Nullable String str7, @Nullable String str8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        MediationExposureEventLogRequest mediationExposureEventLogRequest = new MediationExposureEventLogRequest(str, str2, str3, str4, str5, str6, j, exposureContent, str7, str8);
        int i2 = IAuthTabCallback + 35;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return mediationExposureEventLogRequest;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MediationExposureEventLogRequest(mediationId=" + this.mediationId + ", requestId=" + this.requestId + ", eventContextToken=" + this.eventContextToken + ", eventName=" + this.eventName + ", spaceUnitId=" + this.spaceUnitId + ", adUnitId=" + this.adUnitId + ", placementId=" + this.placementId + ", content=" + this.content + ", automationSessionId=" + this.automationSessionId + ", eventTs=" + this.eventTs + ")";
        int i2 = onWarmupCompleted + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public /* synthetic */ MediationExposureEventLogRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, ExposureContent exposureContent, String str7, String str8, okycx okycxVar) {
        if (121 != (i & 121)) {
            htf31.onExtraCallbackWithResult(i, 121, MediationExposureEventLogRequest$$serializer.INSTANCE.getDescriptor());
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this.mediationId = str;
        if ((i & 2) == 0) {
            this.requestId = null;
        } else {
            this.requestId = str2;
        }
        if ((i & 4) == 0) {
            this.eventContextToken = null;
        } else {
            this.eventContextToken = str3;
            int i5 = 2 % 2;
        }
        this.eventName = str4;
        this.spaceUnitId = str5;
        this.adUnitId = str6;
        this.placementId = j;
        if ((i & 128) == 0) {
            this.content = null;
        } else {
            this.content = exposureContent;
            int i6 = 2 % 2;
        }
        if ((i & 256) == 0) {
            int i7 = onWarmupCompleted + 23;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            this.automationSessionId = null;
        } else {
            this.automationSessionId = str7;
        }
        if ((i & 512) == 0) {
            this.eventTs = null;
        } else {
            this.eventTs = str8;
        }
    }

    public MediationExposureEventLogRequest(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, @Nullable ExposureContent exposureContent, @Nullable String str7, @Nullable String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.mediationId = str;
        this.requestId = str2;
        this.eventContextToken = str3;
        this.eventName = str4;
        this.spaceUnitId = str5;
        this.adUnitId = str6;
        this.placementId = j;
        this.content = exposureContent;
        this.automationSessionId = str7;
        this.eventTs = str8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void onNavigationEvent(MediationExposureEventLogRequest mediationExposureEventLogRequest, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            vylVar.onExtraCallback(serialDescriptor, 0, mediationExposureEventLogRequest.mediationId);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
                if (mediationExposureEventLogRequest.requestId != null) {
                    vylVar.onExtraCallbackWithResult(serialDescriptor, 1, getWriggleLayout.onNavigationEvent, mediationExposureEventLogRequest.requestId);
                }
            }
        } else {
            vylVar.onExtraCallback(serialDescriptor, 0, mediationExposureEventLogRequest.mediationId);
            if (!vylVar.onWarmupCompleted(serialDescriptor, 1)) {
            }
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 2) || mediationExposureEventLogRequest.eventContextToken != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, mediationExposureEventLogRequest.eventContextToken);
            int i3 = onWarmupCompleted + 41;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 4;
            }
        }
        vylVar.onExtraCallback(serialDescriptor, 3, mediationExposureEventLogRequest.eventName);
        vylVar.onExtraCallback(serialDescriptor, 4, mediationExposureEventLogRequest.spaceUnitId);
        vylVar.onExtraCallback(serialDescriptor, 5, mediationExposureEventLogRequest.adUnitId);
        vylVar.onExtraCallback(serialDescriptor, 6, mediationExposureEventLogRequest.placementId);
        if (vylVar.onWarmupCompleted(serialDescriptor, 7) || mediationExposureEventLogRequest.content != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 7, ExposureContent$$serializer.INSTANCE, mediationExposureEventLogRequest.content);
        }
        if (vylVar.onWarmupCompleted(serialDescriptor, 8) || mediationExposureEventLogRequest.automationSessionId != null) {
            vylVar.onExtraCallbackWithResult(serialDescriptor, 8, getWriggleLayout.onNavigationEvent, mediationExposureEventLogRequest.automationSessionId);
        }
        if (!vylVar.onWarmupCompleted(serialDescriptor, 9)) {
            int i5 = IAuthTabCallback + 17;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (mediationExposureEventLogRequest.eventTs == null) {
                return;
            }
        }
        vylVar.onExtraCallbackWithResult(serialDescriptor, 9, getWriggleLayout.onNavigationEvent, mediationExposureEventLogRequest.eventTs);
        int i7 = IAuthTabCallback + 45;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class Companion {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MediationExposureEventLogRequest> serializer() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            MediationExposureEventLogRequest$$serializer mediationExposureEventLogRequest$$serializer = MediationExposureEventLogRequest$$serializer.INSTANCE;
            int i4 = onNavigationEvent + 125;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return mediationExposureEventLogRequest$$serializer;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[PHI: r2
          0x0060: PHI (r2v8 java.lang.Double) = (r2v7 java.lang.Double), (r2v11 java.lang.Double) binds: [B:16:0x005e, B:13:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final MediationExposureEventLogRequest onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull NativeAdsDto nativeAdsDto, @Nullable String str3, @Nullable String str4) {
            long jDoubleValue;
            Double dOnWarmupCompleted;
            String strOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            String str5 = "";
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(nativeAdsDto, "");
            NativeAdsDto.Mediation mediationOnNavigationEvent = nativeAdsDto.onTransact().onNavigationEvent();
            String strIAuthTabCallbackStub = mediationOnNavigationEvent.IAuthTabCallbackStub();
            String strIAuthTabCallbackStub2 = nativeAdsDto.IAuthTabCallbackStub();
            String strIAuthTabCallbackDefault = nativeAdsDto.IAuthTabCallbackDefault();
            NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult = mediationOnNavigationEvent.onExtraCallbackWithResult();
            if (admobInfoOnExtraCallbackWithResult != null && (strOnNavigationEvent = admobInfoOnExtraCallbackWithResult.onNavigationEvent()) != null) {
                str5 = strOnNavigationEvent;
            }
            NativeAdsDto.AdmobInfo admobInfoOnExtraCallbackWithResult2 = mediationOnNavigationEvent.onExtraCallbackWithResult();
            if (admobInfoOnExtraCallbackWithResult2 != null) {
                int i4 = onExtraCallback + 107;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    dOnWarmupCompleted = admobInfoOnExtraCallbackWithResult2.onWarmupCompleted();
                    int i5 = 67 / 0;
                    if (dOnWarmupCompleted != null) {
                        int i6 = onNavigationEvent + 101;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            dOnWarmupCompleted.doubleValue();
                            throw null;
                        }
                        jDoubleValue = (long) dOnWarmupCompleted.doubleValue();
                    } else {
                        jDoubleValue = -1;
                    }
                } else {
                    dOnWarmupCompleted = admobInfoOnExtraCallbackWithResult2.onWarmupCompleted();
                    if (dOnWarmupCompleted != null) {
                    }
                }
            }
            return new MediationExposureEventLogRequest(strIAuthTabCallbackStub, strIAuthTabCallbackStub2, strIAuthTabCallbackDefault, str, str2, str5, jDoubleValue, null, str3, str4);
        }
    }
}
